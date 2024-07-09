import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  register :any ={};

  constructor(private router: Router,private authservice : AuthService) { }

  ngOnInit(): void {
  }
  

  registerUser()
  {
    console.log(this.register);
    this.router.navigate(['/authentication/login']);
    // this.authservice.post(this.register).subscribe(()=>{
    //   this.router.navigate(['/authentication/login']);
    // });
 
  }
  
}
