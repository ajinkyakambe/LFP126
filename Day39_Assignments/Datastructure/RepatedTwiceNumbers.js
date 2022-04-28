console.log("Printing the numbers which are repeating Twice");
var array = [];
for(i = 1;i<=100;i++){
    if(i%11==0){
        array.push(i);
    }
}
console.log(array);