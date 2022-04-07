CREATE DATABASE Pvr_Cinema;

USE Pvr_Cinema;

CREATE TABLE admin (admin_id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT, admin_name NOT NULL UNIQUE, admin_password varchar(255) NOT NULL);

CREATE TABLE users (user_id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,name varchar(255) NOT NULL, email_id varchar(255) NOT NULL UNIQUE, password varchar(255) NOT NULL);

CREATE TABLE movie (movie_id bigint NOT NULL PRIMARY KEY, movie_name varchar(255) NOT NULL UNIQUE, hero_name varchar(255) NOT NULL, movie_language varchar(255) NOT NULL, movie_type varchar(255) NOT NULL, cbfc_rating varchar(255) NOT NULL);


CREATE TABLE seat_booking(seat_id bigint NOT NULL PRIMARY KEY, selected_seats int(2) NOT NULL, CHECK(selected_seats <= 10), price int DEFAULT "120" NOT NULL, date date NOT NULL, movie_name varchar(255), FOREIGN KEY (movie_name) REFERENCES movie(movie_name));

CREATE TABLE payment (user_id bigint, seat_id bigint, card_number bigint NOT NULL UNIQUE, card_holder varchar(255) NOT NULL, FOREIGN KEY (user_id) REFERENCES users(user_id), FOREIGN KEY (seat_id) REFERENCES seat_booking(seat_id));
