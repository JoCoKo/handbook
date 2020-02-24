create table if not exists HANDBOOK
(
    ID LONG auto_increment
        primary key,
    NAME VARCHAR(255) not null,
    NAMESHORT VARCHAR(255) not null
);

insert into HANDBOOK (ID,NAME,NAMESHORT)
select * from (
    select 1,'first', 'F' union
    select 2,'second', 'S' union
    select 3,'third', 'T' union
    select 4,'forth', 'Fo')
where not exists(select * from HANDBOOK);