DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS notes;
CREATE TABLE users
(
    id       bigserial primary key,
    username varchar(24) NOT NULL
);
INSERT INTO users (username)
VALUES
('TestUser'),
('UserTester');
CREATE TABLE notes
(
    title     varchar(24)  NOT NULL,
    timestamp integer         NOT NULL default now(),
    note      varchar(240) NOT NULL
);
INSERT INTO notes (title, timestamp, note)
VALUES
('first', now(), 'i testing notes'),
('second', now(), 'what is this?');