package execprograma;

import musicas.Music;
import musicas.Mypreferences;
import musicas.Podcast;

public class Executa {
      public static void main(String[] args) {

            Music mymusic = new Music();
            mymusic.setTitulo("Forever");
            mymusic.setArtista("Kiss");

            for (int i = 0; i < 1000; i++) {
                  mymusic.reproduz();
            }

            for (int i = 0; i < 50; i++) {
                mymusic.curte();
            }

            Podcast myPodcast = new Podcast();
            myPodcast.setTitulo("BolhaDev");
            myPodcast.setApresentador("Marcus Mendes");

            for (int i = 0; i < 5000; i++) {
                  myPodcast.reproduz();
            }

            for (int i = 0; i < 1000; i++) {
                  myPodcast.curte();
            }

            Mypreferences preferences = new Mypreferences();
            preferences.inclui(myPodcast);
            preferences.inclui(mymusic);

      }
}
