package musicas;

public class Audio {
      private String titulo;
      private int duracao;
      private int totalDeReproducoes;
      private int totalCurtidas;
      private int classificacao;

      //Getters and setters
      public String getTitulo() {
            return titulo;
      }

      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

      public int getDuracao() {
            return duracao;
      }

      public int getTotalDeReproducoes() {
            return totalDeReproducoes;
      }

      public int getTotalCurtidas() {
            return totalCurtidas;
      }

      public int getClassificacao() {
            return classificacao;
      }

      //Métodos Adicionais

      public void curte () {
            this.totalCurtidas ++;
      }

      public void reproduz() {
            this.totalDeReproducoes++;
      }

}
