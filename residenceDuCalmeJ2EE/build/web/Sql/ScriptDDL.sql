-- Tables
DROP TABLE ville  CASCADE CONSTRAINTS;
DROP TABLE province  CASCADE CONSTRAINTS;
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
-- Sequences
DROP SEQUENCE adresse_id_seq;
DROP SEQUENCE residence_id_seq;
DROP SEQUENCE type_appartement_id_seq;
DROP SEQUENCE appartement_id_seq;
DROP SEQUENCE reparation_id_seq;
DROP SEQUENCE locataire_id_seq;
DROP SEQUENCE service_id_seq;
DROP SEQUENCE bail_id_seq;

--1 Sequences

CREATE SEQUENCE adresse_id_seq;

CREATE SEQUENCE residence_id_seq;

CREATE SEQUENCE type_appartement_id_seq;

CREATE SEQUENCE appartement_id_seq;

CREATE SEQUENCE reparation_id_seq;

CREATE SEQUENCE locataire_id_seq;

CREATE SEQUENCE service_id_seq;

CREATE SEQUENCE bail_id_seq;

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
    app_prix NUMBER(6,2) NULL,
    app_image1 VARCHAR2(100) NULL,
    app_image2 VARCHAR2(100) NULL,
    app_image3 VARCHAR2(100) NULL,
    app_image4 VARCHAR2(100) NULL,
    app_image5 VARCHAR2(100) NULL,
    app_image6 VARCHAR2(100) NULL,
    app_image7 VARCHAR2(100) NULL,
    app_image8 VARCHAR2(100) NULL,
    app_image9 VARCHAR2(100) NULL,
    app_image10 VARCHAR2(100) NULL,
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
    loc_nom         VARCHAR(30) NOT NULL,
    loc_prenom      VARCHAR(50) NOT NULL,
    loc_username     VARCHAR(50) NOT NULL,
    loc_password     VARCHAR(50) NOT NULL,
    loc_email       VARCHAR(100),
    loc_telephone   VARCHAR(30) NOT NULL,
    CONSTRAINT locataire_username_pk PRIMARY KEY ( loc_username )
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
    loc_username           VARCHAR(50),
    appartement_id          NUMBER(4),
    bail_date              DATE DEFAULT SYSDATE,
    bail_date_debut        DATE NOT NULL,
    bail_date_fin          DATE NOT NULL,
    bail_montant           NUMBER(6,2) NOT NULL,
    bail_montant_service   NUMBER(6,2),
    CONSTRAINT bail_id_pk PRIMARY KEY ( bail_id ),
    CONSTRAINT bail_loca_id_fk FOREIGN KEY ( loc_username )
        REFERENCES locataire ( loc_username ),
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