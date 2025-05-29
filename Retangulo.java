public class Retangulo extends Figurageometrica {
    public Retangulo(int lado, int altura){
        super(lado, altura, 0, 0, 0, 0);
    }

    private int CalcArea(){
        area = lado*altura;
        return area;
    }

    private int CalcPerim(){
        perimetro = lado*2 + altura*2;
        return perimetro;
    }

    @Override
    public void imprimir(){
        String resposta = "";

        resposta = "Triângulo: \n" + "Área: " + CalcArea() + "\n" + "Perímetro: " + CalcPerim() + "\n";
        System.out.println(resposta); 
    }
}
