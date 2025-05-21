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

    public class Admin {
    public void manage(Sensor sensor, Camera camera) {
        sensor.activate();
        camera.viewCameraFeed();
    }
}


