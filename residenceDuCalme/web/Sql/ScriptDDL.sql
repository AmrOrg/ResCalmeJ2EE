-- Tables
DROP TABLE pays CASCADE CONSTRAINTS;
DROP TABLE adresse CASCADE CONSTRAINTS;
DROP TABLE residence CASCADE CONSTRAINTS;
DROP TABLE type_appartement CASCADE CONSTRAINTS;
DROP TABLE appartement CASCADE CONSTRAINTS;
DROP TABLE reparation CASCADE CONSTRAINTS;
DROP TABLE locataire CASCADE CONSTRAINTS;
DROP TABLE service CASCADE CONSTRAINTS;
DROP TABLE bail CASCADE CONSTRAINTS;
DROP TABLE bail_service CASCADE CONSTRAINTS;
DROP TABLE paiement_commentaires CASCADE CONSTRAINTS;
DROP TABLE paiement CASCADE CONSTRAINTS;
-- Sequences
DROP SEQUENCE adresse_id_seq;
DROP SEQUENCE residence_id_seq;
DROP SEQUENCE type_appartement_id_seq;
DROP SEQUENCE appartement_id_seq;
DROP SEQUENCE reparation_id_seq;
DROP SEQUENCE locataire_id_seq;
DROP SEQUENCE service_id_seq;
DROP SEQUENCE bail_id_seq;

--1
CREATE TABLE pays (
	pays_id    CHAR(2),
	pays_nom   VARCHAR2(50) NOT NULL,
	CONSTRAINT pays_id_pk PRIMARY KEY ( pays_id )
);
--2
CREATE TABLE adresse (
	adresse_id           NUMBER(4),
	pays_id              CHAR(2),
	add_numero_civique   NUMBER(6) NOT NULL,
	add_rue              VARCHAR2(30) NOT NULL,
	add_province         VARCHAR2(30) NOT NULL,
	add_ville            VARCHAR2(30) NOT NULL,
	add_code_postal      VARCHAR2(16) NOT NULL,
	CONSTRAINT addrese_id_pk PRIMARY KEY ( adresse_id ),
	CONSTRAINT adresse_pays_id_fk FOREIGN KEY ( pays_id )
		REFERENCES pays ( pays_id )
);
--3
CREATE TABLE residence (
    residence_id        NUMBER(4),
    adresse_id          NUMBER(4),
    res_nom             VARCHAR2(30),
    res_nombre_app      NUMBER(4) NOT NULL,
    res_nombre_etages   NUMBER(2) NOT NULL,
    res_prix_achat      NUMBER(8,2) NOT NULL,
    CONSTRAINT residence_id_pk PRIMARY KEY ( residence_id ),
    CONSTRAINT residence_addr_id_fk FOREIGN KEY ( adresse_id )
        REFERENCES adresse ( adresse_id )
);
--4
CREATE TABLE type_appartement (
    type_appartement_id       NUMBER(4),
    type_app_description      VARCHAR2(16) NOT NULL,
    type_app_nb_chambres      NUMBER(2),
    type_app_nb_salle_bains   NUMBER(2),
    type_app_cout             NUMBER(6,2) NOT NULL,
    CONSTRAINT type_app_id_pk PRIMARY KEY ( type_appartement_id )
);
-- 5
CREATE TABLE appartement (
    appartement_id          NUMBER(4),
    residence_id            NUMBER(4),
    type_appartement_id     NUMBER(4),
    app_numero              VARCHAR2(16) NOT NULL,
    app_statut_disponible   CHAR(1) DEFAULT 'O',
    CONSTRAINT appartement_id_pk PRIMARY KEY ( appartement_id ),
    CONSTRAINT app_residence_id_fk FOREIGN KEY ( residence_id )
        REFERENCES residence ( residence_id ),
    CONSTRAINT app_type_app_id_fk FOREIGN KEY ( type_appartement_id )
        REFERENCES type_appartement ( type_appartement_id )
);
--6
CREATE TABLE reparation (
    reparation_id            NUMBER(4),
    residence_id             NUMBER(4),
    reparation_date          DATE NOT NULL,
    reparation_description   VARCHAR2(30) NOT NULL,
    reparation_montant       NUMBER(6,2) NOT NULL,
    CONSTRAINT reparation_id_pk PRIMARY KEY ( reparation_id ),
    CONSTRAINT rep_res_id_fk FOREIGN KEY ( residence_id )
        REFERENCES residence ( residence_id )
);
--7
CREATE TABLE locataire (
    locataire_id    NUMBER(4),
    loc_nom         VARCHAR2(30) NOT NULL,
    loc_prenom      VARCHAR(50) NOT NULL,
    loc_email       VARCHAR2(100),
    loc_telephone   VARCHAR2(30) NOT NULL,
    CONSTRAINT locataire_id_pk PRIMARY KEY ( locataire_id )
);
--8
CREATE TABLE service (
    service_id         NUMBER(4),
    serv_description   VARCHAR2(30),
    serv_prix          NUMBER(6,2),
    CONSTRAINT service_id_pk PRIMARY KEY ( service_id )
);
--9
CREATE TABLE bail (
    bail_id                NUMBER(4),
    locataire_id           NUMBER(4),
	appartement_id          NUMBER(4),
    bail_date              DATE DEFAULT SYSDATE,
    bail_date_debut        DATE NOT NULL,
    bail_date_fin          DATE NOT NULL,
    bail_montant           NUMBER(6,2) NOT NULL,
    bail_montant_service   NUMBER(6,2),
    CONSTRAINT bail_id_pk PRIMARY KEY ( bail_id ),
    CONSTRAINT bail_loca_id_fk FOREIGN KEY ( locataire_id )
        REFERENCES locataire ( locataire_id ),
	CONSTRAINT bail_app_id_fk FOREIGN KEY ( appartement_id )
        REFERENCES appartement ( appartement_id )
);
--10
CREATE TABLE bail_service (
    bail_id      NUMBER(4),
    service_id   NUMBER(4),
    bail_duree   NUMBER(2) NOT NULL,
    CONSTRAINT bailserv_id_pk PRIMARY KEY ( bail_id,
    service_id ),
    CONSTRAINT bailserv_bail_id_fk FOREIGN KEY ( bail_id )
        REFERENCES bail ( bail_id ),
    CONSTRAINT bailserv_service_id_fk FOREIGN KEY ( service_id )
        REFERENCES service ( service_id )
);
--11
CREATE  TABLE paiement_commentaires(
	commentaire_id   NUMBER(4)
		GENERATED BY DEFAULT AS IDENTITY,
	comentaire_desc VARCHAR2(30),
	CONSTRAINT commentaire_id_PK PRIMARY KEY ( commentaire_id )
);
--12
CREATE TABLE paiement (
    paiement_id           NUMBER(4)
        GENERATED BY DEFAULT AS IDENTITY,
    bail_id                NUMBER(4),
	commentaire_id NUMBER(4),
    paie_date             DATE DEFAULT SYSDATE,
    paie_date_acquittee   DATE,
    paie_montant          NUMBER(6,2),
    CONSTRAINT paiement_id_pk PRIMARY KEY ( paiement_id ),
    CONSTRAINT paiebail_id_fk FOREIGN KEY ( bail_id )
        REFERENCES bail ( bail_id ),
    CONSTRAINT paiecomment_id_fk FOREIGN KEY ( commentaire_id )
        REFERENCES paiement_commentaires ( commentaire_id )
);

