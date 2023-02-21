import java.util.ArrayList;
import java.util.Scanner;


    public class ProcesosBasicos {

        Scanner scan = new Scanner(System.in);
        String texto;
        String texto2;
        String objetivo;
        String aux;
        String regla;
        String hechos;
        int i;
        int a;
        int noReglas;
        int noHechos;
        public ArrayList<String> reglas = new ArrayList<String>();
        public ArrayList<String> hechosCon = new ArrayList<String>();
        public ArrayList<String> reglasAparece = new ArrayList<String>();
        public void pedirDatos(){
            System.out.println("¿Cuántas reglas son?");
            noReglas=scan.nextInt();
            scan.nextLine();
            System.out.println("Recuerda ingresar las reglas del siguiente modo (R1 = si h2 y h3 -> h6");
            System.out.println("\n");
            for(i=0;i<noReglas;i++){
                System.out.println("Dame R"+(i+1)+": ");
                texto = scan.nextLine();
                reglas.add(texto);
                scan.nextLine();
            }
        }
        public void mostrarDatos(){
            for (a=0;a<reglas.size();a++){
                System.out.println(reglas.get(a));
            }
            System.out.println("Base de conocimiento {");
            for (a=0;a<hechosCon.size();a++){
                System.out.println(hechosCon.get(a));
            }
            System.out.println("}");
            System.out.println("\n");
        }

        public void hechosConocidos(){
            System.out.println("¿Cuántos elementos hay en la base de conocimiento?");
            noHechos=scan.nextInt();
            scan.nextLine();

            for (i=0;i<noHechos;i++) {
                System.out.println("Dame los hechos conocidos");
                texto2 = scan.nextLine();
                hechosCon.add(texto2);
                scan.nextLine();
            }
        }

        public void pedirObjetivo(){
            System.out.println("Dame el objetivo");
            objetivo=scan.nextLine();
            scan.nextLine();
            System.out.println("\n");

        }

        public void comprobacionObjetivo(){
            if(hechosCon.contains(objetivo)){
                System.out.println("El objetivo ya se encuentra en la base de conocimiento");
            }
        }

        public void razonamientoAdelante(){
            for(i=0;i<reglas.size();i++){
                for (a=0;a<hechosCon.size();a++) {
                    aux=reglas.get(i);
                    hechos=hechosCon.get(a);
                    if (aux.regionMatches(true, 13, hechos, 0, 2)) {
                        System.out.println("Si se encuentra");
                    }
                }
            }
        }
    }


