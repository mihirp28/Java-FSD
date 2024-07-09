import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { VideoService } from '../services/video.service';
import * as moment from 'moment';
import  'moment-duration-format';

import  'moment-duration-format';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent
{
  /* the code here subscribes to the observable providing the video list
    and additionally adds the relativeTime which gives the publish duration
    and the length of video
  */

  video$: Observable<Array<any>>;

  constructor(private videoService: VideoService) {
    this.video$ = this.videoService.video$.pipe(map(this.addRelativeTime));
    console.log("this.video");
    
    console.log(this.video$);
    
  }

  addRelativeTime(videos: any) {
    return videos.map((video: any) => {
      video.snippet.relativeTime = moment(video.snippet.publishedAt, moment.defaultFormatUtc).fromNow();
      video.contentDetails.length = moment.duration(video.contentDetails.duration,"minutes").format();
      return video;
    });
  }

}
