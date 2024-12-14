
package zavaletagustavo.poofinal.Menus;


    import java.util.Scanner;

    public class SubMenuUsuario {

     //Método ...   

     //Para verificar la contraseña del jefe porque solo hay uno
      private boolean verificarContrasena(Scanner scanner, String usuario, String contrasenaCorrecta) {
            System.out.print("Ingrese la contraseña de " + usuario + ": ");
            String contrasena = scanner.next();

            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso permitido como " + usuario);
                return true;
            } else {
                System.out.println("Contraseña incorrecta. Acceso denegado.");
                return false;
            }
        }
     //Para verificar las contraseñas de los empleados porque hay más de uno.
        private boolean verificarContrasenaEmpleado(Scanner scanner) {
            //Usamos un arreglo de tipo String 
            //Evitamos usar caracteres especiales como Ñ
            //Este Array puede ser recorrido para buscar el contenido que queramos
            String[] contrasenasValidas = {"420", "362", "987"};
            String[] nombres = {"Gustavo", "Leonardo", "Gabriel"};
            int intentosRestantes = 3;


            //Para que el sismtema no se sobrecargue damos 3 intentos
            while (intentosRestantes > 0) {
                System.out.print("Ingrese la contraseña de Empleado: ");
                String contrasena = scanner.next();

                // Con esto verificamos si la contraseña es válida recorriendo el Array 
                for (int i = 0; i < contrasenasValidas.length; i++) {
                    if (contrasena.equals(contrasenasValidas[i])) {
                //Los nombres y contraseñas de cada uno ocupan la misma ubicación 
                        System.out.println("Bienvenido " + nombres[i]);
                        return true; 
                        //Entonces se verificó que la contraseña es correcta
                    }
                }

                // Si la contraseña es incorrecta
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
                } else {
                    System.out.println("Contraseña incorrecta. El programa se cerrará.");
                    System.exit(0);  //Exita para salir del programa.
                }
            }
            return false;
            //Entonces los intentos se acabaron y se cierra el programa.
        }

     //Para saber qué tipo de usario ingresa
     // de esto depende la contraseña de ingreso
        public String seleccionarUsuario() {

            Scanner scanner = new Scanner(System.in);
            //Vacío porque luego se le asigna si es jefe, empleado o visitante
            String usuario = "";  
            boolean esValido = false; //Para el bucle While

            while (!esValido) {
                    System.out.println("Digite la forma de acceso.");
                System.out.println("(1) Jefe");
                System.out.println("(2) Empleado");
                System.out.println("(3) Visitante");
                System.out.print("Seleccione, por favor: ");
                int opcion = scanner.nextInt();
                //Según la opción digitada en este menú se ejecuta el método
                switch (opcion) {
                    case 1:  // Jefe
                        if (verificarContrasena(scanner, "Jefe", "Elite777")) {
                            usuario = "Jefe";
                            esValido = true;
                        }
                        break;
                    case 2:  // Empleado
                        if (verificarContrasenaEmpleado(scanner)) {
                            usuario = "Empleado";
                            esValido = true;
                        }
                        break;
                    case 3:  // Visitante
                        System.out.println("Accediendo como visitante");
                        usuario = "Visitante";
                        esValido = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            }



        return usuario; 
           // El método retorna usuario, un dato tipo string con el rol del usuario
        } 
    }
