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
    id integer identity primary key,
    movie integer references movie(id),
    movie_key integer,
    duration varchar(10),
    price integer
);

create table author (
    id integer identity primary key,
    name varchar(50),
    birth_date date
);

create table book (
    id integer identity primary key,
    title varchar(255),
    isbn varchar(255)
);

create table book_author (
    author integer,
    book integer,
    primary key (author, book)
);