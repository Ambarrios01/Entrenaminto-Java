import java.util.Scanner;

    public class CalculadoraApp {
        public static void main(String[] args) {
            //Scanner
            Scanner sc = new Scanner(System.in);
            while (true) {


                System.out.println("** Aplicacion de Calculadora **");
                //Mostra el Menu
                System.out.println("""
                        1. Suma
                        2. Resta
                        3. Multiplicacion
                        4. Division
                        5. Salir
                        """);
                System.out.println("Operacion A Realizar: ");try {


                    var operacion = Integer.parseInt(sc.nextLine());
                    //revisar
                    if (operacion >= 1 && operacion <= 4) {
                        System.out.println("Digite El Dato 1: ");
                        var dato1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Digite El Dato 2: ");
                        var dato2 = Integer.parseInt(sc.nextLine());
                        int resultado;
                        switch (operacion) {
                            case 1 -> {
                                //Suma
                                resultado = dato1 + dato2;
                                System.out.println("Resultado Suma: " + resultado);
                            }
                            case 2 -> {
                                //Resta
                                resultado = dato1 - dato2;
                                System.out.println("Resultado Resta: " + resultado);
                            }
                            case 3 -> {
                                //Multiplicacion
                                resultado = dato1 * dato2;
                                System.out.println("Resultado Multiplicacion: " + resultado);
                            }
                            case 4 -> {
                                //Division
                                resultado = dato1 / dato2;
                                System.out.println("Resultado Divicion: " + resultado);
                            }
                            default -> System.out.println("Opcion Errada: " + operacion);

                        }

                    } else if (operacion == 5) {
                        System.out.println("Hasta Luego");
                        break;
                    } else {
                        System.out.println("Opcion Erreda: " + operacion);
                    }
                    System.out.println();
                } catch (Exception e){
                    System.out.println("Ocurrio Un error: " + e.getMessage());
                }
            }//fin de while
        }// fin de main

        private static void MostraMenu(){

        }
    }
