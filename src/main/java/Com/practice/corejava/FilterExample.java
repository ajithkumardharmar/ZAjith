package Com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int productId;
	String productName;
	long price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Product(int productId, String productName, long price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
}

public class FilterExample {
	
	public static void main(String[] args) {
		List<Product> productList  = new ArrayList<>();
		productList.add(new Product(1, "Apple 12", 59000));
		productList.add(new Product(1, "Apple 13", 69000));
		productList.add(new Product(1, "Samsung", 39000));
		productList.add(new Product(1, "Redmi note 12", 29000));
		
		List <String> productNameList = productList.stream().filter(e -> e.getProductName()
				.startsWith("A")).map(Product::getProductName).toList();
		System.out.println(productNameList);
		productNameList.forEach(productName->{
			if(productName.equals("Apple 12")) {
				System.out.println(productName);
			}
		});
		System.out.println("--------------Mid Range-------------------------------");
		List <Product> MidRangeProd = productList.stream()
				.filter(e -> e.getPrice()<40000).collect(Collectors.toList());
		MidRangeProd.forEach(midProduct->{
			System.out.println("Product Name : "+midProduct.getProductName() +" && Product price : "+midProduct.getPrice());
		});
		System.out.println("--------------High Range-------------------------------");
		List <Product> highRangeProd = productList.stream()
				.filter(FilterExample::getHighPrice).collect(Collectors.toList());
		highRangeProd.forEach(midProduct->{
			System.out.println("Product Name : "+midProduct.getProductName() +" && Product price : "+midProduct.getPrice());
		});
	}
	
	public static boolean getHighPrice(Product product) {
		
		return product.getPrice()>40000;
		
	}
}
