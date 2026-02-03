package Funcoes_Basicas;

//Estrutura que substitui if e else para casos especificos.
public class Estrutura_de_decisao_SwitchCase {

    public static void main(String[] args) {
//        EX1
        int dia = 5;
        switch (dia) {
            case 1: {
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda");
                break;
            }
            case 3: {
                System.out.println("Terca");
                break;
            }
            case 4: {
                System.out.println("Quarta");
                break;
            }
            default:
                System.out.println("Outro dia");
                break;
        }

//        EX2
        String feriado = "Natal";
        switch (feriado) {
            case "Pascoa": {
                System.out.println("Feriado de Natal em Abril");
                break;
            }
            case "Carnaval": {
                System.out.println("Feriado de Carnaval em Fevereiro");
                break;
            }
            case "Natal": {
                System.out.println("Feriado de Natal em Dezembro");
                break;
            }
            default:
                System.out.println("Sem registro de feriados");
                break;

        }

    }

}
