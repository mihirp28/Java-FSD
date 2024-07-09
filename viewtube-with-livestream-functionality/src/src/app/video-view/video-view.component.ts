import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { VideoService } from '../services/video.service';


@Component({
  selector: 'app-video-view',
  templateUrl: './video-view.component.html',
  styleUrls: ['./video-view.component.css']
})
export class VideoViewComponent implements OnInit {

  videoObservable: Observable<any> = new Observable<any>();

  constructor(private activatedRoute: ActivatedRoute, private videoservice : VideoService, private videoService: VideoService)
  { 
    console.log("inside video view");
    
    this.activatedRoute.params.subscribe(data => {
      console.log("data");
      console.log(data);
    
      this.videoObservable = videoservice.getVideo(data['id']);
      console.log(" this.videoObservable");
      console.log( this.videoObservable);
    })

  }

  ngOnInit(): void {
    
  }

}
