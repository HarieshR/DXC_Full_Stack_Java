import { Component } from '@angular/core';

@Component({
  selector: 'app-offer-ride',
  templateUrl: './offer-ride.component.html',
  styleUrls: ['./offer-ride.component.css']
})
export class OfferRideComponent {

  isBooked!: boolean;
  submit = false;

  onBook() {
    this.submit = true;
    this.isBooked = true;
   }
}
