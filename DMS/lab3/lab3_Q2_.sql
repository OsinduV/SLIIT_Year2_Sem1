--------CREATING TABLES-------

create table Bank(
	bCode varchar(7),
	name varchar(15),
	registration varchar(15),
	constraint bank_pk primary key (bCode)
)

--Ensure that the interest_rate of Savings account is a non-negative number (>= 0).
create table AccountType(
	accCode varchar(7),
	accName varchar(15),
	description varchar(50),
	intRate int,
	maxCheques int,
	type varchar(15),
	constraint accType_pk primary key (accCode),
	constraint chk_rate check (intRate >= 0),

)

--Ensure that the customer’s PIN number is a four digit (0-9) number 
--Ensure that the customer’s NIC number contains 10 digits 
--Ensure that the customer’s name is not null. 
create table Customer(
	custNo varchar(7),
	custName varchar(15) not null,
	address varchar(50),
	phone varchar(12),
	NIC char(10),
	PIN char(4),
	constraint cust_pk primary key (custNo),
	constraint cust_chk_pin check (pin like '[0-9][0-9][0-9][0-9]'),
	constraint cust_chk_nic check (NIC like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
)

--In the Transaction table, the default value for date&time should be the system datetime.
-- In the Transaction table, the value for executet_by must be one of the following: “ATM”, “Teller”, “Bank”, “Standing Order”, “Cheque”, “On-Line” or “Other”. 
create table Transaction_(
	tid varchar(7),
	amount money,
	description varchar(50),
	executedBy varchar(15) check(executedBy in ('ATM', 'Teller', 'Bank', 'Standing Order', 'Cheque', 'On-Line', 'Other')),
	tdate datetime default(getdate()),
	constraint trans_pk primary key(tid)
)

create table Branch(
	bCode varchar(7),
	branchNo varchar(7),
	branchName varchar(15),
	address varchar(50),
	constraint branch_pk primary key(bCode, branchNo),
	constraint branch_bank_fk foreign key (bCode) 
	references Bank(bCode) 
)

--Ensure that the balance in an account is always non-negative number (>= 0). 
create table Account(
	accNo varchar(7),
	balance int check (balance >= 0),
	bCode varchar(7),
	branchNo varchar(7),
	accCode varchar(7),
	constraint acc_pk primary key (accNo),
	constraint acc_branch_fk foreign key (bCode, branchNo)
	references Branch(bCode, branchNo),
	constraint acc_typ_fk foreign key (accCode)
	references AccountType(accCode)
)

create table Belongs_to(
	custNo varchar(7),
	accNo varchar(7),
	constraint belongs_pk primary key(custNo, accNo),
	constraint belongs_cust_fk foreign key(custNo) references Customer(custNo),
	constraint belongs_acc_fk foreign key(accNo) references Account(accNo)

)

--The type descriptive attribute of the “has” relationship between Transaction table and Account table should have one of the following values: “credit” or “debit”
create table Has(
	tid varchar(7),
	accNo varchar(7),
	type varchar(15) check (type in('credit', 'debit')),
	constraint has_pk primary key (tid, accNo),
	constraint has_acc_fk foreign key (accNo) references Account(accNo),
	constraint has_tran_fk foreign key (tid) references Transaction_(tid)
)



-------INSERTING VALUES---------

-- Insert data into Bank table
INSERT INTO Bank
VALUES ('B001', 'ABC Bank', '1234567'),
       ('B002', 'XYZ Bank', '7654321');

-- Insert data into AccountType table
INSERT INTO AccountType
VALUES ('A001', 'Savings', 'Savings Account', 3, 50, 'Savings'),
       ('A002', 'Checking', 'Checking Account', 1, 100, 'Checking');

-- Insert data into Customer table
INSERT INTO Customer (custNo, custName, address, phone, NIC, PIN)
VALUES ('C001', 'John Doe', '123 Main St', '123-456-7890', '1234567890', '1234'),
       ('C002', 'Jane Smith', '456 Elm St', '987-654-3210', '0987654321', '5678');

-- Insert data into Transaction_ table
INSERT INTO Transaction_ (tid, amount, description, executedBy)
VALUES ('T001', 100.50, 'Deposit', 'Teller'),
       ('T002', 50.25, 'Withdrawal', 'ATM');

-- Insert data into Branch table
INSERT INTO Branch (bCode, branchNo, branchName, address)
VALUES ('B001', '001', 'Main Branch', '789 Elm St'),
       ('B002', '002', 'Downtown Branch', '456 Oak St');

-- Insert data into Account table
INSERT INTO Account (accNo, balance, bCode, branchNo, accCode)
VALUES ('AC001', 5000, 'B001', '001', 'A001'),
       ('AC002', 2000, 'B002', '002', 'A002');

-- Insert data into Belongs_to table
INSERT INTO Belongs_to (custNo, accNo)
VALUES ('C001', 'AC001'),
       ('C002', 'AC002');

-- Insert data into Has table
INSERT INTO Has (tid, accNo, type)
VALUES ('T001', 'AC001', 'credit'),
       ('T002', 'AC002', 'debit');




select * from Bank
select * from AccountType
select * from Customer
select * from Transaction_
select * from Branch
select * from Account
select * from Belongs_to
select * from Has