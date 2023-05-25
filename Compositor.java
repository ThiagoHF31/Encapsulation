public class Compositor {
    private String nome;
    private String pais;
    private Musica[] musicas;
    private static int totalCompositors = 0;

    public Compositor(String nome,String pais){
        this.nome = nome;
        this.pais =pais;
        totalCompositors++;
    }

    public void definirMusicas(String[] nome ){
        musicas = new Musica[nome.length];

        for (int i = 0; i < nome.length; i++) {
            musicas[i] = new Musica(nome[i], this);
        }
    }
    
    void listarMusicas(){
        for (int i = 0; i < musicas.length; i++) {
            System.out.println((i+1)+"º "+musicas[i].getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }
    public static int getTotalCompositors() {
        return totalCompositors;
    }
}
