public class AdaptadorReprodutor implements ReprodutorMusical {
    private ReprodutorMP4 reprodutorMP4;
    private ReprodutorVLC reprodutorVLC;

    public AdaptadorReprodutor() {
        reprodutorMP4 = new ReprodutorMP4();
        reprodutorVLC = new ReprodutorVLC();
    }


    @Override
    public void reproduzir(String tipo, String arquivo) {
        if (tipo.equalsIgnoreCase("mp4")) {
            reprodutorMP4.reproduzirMP4(arquivo);

        } else if (tipo.equalsIgnoreCase("vlc")) {
            reprodutorVLC.reproduzirVLC(arquivo);

        } else {
            System.out.println("Formato não suportado pelo adaptador.");
        }
    }
}
