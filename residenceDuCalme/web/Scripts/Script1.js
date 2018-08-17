var req;
var province;
var HashTotal;

function init() {
    //province = document.getElementById("div_prov");



    if (HashTotal != null) {

        return HashTotal;

    } else {
        if (req == null) {

            req = new XMLHttpRequest();


        } else {

            return req;
        }

        url = "srv_RechercheApp";
        req.open("GET", url, true);
        req.onreadystatechange = callBackHashTotal;
        req.send(null);



    }

}

function callBackHashTotal() {

    if ((req.readyState == 4) && (req.status == 200)) {

        HashTotal = JSON.parse(req.responseText);


    }

}

function chercherVille(x) {


    init();
    callBackVille();



}

function chercherProv(x) {
    init();
    callBackProv();
   // document.getElementById("ville").value = "";


}

function callBackProv() {
        var x = HashTotal;

        for (var i = 0; i < x.province.prov_name.length; i++) {

            document.getElementById("div_prov").innerHTML += "<input name='popup' id='input_prov' class='typeahead form-control' value='" + x.province.prov_name[i] + "' type='text' onclick='MettreProv(this.value)'>";


        }


    }



function callBackVille() {

        var x = HashTotal;

        if (document.getElementById("prov").value == "") { //Quebec
            for (var i = 0; i < x.ville.ville_name.length; i++) {

                document.getElementById("div_ville").innerHTML += "<input name='popup' class='typeahead form-control' value='" + x.ville.ville_name[i] + "' type='text' onclick='MettreVille(this.value)'>";
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
                    document.getElementById("div_ville").innerHTML += "<input name='popup' class='typeahead form-control' value='" + x.ville.ville_name[i] + "' type='text' onclick='MettreVille(this.value)'>";

                }

            }


        }

    }


function MettreProv(x) {

    document.getElementById("prov").value = x;//Quebec
    var d = document.getElementsByName("popup");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");




    }


}
function MettreVille(x) {

    document.getElementById("ville").value = x;
    var d = document.getElementsByName("popup");
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