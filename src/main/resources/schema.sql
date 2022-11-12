create table course (
    id integer identity primary key,
    name varchar(250),
    published_at date
);

drop table rental if exists;
drop table movie if exists;

create table movie (
    id integer identity primary key,
    title varchar(250),
    description varchar(250)
);

create table rental (
    movie integer primary key references movie(id),
    duration varchar(10),
    price integer
);