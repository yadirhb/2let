
INSERT INTO users (username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users (username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
  
INSERT INTO roles (id,username, role) VALUES (1,'guest', 'ROLE_USER');
INSERT INTO roles (id,username, role) VALUES (2,'admin', 'ROLE_ADMIN');