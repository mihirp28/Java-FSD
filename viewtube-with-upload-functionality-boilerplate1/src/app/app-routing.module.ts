import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { StudioUploadComponent } from './studio-upload/studio-upload.component';


const routes: Routes = [
  {path: '', component:StudioUploadComponent , pathMatch: 'full'},
  {path: 'upload', component: StudioUploadComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
