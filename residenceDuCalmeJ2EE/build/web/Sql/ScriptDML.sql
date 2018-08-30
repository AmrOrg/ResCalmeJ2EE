-- 2 DML
DELETE FROM ville;
DELETE FROM province;
DELETE FROM pays;
DELETE FROM type_appartement;
DELETE FROM appartement;
DELETE FROM reparation;
DELETE FROM locataire;
DELETE FROM service;
DELETE FROM type_service;

--Pays
INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'CA',
    'CANADA'
);

INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'US',
    'USA'
);

INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'AR',
    'ARGENTINE'
);

-- Province
INSERT INTO PROVINCE VALUES('QC','CA','QUEBEC');
INSERT INTO PROVINCE VALUES('AB','CA','ALBERTA');
INSERT INTO PROVINCE VALUES('BC','CA','COLOMBIE-BRITANNIQUE');
INSERT INTO PROVINCE VALUES('NB','CA','NOUVEAU-BRUNSWICK');
INSERT INTO PROVINCE VALUES('NS','CA','NOUVELLE-ÉCOSSE');

--Ville
INSERT INTO VILLE VALUES('QC', 'MONTREAL');
INSERT INTO VILLE VALUES('QC', 'LAVAL');
INSERT INTO VILLE VALUES('QC', 'REPENTIGNY');

INSERT INTO VILLE VALUES('AB', 'CALGARY');
INSERT INTO VILLE VALUES('AB', 'EDMONTON');
INSERT INTO VILLE VALUES('AB', 'SAINT ALBERT');

INSERT INTO VILLE VALUES('BC', 'OKANAGAN');
INSERT INTO VILLE VALUES('BC', 'CARIBOO');
INSERT INTO VILLE VALUES('BC', 'CHICOTIN');

--TYPE_APPARTEMENT
INSERT INTO type_appartement (
    type_appartement_id,
    type_app_description,
    type_app_nb_chambres,
    type_app_nb_salle_bains,
    type_app_cout
) VALUES (
    type_appartement_id_seq.NEXTVAL,
    '1-1/2',
    1,
    1,
    650
);
INSERT INTO type_appartement (
    type_appartement_id,
    type_app_description,
    type_app_nb_chambres,
    type_app_nb_salle_bains,
    type_app_cout
) VALUES (
    type_appartement_id_seq.NEXTVAL,
    '3-1/2',
    2,
    1,
    750
);
INSERT INTO type_appartement (
    type_appartement_id,
    type_app_description,
    type_app_nb_chambres,
    type_app_nb_salle_bains,
    type_app_cout
) VALUES (
    type_appartement_id_seq.NEXTVAL,
    '4-1/2',
    3,
    1,
    850
);
INSERT INTO type_appartement (
    type_appartement_id,
    type_app_description,
    type_app_nb_chambres,
    type_app_nb_salle_bains,
    type_app_cout
) VALUES (
    type_appartement_id_seq.NEXTVAL,
    '5-1/2',
    4,
    1,
    950
);
INSERT INTO type_appartement (
    type_appartement_id,
    type_app_description,
    type_app_nb_chambres,
    type_app_nb_salle_bains,
    type_app_cout
) VALUES (
    type_appartement_id_seq.NEXTVAL,
    '6-1/2',
    5,
    1,
    1050
);

--APPARTEMENT
INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix,
    app_numero_civique,   
    app_rue,              
    app_code_postal ,     
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'MONTREAL',
    appartement_id_seq.NEXTVAL,
    1,
    10,
    'N',
    750,
    1800,
    'Spadina Ave',
    'M5V 2L7',
    'images/appartments/image1.jpg',
    'images/appartments/image2.jpg',
    'images/appartments/image3.jpg',
    'images/appartments/image4.jpg',
    'images/appartments/image5.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix, 
    app_numero_civique,   
    app_rue,              
    app_code_postal , 
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'MONTREAL',
    appartement_id_seq.NEXTVAL,
    2,
    11,
    'N',
    800,
    8761,
    'Rue de Marseille',
    'H1L 1S3',
    'images/appartments/image6.jpg',
    'images/appartments/image7.jpg',
    'images/appartments/image8.jpg',
    'images/appartments/image9.jpg',
    'images/appartments/image10.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix, 
    app_numero_civique,   
    app_rue,              
    app_code_postal , 
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'REPENTIGNY',
    appartement_id_seq.NEXTVAL,
    3,
    12,
    'O',
    850,
    9189,
    'Rue de Teck',
    'H1L 1L2',
    'images/appartments/image11.jpg',
    'images/appartments/image12.jpg',
    'images/appartments/image13.jpg',
    'images/appartments/image14.jpg',
    'images/appartments/image15.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix,
    app_numero_civique,   
    app_rue,              
    app_code_postal ,  
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'MONTREAL',
    appartement_id_seq.NEXTVAL,
    4,
    14,
    'O',
    650,
    5160,
    'Boulevard Décarie',
    'H3X 2H9',
    'images/appartments/image11.jpg',
    'images/appartments/image12.jpg',
    'images/appartments/image13.jpg',
    'images/appartments/image14.jpg',
    'images/appartments/image15.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix, 
    app_numero_civique,   
    app_rue,              
    app_code_postal , 
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'LAVAL',
    appartement_id_seq.NEXTVAL,
    5,
    15,
    'N',
    780,
    7701,
    'Louis-H.-La Fontaine',
    'H1K 4B9',
    'images/appartments/image11.jpg',
    'images/appartments/image12.jpg',
    'images/appartments/image13.jpg',
    'images/appartments/image14.jpg',
    'images/appartments/image15.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix, 
    app_numero_civique,   
    app_rue,              
    app_code_postal , 
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'CALGARY',
    appartement_id_seq.NEXTVAL,
    4,
    16,
    'O',
    1200,
    12426 ,
    'Covntry Hlls WY NE',
    'T3K 4T1',
    'images/appartments/image6.jpg',
    'images/appartments/image7.jpg',
    'images/appartments/image8.jpg',
    'images/appartments/image9.jpg',
    'images/appartments/image10.jpg'
);

