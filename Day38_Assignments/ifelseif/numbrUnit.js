console.log("Read the number and display");
var number = [1,10,100,1000];
console.log("Enter array index to display number in words");
var ch = 3;
if(ch == 0){
    console.log("Unit");
}
else if(ch == 1){
    console.log("Ten");
}
else if(ch == 2){
    console.log("Hundred");
}
else if(ch == 3){
    console.log("Thousand");
}
else {
    console.log("Wrong input");
}