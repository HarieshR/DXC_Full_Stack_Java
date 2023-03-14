import { Component, EventEmitter, Input, Output } from '@angular/core';
import { OfferRideComponent } from '../offer-ride/offer-ride.component';


@Component({
  selector: 'app-book-ride',
  templateUrl: './book-ride.component.html',
  styleUrls: ['./book-ride.component.css'],

})
export class BookRideComponent {

  
  showRideTable = false;

  rides = [
    {'start' : 'Vanrose Junction', 'end' : 'Office', 'seat' : '3'},
    {'start' : 'PTP', 'end' : 'Office', 'seat' : '2'},
    {'start' : 'Office', 'end' : 'East-Fort', 'seat' : '7'},
    {'start' : 'Office', 'end' : 'Central Mall', 'seat' : '5'},
  ];

  @Output() bookrideEvent = new EventEmitter();

toggleRideTable() {

  this.showRideTable = true;
 this.bookrideEvent.emit();
 
}

offerRide = false;
showOffer(){
this.offerRide=true;
}


filterRideClicked=false;

  @Input() filter!: string;
  @Output() showRideEvent = new EventEmitter();

  showRides(rideFilter: string) {
    
    this.filterRideClicked = true;
    this.showRideEvent.emit(rideFilter);
    
    
  }

}
