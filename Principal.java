import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Figurageometrica figs[] = new Figurageometrica[200];
        int i=0;
        char continuar = 'S';
        while(continuar != 'N'){
            System.out.println("1 - Quadrado\r\n" + //
                                "2 - Retangulo\r\n" + //
                                "3 - Triangulo\r\n" + //
                                "4 - Circulo\r\n" + //
                                "5 - Trapezio\n" + "Informe o tipo da figura: ");
            Scanner sc = new Scanner(System.in);
            int tipo = sc.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("Informe o lado do Quadrado: \n");
                    Scanner sq = new Scanner(System.in);
                    int ladoquadrado = sq.nextInt();
                    figs[i] = new Quadrado(ladoquadrado);
                    i++;
                    break;
            
                case 2:
                    System.out.println("Informe o lado e a altura do Retângulo: \n");
                    Scanner sr = new Scanner(System.in);
                    int ladoretangulo = sr.nextInt();
                    int alturaretangulo = sr.nextInt();
                    figs[i] = new Retangulo(ladoretangulo,alturaretangulo);
                    i++;
                    break;
                
                case 3:
                    System.out.println("Informe a medida dos lados do Triângulo: \n");
                    Scanner st = new Scanner(System.in);
                    int ladotrian = st.nextInt();
                    int alturatrian = st.nextInt();
                    int lado2trian = st.nextInt();
                    figs[i] = new Triangulo(ladotrian,alturatrian,lado2trian);
                    i++;
                    break;
                
                case 4:
                    System.out.println("Informe a medida do raio: \n");
                    Scanner scirc = new Scanner(System.in);
                    int raiocirculo = scirc.nextInt();
                    figs[i] = new Circulo(raiocirculo);
                    i++;
                    break;
                
                case 5:
                    System.out.println("Informe a medida da Base maior do Trapézio: \n");
                    Scanner BM = new Scanner(System.in);
                    int base_maior = BM.nextInt();
                    System.out.println("Informe a medida da Base menor do Trapézio: \n");
                    Scanner Bm = new Scanner(System.in);
                    int base_menor = Bm.nextInt();
                    System.out.println("Informe a medida da altura do Trapézio: \n");
                    Scanner A = new Scanner(System.in);
                    int alturatrap = A.nextInt();
                    figs[i] = new Trapezio(base_maior, base_menor, alturatrap);
                    i++;
                    break;
            }

            System.out.println("Deseja adicionar outra figura? (S/N)");
            Scanner decisao = new Scanner(System.in);
            continuar = decisao.next().charAt(0);
        } 


        for(Figurageometrica figura: figs){
            figura.imprimir();
        }
    }

    
}
