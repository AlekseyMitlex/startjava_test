-- output the complete table
SELECT * FROM jaegers;

-- display only non-destroyed robots
SELECT * FROM jaegers WHERE status = 'Worker';

-- display robots of several series,  Mark-1 and Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-1' UNION
SELECT * FROM jaegers WHERE mark = 'Mark-6' ORDER BY mark DESC;

-- sort the table in descending order by column mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- display the oldest robot
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- display robots that have destroyed more / less than all kaiju
-- less
SELECT * FROM jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegers);
-- more
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);

-- display the average weight of robots
SELECT AVG(weight) FROM jaegers;

-- increase by one the number of destroyed kaiju robots that have not yet been destroyed
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Worker';

-- remove destroyed robots
DELETE FROM jaegers WHERE status = 'Destroyed';

-- output the complete table
SELECT * FROM jaegers;

-- psql -U postgres -f queries.sql (START .SQL FILE)