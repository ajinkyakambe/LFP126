console.log("Good Morning!");
console.log("Today we shall work on Address Book System using JS.");   

/**
 * UC 1:
 Ability to create a Address Book
Contact with first and last names,
address, city, state, zip, phone number
and email...
 * 
 * @return: A map containing above contact details
 * 
 * @param: first_name,last name,address, city,state,zip , phone num and emailId
 */
 function createContact(first_name, last_name,address, city,state,zip , phone_no, email_id){
    // Creates a  new empty map
    const contact = new Map();

    // Put the above details into the map
    contact.set("first_name", first_name);
    contact.set("last_name", last_name);
    contact.set("address", address);
    contact.set("city", city);
    contact.set("state", state);
    contact.set("zip", zip);
    contact.set("phone_no", phone_no);
    contact.set("email_id", email_id);

    // Returns a map containing above details
    return contact;
}



/**
 * UC 2: Ability to ensure Valid
Contacts are added... 

-First Name and Last Name should start with
Capital and Minimum 3 Characters
- Address, City and State should also have
minimum 4 characters
- Zip, Phone and Email should be valid as done in
the Pattern Exercise
- Throw Error if the RegEx test fails

 * @return: A map containing contact details if contact validated properly, else if contact validation fails then throws error
 * 
 * @param: first_name,last name,address, city,state,zip , phone num and emailId
 * 
 */
 function createValidatedContact(first_name, last_name,address, city,state,zip , phone_no, email_id){
    // Creates a  new empty map
    const contact = new Map();

    
    try{
        // validate first name 
        let regex1 = RegExp("[A-Z][a-zA-Z]{2,}");
        result = regex1.test(first_name);
        if(result){
            // If first name validated, add first name into the map
            contact.set("first_name", first_name);
        }
        // else throw error
        else throw "Regex validation for first name failed"
        
        // validate last name 
        let regex2 = RegExp("[A-Z][a-zA-Z]{2,}");
        result = regex2.test(last_name);
        if(result){
            // If last name validated, add last name into the map
            contact.set("last_name", last_name);
        }
        // else throw error
        else throw "Regex validation for last name failed"
        
        // validate address
        let regex3 = RegExp("[a-zA-Z]{4,}");
        result = regex3.test(address);
        if(result){
            // If address validated, add address into the map
            contact.set("address", address);
        }
        // else throw error
        else throw "Regex validation for address failed.";
        
        // validate city
        let regex4 = RegExp("[a-zA-Z]{4,}");
        result = regex4.test(city);
        if(result){
            // If city validated, add city into the map
            contact.set("city", city);
        }else throw "Regex validation for city failed.";
        
        // validate state- minimum 4 characters required
        let regex5 = RegExp("[a-zA-Z]{4,}");
        result = regex5.test(state);
        if(result){
            // If state validated, add state into the map
            contact.set("state", state);
        }
        // else throw error
        else throw "Regex validation for state failed." + state;
        
        // validate zip- special characters not allowed at beginning or end, total 6 digits with mid whitespace allowed
        let regex6 = RegExp("^[1-9][0-9]{2}[\\s]?[0-9]{2}[0-9]$");
        result = regex6.test(zip);
        if(result){
            // If zip validated, add zip into the map
            contact.set("zip", zip);
        }
        // Else throw error
        else throw "Regex validation for zip failed.";
        
        // validate phone number- special characters not allowed at beginning or end, total 10 digits with mid whitespace allowed
        let regex7 = RegExp("^[7-9][0-9]{4}[\\s]?[0-9]{4}[0-9]$");
        result = regex7.test(phone_no);
        if(result){
            // If phone number validated, add phone number into the map
            contact.set("phone_no", phone_no);
        }      
        // Else throw error
        else throw "Regex validation for phone number failed.";


        // validate email Id- minimum 3 characters before @, gmail.com after@ and optional 2 character of tld after .com
        let regex8 = RegExp("([a-zA-Z0-9]{3,}|[a-zA-Z0-9]{3,}[+_.-]?[a-zA-Z0-9]{1,})[@]{1}[g][m][a][i][l](([.][c][o][m])|([.][c][o][m][.][a-zA-Z]{2}))");
        result = regex8.test(email_id);
        
        if(result){
            // If email Id validated, add email Id into the map
            contact.set("email_id", email_id);
        }
        // else throw error
        else throw "Regex validation for email Id failed. ";
    }catch(error){
        return console.log(error);
    }

    // Returns a map containing above details
    return contact;
}


