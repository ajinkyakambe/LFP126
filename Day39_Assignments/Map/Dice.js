console.log("Rolling dice and finding maximum and minimum occured numbers");
///////Step One
var max = 6;
var min = 1;
let myMap = new Map();
var dicevalue = 0;
var oneCount = 0;
var twoCount = 0;
var threeCount = 0;
var fourCount = 0;
var fiveCount = 0;
var sixCount = 0;
var maxCount = 6;
////////Step Two
for(var i = 0;i<=50;i++){
    dicevalue = Math.floor(Math.random() * (max - min + 1) + min);
    myMap.set(i,dicevalue);
    if(dicevalue == 1){
        oneCount++;
        if(oneCount == 10){
            console.log("Number 1 occured 10 times");
            break;
        }
    }
    if(dicevalue == 2){
        twoCount++;
        if(twoCount == 10){
            console.log("Number 2 occured 10 times");
            break;
        }
    }
    if(dicevalue == 3){
        threeCount++;
        if(threeCount == 10){
            console.log("Number 3 occured 10 times");
            break;
        }
    }
    if(dicevalue == 4){
        fourCount++;
        if(fourCount == 10){
            console.log("Number 4 occured 10 times");
            break;
        }
    }
    if(dicevalue == 5){
        fiveCount++;
        if(fiveCount == 10){
            console.log("Number 5 occured 10 times");
            break;
        }
    }
    if(dicevalue == 6){
        sixCount++;
        if(sixCount == 10){
            console.log("Number 6 occured 10 times ");
            break;
        }
    }
}
console.log("Number occure is ",oneCount);
console.log("Number occure is ",twoCount);
console.log("Number occure is ",threeCount);
console.log("Number occure is ",fourCount);
console.log("Number occure is ",fiveCount);
console.log("Number occure is ",sixCount);
/////Step 3
console.log("\n**********<Stored Map values>**********")
for(let [key,value] of myMap) console.log("Values: ",key," = " , value);