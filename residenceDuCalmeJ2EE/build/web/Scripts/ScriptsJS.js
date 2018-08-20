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

function chercherVille(prov) {
    init();
    initialiserPopup(popupprovince);
    url = "srv_RechercheApp?province=" + prov + "&ville=''";
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

        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.prov_filter.length; i++) {
            document.getElementById("div_prov").innerHTML += "<input name='popupprovince' id='input_prov' class='typeahead form-control' value='" + JSONProv.prov_filter[i] + "' type='text' onclick='MettreProv(this.value)'>";
        }
    }
}

function callBackVille() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.ville_filter.length; i++) {
            document.getElementById("div_ville").innerHTML += "<input name='popupville' class='typeahead form-control' value='" + JSONProv.ville_filter[i] + "' type='text' onclick='MettreVille(this.value)'>";
        }


    }

}
function MettreProv(x) {
    document.getElementById("prov").value = x;//Quebec
    var d = document.getElementsByName("popupprovince");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");
    }

    chercherVille(x);
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

function afficherLesTypes() {

    init();
    url = "srv_InfosAppartement?action=chercherType";
    req.open("GET", url, true);
    req.onreadystatechange = callBackapptype;
    req.send(null);


}

function callBackapptype() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);
        for (var i = 0; i < x.length; i++) {
            document.getElementById("div_type").innerHTML += "<input name='popuptype' class='typeahead form-control' value='" + x[i] + "' type='text' onclick='MettreType(this.value)'>";
        }


    }


}
function MettreType(x) {

    document.getElementById("typeApp").value = x;
    var d = document.getElementsByName("popuptype");
    for (var i = 0; i < d.length; i++) {
        d[i].setAttribute("type", "hidden");

    }



}

function mettrePrix() {
    var count = 0;
    
    var textbox = document.getElementById("prix");
    if (count == 0) {
        count = count+1;
        document.getElementById("div_prix").innerHTML += "<input name='popupprix' class='typeahead form-control' value='' type='text' >";
        
    }



    //" <div data-role='rangeslider'><input type='range' name='price-min' id='price-min' value='200' min='0' max='1000'> <input type='range' name='price-max' id='price-max' value='800' min='0' max='10000'> </div> <div> <input type='submit' data-inline='true' value='Submit'></div>";




}