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
    req.open("GET", url,true);
   req.onreadystatechange = callBack;
    req.send(null);


}

function chercherProv(x) {

    init();
    url = "srv_RechercheApp?province=" + x;
    req.open("GET", url,true);
    req.onreadystatechange = callBack;
    req.send(null);

}

function callBack() {
   

       province.innerHTML = req.responseText;

}
function Mettre(x){
    
    document.getElementById("prov").value = x; 
    province.innerHTML = "";
    
}

