package com.keego.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
    //    Cadastro

    public  static void PreencherUsuário(WebDriver driver, String usuario){
        driver.findElement(By.name(usuario)).sendKeys("tylerferreira");
    }
    public  static void PreencherEmail(WebDriver driver, String email){
        driver.findElement(By.name(email)).sendKeys("tylerferreira@gmail.com");
    }
    public  static void PreencherSenha(WebDriver driver, String senha){
        driver.findElement(By.name(senha)).sendKeys("Qwe123!@#");
    }
    public  static void PreencherNome(WebDriver driver, String nome){
        driver.findElement(By.name(nome)).sendKeys("Tyler");
    }
    public  static void PreencherSobrenome(WebDriver driver, String sobrenome){
        driver.findElement(By.name(sobrenome)).sendKeys("Ferreira");
    }
    public  static void PreencherTelefone(WebDriver driver, String telefone){
        driver.findElement(By.name(telefone)).sendKeys("11955985879");
    }
    public  static void SelecionarPais(WebDriver driver, String selecionarpais){
        Select pais = new Select(driver.findElement(By.name(selecionarpais)));
        pais.selectByVisibleText("Brazil");
    }
    public  static void PreencherCidade(WebDriver driver, String cidade){
        driver.findElement(By.name(cidade)).sendKeys("São Paulo");
    }
    public  static void PreencherEndereco(WebDriver driver, String endereco){
        driver.findElement(By.name(endereco)).sendKeys("Rua da Mata");
    }
    public  static void PreencherEstado(WebDriver driver, String estado){
        driver.findElement(By.name(estado)).sendKeys("SP");
    }
    public  static void PreencherCEP(WebDriver driver, String cep){
        driver.findElement(By.name(cep)).sendKeys("05830555");
    }
    //    Cliques
    public static void CliqueId(WebDriver driver, String id) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }
    public static void CliqueCss(WebDriver driver, String css) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
        driver.findElement(By.cssSelector(css)).click();
    }

    public static void CliqueXpath(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void SelecionarCheckbox(WebDriver driver, String checkbox){
        WebElement check = driver.findElement(By.name(checkbox));
        boolean isSelected = check.isSelected();

        if(isSelected == false) {
            check.click();
        }
    }

    //    Espera

    public static void EsperarElementoClicavelName(WebDriver driver, String name) {

        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
    }

    public static void EsperarElementoVisivelXpath(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }


//    Fim

    public static void fim(WebDriver driver, String fim) {
        driver.quit();
    }

}
