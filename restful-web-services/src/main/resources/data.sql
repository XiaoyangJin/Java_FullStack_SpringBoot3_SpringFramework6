INSERT INTO user_details (birth_date, id, name)
VALUES (CURRENT_DATE(), 10001, 'summer');

INSERT INTO user_details (birth_date, id, name)
VALUES (CURRENT_DATE(), 10002, 'lin');

INSERT INTO user_details (birth_date, id, name)
VALUES (CURRENT_DATE(), 10003, 'ada');

INSERT INTO post (id, user_id, description)
VALUES (20001, 10001, 'I want to learn AWS');

INSERT INTO post (id, user_id, description)
VALUES (20002, 10001, 'I want to learn DevOps');

INSERT INTO post (id, user_id, description)
VALUES (20003, 10002, 'I want to get AWS Certified');

INSERT INTO post (id, user_id, description)
VALUES (20004, 10002, 'I want to learn cloud');