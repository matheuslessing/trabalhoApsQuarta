package aula13;


	
	import junit.framework.Assert;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.Test;
	import static org.junit.Assert.*;
	import org.junit.BeforeClass;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	
	public class CorrecaoTrabalho2_1Test {
	    
	      static WebDriver driver = null;
		  
		  private String hmtl = "C://Users//Matheus//Documents//Faculdade//Quarta//senai_2020_qts-master//src//test//java//aula13//trabalho2-1.html";
	      
	      private static String namePaginaPrincipal ;
	    public SeleniumTest() {
	    }
	    
	    @BeforeClass
	    public static void setUp() {
	         System.setProperty("C://Users//Matheus//Documents//Faculdade//chromedriver//chromedriver.exe");
		        
	        
	         driver = new ChromeDriver();

	        driver.get(hmtl);
	    
	        namePaginaPrincipal = driver.getWindowHandle();
	    }
	    
	    
	
	    
	     @Test
	    public void testLoginMasculinoCerto(){
	        driver.get(hmtl);
	        
	        WebElement campoNome = driver.findElement(By.id("nome"));
	         WebElement campoEndereco = driver.findElement(By.id("endereco"));
	         WebElement campoSexo = driver.findElement(By.id("sexo"));
	         WebElement campoIdade= driver.findElement(By.id("idade"));
	         WebElement submit = driver.findElement(By.id("submit"));
	         campoNome.sendKeys("teste");
	         campoEndereco.sendKeys("123");
	         campoSexo.sendKeys("Masculino");
	         campoIdade.sendKeys("18");
	         submit.click();
	         String codigProximaPagina =  driver.getPageSource();
	         Assert.assertTrue(codigProximaPagina.contains("Cadastro realizado com sucesso"));
	    }
	     
	     @Test
		    public void testLoginFemininoCerto(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id("nome"));
		         WebElement campoEndereco = driver.findElement(By.id("endereco"));
		         WebElement campoSexo = driver.findElement(By.id("sexo"));
		         WebElement campoIdade= driver.findElement(By.id("idade"));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("teste");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Feminino");
		         campoIdade.sendKeys("18");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Cadastro realizado com sucesso"));
		    }
	     
	     @Test
		    public void testLoginErroNomeVazio(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("18");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo nome"));
		    }
	     
	     @Test
		    public void testLoginErroEnderecoVazio(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("18");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo endereco"));
		    }
	     
	     @Test
		    public void testLoginErroSexoVazio(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("");
		         campoIdade.sendKeys("18");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Selecione um valor para o campo sexo"));
		    }
	     
	     @Test
		    public void testLoginErroIdadeVazio(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo idade com valores acima de 0"));
		    }
	     
	     @Test
		    public void testLoginErroIdadeNegativo(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("-18");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo idade com valores acima de 0"));
		    }
	     
	     @Test
		    public void testLoginErroIdadeComZero(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("0");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo idade com valores acima de 0"));
		    }
	     
	     @Test
		    public void testLoginErroIdadeString(){
		        driver.get(hmtl);
		        
		        WebElement campoNome = driver.findElement(By.id(""));
		         WebElement campoEndereco = driver.findElement(By.id(""));
		         WebElement campoSexo = driver.findElement(By.id(""));
		         WebElement campoIdade= driver.findElement(By.id(""));
		         WebElement submit = driver.findElement(By.id("submit"));
		         campoNome.sendKeys("Ivan");
		         campoEndereco.sendKeys("Avenida Suarez, 185");
		         campoSexo.sendKeys("Masculino");
		         campoIdade.sendKeys("ABC");
		         submit.click();
		         String codigProximaPagina =  driver.getPageSource();
		         Assert.assertTrue(codigProximaPagina.contains("Preencha o campo idade, somente com numeros"));
		    }
	     
	     @Test
		    public void testTituloPaginaLogin(){
		      driver.get(hmtl);
		      String tituloExperado ="Trabalho 2-1"; 
		        
		      Assert.assertEquals(tituloExperado,driver.getTitle());
		    }
	 
	    
	    @AfterClass
	    public static void tearDown() {
	    	
	        driver.quit();
	    }
	    
	}


}
