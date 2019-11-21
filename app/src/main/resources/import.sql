INSERT INTO roles (id, role) VALUES (1,'ROLE_USER');
INSERT INTO roles (id, role) VALUES (2,'ROLE_ADMIN');

INSERT INTO credentials (username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO credentials (username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);

INSERT INTO authorities (ID,username, authority) VALUES (1,'guest', 'ROLE_USER');
INSERT INTO authorities (ID,username, authority) VALUES (2,'admin', 'ROLE_ADMIN');
INSERT INTO authorities (ID,username, authority) VALUES (3,'admin', 'ROLE_USER');

INSERT INTO users(id, dateCreated, dateOfBirth, email, enabled, firstName, imageUrl, lastName, password, status, username) VALUES (1,Now(),Now(),'admin@gmail.com',1,'Admin','','Admin','',1,'admin')
INSERT INTO users(id, dateCreated, dateOfBirth, email, enabled, firstName, imageUrl, lastName, password, status, username) VALUES (2,Now(),Now(),'sarah@gmail.com',1,'Sarah','','Josephs','',1,'sarahj')

INSERT INTO users_roles(user_id, roles_id) VALUES (1, 1)
INSERT INTO users_roles(user_id, roles_id) VALUES (1, 2)
INSERT INTO users_roles(user_id, roles_id) VALUES (2, 2)