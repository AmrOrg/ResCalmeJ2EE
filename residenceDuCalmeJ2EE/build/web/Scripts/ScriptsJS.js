var req;
var province;
var popupville;
var popupprovince;

//FONCTIONS INITIALISATION
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
//FONCTIONS SERVLETS
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

function chercherVille(prov) {
    init();
    initialiserPopup(popupprovince);
    url = "srv_RechercheApp?province=" + prov + "&ville=''";
    req.open("GET", url, true);
    req.onreadystatechange = callBackVille;
    req.send(null);
}

function chercherTypes() {
    init();
    url = "srv_InfosAppartement?action=chercherType";
    req.open("GET", url, true);
    req.onreadystatechange = callBackapptype;
    req.send(null);
}

function chercherServices() {
    init();
    url = "srv_InfosAppartement?action=chercherServices";
    req.open("GET", url, true);
    req.onreadystatechange = callBackServices;
    req.send(null);
}

//FONCTIONS CALLBACK
function callBackProv() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.prov_filter.length; i++) {
            document.getElementById("div_prov").innerHTML += "<input name='popupprovince' id='input_prov' class='typeahead form-control' value='" + JSONProv.prov_filter[i] + "' type='text' onclick='MettreProv(this.value, prov)'>"
        }
    }
}

function callBackVille() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.ville_filter.length; i++) {
            document.getElementById("div_ville").innerHTML += "<input name='popupville' class='typeahead form-control' value='" + JSONProv.ville_filter[i] + "' type='text' onclick='AjouterElements(this.value, 'ville', 'popupville')'>";
        }
    }

}

function callBackapptype() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);
        for (var i = 0; i < x.length; i++) {
            document.getElementById("div_type").innerHTML += "<input name='popuptype' class='typeahead form-control' value='" + x[i] + "' type='text' onclick='AjouterElements(this.value, 'typeApp', 'popuptype')'>";
        }
    }
}

function callBackServices() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);
        for (var i = 0; i < x.length; i++) {
            document.getElementById("div_services").innerHTML += "<input name='popupservices' class='typeahead form-control' value='" + x[i].serv_description + "' type='text' onclick='AjouterElements(this.value, ''servicesApp'', ''popupservices'')'>";
        }
    }
}

//FONCTIONS POUR AJOUTER UN ELEMENT POPUP
function AjouterElements(valeur, idElement, popupElement) {
    alert("valeur", +valeur);
    alert("idElement", +idElement);
    alert("popupElement", +popupElement);
    document.getElementById(idElement).value = valeur;
    var varPopup = document.getElementsByName(popupElement);
    for (var i = 0; i < varPopup.length; i++) {
        varPopup[i].setAttribute("type", "hidden");
    }
    if (idElement= 'prov'){
        chercherVille(valeur);
    }
}

function MettreProv(x, y) {
    alert(+y);
    document.getElementById("prov").value = x;//Quebec
    var d = document.getElementsByName("popupprovince");
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


