show databases;

#UC1 
/*Ability to create a
Address Book Service DB

- Use SQL Client to create DB */
create database Addressbook_Service;

#UC2 
/*Ability to create a Address
Book Table with first and
last names, address, city,
state, zip, phone number
and email as its attributes */
create table addressbook
(
	FirstName varchar(20) not null,
    LastName varchar(20) not null,
	Address varchar(50) not null,
    City varchar(20) not null,
    State varchar(20) not null,
	Zip varchar(6) not null,
    PhoneNo varchar(12) not null,
    Email_ID char(50) not null
);
describe addressbook;

#UC3
/*Ability to insert new
Contacts to Address
Book */


INSERT INTO addressbook(FirstName, LastName, Address, City, State, Zip, PhoneNo, Email_ID)
	VALUES ('shreya', 'Makadey', 'Dalal Complex', 'Nagpur', 'Maharashtra', '441904', '2135469787', 'shreya10@gmail.com');
INSERT INTO addressbook(FirstName, LastName, Address, City, State, Zip, PhoneNo, Email_ID)
	VALUES ('Nikita', 'Takhare', 'Javaharnagar', 'Nagpur', 'Maharashtra', '441904', '2135469787', 'nikitatakhre@gmail.com');
select * from addressbook;

#UC4 
/*Ability to edit
existing contact
person using their
name */

update addressbook set
					Address='Keshav Nagar',
                    City='Lakhani',
                    Zip='489750',
                    PhoneNo='5468971321',
                    Email_ID='shreya@gmail.com'
				where FirstName='shreya';
select * from addressbook;

#UC5 

/*Ability to delete a
person using person's
name */

delete from addressbook where FirstName='shreya';
select * from addressbook;

#UC6 
/* Ability to Retrieve
Person belonging to
a City or State from
the Address Book */

select * from addressbook where City = 'Nagpur';
 select * from addressbook where State = 'Maharashtra';
 
 #UC7
/*Ability to understand
the size of address
book by City and State
- Here size indicates the count */

 select City,count(*) from addressbook where City = 'Nagpur';
 
  #getting the count in addressbook by  state name
 select State,count(*) from addressbook where State = 'Maharashtra'; 
 
 #UC8 
 /*
 Ability to retrieve entries
sorted alphabetically by
Person’s name for a
given city */

 select * from addressbook where city = 'Nagpur' order by FirstName;
 
 #UC9 
 /*Ability to identify each
Address Book with name and
Type. - Here the type could Family, Friends,
Profession, etc
- Alter Address Book to add name and
type */
Alter table AddressBook add AddressBookName varchar(45) Not Null after Email_Id;
Alter table AddressBook add AddressBookType varchar(45) Not Null after AddressBookName; 
 
Update AddressBook set AddressBookName= 'AddressBook1' where FirstName  = 'Minal' or FirstName  = 'aditi';
Update AddressBook set AddressBookName ='AddressBook2' where FirstName  = 'Soniya' or FirstName  = 'shreya';
Update AddressBook set AddressBookName = 'AddressBook3' where FirstName  = 'Nikita' or FirstName  = 'radhika';
Update AddressBook set AddressBookType = 'Family' where FirstName  = 'Nikita'  or FirstName  = 'aditi';
Update AddressBook set AddressBookType = 'Friends' where FirstName  = 'shreya' or FirstName  = 'radhika' ;
Update AddressBook set AddressBookType = 'Profession' where FirstName  = 'Minal' or FirstName  = 'Soniya';  

#creating different address books as family , friends amd profession ,all having reference of addressbook

 CREATE table FriendsAddressbook(
Friend_ID     int Not Null auto_increment,
AddressbookID int ,
Primary key (Friend_ID) ,
FOREIGN KEY (AddressbookID) REFERENCES AddressBook(ID) ON DELETE CASCADE
 );
