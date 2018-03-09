INSERT INTO Project(name) values ('TDVMC');
INSERT INTO Project(name) values ('Vorlesungen');
INSERT INTO Project(name) values ('Diverses');
INSERT INTO Project(name) values ('Calendar');

INSERT INTO ActivityType(name, color) values ('Web-Recherche', '#ff0011');
INSERT INTO ActivityType(name, color) values ('Programmieren', '#00aa11');
INSERT INTO ActivityType(name, color) values ('Besprechung', '#0011ff');
INSERT INTO ActivityType(name, color) values ('Paper lesen', '#00ff11');
INSERT INTO ActivityType(name, color) values ('VO besuchen', '#cc0011');
INSERT INTO ActivityType(name, color) values ('Organisatorisches', '#aa0011');

INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (1, 2, '2018-02-27 13:15:00', '2018-02-27 18:05:00', 'git repository für TDVMC projekt einrichten', 'git projekt erstellen, eclipse anbindung, ...');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (1, 2, '2018-02-28 10:15:00', '2018-02-28 11:45:00', 'git repository für TDVMC projekt einrichten', 'git projekt erstellen, eclipse anbindung, ...');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (1, 2, '2018-02-28 12:15:00', '2018-02-28 17:00:00', 'git repository für TDVMC projekt einrichten', 'git projekt erstellen, eclipse anbindung, ...');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (1, 1, '2018-03-05 09:15:00', '2018-03-05 12:15:00', 'vergleich von random number generators', 'Mersenne random number generator verwenden!');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (3, 6, '2018-03-05 12:40:00', '2018-03-05 17:20:00', 'Computer Frühjahrsputz', 'Johannes installiert am Mittwoch neues Ubuntu.');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (4, 2, '2018-03-08 10:10:00', '2018-03-05 12:15:00', 'erste tests mit JPA, Database, H2', 'Entities erstellen und in DB speichern');
INSERT INTO Appointment(projectId, activitytypeId, startDate, endDate, subject, body) values (4, 2, '2018-03-08 12:45:00', '2018-03-05 13:30:00', 'erste tests mit JPA, Database, H2', 'Entities erstellen und in DB speichern');