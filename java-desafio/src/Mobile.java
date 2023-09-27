import browser.Navegador;
import music.PlayerMusica;
import phone.Ligacao;

public class Mobile {
    public static void main(String[] args) throws Exception {
        PlayerMusica music = new PlayerMusica();
        music.tocarMusica();
        music.pausarMusica();
        music.selecionarMusica();

        Navegador browser = new Navegador();
        browser.adicionarNovaAba();
        browser.atualizarPagina();
        browser.exibirPagina();

        Ligacao phone = new Ligacao();
        phone.atender();
        phone.ligar();
        phone.iniciarCorreioVoz();
    }
}
