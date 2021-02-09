-- create table person
-- (
-- 	id integer not null,
-- 	name varchar(255) not null,
-- 	location varchar(255),
-- 	birth_date timestamp,
-- 	primary key(id)
-- );
-- schema is auto created by spring boot auto configuration in hybernate

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'TOM1', 'REDWOOD', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'TOM2', 'CITY', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'TOM3', 'CA', sysdate());

