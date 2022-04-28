console.log("Checking the number is prime or not");
var number =50;

for(var j = 1; j<= number;j++){
    var count = 0;
    for (var i = 1;i <= j;i++){
        if (j % i == 0){
            count = count + 1;      
        }
    }
    if(count == 2){
        console.log(j," is a Prime Number");
    }
}

