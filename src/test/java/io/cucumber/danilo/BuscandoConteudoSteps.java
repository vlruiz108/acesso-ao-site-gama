package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class BuscandoConteudoSteps {
		
public WebDriver browser;
			
      {System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    browser = new ChromeDriver();
		}
      @Dado("que eu estou no site da gama academy {string}")
  	  public void que_eu_estou_no_site_da_gama_academy1(String string) {
  		browser.get("https://www.gama.academy/");
  	}
      @Dado("clico para fechar a propaganda")
      public void clico_para_fechar_a_propaganda() throws InterruptedException {
    	  Thread.sleep(4000);
    	  browser.findElement(By.cssSelector(".ub-emb-close")).click();
      
      }
    		  
      @Dado("cliclo na opcao quem somos")
      public void cliclo_na_opcao_quem_somos() throws InterruptedException {
    	  WebElement input = browser.findElement(By.cssSelector(".nav-menu a"));
  		input.click();
    	
        
      }
      
        @Entao("deve ver o item do {string}")
        public void eu_devo_ver_a_mensagem(String string) {
  		WebElement input = browser.findElement( By.cssSelector(".manifesto h1.heading.lado"));
  		assertEquals(string, input.getText());
  		browser.quit();
      }

	  }


