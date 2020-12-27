alter table customer drop primary key cascade;

drop table customer;

CREATE TABLE customer(
	id varchar2(30) PRIMARY KEY,
	password VARCHAR2(30) NOT NULL,
	name VARCHAR2(50) NOT NULL,
	email VARCHAR2(500) NOT NULL
);

INSERT INTO customer (id, password, name, email) VALUES ('id1', '11', '유재석', 'a@b.com');

commit;

