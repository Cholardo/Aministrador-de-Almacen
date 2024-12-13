package Login;

import java.util.Scanner;

/**@author GrupoPOO:
 * -
 * -
 * -
 */
public class Login {
String usuario="";
String contraseña="";
static int i=0;
public Login(String usuario,String contraseña){
   this.usuario= usuario;
   this.contraseña=contraseña;
}
public void Usuario1(){
if (usuario.equals("Vendedor") && contraseña.equals("12345")){
    i=3;
  //  Productos;
if (usuario.equals("Admin") && contraseña.equals("12345")){
    i=3;
  //  Empleados();
}}
else{
    System.out.println("Usuario incorrecto");
    i++;
    if (i>=3){
            System.out.println("Numero de intentos maximo");
        }
}}

public static void main(String[] args) {
    String usuario,contraseña;
    Scanner leer= new Scanner(System.in);
    do{
        System.out.println("Ingrese nombre de usuario");
        usuario=leer.nextLine();
        System.out.println("Ingrese contraseña");
        contraseña=leer.nextLine();
        Login login1= new Login(usuario,contraseña);
        login1.Usuario1();
    }while(i<3);
    }
}