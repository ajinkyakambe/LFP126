/**
 * UC 1: Email Validation: Make sure at least three characters are present 
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
 * UC 2: Email validation: Make sure @ symbol and gmail after that is present
 */
 {
    let valid_email_id ="abc@gmail";
    let invalid_email_id1  = "abcgoogle";
    let invalid_email_id2 = "abc@xyz";

    // Atleast three characters should be present
    let regex = RegExp("[a-zA-Z0-9]{3,}[@]{1}[g][m][a][i][l]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Result with valid email Id:"+ result_valid_email_id);      // Returns true
    console.log("Result with invalid email Id1:"+ result_invalid_email_id1);  // Returns false
    console.log("Result with invalid email Id:2"+ result_invalid_email_id2);  // Returns false
}

/**
 * UC 3: Email validation: Make sure . and com after gmail are there
 */
 {
    let valid_email_id ="abc@gmail.com";
    let invalid_email_id1  = "abc@gmail.co";
    let invalid_email_id2 = "abc@gmailcom";

    // Atleast three characters should be present
    let regex = RegExp("[a-zA-Z0-9]{3,}[@]{1}[g][m][a][i][l][.][c][o][m]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Is valid email Id: "+ result_valid_email_id);      // Returns true
    console.log("Is valid email Id1:"+ result_invalid_email_id1);  // Returns false
    console.log("Is valid email Id2: "+ result_invalid_email_id2);  // Returns false
}

/**
 * UC 4: Email validation: There may be a certain special character(+-.-) before @ but alphanumeric characters must separate 
 *                          it from @ symbol
 */
 {
    let valid_email_id ="abc.xyz@gmail.com";
    let invalid_email_id1  = "abc.@gmail.com";  // No alphanumeric character after dot
    let invalid_email_id2 = "abc&@gmail.com";   // Ampersand not an allowed special character

    // Atleast three characters should be present
    let regex = RegExp("([a-zA-Z0-9]{3,}|[a-zA-Z0-9]{3,}[+_.-]?[a-zA-Z0-9]{1,})[@]{1}[g][m][a][i][l][.][c][o][m]");

    let result_valid_email_id = regex.test(valid_email_id);
    let result_invalid_email_id1 = regex.test(invalid_email_id1);
    let result_invalid_email_id2 = regex.test(invalid_email_id2);

    console.log("Is email Id Valid: "+ result_valid_email_id);      // Returns true
    console.log("Is email Id1 valid: "+ result_invalid_email_id1);  // Returns false
    console.log("Is email Id2 valid: "+ result_invalid_email_id2);  // Returns false
}