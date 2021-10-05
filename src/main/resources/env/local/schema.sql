DROP TABLE IF EXISTS BASIC_SPENDING;
DROP TABLE IF EXISTS PERIODICAL_SPENDING;

CREATE SCHEMA IF NOT EXISTS  SPENDING;

CREATE TABLE IF NOT EXISTS SPENDING.BASIC_SPENDING(
    ID INT NOT NULL,
    AMOUNT DECIMAL NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    TYPE VARCHAR(255) NOT NULL,
    PAY_DATE DATE NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS  SPENDING.PERIODICAL_SPENDING(
    ID INT NOT NULL,
    AMOUNT DECIMAL NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    TYPE VARCHAR(255) NOT NULL,
    START_DATE DATE NOT NULL,
    PAY_DATE DATE NOT NULL,
    PRIMARY KEY (ID)
);

CREATE SEQUENCE IF NOT EXISTS SPENDING.SEQ_BASIC_SPENDING MINVALUE 1 START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE IF NOT EXISTS SPENDING.SEQ_PERIODICAL_SPENDING START WITH 1 INCREMENT BY 1;