/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

/**
 *
 * @author sp23-bse-001
 */

    public class Sensor {
    private boolean isActive;

    public void activate() {
        isActive = true;
        System.out.println("Sensor activated.");
    }

    public void control() {
        System.out.println("Sensor controlled manually.");
    }

    public boolean isDangerousActivityDetected() {
        // Mock condition
        return Math.random() > 0.5;
    }

    public String getData() {
        return "Sensor data...";
    }
}


