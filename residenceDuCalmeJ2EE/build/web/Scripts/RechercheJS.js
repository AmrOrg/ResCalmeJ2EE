$(document).ready(function () {

    $("#btn_recherche").click(function () {

        $.post("srv_InfosAppartement",
                {

                    action: "rechercheListeApp",
                    province: $("#prov").val(),
                    ville: $("#ville").val(),
                    type: $("#typeApp").val(),
                    prixMin: $("#popupprixMin").val(),
                    prixMax: $("#popupprixMax").val(),
                    service:$("#servicesApp").val()
          
                });


    });


});
