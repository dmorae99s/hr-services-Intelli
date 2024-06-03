CREATE SCHEMA IF NOT EXISTS hrdb;
SET SCHEMA hrdb;

CREATE TABLE hr_payments(id int NOT NULL AUTO_INCREMENT, emp_id int, concept varchar(30), amount int, transaction_date date);

INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(1, 'Payment emp 1 - 31-12-22', 10, '2022-12-31');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(1, 'Payment emp 1 - 15-02-23', 22, '2023-02-15');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(1, 'Payment emp 1 - 22-11-23', 21, '2023-11-22');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(2, 'Payment emp 2 - 01-02-22', 33, '2022-02-01');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(2, 'Payment emp 2 - 03-03-22', 42, '2022-03-03');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(3, 'Payment emp 3 - 07-12-22', 4, '2022-12-07');
INSERT into hr_payments(emp_id, concept, amount, transaction_date) values(4, 'Payment emp 4 - 04-12-20', 5, '2020-12-04');
