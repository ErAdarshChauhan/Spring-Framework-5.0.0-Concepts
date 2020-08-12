import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  url_api = "http://localhost:2020/books";
  constructor(private http:HttpClient ) { }

  getAllBooks(){
    return this.http.get(this.url_api+"/getAllBooks");
  }

  searchByName(name:string){
    return this.http.get(this.url_api+"/getBookByName/"+name);
  }

  // searchById(id:string){
  //   return this.http.get(this.url_api+"/getBookById/"+id);
  // }

  searchByAuthor(author:string){
    return this.http.get(this.url_api+"/getBookByAuthor/"+author);
  }

  searchByPrice(price:string){
    return this.http.get(this.url_api+"/getBookByPrice/"+price);
  }
}
