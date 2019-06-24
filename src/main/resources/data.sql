INSERT INTO user(username, password) VALUES('client','$2a$11$LmbzNrpdgCAwLECwo99sE.VcBgjhkd2rEl4V7tH3tu8mw0XV30vqK');

INSERT INTO customer (bonus_count, client_name, phone, visit_count) values (1,'Иванова Анастасия','89630021313',2);
INSERT INTO customer (bonus_count, client_name, phone, visit_count) values (1,'Ефремова Дарья','89630022211',9);

INSERT INTO master (name, personal_info) VALUES ('Сизова Светлана','Квалифицированный мастер по наращиваню ресниц');
INSERT INTO master (name, personal_info) VALUES ('Быкова Евгения','Квалифицированный мастер по ногтям');



INSERT INTO auth_user_group(username, auth_group) VALUES('client','user');
