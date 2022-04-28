var start_with = 100;
var bet = 0;
var goal = 200;
var number_of_Times = 0;
var temp = start_with;
var win = 0;
var lose = 0;

while(temp != 0 && temp != goal){
    if (temp != 0) {
        if (win != goal) {
            if (Math.random() > 0.5) {
                temp++;
                win++;
            } else {
                temp--;
                lose++;
            }
        } else {
            console.log("You won the game goal.....");
            break;
        }
    } else {
        console.log("You lose the Game");
    }
}
console.log("Number of times Win: ",win);
console.log("Number of Times bet: ",win+lose);