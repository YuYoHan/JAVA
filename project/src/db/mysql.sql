create database java_project02;

create table user
(
    userId    bigint auto_increment primary key,
    userName  varchar(300)  not null,
    userPw    varchar(300)  not null,
    userPhone varchar(300)  not null,
    userAddr  varchar(2000) not null
);

use java_project02;


create table car
(
    carId     bigint primary key auto_increment,
    carType   varchar(300)  not null,
    distance  varchar(3000) not null,
    carAge    varchar(300)  not null,
    price     varchar(3000) not null,
    carOption varchar(4000),
    userId    bigint,
    constraint userId_fk2 foreign key (userId) references user (userId)
);

create table board(
    boardId bigint primary key auto_increment,
    boardTitle varchar(300) not null ,
    boardDetails varchar(4000),
    regTime datetime default now(),
    userId  bigint,
    constraint userId_fk3 foreign key (userId) references user (userId),
    carId bigint,
    constraint carId_fk1 foreign key (carId) references car(carId)
);
