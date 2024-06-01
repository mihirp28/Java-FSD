import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-board',
  template: `
    <p>
      board works!
    </p>
  `,
  styleUrls: ['./board.component.css']
})
export class BoardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
