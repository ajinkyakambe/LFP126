console.log("Checking the number is prime or not");
var number =20;
var array = [];
for (var i=2;i  <= number;i++){
     if (number % i == 0){
         console.log(i)
         number = number / i;
         array.push(i);
         i = 1;
    }
}
console.log(array);