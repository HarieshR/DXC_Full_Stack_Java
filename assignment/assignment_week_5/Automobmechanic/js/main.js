function redirectToServices() {
    window.location.assign("services.html");
}
function validateForm() {
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pwd").value;
     
    fetch('../js/users.json').then(result => result.json()).then(json => {
        let flag = false; 
        for (let i = 0; i < 6; i++) {
            if (username == json[i].username && password == json[i].password) {
                alert("Logged in Sucessfully");
                flag = true; 
                flag1 = true;
                sessionStorage.setItem("UserName", username);
                sessionStorage.setItem("Flag", "true"); 
                window.location.assign("home.html") 
                break;
            }
        }
        if (flag == false) {
            alert("Invalid Credentails");
        }
    })
}

if(sessionStorage.getItem("Flag") == "true") {
    changeNavBar();
}

function changeNavBar() {
     
    if(sessionStorage.getItem("UserName") == "admin"){
        document.getElementById('login').style.display = "none";
        document.getElementById("services").style.display = "none";
        document.getElementById("booking").style.display = "none";
        sessionStorage.removeItem("flag");
        let parent = document.getElementById("name");
         parent.textContent = 'Hi ' + sessionStorage.getItem("UserName") + " |";
     
    }
    else {
         document.getElementById("login").style.display = "none";
         document.getElementById('reports').style.display = "none";
         sessionStorage.removeItem("flag");
         let parent = document.getElementById("name");
         parent.textContent = 'Hi ' + sessionStorage.getItem("UserName") + " |";
    }
}

function MoreDetailsPMS(){
sessionStorage.setItem("value" ,"1");
window.location.assign("preventive-maintenance-service.html");

}

function MoreDetailsBPS(){
    sessionStorage.setItem("value" ,"2");
    window.location.assign("body-repair-service.html");

    }
function MoreDetailsCCS(){
    sessionStorage.setItem("value" ,"3");
    window.location.assign("car-care-service.html");
    }

function countDown(){
    var endTime = new Date("Mar 20, 2023 09:00:00").getTime();
    var x = setInterval(function () {
        var now = new Date().getTime();
        var t = endTime - now;
        var days = Math.floor(t / (1000 * 60 * 60 * 24));
        var hours = Math.floor((t % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((t % (1000 * 60 * 60)) / (1000 * 60));
        document.getElementById("counter").innerHTML = days + "d "
            + hours + "h " + minutes + "m " + seconds + "s ";
        if (t < 0) {
            clearInterval(x);
            document.getElementById("counter").innerHTML = "EXPIRED";
        }
    }, 1000);
    
}

function bookingPMS(){
    sessionStorage.setItem("Stage1","true")
    window.location.assign("booking.html"); 
}

function bookingBPS(){
    sessionStorage.setItem("Stage1","true")
    window.location.assign("booking.html");
    
}

function bookingCCS(){
    sessionStorage.setItem("Stage1","true")
    window.location.assign("booking.html");
 
}

function backUrl(){
  window.history.back();
}

if( sessionStorage.getItem("Stage1")=="true"){
    document.getElementById("selectService").selectedIndex = sessionStorage.getItem("value"); 
    sessionStorage.removeItem("Stage1");
  //  sessionStorage.removeItem("value");
}




function validatebooking(){
    sessionStorage.setItem("bookingsuccess","true");
    checkDate();
 return true;
}

document.getElementById("appointmentDate").addEventListener("change", function() {
     var input = this.value;
        console.log(input);
        let today = new Date().toISOString().slice(0, 10)
        console.log(today);   
        if(input < today ){
            document.getElementById("errorMsg").innerHTML = "*Error Please entre a Valid date"
                console.log("Error Please entre a valid date");
                }
            else{
                document.getElementById("errorMsg").innerHTML = "";
            } });


if(sessionStorage.getItem("bookingsuccess") == "true"){
    setTimeout(()=>{
        console.log("You are insde this function")
        prompt("On a scale of 1-10, how likely are you to recommend our website to your friends or family?");
        alert("Thanks for your feedback");
        sessionStorage.removeItem("bookingsuccess");
        ;},6000);
}



function logout(){
    sessionStorage.clear();
    alert("Logged out successfully");
    window.location.assign("home.html");
}
