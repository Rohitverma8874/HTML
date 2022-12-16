use infinie;
create table credit(Ac_no Varchar(15), Trans Varchar(15), date_trans date,amount double);
insert into credit_info(Ac_no,Trans,date_trans,amount) values
('22121601','T020221216001','20221216',500),
('22121602','T020221216002','20220516',600),
('22121603','T020221216004','20220615',120),
('22121603','T020221216005','20220103',120),
('22121607','T020221216008','20221211',1300),
('22121602','T020221216014','20221201',5008),
('22121602','T020221216132','20221204',580),
('22121602','T020221216013','20221213',556);
SELECT * FROM credit;
select month(date_trans) from credit;



