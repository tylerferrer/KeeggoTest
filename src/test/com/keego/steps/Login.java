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

public class Login extends Methods {
    WebDriver driver;
    @Dado("que estou acessando a tela principal")
    public void queEstouAcessandoATelaPrincipal() {
        System.setProperty("webdriver.chrome.driver","src/main/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");
        driver = new ChromeDriver(options); driver.get("http://advantageonlineshopping.com");
        driver.manage().window().maximize();
    }

    @Quando("clico no icone de login")
    public void clicoNoIconeLogin() {
        CliqueId(driver,"menuUser");
    }

    @Então("preencho usuário {string}")
    public void preencherUsuario(String string) {
        PreencherUsuário(driver,"username");
    }

    @Então("minha senha {string}")
    public void minhaSenha(String string) {
        EsperarElementoClicavelName(driver,"password");
        PreencherSenha(driver,"password");
    }
    @Então("clico em login")
    public void clicoEmLogin() throws InterruptedException {
        Thread.sleep(3000);
        CliqueId(driver,"sign_in_btnundefined");
    }
    @Quando("vejo meu usuário logado")
    public void vejoMeuUsuárioLogado() throws InterruptedException {
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//*/nav/ul/li[3]/a/span")).getText();
        assertEquals("tylerferreira", actualText);
        System.out.println("O texto apresentado é: "+actualText);
    }
    @Quando("clico nele")
    public void clicoNele() {
        CliqueId(driver,"menuUserLink");
    }
    @Quando("clico para acessar minha conta")
    public void clicoNaMinhaConta() {
        CliqueXpath(driver,"//*/nav/ul/li[3]/a/div/label[1]");
    }
    @Quando("vejo a tela da minha conta")
    public void vejoATelaDaMinhaConta() throws InterruptedException {
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("/html/body/div[3]/section/article/h3")).getText();
        assertEquals("MY ACCOUNT", actualText);
        System.out.println("O texto apresentado é: "+actualText);
    }
    @Então("clico em deletar minha conta e seleciono sim no popup")
    public void clicoEmDeletarMinhaContaESelecionoSimNoPopup() {
       CliqueXpath(driver,"//*[@id=\"myAccountContainer\"]/div[6]/button");
       CliqueCss(driver,"#deleteAccountPopup > div.deleteBtnContainer > div.deletePopupBtn.deleteRed");
    }
    @Então("vejo o popup de conta deletada com sucesso")
    public void vejoOPopupDeContaDeletadaComSucesso() throws InterruptedException {
        Thread.sleep(1000);
        String actualText = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/p")).getText();
        assertEquals("Account deleted successfully", actualText);
        System.out.println("O texto apresentado é: "+actualText);
        fim(driver,"");
    }
}
