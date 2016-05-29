CREATE TABLE KAYTTAJAT (
kayttajatunnus varchar(50) NOT NULL,
enabled tinyint NOT NULL,
salasana varchar(500) NOT NULL,
PRIMARY KEY (kayttajatunnus)
);

CREATE TABLE OIKEUDET (
oikeudet_id integer NOT NULL AUTO_INCREMENT,
rooli varchar(255) NOT NULL UNIQUE,
PRIMARY KEY(oikeudet_id)
);
ALTER TABLE OIKEUDET AUTO_INCREMENT=1;

CREATE TABLE KAYTTAJAOIKEUDET (
id integer NOT NULL AUTO_INCREMENT,
kayttajan_tunnus varchar(50) NOT NULL,
oikeus_id integer NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(kayttajan_tunnus) REFERENCES KAYTTAJAT(kayttajatunnus) ON DELETE NO ACTION ON UPDATE NO ACTION,
FOREIGN KEY(oikeus_id) REFERENCES OIKEUDET(oikeudet_id) ON DELETE NO ACTION ON UPDATE NO ACTION
);
ALTER TABLE KAYTTAJAOIKEUDET AUTO_INCREMENT=1;

CREATE TABLE Imurointi (
imurointi_id int NOT NULL AUTO_INCREMENT,
alue varchar(50) NOT NULL,
paivamaara TIMESTAMP NULL,
kayttajatunnus varchar (50) NOT NULL,
PRIMARY KEY (imurointi_id),
FOREIGN KEY (kayttajatunnus) REFERENCES KAYTTAJAT(kayttajatunnus)
);
ALTER TABLE TUNNIT AUTO_INCREMENT=1;

CREATE TABLE Paperit (
paperit_id int NOT NULL AUTO_INCREMENT,
tyyppi varchar(50) NOT NULL,
paivamaara TIMESTAMP NULL,
kayttajatunnus varchar (50) NOT NULL,
PRIMARY KEY (paperit_id),
FOREIGN KEY (kayttajatunnus) REFERENCES KAYTTAJAT(kayttajatunnus)
);
ALTER TABLE TUNNIT AUTO_INCREMENT=1;
