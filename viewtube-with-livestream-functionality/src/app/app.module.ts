import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SidebarComponent } from './sidebar/sidebar.component';

import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatFormFieldModule} from '@angular/material/form-field';
import { MatChipsModule } from '@angular/material/chips';
import { MatMenuModule } from '@angular/material/menu';
import { FormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatTooltipModule } from '@angular/material/tooltip';
import { HomeComponent } from './home/home.component';
import { VideoUploadComponent } from './video-upload/video-upload.component';

import { MatSelectModule } from '@angular/material/select'
import {MatRadioModule } from '@angular/material/radio';
import { StudioUploadComponent } from './studio-upload/studio-upload.component';
import { LiveStreamComponent } from './live-stream/live-stream.component'

import { ReactiveFormsModule } from '@angular/forms';
import { VideoViewComponent } from './video-view/video-view.component';
import { MatCardModule } from '@angular/material/card';
import { LoginNavComponent } from './login-nav/login-nav.component';
import { LoginFormComponent } from './login-form/login-form.component';

import { MatCheckboxModule } from '@angular/material/checkbox';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    HomeComponent,
    VideoUploadComponent,
    StudioUploadComponent,
    LiveStreamComponent,
    VideoViewComponent,
    LoginNavComponent,
    LoginFormComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,

    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatFormFieldModule,
    MatChipsModule,
    MatMenuModule,
    FormsModule,
    MatInputModule,
    MatTooltipModule,

    MatSelectModule,
    MatRadioModule,

    ReactiveFormsModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatCheckboxModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
