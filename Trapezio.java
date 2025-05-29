public class Trapezio extends Figurageometrica {
    int ladotrian,ladotrapezio;
    public Trapezio(int base_maior, int base_menor, int altura){
        super(0, altura, base_maior, base_menor, 0, 0);
    }

    private int CalcArea(){
        area = ((base_maior + base_menor)*altura)/2;
        return area;
    }

    private int CalcPerim(){
        ladotrian = base_maior-base_menor;
        ladotrapezio = (int)Math.sqrt(altura*altura+ladotrian*ladotrian);
        perimetro = base_maior+base_menor+altura+ladotrapezio;
        return perimetro;
    }

    @Override
    public void imprimir(){
        String resposta = "";

        resposta = "Trapézio: \n" + "Área: " + CalcArea() + "\n" + "Perímetro: " + CalcPerim() + "\n";
        System.out.println(resposta);
    }
}
