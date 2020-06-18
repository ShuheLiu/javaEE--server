DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int NOT NULL,
  `sName` varchar(20) NOT NULL,
  `sPassword` varchar(20) NOT NULL,
PRIMARY KEY (`sid`)
);
INSERT INTO student VALUES (1, 'student1', '123456');
INSERT INTO student VALUES (2, 'student2', '123456');
INSERT INTO student VALUES (3, 'student3', '123456');
INSERT INTO student VALUES (4, 'student4', '123456');
INSERT INTO student VALUES (5, 'student15', '123456');

DROP TABLE IF EXISTS `studentHomework`;
CREATE TABLE `studentHomework` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sid` int NOT NULL,
  `hid` int NOT NULL,
  `homework_content` varchar(300),
  `create_time` BIGINT,
  `update_time` BIGINT,
PRIMARY KEY (`id`)
);
INSERT INTO studentHomework VALUES (1, 1, 1,'This is the first homework!',1592198021,1592198021);
INSERT INTO studentHomework VALUES (2, 2, 1,'This is the first homework!',1592198021,1592198021);
INSERT INTO studentHomework VALUES (3, 1, 2,'This is the second homework!',1592198021,1592198021);
INSERT INTO studentHomework VALUES (4, 3, 1,'This is the first homework!',1592198021,1592198021);
INSERT INTO studentHomework VALUES (5, 4, 1,'This is the first homework!',1592198021,1592370821);

DROP TABLE IF EXISTS `homework`;
CREATE TABLE `homework` (
  `hid` int NOT NULL AUTO_INCREMENT,
  `tid` int NOT NULL,
  `htitle` varchar(300) NOT NULL,
  `hcontent` varchar(300) NOT NULL,
  `start_time` BIGINT NOT NULL,
  `end_time` BIGINT NOT NULL,
PRIMARY KEY (`hid`)
);
INSERT INTO homework VALUES (1,1001,'homework1','Please submit the first homework!',1592198021,1592630021);
INSERT INTO homework VALUES (2,1001,'homework2','Please submit the second homework!',1592198021,1592630021);
INSERT INTO homework VALUES (3,1002,'homework3','Please submit the third homework!',1592198021,1592630021);

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int NOT NULL,
  `tName` varchar(20) NOT NULL,
  `tPassword` varchar(20) NOT NULL,
PRIMARY KEY (`tid`)
);
INSERT INTO teacher VALUES (1001, 'teacher1', '111111');
INSERT INTO teacher VALUES (1002, 'teacher2', '222222');
INSERT INTO teacher VALUES (1003, 'teacher3', '333333');
INSERT INTO teacher VALUES (1004, 'teacher4', '444444');
INSERT INTO teacher VALUES (1005, 'teacher5', '555555');