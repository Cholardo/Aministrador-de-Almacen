/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tableros;

import java.time.LocalDate;

/**
 *
 * @author Usuario 214 Store
 */
public class Empleados {
   private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String DNI;
    private LocalDate fechaNacimiento;
    private char sexo; 
    private String turno;
    private String contrato;

    public Empleados(String nombres, String apellidoPaterno, String apellidoMaterno, String DNI, LocalDate fechaNacimiento, char sexo, String turno, String contrato) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.turno = turno;
        this.contrato = contrato;
    }   
}