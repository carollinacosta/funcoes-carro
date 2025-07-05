import java.util.Scanner;

public class Carro {
    //Scanner scanner = new Scanner(System.in);
    private int velocidade = 0;
    private int marcha;
    private boolean ligado = false;


    public Carro(){
       this.velocidade = 0;
       this.marcha = 0;
       this.ligado = false;

    }

    public void desligarCarro(){
        if (ligado && velocidade == 0 && marcha == 0){
            ligado=false;
            System.out.println("Carro desligado!");
        } else if (velocidade >= 1 || marcha >= 1) {
            System.out.println("Carro só irá desligar quando estiver com velocidade 0km/h e em ponto morto.");
        } else {
            System.out.println("Carro já está desligado");
        }
    }

    public void ligarCarro(){
       if (!ligado){
           ligado=true;
           System.out.println("Carro ligado!");
       } else if (velocidade == 0 && marcha == 0) {
           System.out.println("Carro está ligado em ponto morto.");
       } else {
           System.out.println("Carro já está ligado.");
       }
    }

    public void acelerarCarro(){
        if (ligado && marcha > 0 && velocidade < 120){
            int novaVelocidade = velocidade +1;
            if (velocidadeCompativelComMarcha(marcha,velocidade)){
                velocidade = novaVelocidade;
                System.out.println("Velocidade atual: " +velocidade + " km/h.");
            }else {
                System.out.println("Não é permitido acelarar com essa marcha.");
            }
        }else {
            System.out.println("Carro desligado ou em ponto morto.");
        }
    }

    public void diminuirVelocidade(){
        if (ligado && velocidade > 0){
            velocidade--;
            System.out.println("Velocidade atual: "+velocidade+" km/h.");
            if (velocidade==0){
                marcha=0;
                System.out.println("Carro parado ou em ponto morto.");
            }
        }else {
            System.out.println("Carro já está em 0km/h");
        }
    }

    public void virarEsquerda(){
        if (velocidade >= 1 && velocidade <=40){
            System.out.println("Carro virou para a esqueda.");
        }else {
            System.out.println("Para virar o carro a velocidade deve estar no mín 1km e máximo 40km");
        }
    }

    public void virarDireita(){
        if (velocidade >= 1 && velocidade <=40){
            System.out.println("Carro virou para a direita.");
        }else {
            System.out.println("Para virar o carro a velocidade deve estar no mín 1km e máximo 40km");
        }
    }

    public void verificarVelocidade(){
        System.out.println("A velocidade atual é: " + velocidade+ " km/h");
    }


    public void trocarMarcha(int novaMarcha){
        if (novaMarcha>=1 && novaMarcha<=6 && ligado){
            if (Math.abs(novaMarcha-marcha) == 1){
                if (velocidadeCompativelComMarcha(novaMarcha,velocidade)){
                    marcha = novaMarcha;
                    System.out.println("Carro está na marcha: "+novaMarcha+ " com velocidade: "+velocidade);
                }else {
                    System.out.println(velocidade+" Velocidade não é compatível com a marcha: "+novaMarcha);
                }
            }else {
                System.out.println("Não é permitido pular marchas!");
            }
        }else {
            System.out.println("Não foi possível trocar a marcha: " +
                    "verifique se o carro está ligado e se a marcha está entre 1 e 6.");
        }
    }


    private boolean velocidadeCompativelComMarcha(int marcha, int velocidade){
        switch (marcha){
            case 0:
                return velocidade==0;
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade >=21 && velocidade <=40;
            case 3:
                return velocidade >=41 && velocidade <=60;
            case 4:
                return velocidade >=61 && velocidade <=80;
            case 5:
                return velocidade >=81 && velocidade <=100;
            case 6:
                return velocidade >=101 && velocidade <=120;
            default:
                return false;
        }

    }



}
