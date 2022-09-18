import java.util.Scanner;

    public class main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Escolha a taubuada que vc deseja consultar");
            System.out.println("(A) pra Adição,(S) Subtração,(M) Multiplicação e (D) Divisão");
            String tabuada = in.next();
            Scanner inNum = new Scanner(System.in);
            System.out.println("Informe o número que vc deseja consultar à tabuada: ");
            int numero = inNum.nextInt();
            int mult;
            int soma,subtracao;
            int divisao,divisor;

            switch (tabuada){
                case "A":
                case "a":System.out.println("Á tabuáda do número "+numero+" é:");
                    for(int i=0; i<=10; i++) {
                        soma = (numero + i);
                        System.out.println(numero + "+" + i + "=" + soma);
                    }
                break;
                case "S":
                case "s":
                    for(int i=0; i<=10; i++){
                        subtracao = (numero - i);
                        System.out.println(numero + "-" + i + "=" + subtracao);
                    }
                break;
                case "M":
                case "m":
                    for(int i=0; i<=10; i++){
                        mult = (numero * i);
                        System.out.println(numero + "x"+ i + "="+mult);
                    }
                break;
                case "D":
                case "d":
                    for(int i=0; i<=10; i++){
                        divisor = numero * i;
                        divisao = divisor / numero;
                        System.out.println(divisor + "/"+ numero + "="+ divisao);
                    }
                break;
                default:
                    System.out.println("Valor inválido!");

            }
        }

    }
