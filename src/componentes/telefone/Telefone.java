package componentes.telefone;

import componentes.reprodutor.Ipod;
import componentes.smartphone.Iphone;

public class Telefone implements AparelhoTelefonico  {
    @Override
    public void ligar() {
        System.out.println("fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("abrir corrreio de voz");
    }


}
