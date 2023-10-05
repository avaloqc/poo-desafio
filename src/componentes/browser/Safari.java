package componentes.browser;

public class Safari implements Navegador {
    @Override
    public void exibirPagina() {
        System.out.println("Mostrar página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualziando a página");

    }
}
