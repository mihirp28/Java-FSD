import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LiveStreamComponent } from './live-stream/live-stream.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { LoginNavComponent } from './login-nav/login-nav.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { RegisterComponent } from './register/register.component';
import { AuthGuard } from './services/auth.guard';
import { SidebarComponent } from './sidebar/sidebar.component';
import { StudioUploadComponent } from './studio-upload/studio-upload.component';
import { VideoUploadComponent } from './video-upload/video-upload.component';
import { VideoViewComponent } from './video-view/video-view.component';

const routes: Routes = [
  {
    path: "home",
    component: SidebarComponent,
    children: [
      {
        path: "", 
        component: HomeComponent,
        children :[
          {
            path : "video-view/:id",
            component : VideoViewComponent,
          }
        ]
      }
    ] 
  },
  {
    path: "studio-upload",
    canActivate :[],
    component: StudioUploadComponent,
    children:[
      {
        path: "",
        component: VideoUploadComponent, 
      },
      {
        path: "upload-video",
        component: VideoUploadComponent,  
      },
      {
        path : "live-Video",
        component :LiveStreamComponent, 
      }
    ] 
  },
  {
    path:"authentication",
    component : LoginNavComponent,
    children :[
      {
        path :"",
        component: RegisterComponent,
      },
      {
        path :"login",
        component : LoginFormComponent,
      },
      {
        path : "register",
        component : RegisterComponent,
      }

    ]
  },
  {
    path: "",
    redirectTo: "home",
    pathMatch: 'full'
  },
  {
    path: "**",
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
