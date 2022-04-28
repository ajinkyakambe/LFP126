console.log("Generating 5 random numbers:");
var min = 100;
var max = 999;
var array = [];
for(var i = 0; i< 5;i++){
    var number = Math.floor(Math.random() * (max - min + 1) + min);
    array.push(number);
}
console.log(array);

console.log("\nSearching for the 2nd Large and 2nd smallest number from an array");
var firstsmallest;
var secondsmalles;
firstsmallest = secondsmalles = array[0];
for(var i = 0; i<= array.length;i++){
    if(array[i] < firstsmallest){
        secondsmalles = firstsmallest;
        firstsmallest = array[i];
    }
    else if(array[i] < secondsmalles && array[i] != firstsmallest)
    secondsmalles = array[i];
}
console.log("Second Smallest number: ",secondsmalles);

var secondlargest;
var firstlargest;
firstlargest = secondlargest = array[0];
for(var i = 0; i<= array.length;i++){
    if(array[i] > firstlargest){
        secondlargest = firstlargest;
        firstlargest = array[i];
    }
    else if(array[i] > secondlargest && array[i] != firstlargest)
    secondlargest = array[i];
}

console.log("Second Largest Number: ",secondlargest);