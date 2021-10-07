package AmazonImplementation;

public class Search {
	
	public String displyProduct(Product product) {
		
		if(product.getProductName().contains(product.getProductName())){
			return product.getProductName();
		}
		return null;
	}

}