/**
 * UC 3: Ability to create a
New Address Book
array and add new
Contacts to it.
 * 
 * @return: An array (addressbook) containing contacts
 * 
 * @param: arbitrary number of contacts
 */
 function createAddressBook(contact1,contact2){
    // Create a new addressbook of type array
    const addressBook = new Array();
    for (let i=0;i<arguments.length;i++){
        addressBook.push(arguments[i]);
    }

    // Returns an array containing above contacts
    return addressBook;
}


/**
 * UC 4 : Ability to find
existing contact
person using their
name and edit it
 * 
 * @return: An array (addressbook after modification) containing contacts
 * 
 * @param: addressbook, first and last name of contact to be edited, contact details to replace
 */
 function editExistingContact(addressbook, first_name,last_name, contact){
    let range = addressbook.length;

    // Loop through the contacts inside the address book
    for(let i=0;i<range;i++){
        
        // Match for the contact using first and last name
        if((addressbook[i].get("first_name") === first_name) &&(addressbook[i].get("last_name") === last_name)){
            // edit the contact details
            addressbook[i].set("first_name",contact.get("first_name"));
            addressbook[i].set("last_name",contact.get("last_name"));
            addressbook[i].set("address",contact.get("address"));
            addressbook[i].set("city",contact.get("city"));
            addressbook[i].set("state",contact.get("state"));
            addressbook[i].set("zip",contact.get("zip"));
            addressbook[i].set("phone_no",contact.get("phone_no"));
            addressbook[i].set("email_id",contact.get("email_id"));
        }
    }

    // Returns an array containing above contacts
    return addressbook;
}

let contact_new = createValidatedContact("ajinkya","kambe","kokanwadi street","murtizapur","maharashtra",458538,9801234567,"ajinkya.kambe@gmail.com");



