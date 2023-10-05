package componentes.reprodutor;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("reproducindo música");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo track");

    }
}
