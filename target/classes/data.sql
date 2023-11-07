
INSERT INTO AUTHOR(FIRST_NAME, LAST_NAME)
    VALUES
    (     'Craig','Wells'    ),
    (     'Joshua','Bloch'   ),
    (     'Alex','Antonov'   ),
    (     'Joyce','Farrell'  ),
    (     'Cay','Horstmann'  ), 
    (     'Janet','Gregory'  ), 
    (     'Greg','Turnquist' ),
    (     'Walter','Savich'  ),
    (     'John','Carnell'   );

INSERT INTO BOOK ( BOOK_TITLE, BOOK_YEAR, AUTHOR_ID)
VALUES 
    ('Spring Boot in Action', '2018', (SELECT Author_ID from author where last_name = 'Wells')),
    ('Core Java for the Impatient', '2018', (SELECT Author_ID from author where last_name = 'Horstmann')),
    ('Spring Microservices in Action', '2016', (SELECT Author_ID from author where last_name = 'Carnell')),
    ('Java Programming', '2018', (SELECT Author_ID from author where last_name = 'Farrell')),
    ('Beginning Java Databases', '2001', (SELECT Author_ID from author where last_name = 'Carnell')),
    ('Effective Java', '2017', (SELECT Author_ID from author where last_name = 'Bloch')),
    ('Spring Boot 2.0', '2017', (SELECT Author_ID from author where last_name = 'Antonov')),
    ('Spring Boot Cookbook', '2015', (SELECT Author_ID from author where last_name = 'Antonov')),
    ('Learning spring Boot 2.0', '2017', (SELECT Author_ID from author where last_name = 'Turnquist')),
    ('Absolute Java', '2015', (SELECT Author_ID from author where last_name = 'Savich')),
    ('Agile Testing', '2015', (SELECT Author_ID from author where last_name = 'Gregory')),
    ('Java: An Introduction to Problem Solving', '2017', (SELECT Author_ID from author where last_name = 'Savich'));
