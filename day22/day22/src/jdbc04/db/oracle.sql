-- 스키마 설정은 생략. 해당 사용자로 접속하여 아래의 테이블을 생성.

-- 시퀀스 생성
CREATE
    SEQUENCE member_seq START
    WITH 1 INCREMENT BY 1;
CREATE
    SEQUENCE goods_seq START
    WITH 1 INCREMENT BY 1;


-- 테이블 생성
CREATE TABLE member
(
    userId    NUMBER PRIMARY KEY,
    userName  VARCHAR2(300)  NOT NULL,
    userPhone VARCHAR2(300)  NOT NULL,
    userAddr  VARCHAR2(2000) NOT NULL,
    userPw    VARCHAR2(300)  NOT NULL
);

create table goods(
    numId number primary key ,
    item varchar2(20),
    qty number,
    price number
);
select * from member;
select * from goods;

drop table member;



-- 트리거 생성
CREATE OR REPLACE TRIGGER member_trigger
BEFORE INSERT ON member
FOR EACH ROW
BEGIN
    SELECT member_seq.NEXTVAL INTO :NEW.userId FROM dual;
END;
/

CREATE OR REPLACE TRIGGER goods_trigger
BEFORE INSERT ON goods
FOR EACH ROW
BEGIN
    SELECT goods_seq.NEXTVAL INTO :NEW.numId FROM dual;
END;
/

