console.log("Flip the coin")
var win = 0;
var headCount = 0;
var tailCount = 0;
var count = 0;
while(win != 11){
    var flipcoin = (Math.random())*2;
    if(flipcoin > 1 ){
        console.log("Head");
        headCount++;
        if(headCount==11){
            console.log("\nHead Wins!!!")
            win = headCount;
        }
    }
    else{
        console.log("Tail");
        tailCount++;
        if(tailCount==11){
            console.log("\nTail Wins!!!")
            win = tailCount;
        }
    }
    
}
// console.log(tailCount);
// console.log(headCount);
