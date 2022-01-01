var wish=document.querySelector(".greeting");
console.log("hello");

var date1 = new Date()

var time1 = date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds();

console.log(date1.getHours())

if((date1.getHours() >=0) && (date1.getHours() < 12))

{

wish.innerText = "Hiii Good Morning";
console.log("hii");

} 
 else if((date1.getHours() >= 12) && (date1.getHours() <16)){
      wish.innerText = "Good Afternoon";
      console.log("9");

 }

else if((date1.getHours() >= 16) && (date1.getHours() <21)){ 
    wish.innerText = "Good Evening";
    console.log("7");

}


else { 
    wish.innerText = "Good Night";
    console.log("6");

}
console.log((date1.getHours() >= 21) && (date1.getHours () <= 2))