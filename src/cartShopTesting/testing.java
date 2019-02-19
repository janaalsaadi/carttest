package cartShopTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {


	@Test public void test_empty_cart_test(){
		cart_shop jana = new cart_shop();
		int num_def=0;
		int found=jana.getCountOffBook();
		assertTrue(num_def==found);	
	}
	@Test
	public void secondtest () { 
		cart_shop jana = new cart_shop();
		int num_def = 1 ;
		int priceE = 127 ;
		books book = new books("java", 127);
		jana.addBook(book);
		assertTrue(num_def ==  jana.getCountOffBook());
		assertTrue(priceE == jana.getPrice());
	}
	
	@Test
	public void allstest () { 
		cart_shop jana = new cart_shop();
		int num_def = 2 ;
		int priceE = 227 ;
		books book = new books("java", 127);
		books book2 = new books("book2", 100);
		jana.addBook(book);
		jana.addBook(book2);
		assertTrue(num_def ==  jana.getCountOffBook());
		assertTrue(priceE == jana.getPrice());
	}


}
