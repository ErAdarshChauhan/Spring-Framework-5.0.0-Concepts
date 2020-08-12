import { Component, OnInit } from '@angular/core';
import {  FormGroup,FormControl,FormBuilder} from "@angular/forms";
import { BookService } from '../book.service';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

  bookForm : FormGroup;
  bookData : any;

  constructor(private builder:FormBuilder, private service:BookService) {
    this.bookForm = builder.group({
      //  bookId : new FormControl(),
       bookName : new FormControl(),
       author : new FormControl(),
       price : new FormControl()
    });

   }

  ngOnInit() {
    
  }

  searchById(){
    
  }

  searchByName(){
    if (this.bookForm.get('bookName').value!="") {
      this.service.searchByName(this.bookForm.get('bookName').value).subscribe(data=>{
        this.bookData = data;
        console.log(this.bookData);
    });
  
    }
    
    // if (this.bookForm.get('bookId').value!="") {
    //   this.service.searchById(this.bookForm.get('bookId').value).subscribe(data=>{
    //     this.bookData = data;
    //     console.log(this.bookData);
    // });
    // console.log(this.bookForm.get('bookId').value);
    // }

    if (this.bookForm.get('author').value!="") {
      this.service.searchByAuthor(this.bookForm.get('author').value).subscribe(data=>{
        this.bookData = data;
        console.log(this.bookData);
    });
    
    }
    if (this.bookForm.get('price').value!="") {
      this.service.searchByPrice(this.bookForm.get('price').value).subscribe(data=>{
        this.bookData = data;
        console.log(this.bookData);
    });
    
    }
    
  }
}
