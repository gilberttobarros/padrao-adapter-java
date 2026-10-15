public class ReprodutorMP3 implements  ReprodutorMusical{
    @Override
    public void reproduzir(String tipo, String arquivo) {
        if (tipo.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduzindo arquivo MP3: " + arquivo);
        } else {
            System.out.println("Formato não suportado diretamente.");
        }
    }
}
