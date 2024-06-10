import { Component, ElementRef, OnInit } from '@angular/core';
import { StorageService } from './storage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'myApp';
  public width:string='80%';
  public column:number=4;
 public gap:string="15px";

 public  body:any = document.querySelector('body');
 public sidebar:any = this.elementRef.nativeElement.querySelector('nav');
 public toggle:any = this.elementRef.nativeElement.querySelector(".toggle");
 public searchBtn:any = this.elementRef.nativeElement.querySelector(".search-box");
 public modeSwitch:any = this.elementRef.nativeElement.querySelector(".toggle-switch");
 public modeText:any = this.elementRef.nativeElement.querySelector(".mode-text");
 
public flag:boolean=true;
 constructor(private elementRef: ElementRef, private _database:StorageService) {}
  ngOnInit(): void {
    this._database.getData().subscribe(data=>this.notes=data);
  }
 onClick(){
  if(this.flag===true)
      this.flag=false;
  else
  this.flag=true;    
  } 
  onSearch(){
    this.sidebar.classList.remove("close");
    }
  
 OnSwitch() {
  this.body.classList.toggle("dark");
      
  if(this.body.classList.contains("dark")){
    this.modeText.innerHTML = "Light mode";
  }else{
    this.modeText.innerHTML = "Dark mode";   
  }
    }

 
    notes:any=[];
    
    onNoteAdded(note: any){
      //console.log(note);
      if(note.title==="" || note.content===""){
        alert("Title or Content is empty");
      }
      else{
        this._database.pushData(note).subscribe(data=>{
          this._database.getData().subscribe(data=>this.notes=data);
          })
      }
    }
}
