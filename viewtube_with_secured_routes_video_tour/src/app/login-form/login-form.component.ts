import { Component,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { map, Observable, pipe } from 'rxjs';
import { AuthService } from '../services/auth.service';


@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  login : any ={};

  constructor(private authService: AuthService,private router: Router) {}

  ngOnInit(): void {
  }


  loginUser()
  {
    if(this.login.password === "1234")
    {
      this.authService.login(this.login);
      this.router.navigate(['studio-upload']);
      alert("Login Sucessful")
    }
    else
    {
      alert("Login Failed");
      this.router.navigate(['/authentication/login']);
    }

  } 

}
