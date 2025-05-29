public class Quadrado extends Figurageometrica {
    public Quadrado(int lado){
        super(lado, 0, 0, 0, 0, 0);
    }

    private int CalcArea(){
        area = lado*lado;
        return area;
    }

    private int CalcPerim(){
        perimetro = lado*4;
        return perimetro;
    }

    @Override
    public void imprimir(){
        String resposta = "";

        resposta = "Quadrado: " + "\n" + "Área: " + CalcArea() +
                   "\n" + "Perímetro: " + CalcPerim() + "\n";
                   
        System.out.println(resposta);
    }
}
