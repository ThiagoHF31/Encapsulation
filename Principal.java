import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Compositor comp = new Compositor("Letodie", "Brasil");
        Compositor NF = new Compositor("NF", "EUA");

        String[] music = {"Covil dos lobos", "Apenas 20", "Apenas 25", "Humanos"};
        comp.definirMusicas(music);
        pulalinha();

        System.out.print("\033[34mO 1º compositor é: \033[0m");
        comp.getMusicas()[0].MostraComp();
        System.out.println();
        comp.listarMusicas();
        pulalinha();

        String[] musi = {"Hope", "Gone", "Happy", "Clouds"};
        NF.definirMusicas(musi);
        pulalinha();

        System.out.print("\033[34mO 2º Compositor é: \033[0m");
        NF.getMusicas()[0].MostraComp();
        System.out.println();
        System.out.println("\033[34mAlgumas musicas do compositor são: \033[0m");
        NF.listarMusicas();
        pulalinha();

        System.out.println("O total de compositores é: "+Compositor.getTotalCompositors());
        pulalinha();
        
        reader.close();
    }


    static void pulalinha(){
         System.out.println("__________________________");
    }
}