console.log("Palindrome number");
var number =454;
palindrome(number);

function palindrome(){
    var r;
    var sum = 0;
    var temp = number;
    while(number > 0){
        r = number % 10; 
        number = parseInt(number / 10); 
        sum = (sum * 10) + r;        
    }
    if(sum == temp){
        console.log("The given number is palindrome")
    }
    else{
        console.log("The given number is not a Palindrome")
    }
}