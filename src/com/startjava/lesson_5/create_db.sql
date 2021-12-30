-- create database

CREATE TABLE Jaegers (
    ID SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height REAL,
    weight REAL,
    status CHAR(9),
    origin TEXT,
    launch INTEGER,
    kaijuKill INTEGER
);