INSERT INTO appartement (
    ville_nom,
    appartement_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible,
    app_prix, 
    app_numero_civique,   
    app_rue,              
    app_code_postal , 
    app_image1, 
    app_image2, 
    app_image3, 
    app_image4, 
    app_image5
) VALUES (
    'CALGARY',
    appartement_id_seq.NEXTVAL,
    5,
    15,
    'O',
    1200,
    1855 ,
    'Evergreen Dr SW',
    'T2Y 5B1',
    'images/appartments/image14.jpg',
    'images/appartments/image16.jpg',
    'images/appartments/image18.jpg',
    'images/appartments/image19.jpg',
    'images/appartments/image20.jpg'
);

-- LOCATAIRE
INSERT INTO locataire (
    loc_nom,
    loc_prenom,
    loc_username,
    loc_password,
    loc_email,
    loc_telephone
) VALUES (
    'DESPRES',
    'CHRISTIAN',
    'dchristian',
    'password',
    'dchristian@gmail.com',
    '5147859823'
);

-- LOCATAIRE
INSERT INTO locataire (
    loc_nom,
    loc_prenom,
    loc_username,
    loc_password,
    loc_email,
    loc_telephone
) VALUES (
    'MANNON',
    'CHLOE',
    'mchloe',
    'password',
    'mchloe@gmail.com',
    '5148579585'
);

--REPARATION
INSERT INTO reparation (
    reparation_id,
    appartement_id,
    reparation_date,
    reparation_description,
    reparation_montant
) VALUES (
    reparation_id_seq.NEXTVAL,
    1,
    TO_DATE('2017-09-17','YYYY-MM-DD'),
    'Peinture',
    2500
);

INSERT INTO reparation (
    reparation_id,
    appartement_id,
    reparation_date,
    reparation_description,
    reparation_montant
) VALUES (
    reparation_id_seq.NEXTVAL,
    2,
    TO_DATE('2017-11-17','YYYY-MM-DD'),
    'Plomberie',
    4500
);

INSERT INTO reparation (
    reparation_id,
    appartement_id,
    reparation_date,
    reparation_description,
    reparation_montant
) VALUES (
    reparation_id_seq.NEXTVAL,
    2,
    TO_DATE('2017-11-17','YYYY-MM-DD'),
    'Porte',
    1550
);

-- TYPE_SERVICE
INSERT INTO TYPE_SERVICE (
    type_serv_id,
    serv_description,
    serv_prix
) VALUES (
    type_serv_id_seq.NEXTVAL,
    'Stationnement',
    75
);

INSERT INTO TYPE_SERVICE (
    type_serv_id,
    serv_description,
    serv_prix
) VALUES (
    type_serv_id_seq.NEXTVAL,
    'Chauffage',
    120
);

INSERT INTO TYPE_SERVICE (
    type_serv_id,
    serv_description,
    serv_prix
) VALUES (
    type_serv_id_seq.NEXTVAL,
    'Meuble',
    50
);


-- SERVICE
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    1,
    1
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    1,
    1
);

INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    2,
    3
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    3,
    3
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    4,
    3
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    5,
    1
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    6,
    1
);

INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    7,
    1
);
INSERT INTO service (
    service_id,
    appartement_id,
    type_serv_id
) VALUES (
    service_id_seq.NEXTVAL,
    7,
    3
);

COMMIT;