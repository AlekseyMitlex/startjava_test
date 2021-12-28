-- create database

CREATE TABLE Jaegers (
    ID SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height REAL,
    weight REAL,
    origin TEXT,
    launch INTEGER,
    kaijuKill INTEGER
);