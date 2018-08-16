var req;
var province;

function init() {
    province = document.getElementById("div_prov");

    if (req == null) {

        req = new XMLHttpRequest();


    } else {

        return req;
    }

}

function chercherVille(x) {


    init();
    url = "srv_RechercheApp?ville=" + x;
    req.open("GET", url, true);
    req.onreadystatechange = callBackVille;
    req.send(null);


}

function chercherProv(x) {

    init();
    url = "srv_RechercheApp?province=" + x;
    req.open("GET", url, true);
    req.onreadystatechange = callBackProv;
    req.send(null);

}

function callBackProv() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);

        for (var i = 0; i < x.province.length; i++) {

            document.getElementById("div_prov").innerHTML += "<input class='typeahead form-control' value='" + x.province[i] + "' type='text' onclick='MettreProv(this.value)'>";
        }


    }

}

function callBackVille() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);

        for (var i = 0; i < x.ville.length; i++) {

            document.getElementById("div_prov").innerHTML += "<input class='typeahead form-control' value='" + x.ville[i] + "' type='text' onclick='MettreVille(this.value)'>";
        }


    }

}
function MettreProv(x) {

    document.getElementById("prov").value = x;
    province.innerHTML = "";

}
function MettreVille(x) {

    document.getElementById("ville").value = x;
    province.innerHTML = "";


}

