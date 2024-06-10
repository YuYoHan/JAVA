-- 스키마 설정은 생략. 해당 사용자로 접속하여 아래의 테이블을 생성.

-- 시퀀스 생성
CREATE
    SEQUENCE members_seq START
    WITH 1 INCREMENT BY 1;
CREATE
    SEQUENCE goods_seq START
    WITH 1 INCREMENT BY 1;


-- 테이블 생성
create table members(
    userId    NUMBER PRIMARY KEY,
    userName  VARCHAR2(300)  NOT NULL,
    userPw    VARCHAR2(300)  NOT NULL,
    userAddr  VARCHAR2(1000) NOT NULL,
    userPhone VARCHAR2(300)  NOT NULL
);

insert into members values (members_seq.NEXTVAL, '체크', 'Dudtjq8990!', '종로', '010-0000-0000');
select * from members;

create table goods(
numId number primary key ,
item varchar2(20),
qty number,
price number
);
select * from goods;


-- 트리거 생성
CREATE OR REPLACE TRIGGER members_trigger
BEFORE INSERT ON members
FOR EACH ROW
BEGIN
    SELECT members_seq.NEXTVAL INTO :NEW.userId FROM dual;
END;
/

CREATE OR REPLACE TRIGGER goods_trigger
BEFORE INSERT ON goods
FOR EACH ROW
BEGIN
    SELECT goods_seq.NEXTVAL INTO :NEW.numId FROM dual;
END;
/

