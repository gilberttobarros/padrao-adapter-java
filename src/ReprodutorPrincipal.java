public class ReprodutorPrincipal implements ReprodutorMusical {
    private ReprodutorMP3 reprodutorMP3;
    private AdaptadorReprodutor adaptador;

    public ReprodutorPrincipal() {
        reprodutorMP3 = new ReprodutorMP3();
        adaptador = new AdaptadorReprodutor();
    }

    @Override
    public void reproduzir(String tipo, String arquivo) {
        if (tipo.equalsIgnoreCase("mp3")) {
            reprodutorMP3.reproduzir(tipo, arquivo);

        } else if (tipo.equalsIgnoreCase("mp4")
                || tipo.equalsIgnoreCase("vlc")) {
            adaptador.reproduzir(tipo, arquivo);

        } else {
            System.out.println("Formato não suportado.");
        }
    }
}
