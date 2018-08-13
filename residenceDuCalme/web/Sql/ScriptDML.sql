-- 2 DML
DELETE FROM pays;
DELETE FROM adresse;
DELETE FROM residence;
DELETE FROM type_appartement;
DELETE FROM appartement;
DELETE FROM reparation;
DELETE FROM locataire;
DELETE FROM service;
DELETE FROM bail;
DELETE FROM bail_service;
DELETE FROM paiement_commentaires;
DELETE FROM paiement;

--Pays
INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'CA',
    'Canada'
);

INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'US',
    'United States of America'
);

INSERT INTO pays (
    pays_id,
    pays_nom
) VALUES (
    'AR',
    'Argentina'
);
-- Adresse Residence --1
INSERT INTO adresse (
    adresse_id,
    pays_id,
    add_numero_civique,
    add_rue,
    add_province,
    add_ville,
    add_code_postal
) VALUES (
    adresse_id_seq.NEXTVAL,
    'CA',
    1800,
    'Spadina Ave',
    'Toronto',
    'Ontario',
    'M5V 2L7'
);
-- Adresse Residence --2
INSERT INTO adresse (
    adresse_id,
    pays_id,
    add_numero_civique,
    add_rue,
    add_province,
    add_ville,
    add_code_postal
) VALUES (
    adresse_id_seq.NEXTVAL,
    'US',
    7441,
    '12 E. Spadina Ave',
    'New York',
    'Brooklyn',
    '1234UCF'
);
--RESIDENCE 1
INSERT INTO residence (
    residence_id,
    adresse_id,
    res_nom,
    res_nombre_app,
    res_nombre_etages,
    res_prix_achat
) VALUES (
    residence_id_seq.NEXTVAL,
    1,
    'Residence du calme',
    45,
    12,
    750000
);
--RESIDENCE 2
INSERT INTO residence (
    residence_id,
    adresse_id,
    res_nom,
    res_nombre_app,
    res_nombre_etages,
    res_prix_achat
) VALUES (
    residence_id_seq.NEXTVAL,
    2,
    'PEACE RESIDENTIAL',
    55,
    8,
    450000
);

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
    appartement_id,
    residence_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible
) VALUES (
    appartement_id_seq.NEXTVAL,
    1,
    1,
    1,
    'N'
);

INSERT INTO appartement (
    appartement_id,
    residence_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible
) VALUES (
    appartement_id_seq.NEXTVAL,
    1,
    2,
    2,
    'N'
);

INSERT INTO appartement (
    appartement_id,
    residence_id,
    type_appartement_id,
    app_numero,
    app_statut_disponible
) VALUES (
    appartement_id_seq.NEXTVAL,
    1,
    2,
    3,
    'O'
);
-- LOCATAIRE
INSERT INTO locataire (
    locataire_id,
    loc_nom,
    loc_prenom,
    loc_email,
    loc_telephone
) VALUES (
    locataire_id_seq.NEXTVAL,
    'DESPRES',
    'CHRISTIAN',
    'dchristian@gmail.com',
    '5147859823'
);

INSERT INTO locataire (
    locataire_id,
    loc_nom,
    loc_prenom,
    loc_email,
    loc_telephone
) VALUES (
    locataire_id_seq.NEXTVAL,
    'KING',
    'STEVEN',
    'ksteven@gmail.com',
    '4385621458'
);

--REPARATION
INSERT INTO reparation (
    reparation_id,
    residence_id,
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
    residence_id,
    reparation_date,
    reparation_description,
    reparation_montant
) VALUES (
    reparation_id_seq.NEXTVAL,
    1,
    TO_DATE('2017-11-17','YYYY-MM-DD'),
    'Plomberie',
    4500
);

INSERT INTO reparation (
    reparation_id,
    residence_id,
    reparation_date,
    reparation_description,
    reparation_montant
) VALUES (
    reparation_id_seq.NEXTVAL,
    1,
    TO_DATE('2017-11-17','YYYY-MM-DD'),
    'Porte',
    1550
);

--SERVICE

INSERT INTO service (
    service_id,
    serv_description,
    serv_prix
) VALUES (
    service_id_seq.NEXTVAL,
    'Stationnement',
    75
);

INSERT INTO service (
    service_id,
    serv_description,
    serv_prix
) VALUES (
    service_id_seq.NEXTVAL,
    'Chauffage',
    120
);

INSERT INTO service (
    service_id,
    serv_description,
    serv_prix
) VALUES (
    service_id_seq.NEXTVAL,
    'Meuble',
    50
);
-- BAIL

INSERT INTO bail (
    bail_id,
    locataire_id,
	appartement_id,
    bail_date,
    bail_date_debut,
    bail_date_fin,
    bail_montant,
    bail_montant_service
) VALUES (
    bail_id_seq.NEXTVAL,
    1,
	1,
    TO_DATE('2017-06-29','YYYY-MM-DD'),
    TO_DATE('2017-07-01','YYYY-MM-DD'),
    TO_DATE('2018-07-01','YYYY-MM-DD'),
    650,
    195
);

INSERT INTO bail (
    bail_id,
    locataire_id,
	appartement_id,
    bail_date,
    bail_date_debut,
    bail_date_fin,
    bail_montant,
    bail_montant_service
) VALUES (
    bail_id_seq.NEXTVAL,
    2,
	2,
    TO_DATE('2017-05-29','YYYY-MM-DD'),
    TO_DATE('2017-06-01','YYYY-MM-DD'),
    TO_DATE('2018-06-01','YYYY-MM-DD'),
    750,
    120
);

--BAIL_SERVICE
INSERT INTO bail_service (
    bail_id,
    service_id,
    bail_duree
) VALUES (
    1,
    1,
    12
);
INSERT INTO bail_service (
    bail_id,
    service_id,
    bail_duree
) VALUES (
    1,
    2,
    12
);
INSERT INTO bail_service (
    bail_id,
    service_id,
    bail_duree
) VALUES (
    2,
    2,
    12
);

-- PAIEMENT_COMMENTAIRES
INSERT INTO paiement_commentaires(comentaire_desc) 
VALUES('Paiement effectue a temps');
INSERT INTO paiement_commentaires(comentaire_desc) 
VALUES('Paiement effectue en retard');

--PAIEMENT

INSERT INTO paiement (
    bail_id,
	commentaire_id,
    paie_date,
    paie_date_acquittee,
    paie_montant
) VALUES (
    1,
    1,
    TO_DATE('2017-08-01','YYYY-MM-DD'),
    TO_DATE('2017-07-01','YYYY-MM-DD'),
    845
);

INSERT INTO paiement (
    bail_id,
	commentaire_id,
    paie_date,
    paie_date_acquittee,
    paie_montant
) VALUES (
    1,
    2,
    TO_DATE('2017-09-05','YYYY-MM-DD'),
    TO_DATE('2017-08-01','YYYY-MM-DD'),
    845
);

INSERT INTO paiement (
    bail_id,
	commentaire_id,
    paie_date,
    paie_date_acquittee,
    paie_montant
) VALUES (
    1,
    1,
    TO_DATE('2017-10-03','YYYY-MM-DD'),
    TO_DATE('2017-09-01','YYYY-MM-DD'),
    845
);

INSERT INTO paiement (
    bail_id,
	commentaire_id,
    paie_date,
    paie_date_acquittee,
    paie_montant
) VALUES (
    2,
    1,
    TO_DATE('2017-07-01','YYYY-MM-DD'),
    TO_DATE('2017-06-01','YYYY-MM-DD'),
    870
);

COMMIT;