--2 Sequences

CREATE SEQUENCE adresse_id_seq;

CREATE SEQUENCE residence_id_seq;

CREATE SEQUENCE type_appartement_id_seq;

CREATE SEQUENCE appartement_id_seq;

CREATE SEQUENCE reparation_id_seq;

CREATE SEQUENCE locataire_id_seq;

CREATE SEQUENCE service_id_seq;

CREATE SEQUENCE bail_id_seq;

--3 Indexes

CREATE INDEX apparetement_statut_idx ON
    appartement ( app_statut_disponible );

CREATE INDEX locataire_nom_idx ON
    locataire ( loc_nom,
    loc_prenom );

CREATE INDEX service_description_idx ON
    service ( serv_description );

CREATE INDEX bail_date_debut_dx ON
    bail ( bail_date_debut );

CREATE INDEX bail_date_fin_dx ON
    bail ( bail_date_fin );

CREATE INDEX bail_montant_idx ON
    bail ( bail_montant );

CREATE INDEX bail_montant_service_idx ON
    bail ( bail_montant_service );

CREATE INDEX paie_date_idx ON
    paiement ( paie_date );

CREATE INDEX paie_aquitte_idx ON
    paiement ( paie_date_acquittee );

CREATE INDEX paie_montant_idx ON
    paiement ( paie_montant );

--4 Views

CREATE OR REPLACE VIEW locataire_ca_view (
    locataire_id,
    nom,
    prenom,
    telephone,
    numero_app,
    numero_civique_app,
    rue_app,
    province_app,
    ville_app,
    code_postal_app
) AS
    SELECT
        locataire_id,
        loc_nom,
        loc_prenom,
        loc_telephone,
        app_numero,
        add_numero_civique,
        add_rue,
        add_province,
        add_ville,
        add_code_postal
    FROM
        locataire
		JOIN bail USING( locataire_id )
        JOIN appartement USING ( appartement_id )
        JOIN residence USING ( residence_id )
        JOIN adresse USING ( adresse_id )
    WHERE
        pays_id = 'CA'
WITH READ ONLY;

CREATE OR REPLACE VIEW reparation_ca_view (
    nom_residence,
    description,
    montant
) AS
    SELECT
        res.res_nom,
        rep.reparation_description,
        SUM(rep.reparation_montant)
    FROM
        reparation rep
        JOIN residence res ON ( rep.residence_id = res.residence_id )
        JOIN adresse adr ON ( res.adresse_id = adr.adresse_id )
    WHERE
        adr.pays_id = 'CA'
    GROUP BY
        res.res_nom,
        rep.reparation_description
    ORDER BY
        res.res_nom,
        rep.reparation_description
WITH READ ONLY;
  
-- Fonction personnalis�e

CREATE OR REPLACE FUNCTION formater_phone (
    p_phone IN VARCHAR2
) RETURN VARCHAR2
    AS
BEGIN
    RETURN '('
    || substr(p_phone,1,3)
    || ')'
    || substr(p_phone,4,3)
    || '-'
    || substr(p_phone,7);
END formater_phone;