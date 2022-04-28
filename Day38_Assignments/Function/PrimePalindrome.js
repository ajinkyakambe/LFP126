console.log("Prime Palindrome Program");
var number = 43;
var count = 0;
var sum = 0;
var temp = number;
prime(number);
palindrome(number);
primePalindrome();

function prime(){

    for (var i = 1;i <= number;i++){
        if (number % i == 0){
            count = count + 1;      
        }
    }
    if(count == 2){
        console.log(number," is a Prime Number");
    }
    else{
        console.log(number," is not a prime number");
    }
}

function palindrome(){
    var r;

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

function primePalindrome(){
    if(count ==2 && sum == temp){
        console.log("The given number is Palindrome and alos Prime");
    }
    else{
        console.log("The given number is not Prime Palindrome");
    }
}