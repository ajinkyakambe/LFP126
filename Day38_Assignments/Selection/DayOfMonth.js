
console.log("Printing if day of month is between March 20 and June 20");
console.log("3 March");
console.log("4 April");
console.log("5 May");
console.log("6 June");
var day = 25;
var month = 5;
var result;
var daylimit = (30+(month %2))
if(month >= 3 && day <= daylimit && month <= 6){
    if(month == 3){
        if(day >=20 && day <= daylimit){
            result = "True";
        }
    }
    else if(month == 6){
        if(day <=20){
            result = "True";
        }
    }
    else{
        result = "True"
    }
}
else{
    result = "False";
}
console.log(result);