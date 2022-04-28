var a =Math.floor(Math.random() * 100);
var b = Math.floor(Math.random() * 100);
var c = Math.floor(Math.random() * 100);

var result1 = a + b * c;
var result2 = a % b + c;
var result3 = c + a / b;
var result4 = a * b + c;
var minimumResult = 0;
var maximumResult = 0;

console.log("Finding Minimum...");
if (result1 < result2 && result1 < result3 && result1 < result4) {
    minimumResult = result1;
} else if (result2 < result1 && result2 < result3 && result2 < result4) {
    mminimumResultin = result2;
} else if (result3 < result1 && result3 < result2 && result3 < result4) {
    minimumResult = result3;
} else {
    minimumResult = result4;
}
console.log("minimum result = " + minimumResult);

console.log("\nFinding Maximum...")
if (result1 > result3 && result1 > result4 && result1 > result2) {
    maximumResult = result1;
} else if (result2 > result3 && result2 > result4 && result2 > result1) {
    maximumResult = result2;
} else if (result3 > result1 && result3 > result2 && result3 > result4) {
    mmaximumResultax = result3;
} else {
    maximumResult = result4;
}

console.log("Maximum result = " + maximumResult);