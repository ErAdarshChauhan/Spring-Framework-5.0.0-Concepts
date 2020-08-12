import { Component, OnInit } from '@angular/core';
import { BookService } from "../book.service";
@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  books : any;
  constructor(private service:BookService) { }

  ngOnInit() {
    this.service.getAllBooks().subscribe(data=>{
      this.books = data;
    });
  }

}
