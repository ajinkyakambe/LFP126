console.log("\n5 random 2 digit numbers Min and Max:");
var arr = [];
var max = 999;
var min = 100;
var minNumber = 0;
var maxNumber = 0;
while(arr.length < 5){

    var number1 = number = Math.floor(Math.random() * (max - min + 1) + min);
    if(arr.indexOf(number1) === -1) arr.push(number1);
    if(arr.indexOf(number1) >= maxNumber){
        maxNumber = number1;
    }
    if(arr.indexOf(number1) <= minNumber){
        minNumber = number1;
    }
}
console.log("numbers ",arr);
console.log("Minimum number = ",minNumber);
console.log("Maximum number = ",maxNumber);