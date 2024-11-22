package com.example.crud.product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="api/v1/products")
public class ProductController {	
	private final ProductService productService;
	@Autowired
	public ProductController(ProductService productService){
		this.productService= productService;
	}

	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();

	}

	@PostMapping
	public ResponseEntity<Object> registrarProducto(@RequestBody Product product){
		return this.productService.newProduct(product);
	}

	@PutMapping
	public ResponseEntity<Object> actualizarProducto(@RequestBody Product product){
		return this.productService.newProduct(product);
	}

	@DeleteMapping(path="{productId}")
	public ResponseEntity<Object> eliminar(@PathVariable("productId")long id){
		return this.productService.deleteproduct(id);
	}

}
