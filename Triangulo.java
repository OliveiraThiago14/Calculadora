
public class Triangulo extends Figurageometrica{
    int lado2;

    private void verificador(int lado, int altura, int lado2){
        if(lado>lado2 && lado>altura){
            this.lado2 = lado;
            this.lado = lado2;
        } else if(altura>lado && altura>lado2){
            this.lado2 = altura;
            this.altura = lado2;
        }
    }
    
    public Triangulo(int lado, int altura, int lado2){
        super(lado,altura,0,0,0,0);
        this.lado2 = lado2;
        verificador(lado, altura, lado2);
    }

    private int CalcArea(){
        area = lado*altura;
        return area;
    }

    private int Calcperim(){
        perimetro = lado+lado2+altura;
        return perimetro;
    }

    public boolean ehtriangulo(){
        boolean verificador = false;
        if(Math.abs(lado-lado2) <= altura && altura >= lado+lado2 &&
           Math.abs(lado-altura) <= lado2 && lado2 >= lado+altura &&
           Math.abs(altura-lado2) <= lado && lado >= altura+lado2){
            verificador = true;
        }
        return verificador;
    }
    

    @Override
    public void imprimir(){
        String resposta="";

        if(!ehtriangulo()){
            resposta = "area: " + CalcArea() + "\n" +
                    "perímetro: " + Calcperim() + "\n";

        } else{
            resposta = "não é triângulo\n";
        }
        System.out.println(resposta);
    }
}