public class ReprodutorVLC implements ReprodutorAvancado {
    @Override
    public void reproduzirMP4(String arquivo) {

    }

    @Override
    public void reproduzirVLC(String arquivo) {
        System.out.println("Reproduzindo arquivo VLC: " + arquivo);
    }
}
