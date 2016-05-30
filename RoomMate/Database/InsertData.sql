INSERT INTO KAYTTAJAT (kayttajatunnus,enabled,salasana)
VALUES ('Raikka',1,'testi');

INSERT INTO OIKEUDET(oikeudet_id, rooli)
VALUES (1,'kayttaja'), (2,'admin');

INSERT INTO KAYTTAJAOIKEUDET (id, kayttajan_tunnus, oikeus_id)
VALUES (1,'Raikka',1), (2,'Raikka',2);