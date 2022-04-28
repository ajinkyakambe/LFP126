/*
Write a Program to generate a birth month of 50 individuals
between the year 92 & 93. Find all the individuals having birthdays
in the same month. Store it to finally print.
*/

map = new Map();

monthArray = ["January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

map.set("January", 0);
map.set("Febuary", 0);
map.set("March", 0);
map.set("April", 0);
map.set("May", 0);
map.set("June", 0);
map.set("July", 0);
map.set("August", 0);
map.set("September", 0);
map.set("October", 0);
map.set("November", 0);
map.set("December", 0);

for (let i = 0; i < 50; i++) {
    let month = Math.floor(Math.random() * 12);
    map.set(monthArray[month], map.get(monthArray[month]) + 1);
}

console.log(map);