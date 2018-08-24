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
    alert("servicesApp");
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
            document.getElementById("div_prov").innerHTML += "<input name='popupprovince' id='input_prov' class='typeahead form-control' value='" + JSONProv.prov_filter[i] + "'type='text' onclick='AjouterElements(this.id, this.name, this.value)'>"
        }
    }
}

function callBackVille() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var JSONProv = JSON.parse(req.responseText);
        for (var i = 0; i < JSONProv.ville_filter.length; i++) {
            document.getElementById("div_ville").innerHTML += "<input id='input_ville' name='popupville' class='typeahead form-control' value='" + JSONProv.ville_filter[i] + "' type='text' onclick='AjouterElements(this.id, this.name, this.value)'>";
        }
    }

}

function callBackapptype() {
    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);
        for (var i = 0; i < x.length; i++) {
            document.getElementById("div_type").innerHTML += "<input id='input_type' name='popuptype' class='typeahead form-control' value='" + x[i] + "' type='text' onclick='AjouterElements(this.id, this.name, this.value)'>";
        }
    }
}

function callBackServices() {

    if ((req.readyState == 4) && (req.status == 200)) {
        var x = JSON.parse(req.responseText);
        for (var i = 0; i < x.length; i++) {
            document.getElementById("div_services").innerHTML += "<input id='input_service' name='popupservices' class='typeahead form-control' value='" + x[i].serv_description + "' type='text' onclick='AjouterElements(this.id, this.name, this.value)'>";
        }
    }
}

//FONCTIONS POUR AJOUTER UN ELEMENT POPUP

function AjouterElements(idElement, popupElement, valeur) {
    if (idElement==="input_prov")idElement= 'prov';
    if (idElement==="input_ville")idElement= 'ville';
    if (idElement==="input_type")idElement= 'typeApp';
    if (idElement==="input_prix")idElement= 'prix';
    if (idElement==="input_service")idElement= 'servicesApp';

    document.getElementById(idElement).value = valeur;
    var varPopup = document.getElementsByName(popupElement);
    for (var i = 0; i < varPopup.length; i++) {
        varPopup[i].setAttribute("type", "hidden");
    }
    if (idElement === 'prov'){
        chercherVille(valeur);
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

var count = 0;
function getPrix() {


    if (count === 0) {
        document.getElementById("div_prix").innerHTML += "<input name='popupprixMin' id='popupprixMin' class='typeahead form-control' placeholder='prix Min'  value='' type='text' >";
        document.getElementById("div_prix").innerHTML += "<input name='popupprixMin' id='popupprixMax' class='typeahead form-control' placeholder='prix Max' value='' type='text' >";
        document.getElementById("div_prix").innerHTML += "<input type='submit' id='btnAppliquer' value='Appliquer' onclick=mettrePrix() />";

        count++;
    }

}
function mettrePrix(prixMin, prixMax) {

    var prixMin = document.getElementById("popupprixMin").value;
    var prixMax = document.getElementById("popupprixMax").value;
    if ((prixMin == null) || (prixMin == "")) {

        prixMin = 0;

    };
    if ((prixMax == null) || (prixMax == "")) {

        prixMax = "à Tous ";
    }

    alert(prixMin);

    document.getElementById("prix").value = prixMin + "  CAD  à " + prixMax + "  CAD";
    document.getElementById("popupprixMin").setAttribute("type", "hidden");
    document.getElementById("popupprixMax").setAttribute("type", "hidden");
    document.getElementById("btnAppliquer").setAttribute("type", "hidden");
   


    count = 0;

}
