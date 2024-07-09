import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studio-upload',
  templateUrl: './studio-upload.component.html',
  styleUrls: ['./studio-upload.component.css']
})
export class StudioUploadComponent implements OnInit {
  Urllist:New[]=
  [new New("ABC.com")];

  constructor() {


  }

  ngOnInit(): void {
  }
  onSubmit(contactForm:any){
    console.log(contactForm.value)

}
}
export class New{
  public Video_url:string;

  constructor(Video_url:string) {

    this.Video_url=Video_url;
  }
}

