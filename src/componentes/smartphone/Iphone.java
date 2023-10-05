package componentes.smartphone;

import componentes.browser.Navegador;
import componentes.reprodutor.ReprodutorMusical;
import componentes.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo no app de Ipodo do Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando no app de Ipod do Iphone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo música no app de Ipod do Iphone");

    }

    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação da app de telefone do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no app de telefone do Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz no app de telefone do Iphone");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Mostrando página no Safari do Iphone");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no Safari do Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Safari do Iphone");

    }
}
