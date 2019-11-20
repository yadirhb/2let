
# INSERT INTO users (id,username,password) VALUES (1,'guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS');
# INSERT INTO users (id,username,password) VALUES (2,'admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe');
  
INSERT INTO roles (id,username, role) VALUES (1,'guest', 'ROLE_USER');
INSERT INTO roles (id,username, role) VALUES (2,'admin', 'ROLE_ADMIN');

INSERT INTO users(id,username,password,enabled) VALUES (1,'guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users(id,username,password,enabled) VALUES (2,'admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);

INSERT INTO authorities (ID,username, authority) VALUES (1,'guest', 'ROLE_USER');
INSERT INTO authorities (ID,username, authority) VALUES (2,'admin', 'ROLE_ADMIN');
INSERT INTO authorities (ID,username, authority) VALUES (3,'admin', 'ROLE_USER');