SET DEFINE OFF;

DROP TABLE restaurant cascade constraint;
DROP TABLE specific cascade constraint;
DROP TABLE category cascade constraint;

CREATE TABLE category (
        c_id        varchar2(10)              PRIMARY KEY,
        c_name        varchar2(50)         NOT NULL
);

CREATE TABLE specific (
        s_id       varchar2(10)             PRIMARY KEY,
        s_name        varchar2(50)           NOT NULL,
        c_id        varchar2(10)               NOT NULL
);

CREATE TABLE restaurant (
        r_id        varchar2(10)                PRIMARY KEY,
        r_name        varchar2(50)                NOT NULL,
        s_id        varchar2(10)                 NOT NULL,
        map_link        varchar2(2000)                NOT NULL,
        page_link        varchar2(2000)                 NOT NULL
);
ALTER TABLE specific ADD FOREIGN KEY (c_id) REFERENCES category (c_id);
ALTER TABLE restaurant ADD FOREIGN KEY (s_id) REFERENCES specific (s_id);