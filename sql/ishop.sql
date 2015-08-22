--members 맴버 테이블
select * from shopmember;
DROP TABLE SHOPMEMBER;
DROP SEQUENCE shopmember_no_seq;

CREATE TABLE SHOPMEMBER
(
	no				NUMBER(8),
	id				VARCHAR2(255),
	password		VARCHAR2(255),
	name			VARCHAR2(50),
	birthday		VARCHAR2(50),
	phone_number	VARCHAR2(30),
	handphone		VARCHAR2(30),
	email			VARCHAR2(40),
	address			VARCHAR2(255),
	condition		VARCHAR2(255),
	type			VARCHAR2(255)
);

ALTER TABLE SHOPMEMBER
ADD ( CONSTRAINT shopmember_no_pk PRIMARY KEY ( no ) );

CREATE SEQUENCE shopmember_no_seq START WITH 1
                              INCREMENT BY 1
                              MAXVALUE 99999999
                              NOCACHE
                              NOCYCLE;

--members 상품정보 테이블
create table shopbracelet
(
   no         		NUMBER (8),
   name       		VARCHAR2 (30)
);

create table shopbraceletview
(
	no				NUMBER(8),
	pd_group		NUMBER(8),
	pd_name			VARCHAR2(50),
	pd_manufacture	VARCHAR2(255),
	pd_price		NUMBER(8),
	pd_exp			VARCHAR2(4000),
	pd_condition	VARCHAR2(255),
	pd_date			DATE,
	new_pd			VARCHAR2(50),
	pd_hit			VARCHAR2(50),
	pd_sale			VARCHAR2(50),
	pd_discount		NUMBER(8),
	pd_image		ORDImage
);



