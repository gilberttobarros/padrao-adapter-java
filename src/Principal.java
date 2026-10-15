public class Principal {
    public static void main(String[] args) {
        ReprodutorPrincipal reprodutor = new ReprodutorPrincipal();

        reprodutor.reproduzir("mp3", "musica.mp3");

        reprodutor.reproduzir("mp4", "video.mp4");

        reprodutor.reproduzir("vlc", "filme.vlc");
    }
}
