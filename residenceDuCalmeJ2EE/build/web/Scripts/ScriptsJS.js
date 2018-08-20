var req;
var province;
var popupville;
var popupprovince;

function init() {
    popupville = document.getElementsByName("popupville");
    popupprovince = document.getElementsByName("popupprovince");
    if (req == null) {
        req = new XMLHttpRequest();
    } else {
        return req;
    }
}

function initialiserPopup(popup) {
    for (var i = 0; i < popup.length; i++) {
        popup[i].setAttribute("type", "hidden");
    }
}

function chercherVille(ville) {
    init();
    initialiserPopup(popupprovince);
    url = "srv_RechercheApp?ville=" + ville;
    req.open("GET", url, true);
    req.onreadystatechange = callBackVille;
    req.send(null);
}


function chercherProv(prov) {
    document.getElementById("ville").value = "";
    //Recuperation des variables 
    init();
    //Initialiser les popups
    initialiserPopup(popupprovince);
    initialiserPopup(popupville);
    url = "srv_RechercheApp?province=" + prov + "&ville=''";
    req.open("GET", url, true);
    req.onreadystatechange = callBackProv;
    req.send(null);
}

function callBackProv() {
    if ((req.readyState == 4) && (req.status == 200)) {
        alert("a", "a");
        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.province.length; i++) {
            alert("b", "b");
            document.getElementById("div_prov").innerHTML += "<input name='popupprovince' id='input_prov' class='typeahead form-control' value='" + JSONProv.province.prov_name[i] + "' type='text' onclick='MettreProv(this.value)'>";
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