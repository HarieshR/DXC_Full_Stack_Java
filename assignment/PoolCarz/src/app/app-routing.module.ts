import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { BookRideComponent } from './book-ride/book-ride.component';
import { OfferRideComponent } from './offer-ride/offer-ride.component';

const routes: Routes = [
    { component: LoginComponent, path: '' },
    { component: BookRideComponent, path: 'book-ride' },
    { component: OfferRideComponent, path: 'offer-ride' },
    { component: LoginComponent, path: 'login' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
