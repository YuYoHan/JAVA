-- 스키마 설정은 생략. 해당 사용자로 접속하여 아래의 테이블을 생성.

-- 시퀀스 생성
CREATE
    SEQUENCE user_seq START
    WITH 1 INCREMENT BY 1;
CREATE
    SEQUENCE car_seq START
    WITH 1 INCREMENT BY 1;
CREATE
    SEQUENCE board_seq START
    WITH 1 INCREMENT BY 1;

-- 테이블 생성
CREATE TABLE user
(
    userId    NUMBER PRIMARY KEY,
    userName  VARCHAR2(300)  NOT NULL,
    userPhone VARCHAR2(300)  NOT NULL,
    userAddr  VARCHAR2(2000) NOT NULL,
    userPw    VARCHAR2(300)  NOT NULL
);


CREATE TABLE car
(
    carId     NUMBER PRIMARY KEY,
    carType   VARCHAR2(300)  NOT NULL,
    distance  VARCHAR2(3000) NOT NULL,
    carAge    VARCHAR2(300)  NOT NULL,
    price     VARCHAR2(3000) NOT NULL,
    carOption VARCHAR2(4000),
    userId    NUMBER,
    CONSTRAINT userId_fk2 FOREIGN KEY (userId) REFERENCES user (userId)
);


CREATE TABLE board
(
    boardId      NUMBER PRIMARY KEY,
    boardTitle   VARCHAR2(300) NOT NULL,
    boardDetails VARCHAR2(4000),
    regTime      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    userId       NUMBER,
    CONSTRAINT userId_fk3 FOREIGN KEY (userId) REFERENCES user (userId),
    carId        NUMBER,
    CONSTRAINT carId_fk1 FOREIGN KEY (carId) REFERENCES car (carId)
);


-- 트리거 생성
CREATE
    OR
    REPLACE TRIGGER user_trigger
    BEFORE
        INSERT
    ON user
    FOR EACH ROW
BEGIN
    SELECT user_seq.NEXTVAL
    INTO :NEW.userId
    FROM dual;
END;
/


CREATE OR
    REPLACE TRIGGER car_trigger
    BEFORE
        INSERT
    ON car
    FOR EACH ROW
BEGIN
    SELECT car_seq.NEXTVAL
    INTO :NEW.carId
    FROM dual;
END;
/


CREATE OR
    REPLACE TRIGGER board_trigger
    BEFORE
        INSERT
    ON board
    FOR EACH ROW
BEGIN
    SELECT board_seq.NEXTVAL
    INTO :NEW.boardId
    FROM dual;
END;
/
 
