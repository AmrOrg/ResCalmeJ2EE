-- Tables
DROP TABLE ville  CASCADE CONSTRAINTS;
DROP TABLE province  CASCADE CONSTRAINTS;
DROP TABLE pays CASCADE CONSTRAINTS;
DROP TABLE type_appartement CASCADE CONSTRAINTS;
DROP TABLE appartement CASCADE CONSTRAINTS;
DROP TABLE reparation CASCADE CONSTRAINTS;
DROP TABLE locataire CASCADE CONSTRAINTS;
DROP TABLE service CASCADE CONSTRAINTS;
DROP TABLE TYPE_SERVICE CASCADE CONSTRAINTS;


-- Sequences
DROP SEQUENCE adresse_id_seq;
DROP SEQUENCE type_appartement_id_seq;
DROP SEQUENCE appartement_id_seq;
DROP SEQUENCE reparation_id_seq;
DROP SEQUENCE locataire_id_seq;
DROP SEQUENCE service_id_seq;
DROP SEQUENCE type_serv_id_seq;
--1 Sequences

CREATE SEQUENCE adresse_id_seq;

CREATE SEQUENCE type_appartement_id_seq;

CREATE SEQUENCE appartement_id_seq;

CREATE SEQUENCE reparation_id_seq;

CREATE SEQUENCE locataire_id_seq;

CREATE SEQUENCE service_id_seq;

CREATE SEQUENCE type_serv_id_seq;


--2
CREATE TABLE pays (
	pays_id    CHAR(2),
	pays_nom   VARCHAR2(50) NOT NULL,
	CONSTRAINT pays_id_pk PRIMARY KEY ( pays_id )
);
CREATE TABLE province (
        prov_id CHAR(2),
	pays_id    CHAR(2),
	prov_nom   VARCHAR2(50) NOT NULL,
constraint Prov_pay_id_pk primary key (prov_id,pays_id,prov_nom) ,
	CONSTRAINT Province_id_pk Foreign KEY (pays_id) references pays( pays_id )

);
CREATE TABLE ville (
    prov_id CHAR(2),
	ville_nom   VARCHAR2(50) NOT NULL,
constraint ville_prov_nom_pk primary key (prov_id, ville_nom)
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
    ville_nom   VARCHAR2(50) NOT NULL,
    appartement_id        NUMBER(4),
    type_appartement_id     NUMBER(4),
    app_numero              VARCHAR2(16) NOT NULL,
    app_statut_disponible   CHAR(1) DEFAULT 'O',
    app_prix NUMBER(6,2) NULL,
    app_numero_civique   NUMBER(6) NOT NULL,
    app_rue              VARCHAR2(30) NOT NULL,
    app_code_postal      VARCHAR2(16) NOT NULL,
    app_image1 VARCHAR2(100) NULL,
    app_image2 VARCHAR2(100) NULL,
    app_image3 VARCHAR2(100) NULL,
    app_image4 VARCHAR2(100) NULL,
    app_image5 VARCHAR2(100) NULL,
    CONSTRAINT appartement_id_pk PRIMARY KEY ( appartement_id ),
    CONSTRAINT app_type_app_id_fk FOREIGN KEY ( type_appartement_id )
        REFERENCES type_appartement ( type_appartement_id ),
    CONSTRAINT app_ville_nom_UN UNIQUE (ville_nom, app_code_postal)
);
--6
CREATE TABLE TYPE_SERVICE (
    type_serv_id         NUMBER(4),
    serv_description   VARCHAR2(30),
    serv_prix          NUMBER(6,2),
    CONSTRAINT type_service_id_pk PRIMARY KEY ( type_serv_id )
);

CREATE TABLE service (
    service_id         NUMBER(4),
    type_serv_id       NUMBER(4),
    appartement_id     NUMBER(4),
    CONSTRAINT service_id_pk PRIMARY KEY ( service_id ),
    CONSTRAINT type_service_id_fk FOREIGN KEY ( type_serv_id )
    REFERENCES TYPE_SERVICE ( type_serv_id ),
    CONSTRAINT service_app_id_fk FOREIGN KEY ( appartement_id )
    REFERENCES appartement ( appartement_id )
);

--7
CREATE TABLE reparation (
    reparation_id          NUMBER(4),
    appartement_id         NUMBER(4),
    reparation_date          DATE NOT NULL,
    reparation_description   VARCHAR2(30) NOT NULL,
    reparation_montant       NUMBER(6,2) NOT NULL,
    CONSTRAINT reparation_id_pk PRIMARY KEY ( reparation_id ),
    CONSTRAINT rep_app_id_fk FOREIGN KEY ( appartement_id )
        REFERENCES appartement ( appartement_id )
);
--8
CREATE TABLE locataire (
    loc_nom         VARCHAR(30) NOT NULL,
    loc_prenom      VARCHAR(50) NOT NULL,
    loc_username     VARCHAR(50) NOT NULL,
    loc_password     VARCHAR(50) NOT NULL,
    loc_email       VARCHAR(100),
    loc_telephone   VARCHAR(30) NOT NULL,
    CONSTRAINT loc_username_pk PRIMARY KEY ( loc_username )
);

--3 Indexes
CREATE INDEX apparetement_statut_idx ON
    appartement ( app_statut_disponible );

CREATE INDEX locataire_nom_idx ON
    locataire ( loc_nom,
    loc_prenom );

CREATE INDEX service_description_idx ON
    TYPE_SERVICE ( serv_description );
