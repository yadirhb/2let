
INSERT INTO users (id,username,password,enabled) VALUES (2, 'guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users (id,username,password,enabled) VALUES (1, 'admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
  
INSERT INTO roles (id,role) VALUES (1, 'ROLE_USER');
INSERT INTO roles (id,role) VALUES (2, 'ROLE_ADMIN');

