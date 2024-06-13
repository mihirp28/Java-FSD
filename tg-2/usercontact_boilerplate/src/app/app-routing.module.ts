import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { SearchComponent } from './search/search.component';

// Define paths for routing between contact form and listing view
// Empty path ('') should route to Contact Component
// /contact -> route to Contact component
// /listContatct -> route to search component
const routes: Routes = [
  {path:"home",component:ContactComponent},
  {path:"search",component:SearchComponent},
  {path:"",redirectTo: 'home', pathMatch: 'full'}  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
