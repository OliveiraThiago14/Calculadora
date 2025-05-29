public class Circulo extends Figurageometrica {
    int raio;
    public Circulo(int raio){
        super(0, 0, 0, 0, 0, 0);
        this.raio = raio;
    }

    private int CalcArea(){
        area = Mat.PI()*raio;
        return area;
    }

    private int CalcPerim(){
        perimetro = 2*Mat.PI()*raio*raio;
        return perimetro;
    }

    @Override
    public void imprimir(){
        String resposta = "";

        resposta = "Círculo: \n" + "Área: " + CalcArea() + "\n" + "Perímetro: " + CalcPerim() + "\n";
        System.out.println(resposta); 
    }
}
