console.log("Welcome to Unit Conversion");
console.log("Enter ur choice for unit conversion\n1 Feet to Inch \t2 feet to Meter \n3 Inch to Feet \t4 Meter to Feet");
var ch = 2;
var number = 10;
var result;

switch (ch){
    case 1:
        console.log("Feet to Inch");
        result = number * 12;
        break;
    case 2:
        console.log("feet to Meter");
        result = number * 0.3048;
        
        break;
    case 3:
        console.log("Inch to Feet");
        result = number * 0.0833333;
        break;
    case 4:
        console.log("Meter to Feet");
        result = number * 3.28084
        break;
    default :
        console.log("Wrong input");                                                                               
}
console.log("Result ",result);