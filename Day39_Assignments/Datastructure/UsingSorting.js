console.log("Generating 5 random numbers:");
var min = 100;
var max = 999;
var array = [];
for(var i = 0; i< 5;i++){
    var number = Math.floor(Math.random() * (max - min + 1) + min);
    array.push(number);
}
console.log(array);
var temp = array[i];
array.sort(function(a, b){return a - b});
console.log(array);
console.log("Second Smallest number: ",array[1]);
console.log("Second Largest Number: ",array[array.length-2]);