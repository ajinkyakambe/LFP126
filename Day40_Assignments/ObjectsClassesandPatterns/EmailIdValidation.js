/**
 * UC 1:Validate Email address with a
regex. The email consists of
minimum 3 and optional 2 more
parts with mandatory @ and .
abc.xyz@bridgelabz.co.in
Here abc, bridgelabz and co are
mandatory and the remaining 2
are optional
To begin with lets validate the
mandatory part and start with abc 
 */
 {
    let valid_email_id ="abc";
    let invalid_email_id  = "ab";

    // Atleast three characters should be present
    let regex = RegExp("[a-zA-Z0-9]{3,}");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id = regex.test(invalid_email_id);

    console.log("Result with valid email Id:"+ result_valid_email_id);      // Returns true
    console.log("Result with invalid email Id:"+ result_invalid_email_id);  // Returns false
}

/**
 * UC 2: Ensure @ and validate the
mandatory 2nd part i.e.
bridgelabz
 */
 {
    let valid_email_id ="abc@bridgelabz";
    let invalid_email_id1  = "abcgoogle";
    let invalid_email_id2 = "abc@xyz";

    // Atleast three characters should be present
    let regex = RegExp("[a-zA-Z0-9]{3,}[@]{1}[b][r][i][d][g][e][l][a][b][z]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Result with valid email Id:"+ result_valid_email_id);      // Returns true
    console.log("Result with invalid email Id1:"+ result_invalid_email_id1);  // Returns false
    console.log("Result with invalid email Id:2"+ result_invalid_email_id2);  // Returns false
}

/**
 * UC 3: Ensure “.” after bridgelabz
and validate the
mandatory 3rd part i.e. co
 */
 {
    let valid_email_id ="abc@bridgelabz.com";
    let invalid_email_id1  = "abc@bridgelabz.co";
    let invalid_email_id2 = "abc@bridgelabzcom";

    // Atleast three characters should be present
    let regex = RegExp("[a-zA-Z0-9]{3,}[@]{1}[b][r][i][d][g][e][l][a][b][z][.][c][o][m]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Is valid email Id: "+ result_valid_email_id);      // Returns true
    console.log("Is valid email Id1:"+ result_invalid_email_id1);  // Returns false
    console.log("Is valid email Id2: "+ result_invalid_email_id2);  // Returns false
}

/**
 * UC 4: Lets handle optional part
i.e. xyz in
abc.xyz@bridgelabz.co.in
NOTE: make sure only
following are valid special
characters _,+,
-,.
proceeding to xyz
 */
 {
    let valid_email_id ="abc.xyz@bridgelabz.com";
    let invalid_email_id1  = "abc.@bridgelabz.com";  // No alphanumeric character after dot
    let invalid_email_id2 = "abc&@bridgelabz.com";   // Ampersand not an allowed special character

    // Atleast three characters should be present
    let regex = RegExp("([a-zA-Z0-9]{3,}|[a-zA-Z0-9]{3,}[+_.-]?[a-zA-Z0-9]{1,})[@]{1}[b][r][i][d][g][e][l][a][b][z][.][c][o][m]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Is email Id Valid: "+ result_valid_email_id);      // Returns true
    console.log("Is email Id1 valid: "+ result_invalid_email_id1);  // Returns false
    console.log("Is email Id2 valid: "+ result_invalid_email_id2);  // Returns false
}