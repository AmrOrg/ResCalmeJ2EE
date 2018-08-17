var req;
var province;

function init() {
    //province = document.getElementById("div_prov");

    if (req == null) {

        req = new XMLHttpRequest();


    } else {

        return req;
    }

}

function chercherVille(x) {
    var d = document.getElementsByName("popupprovince");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");
    }

    init();
    url = "srv_RechercheApp?ville=" + x;
    req.open("GET", url, true);
    req.onreadystatechange = callBackVille;
    req.send(null);


}

function chercherProv(x) {
    document.getElementById("ville").value = "";
    var d = document.getElementsByName("popupville");
    var p = document.getElementsByName("popupprovince");

    for (var i = 0; i < p.length; i++) {
        p[i].setAttribute("type", "hidden");

    }
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");

    }
    init();
    url = "srv_RechercheApp?province=" + x + "&ville=''";
    req.open("GET", url, true);
    req.onreadystatechange = callBackProv;
    req.send(null);

}

function callBackProv() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);


        for (var i = 0; i < x.length; i++) {

            document.getElementById("div_prov").innerHTML += "<input name='popupprovince' id='input_prov' class='typeahead form-control' value='" + x[i] + "' type='text' onclick='MettreProv(this.value)'>";


        }


    }

}

function callBackVille() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);

        if (document.getElementById("prov").value == "") {
            for (var i = 0; i < x.ville.ville_name.length; i++) {

                document.getElementById("div_ville").innerHTML += "<input name='popupville' class='typeahead form-control' value='" + x.ville.ville_name[i] + "' type='text' onclick='MettreVille(this.value)'>";
            }
        } else {
            var prov = document.getElementById("prov").value;
            var c;
            for (var i = 0; i < x.province.prov_name.length; i++) {

                if (x.province.prov_name[i] == prov) {

                    c = x.province.prov_id[i];

                }
            }
            for (var i = 0; i < x.ville.ville_name.length; i++) {

                if (x.ville.prov_id[i] == c) { //qc  == Qc
                    document.getElementById("div_ville").innerHTML += "<input name='popupville' class='typeahead form-control' value='" + x.ville.ville_name[i] + "' type='text' onclick='MettreVille(this.value)'>";

                }

            }


        }

    }

}
function MettreProv(x) {

    document.getElementById("prov").value = x;//Quebec
    var d = document.getElementsByName("popupprovince");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");




    }


}
function MettreVille(x) {

    document.getElementById("ville").value = x;
    var d = document.getElementsByName("popupville");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");

    }


}


$(document).ready(function () {
    $("input").focus(function () {
        $(this).css("background-color", "#cccccc");
    });
    $("input").blur(function () {
        $(this).css("background-color", "#ffffff");
    });
});