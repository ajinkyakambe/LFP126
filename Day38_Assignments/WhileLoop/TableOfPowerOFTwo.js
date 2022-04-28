console.log("Priniting the table of 2 till given power");
var power =5;
var temp;
// for(var i = 1; i <= power;i++){
//     temp = Math.pow(2,i);
// }
var i = 1;
while(temp != 256){
    temp = Math.pow(2,i);
    i++;
}
console.log(temp);