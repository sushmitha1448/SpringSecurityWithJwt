INSERT INTO USERS ( USER_NAME,PASSWORD,ROLES)
VALUES (1,'sus@gmail.com','YeS3LkEg3rXd7P9','ADMIN');
);
INSERT INTO USERS ( USER_NAME,PASSWORD,ROLES)
VALUES (2,'neetha@gmail.com','AwcKJM4gg3YCHla','USER');
);

INSERT INTO AUTHORITIES (USER_ID,AUTHORITY)
VALUES(1,'ROLE_ADMIN');

INSERT INTO AUTHORITIES (USER_ID,AUTHORITY)
VALUES(2,'ROLE_USER');
