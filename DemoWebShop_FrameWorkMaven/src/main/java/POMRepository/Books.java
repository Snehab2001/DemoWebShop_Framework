package POMRepository;


	import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Books 
	{
	     @FindBy(id="products-orderby")
		 private WebElement sortByDropdown;
	     
	     @FindBy(id="products-pagesize")
		 private WebElement displayDropdown;
	     
	     @FindBy(xpath = "//h2[@class='product-title']")
		 private List<WebElement> BooksNamesLink;
	     
	     public Books(Object driver)
	     {
	  	   PageFactory.initElements((SearchContext) driver, this);
	     }

		public WebElement getSortByDropdown() {
			return sortByDropdown;
		}

		public WebElement getDisplayDropdown() {
			return displayDropdown;
		}

		public List<WebElement> getBooksNamesLink() {
			return BooksNamesLink;
		}

		public WebElement getFictionExProductName() {
			// TODO Auto-generated method stub
			return null;
		}

		public WebElement getComputingandInternet() {
			// TODO Auto-generated method stub
			return null;
		}

		
	     
	}


