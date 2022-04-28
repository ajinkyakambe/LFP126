console.log("Checking the number is prime or not");
var number =20;

for (var i=2;i <= number;i++){
     if (number % i == 0){
         console.log(i)
         number = number / i;
         i = 1;
    }
}
