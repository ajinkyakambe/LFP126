console.log("Printing the Nth Harmonic Number");
var number = 8;
var harmonicNumbe = 1;
for(var i = 1;i<=number;i++){
    harmonicNumbe = (harmonicNumbe + 1 / (i + 1));
}
console.log(harmonicNumbe);