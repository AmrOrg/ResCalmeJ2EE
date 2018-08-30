create or replace PROCEDURE retournerListeApp (
    p_province IN   VARCHAR,
    p_ville    IN VARCHAR,
    p_description IN VARCHAR,
    p_prix_min IN NUMBER,
    p_prix_max IN NUMBER,
    p_service IN VARCHAR,
    p_resultat_refcur OUT SYS_REFCURSOR
)
IS
BEGIN
    
    OPEN p_resultat_refcur FOR SELECT pays_nom, PROVINCE.prov_nom, VILLE.ville_nom, 
    app_numero, app_numero_civique , app_rue, app_code_postal,type_app_description,
    listagg(serv_description,', ') within group(order by serv_description)serv_description,
    app_statut_disponible, app_prix, SUM(serv_prix)serv_prix, app_image1,app_image2, app_image3, app_image4, app_image5
    FROM PROVINCE
    INNER JOIN PAYS ON PROVINCE.PAYS_ID= PAYS.PAYS_ID 
    INNER JOIN VILLE ON PROVINCE.PROV_ID= VILLE.PROV_ID
    INNER JOIN APPARTEMENT ON VILLE.VILLE_NOM= APPARTEMENT.VILLE_NOM
    INNER JOIN TYPE_APPARTEMENT ON APPARTEMENT.type_appartement_id= TYPE_APPARTEMENT.type_appartement_id
    LEFT OUTER JOIN SERVICE ON APPARTEMENT.appartement_id= SERVICE.appartement_id
    LEFT OUTER JOIN TYPE_SERVICE ON TYPE_SERVICE.TYPE_SERV_ID= SERVICE.TYPE_SERV_ID
    WHERE PROV_NOM LIKE p_province 
    AND VILLE.ville_nom LIKE p_ville 
    AND type_app_description LIKE p_description
    AND  APPARTEMENT.app_prix BETWEEN p_prix_min AND p_prix_max 
    AND serv_description LIKE p_service
    GROUP BY pays_nom, PROVINCE.prov_nom, VILLE.ville_nom, 
    app_numero, app_numero_civique , app_rue, app_code_postal,type_app_description,
    app_statut_disponible, app_prix, app_image1,app_image2, app_image3, app_image4, app_image5
    ORDER BY pays_nom, PROVINCE.prov_nom, VILLE.ville_nom, app_numero, app_numero_civique , app_rue;
END;