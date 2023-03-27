drop table if exists genre_book;
DROP TABLE IF EXISTS genre;
drop table if exists book;

CREATE TABLE genre (
    id   BIGINT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
   name  VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE book (
    id   BIGINT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    name  VARCHAR(255) NOT NULL UNIQUE
);

create table genre_book (
  genre_id bigint not null,
  book_id bigint not null
);