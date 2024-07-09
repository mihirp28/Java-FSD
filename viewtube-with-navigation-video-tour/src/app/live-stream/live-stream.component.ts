import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { startDateTimeValidator } from '../custom-validators'


@Component({
  selector: 'app-live-stream',
  templateUrl: './live-stream.component.html',
  styleUrls: ['./live-stream.component.css']
})
export class LiveStreamComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  liveStreamForm = new FormGroup({
    eventTitle : new FormControl('', [Validators.required,Validators.maxLength(10)]),
    startdate: new FormControl('', [Validators.required, startDateTimeValidator()]),
    starttime :new FormControl('', [Validators.required]),
    endDate : new FormControl('', [Validators.required]),
    endtime : new FormControl('', [Validators.required]),
    details : new FormControl('')
  })


  get eventTitle() { return this.liveStreamForm.controls['eventTitle']};
  get startdate() { return this.liveStreamForm.controls['startdate']};
  get starttime() { return this.liveStreamForm.controls['starttime']};
  get endDate() { return this.liveStreamForm.controls['endDate']};
  get endtime() { return this.liveStreamForm.controls['endtime']};
  

  Submit()
  {
    console.log(this.liveStreamForm.value);
    alert("Your live stream event is scheduled successfully");
  }

}
