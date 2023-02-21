document.write("<b> Your Ticket Details</b> <br>");

function calculateTotalCost(seat) {

    let ticketPrice = 9;
    var discount = 0;
    var count = 0;
    var cost = 0;
    var totalCost = 0;
    var customer = [0, 0, 0, 0, 0];

    if(seat <=2){
        totalCost = ticketPrice * seat;
        var i = 0; 
        do{ 
            ++count;
            document.write("Ticket for Customer " + count + " gets " + customer[i] + "% " + "discount!");
            document.write(", Cost is: $" + ticketPrice + "<br>");
            i++;
        } while (i < seat)  
        document.write("For " + count + " tickets, you need to pay: $" + totalCost);
        return totalCost;
    }
    else if (seat > 2 && seat < 5) {
        discount = 3;
        for(var i = 0; i < seat; i++) {
            ++count;
            discount += 2;
            customer[i] = discount;
            document.write("Ticket for Customer " + count + " gets " + customer[i] + "% "   + "discount!");
            cost = (ticketPrice - (ticketPrice * discount) / 100);
            document.write(", Cost is: $" + cost + "<br>");
            totalCost += cost;
        };
        document.write("For " + count + " tickets, you need to pay: <b>$" + totalCost + "</b> instead of $"
        + ticketPrice*count );
        
    } else if (seat >= 5) {
        document.write("Booking not allowed for 5 or more seats.");
    }

    return 0;
}
let inp = prompt('Enter number of tickets');
var regEx = [0-9];
while (inp.match(regEx));
calculateTotalCost(inp); 
// calculateTotalCost(1); 
// calculateTotalCost(2); 
// calculateTotalCost(3); 
// calculateTotalCost(4); 
// calculateTotalCost(5); 