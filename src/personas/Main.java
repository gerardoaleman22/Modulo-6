/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

public class Main {
    public static void main(String[] args) {
        Persona doctor = new Doctor("Ana", 45, "Cardiología");
        Persona deportista = new Deportista("Carlos", 25, "Fútbol");

        doctor.mostrarInformacion();
        deportista.mostrarInformacion();
    }
}

