public class Musica {
    private String titulo;
    private Compositor compositor;

    public Musica(String nome, Compositor compositor){
        this.titulo = nome;
        this.compositor = compositor;
    }

    void MostraComp(){
        System.out.println(compositor.getNome());
        System.out.println("\033[35mPaís de nascimento: \033[0m"+compositor.getPais());
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Compositor getCopositor(){
        return compositor;
    }

    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }
}