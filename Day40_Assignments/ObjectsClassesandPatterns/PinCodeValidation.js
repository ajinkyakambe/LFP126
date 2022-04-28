/**
 * UC 1: Create a regex pattern to validate pin code 400088
 */
{   
    let pin = 400088;
    let regex = RegExp('[1-9][0-9]{5}');
    let result = regex.test(pin);
    console.log(result);
}
/**
 * UC 2: Restrict the pin code from taking alphabets or special characters at beginning
 */
{
    let pin = "A400088";

    // Beginning should contain only digits from 1 to 9
    let regex = RegExp('^[1-9][0-9]{5}');
    let result = regex.test(pin);
    console.log(result);    // returns false
}

/**
 * UC 3: Restrict the pin code from taking alphabets or special characters at end
 */
{
    let pin = "400088B";

    // End should contain only digits from 1 to 9, cannot contain any alphabets or special characters
    let regex = RegExp('[1-9][0-9]{4}[0-9]$');
    let result = regex.test(pin);
    console.log(result);    // returns false
}

/**
 * UC 4: Make sure 400 088 is also valid along with 400088
 */
{
    let pin_with_whitespace = "400 088";
    let pin_without_whitespace = "400088";

    // Whitespace in the mid is allowed
    let regex = RegExp("[0-9]{3}[\\s]?[0-9]{3}");
    let result_with_whitespace = regex.test(pin_with_whitespace);
    let result_without_whitespace = regex.test(pin_without_whitespace);
    console.log("Result with whitespace in between: "+ result_with_whitespace);    // returns true
    console.log("Result without whitespace in between: " +result_without_whitespace);    // returns true
}

