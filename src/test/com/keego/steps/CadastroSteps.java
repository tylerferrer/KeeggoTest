package com.keego.steps;

import com.keego.methods.Methods;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class CadastroSteps extends Methods {
    WebDriver driver;
    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
        System.setProperty("webdriver.chrome.driver","src/main/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");
        driver = new ChromeDriver(options); driver.get("http://advantageonlineshopping.com/#/register");
        driver.manage().window().maximize();
    }
    @Quando("vejo a tela de cadastro")
    public void vejoATelaDeCadastro() {
        EsperarElementoVisivelXpath(driver,"//*/section/article/h3");
        String actualText = driver.findElement(By.xpath("//*/section/article/h3")).getText();
        assertEquals("CREATE ACCOUNT", actualText);
        System.out.println("O texto apresentado é: "+actualText);
    }

    @Então("preencho meu usuário {string}")
    public void  preenchoMeuUsuario(String string) {
        PreencherUsuário(driver,"usernameRegisterPage");
    }

    @Quando("preencho meu email {string}")
    public void  preenchoMeuEmail(String string) {
        PreencherEmail(driver,"emailRegisterPage");
    }

    @Quando("preencho minha senha {string}")
    public void  preenchoMinhaSenha(String string) {
        PreencherSenha(driver,"passwordRegisterPage");
    }

    @Quando("confirmo o preenchimento da minha senha {string}")
    public void  confirmoOPreenchimentoDaMinhaSenha(String string) {
        PreencherSenha(driver,"confirm_passwordRegisterPage");
    }

    @Quando("preencho meu nome {string}")
    public void  preenchoMeuNome(String string) {
       PreencherNome(driver,"first_nameRegisterPage");
    }

    @Quando("preencho meu sobrenome {string}")
    public void  preenchoMeuSobrenome(String string) {
       PreencherSobrenome(driver,"last_nameRegisterPage");
    }

    @Quando("preencho meu telefone {string}")
    public void  preenchoMeuTelefone(String string) {
        PreencherTelefone(driver,"phone_numberRegisterPage");
    }

    @Quando("seleciono meu país Brasil")
    public void  selecionoMeuPais() {
        SelecionarPais(driver,"countryListboxRegisterPage");
    }

    @Quando("preencho minha cidade {string}")
    public void  preenchoMinhaCidade(String string) {
        PreencherCidade(driver,"cityRegisterPage");
    }

    @Quando("preencho meu endereço {string}")
    public void  preenchoMeuEndereco(String string) {
        PreencherEndereco(driver,"addressRegisterPage");
    }

    @Quando("preencho meu estado {string}")
    public void  preenchoMeuEstado(String string) {
        PreencherEstado(driver,"state_/_province_/_regionRegisterPage");
    }

    @Quando("preencho meu CEP {string}")
    public void  preenchoMeuCep(String string) {
      PreencherCEP(driver,"postal_codeRegisterPage");
    }

    @Quando("clico para aceitar os termos de uso")
    public void  aceitoOsTermosDeUso() {
       SelecionarCheckbox(driver,"i_agree");
    }

    @Então("seleciono registrar")
    public void  selecionoRegistrar() {
       CliqueId(driver,"register_btnundefined");
    }

    @Então("finalizo o cadastro")
    public void finalizoOCadastro() throws InterruptedException {
        Thread.sleep(3000);
        fim(driver,"");
    }
}