insert into FriendsAddressbook (AddressbookID) values ('5'),('7');
select * from FriendsAddressbook;
 

CREATE table FamilyAddressbook(
Family_ID     int Not Null auto_increment,
AddressbookID int ,
Primary key (Family_ID) ,
FOREIGN KEY (AddressbookID) REFERENCES AddressBook(ID) ON DELETE CASCADE
 ); 
insert into FamilyAddressbook (AddressbookID) values ('2'),('3'); 
select * from FamilyAddressbook;
 

CREATE table ProfessionalAddressbook(
Profession_ID     int Not Null auto_increment,
AddressbookID int ,
Primary key (Profession_ID) ,
FOREIGN KEY (AddressbookID) REFERENCES AddressBook(ID) ON DELETE CASCADE
 );  
insert into ProfessionalAddressbook (AddressbookID) values ('4'),('6'); 
select * from ProfessionalAddressbook; 


#UC 10 Ability to get count by type
Select Count(FirstName) From AddressBook where AddressBookType = 'Family' order by FirstName;		#Count 2
Select Count(FirstName) From AddressBook where AddressBookType = 'Friends' order by FirstName;		#Count 2
Select Count(FirstName) From AddressBook where AddressBookType = 'Profession' order by FirstName;	#Count 2

#UC11 insert contact in familyaddressbook by using addressbook class
 INSERT INTO addressbook(FirstName, LastName, Address, City, State, Zip, PhoneNo, Email_ID,AddressBookName,addressBookType)
					VALUES ('firstname', 'lastname', 'Paris Complex', 'Nagpur', 'Maharashtra', '481204', '9935009787', 'example1@gmail.com', 'Addressbook1', 'Family');
select @@last_insert_id ;
insert into familyaddressbook (AddressbookID) values (@@last_insert_id);
select * from FamilyAddressbook;
select * from addressbook;


#UC 11 insert contact in friendsaddressbook by using addressbook class
 INSERT INTO addressbook(FirstName, LastName, Address, City, State, Zip, PhoneNo, Email_ID,AddressBookName,addressBookType)
					VALUES ('firstname', 'lastname', 'Mahda Colony', 'Chandrapur', 'Maharashtra', '400204', '9555009787', 'example2@gmail.com', 'Addressbook3', 'Friend');
select @@last_insert_id ;
insert into friendsaddressbook (AddressbookID) values (@@last_insert_id);
select * from friendsaddressbook;
select * from Addressbook;
select * from addressbook; 

#UC13 
#refactor uc6 i.e. retrive data from address book using city or state with new table structure 
select * from addressbook a1, familyaddressbook f1 where a1.ID=f1.AddressbookID  and city='Nagpur';
select * from addressbook a1, friendsaddressbook friend1 where a1.ID=friend1.AddressbookID and city='Nagpur';
select * from addressbook a1, professionaladdressbook p1 where a1.ID=p1.AddressbookID and city='Nagpur';

#refactor uc7 i.e. grt count by city or state with new table structure 
select count(id) from addressbook a1, familyaddressbook f1 where a1.ID=f1.AddressbookID  and city='Nagpur'; #Count:2
select count(id) from addressbook a1, friendsaddressbook friend1 where a1.ID=friend1.AddressbookID and city='Nagpur'; #Count:1
select count(id) from addressbook a1, professionaladdressbook p1 where a1.ID=p1.AddressbookID and city='Nagpur'; #Count:0

#refactor uc8 i.e. sort alphabetically address book using city or state with new table structure 
select * from addressbook a1, familyaddressbook f1 where a1.ID=f1.AddressbookID  and city='Nagpur' order by FirstName;
select * from addressbook a1, friendsaddressbook friend1 where a1.ID=friend1.AddressbookID and city='Nagpur' order by FirstName;
select * from addressbook a1, professionaladdressbook p1 where a1.ID=p1.AddressbookID and city='Nagpur' order by FirstName;

