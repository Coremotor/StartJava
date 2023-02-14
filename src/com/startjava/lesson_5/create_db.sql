DROP DATABASE IF EXISTS Jaegers;

CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    INTEGER,
    weight    INTEGER,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);

\ir init_db.sql;

\ir queries.sql;