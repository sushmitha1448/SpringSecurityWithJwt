CREATE TABLE USERS(
  USER_ID INT  NOT NULL PRIMARY_KEY,
  USER_NAME VARCHAR(50) NOT NULL,
  PASSWORD VARCHAR(500) NOT NULL,
  ROLES VARCHAR(50) NOT NULL
);

CREATE TABLE AUTHORITIES(
    USER_ID INT NOT NULL,
    AUTHORITY VARCHAR(50) NOT NULL,
    CONSTRAINT FK_AUTHORITIES_USER FOREIGN KEY(USER_ID) REFERENCES USERS(USER_ID)
);

create unique index ix_auth_username on AUTHORITIES(USERID,AUTHORITIY);