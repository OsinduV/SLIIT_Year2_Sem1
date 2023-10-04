create table Customer(
	custId varchar(7),
	custName varchar(20),
	address varchar(50),
	phone varchar(12),
	loyalityPoints int,
	constraint Cust_pk primary key (custId)
)

create table Staff(
	staffId varchar(7),
	staffName varchar(20),
	phone varchar(12),
	constraint staff_pk primary key (staffId)
)


create table Supplier(
	supId varchar(7),
	contactName varchar(15),
	phone varchar(12),
	address varchar(50),
	constraint supplier_pk primary key(supId)
)

create table Product(	
	prodId varchar(7),
	prodName varchar(20),
	qty int,
	unitPrice int,
	ROL int,
	supplier varchar(7),
	constraint product_pk primary key (prodId),
	constraint prod_sup_fk foreign key (supplier) references Supplier(supId),
	constraint prod_qty_chk check (qty > 0)
)

create table Sales(
	pid varchar(7),
	cid varchar(7),
	sid varchar(7),
	salesDate date,
	constraint sales_pk primary key (pid, cid, sid),
	constraint sales_prod_fk foreign key (pid) references Product(prodId),
	constraint sales_cust_fk foreign key (cid) references Customer(custId),
	constraint sales_staff_fk foreign key (sid) references Staff(staffId),
	constraint sales_date_defult default cast(getdate() as date) for salesDate
)

insert into customer values ('C100', 'Ravi Perera', 'colombo', '0112156987', 1200)
insert into customer values ('c101', 'Nimali Alwis', 'Gampaha', '0332154879', 275)

insert into Staff values ('S001', 'Kamal Silva', '0714587963')
insert into Staff values ('S002', 'Amila Namal', '0714569875')

insert into Supplier values ('1', 'Amal Ranjith', 'Ratmalana', '0112569874')
insert into Supplier values ('2', 'Nadeeka perera', 'Borella', '0112589745')

insert into Product values ('P0001', 'Lemon puff', 22, 85, 20, '1')
insert into Product values ('P0201', 'Knor soup', 8, 100, 10, '2') 
insert into Product values ('P0084', 'lipton cylonta', 12, 125, 15, '2')
insert into Product values ('P0222', 'chocolate fingers', 14, 50, 8, '1')

insert into Sales values ('P0201', 'C100', 'S001', '3/11/2015')
insert into Sales values ('P0222', 'C101', 'S002', '11/22/2015')
insert into Sales values ('P0222', 'C101', 'S002', '22/11/2015')
insert into Sales values ('P0084', 'C100', 'S001', '01/12/2015')
insert into Sales values ('P0201', 'C100', 'S002', '08/12/2015')





update Product
set prodId = 'P0001'
where prodName = 'Lemon puff'

update Customer set custId = 'C101'
where custName = 'Nimali Alwis'

select cast(getdate() as time)