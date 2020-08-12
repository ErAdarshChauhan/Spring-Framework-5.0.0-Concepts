import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookComponent } from './book.component';
import { SearchBookComponent } from '../search-book/search-book.component';


const routes: Routes = [
  {
    path:"*", redirectTo:"books/get-all-books", pathMatch:"full"
  },
  {
    path:"books/get-all-books", component: BookComponent
  },
  {
    path:"books/search-books", component: SearchBookComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookRoutingModule { }
