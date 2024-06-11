use ry;
drop table if exists accounts;

create table accounts
(
    accountId    bigint(20)                         not null auto_increment primary key comment '账号ID',
    accountName  varchar(216)                       not null comment '账号名',
    userName     varchar(216)                       not null comment '姓名',
    userPassword varchar(216)                       not null comment '密码',
    identify     varchar(216)                       not null comment '身份',
    school       varchar(216) comment '学校',
    groupType    varchar(216) comment '报名组别',
    avatar       varchar(512) comment '头像',
    createTime   datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
);
