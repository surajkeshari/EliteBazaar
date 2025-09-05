import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../common/product';

@Component({
  selector: 'app-product-list',
  standalone: false,
  templateUrl: './product-list.html',
  styleUrl: './product-list.css'
})
export class ProductList implements OnInit {
   products: Product[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.listProducts();
  }

  listProducts() {
    const newLocal = this;
    newLocal.productService.getProductList().subscribe(
      data => {
        this.products = data;
      }
    )
  }
}
