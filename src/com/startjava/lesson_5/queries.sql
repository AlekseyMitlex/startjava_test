-- create database

CREATE TABLE Jaegers (
    ID SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height REAL,
    weight REAL,
    origin TEXT,
    launch INTEGER,
    kaijuKill INTEGER
);

-- init database

INSERT INTO Jaegers(modelName, mark, height, weight, origin, launch, kaijuKill)
	VALUES
		('GipsyDanger',		'Mark-3',	'79.25',	'1.980',	'USA',		'2017',	'9'),
		('ChernoAlpha',		'Mark-1',	'85.34',	'2.412',	'Russia',	'2015',	'6'),
		('StrikerEureka',	'Mark-5',	'76.2',	'	1.850',		'Australia','2019',	'11'),
		('GipsyAvenger',	'Mark-6',	'81.77',	'2.004',	'Unknown',	'2034',	'1'),
		('CrimsonTyphoon',	'Mark-4',	'76.2',		'1.722',	'China',	'2018',	'7'),
		('ObsidianFury',	'Mark-6',	'85.0',		'1.800',	'Unknown',	'2035',	'0'),
		('CoyoteTango',		'Mark-1',	'85.35',	'2.312',	'Japan',	'2015',	'2'),
		('Apex',			'Mark-6',	'86.0',		'1.870',	'Unknown',	'2035',	'0'),
		('BracerPhoenix',	'Mark-5',	'70.91',	'2.128',	'Japan',	'2025',	'3'),
		('BrawlerYukon',	'Mark-1',	'73.3',		'2.075',	'USA',		'2015',	'4');



