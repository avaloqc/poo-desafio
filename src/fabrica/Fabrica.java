package fabrica;

import componentes.browser.Navegador;
import componentes.reprodutor.ReprodutorMusical;
import componentes.smartphone.Iphone;
import componentes.telefone.AparelhoTelefonico;


public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone2007 = new Iphone();
        iphone2007.ligar();
        iphone2007.selecionarMusica();
        iphone2007.adicionarNovaAba();

        ReprodutorMusical ipod = iphone2007;
        AparelhoTelefonico phone = iphone2007;
        Navegador safari = iphone2007;

        ipod.tocar();
        phone.ligar();
        safari.exibirPagina();

    }
}