/**
 * UC 5 : Ability to find a
person with name
delete it from the
array
 * 
 * @return: An array (addressbook after modification) containing contacts
 * 
 * @param: addressbook, first and last name of contact to be deleted
 */
 function deleteExistingContact(addressbook, first_name,last_name){
    let range = addressbook.length;

    // Loop through the contacts inside the address book
    for(let i=0;i<range;i++){
        
        // Match for the contact using first and last name
        if((addressbook[i].get("first_name") === first_name) && (addressbook[i].get("last_name") === last_name)){
            // delete the contact details
            delete addressbook[i];
        }
    }

    // Returns an array after deletion of above contact
    return addressbook;
}
let contact3 = createValidatedContact("ajinkya","kambe","Wellington street","wellington","newzealand",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact4 = createValidatedContact("aditya","Kumaratunga","Middleton street","Jaipur","rajasthan",458538,9801234567,"aditya.kumaratunga@gmail.com");
// create an addressbook containing above contacts
let addressBook = createAddressBook(contact3,contact4);
// Delete the existing contact based on name
let first_name = "Ajinkya";
let last_name = "Kambe";


/**
 * UC 6 : Ability to find
number of contacts
in the address book

 * 
 * @return: int value (number of contacts inside addressbook)
 * 
 * @param: addressbook
 */
 function countContact(addressbook){

    // Reduce function cannot work on an empty array, so minimum 1 element will be there
    let count = 1;
    let contacts_no = addressbook.reduce((acc,num)=>{
            count++;
            return count;
    })
    return contacts_no;
}

let contact11 = createValidatedContact("ajinkya","kambe","Wellington street","wellington","newzealand",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact12 = createValidatedContact("aditya","Kumaratunga","Middleton street","Jaipur","rajasthan",458538,9801234567,"aditya.kumaratunga@gmail.com");
let contact14 = createValidatedContact("nehal","Singh","kokanwadi street","murtizapur","maharashtra",458538,9801234567,"ajinkya.kambe@gmail.com");

// create an addressbook containing above contacts
let addressBook1 = createAddressBook(contact11,contact12,contact14);



/**
 * UC 7 : Ability to ensure there is no
Duplicate Entry of the same
Person in the Address Book
 * 
 * @return: boolean value (true if person name already exists in address book, false otherwise)
 * 
 * @param: addressbook, contact
 */
 function preventDuplicateEntry(addressbook,contact){

    // Each contact in address book mapped to first_name concatenated with last_name, some() checks if any concatenated 
    //name matches the first_name and last name combined of contact to be added
    let contactAlreadyPresent = addressbook.map(contacts=>{ return contacts.get("first_name")+contacts.get("last_name")})
                                            .some(contact_names=>{
                                                return contact_names == (contact.get("first_name")+contact.get("last_name"));});   
    
    return contactAlreadyPresent;
}

let contact21 = createValidatedContact("ajinkya","kambe","Wellington street","wellington","newzealand",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact22 = createValidatedContact("aditya","Kumaratunga","Middleton street","Jaipur","rajasthan",458538,9801234567,"aditya.kumaratunga@gmail.com");
let contact23 = createValidatedContact("nehal","Singh","kokanwadi street","murtizapur","maharashtra",458538,9801234567,"ajinkya.kambe@gmail.com");
// create an addressbook containing above contacts
let addressBook2 = createAddressBook(contact21,contact22,contact23);

let contact25 = createValidatedContact("nehal","Singh","kokanwadi street","murtizapur","maharashtra",458538,9801234567,"ajinkya.kambe@gmail.com");

let contactAlreadyPresent = preventDuplicateEntry(addressBook2,contact25);



/**
 * UC 8 : Ability to search
Person in a particular
City or State - Use Array Functions of filter,
 * 
 * @return: contact of the person being searched or null
 * 
 * @param: addressbook, first_name, last_name, IsCity(true indicates city, false indicates state), cityOrState
 */
 function searchPersonInCityOrState(addressbook,IsCity,cityOrState,first_name,last_name){

    // All contacts in address book are filtered for the given city or state, then the  
    //name is matched with the first name and last name of contact to be searched
    let contactDetails = "contact not present in given city or state";
    if(IsCity){
        let contactDetails = addressbook.filter(contacts=> (contacts.get("city") == cityOrState))       
                                        .filter(contacts=>(contacts.get("first_name") == first_name  && contacts.get("last_name") == last_name));
                                        
        return contactDetails;
    }else if(!IsCity){
        let contactDetails = addressbook.filter(contacts=> (contacts.get("state") == cityOrState))
                                        .filter(contacts=>(contacts.get("first_name") == first_name  && contacts.get("last_name") == last_name));                                   
        return contactDetails;
        }
    return contactDetails;
}

let contact31 = createValidatedContact("ajinkya","kambe","Wellington street","mysore","newzealand",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact32 = createValidatedContact("aditya","Kumaratunga","Middleton street","Jaipur","rajasthan",458538,9801234567,"aditya.kumaratunga@gmail.com");
let contact34 = createValidatedContact("nehal","Singh","kokanwadi street","mysore","karnataka",458538,9801234567,"nehal.singh@gmail.com");
let contact35 = createValidatedContact("Aman","Singh","Konark street","mysore","karnataka",490538,9805432167,"aman.singh@gmail.com");

// create an addressbook containing above contacts
let addressBook3 = createAddressBook(contact31,contact32,contact34,contact35);

let contactDetails = searchPersonInCityOrState(addressBook3,false,"karnataka","nehal","Singh");

// Display the contact details if present in a particular city or state
if(contactDetails.length == 0){
    //console.log("The person has not been found in given city or state.")
}else{
    //console.log("The contact details of the person are: ");
    //console.log(contactDetails);
}


/**
 * UC 9 : Ability to view
Persons by City or
State - Use Array
 * 
 * @return: Arraylist containing contacts
 * 
 * @param: addressbook, IsCity(true indicates city, false indicates state), cityOrState
 */
 function viewAllPersonsInCityOrState(addressbook,IsCity,cityOrState){

    // All contacts in address book are filtered for the given city or state
    let contactDetails = "No contact in the given city or state";

    // view persons by city
    if(IsCity){
        let contactDetails = addressbook.filter(contacts=> (contacts.get("city") == cityOrState));  

        if(contactDetails.length == 0){
            return console.log("No person has not been found in the city 0f "+ cityOrState);
        }                                    
        return contactDetails;
    }
    // view persons by state
    else if(!IsCity){
        let contactDetails = addressbook.filter(contacts=> (contacts.get("state") == cityOrState));  

        if(contactDetails.length == 0){
            return console.log("No person has not been found in the state 0f "+ cityOrState);
        }                                                       
        return contactDetails;
    }

    return contactDetails;
}

let contact41 = createValidatedContact("ajinkya","kambe","Wellington street","mysore","karnataka",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact43 = createValidatedContact("aditya","Kumaratunga","Middleton street","kollam","kerala",458538,9801234567,"aditya.kumaratunga@gmail.com");
let contact44 = createValidatedContact("nehal","Singh","kokanwadi street","mysore","karnataka",458538,9801234567,"nehal.singh@gmail.com");
let contact45 = createValidatedContact("Aman","Singh","Konark street","kochi","kerala",490538,9805432167,"aman.singh@gmail.com");

// create an addressbook containing above contacts
let addressBook4 = createAddressBook(contact41,contact43,contact44,contact45);

// Get an arraylist containing all the contacts of a given city or state
let contactDetls = viewAllPersonsInCityOrState(addressBook4,false,"karnataka");

// Display the contact details if any in a particular city or state
if(contactDetls != null){
    //console.log("The contact details of the person are: ");
    //console.log(contactDetls);
}


/**
 * UC 10 : Ability to get number
of contact persons i.e.
count by City or State
 * 
 * @return: number (count of persons in a city or state)
 * 
 * @param: addressbook, IsCity(true indicates city, false indicates state), cityOrState
 */
 function countPersonsInCityOrState(addressbook,IsCity,cityOrState){

    // All contacts in address book are filtered for the given city or state
    let contactNums = 0;
    var byCityOrState = "";

    if(IsCity){byCityOrState = "city" }
    else if(!IsCity){byCityOrState = "state"}

    try{
        // Count persons by filtering contacts of that city, then each contact replaced with number 1 and count all the elements of the array
        contactNums = addressbook.filter(contacts=> (contacts.get(byCityOrState) == cityOrState))  
                                    .map(contact=>1)
                                    .reduce((totl,num)=>(totl+num));  
    }
    // If array is empty reduce throws TypeError
    catch(TypeError){contactNums  = 0;}
    return contactNums;
}

let contact52 = createValidatedContact("ajinkya","kambe","Wellington street","mysore","karnataka",458538,9801234567,"ajinkya.kambe@gmail.com");
let contact53 = createValidatedContact("aditya","Kumaratunga","Middleton street","kollam","kerala",458538,9801234567,"aditya.kumaratunga@gmail.com");
let contact54 = createValidatedContact("nehal","Singh","kokanwadi street","mysore","karnataka",458538,9801234567,"nehal.singh@gmail.com");
let contact55 = createValidatedContact("Aman","Singh","Konark street","kochi","kerala",490538,9805432167,"aman.singh@gmail.com");

// create an addressbook containing above contacts
let addressBook5 = createAddressBook(contact52,contact53,contact54,contact55);

// Get the count of all the contacts in a given city or state
let cityOrState = "karnataka";
let contactNums = countPersonsInCityOrState(addressBook5,false,cityOrState);
console.log("Number of contacts in the city or state of "+ cityOrState);
console.log(contactNums);