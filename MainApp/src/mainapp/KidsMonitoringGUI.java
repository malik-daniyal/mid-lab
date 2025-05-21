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

import javax.swing.*;
import java.awt.event.*;

public class KidsMonitoringGUI extends JFrame {
    private Sensor sensor = new Sensor();
    private Camera camera = new Camera();
    private DataAnalyzer analyzer = new DataAnalyzer();
    private HistoryManager history = new HistoryManager();

    public KidsMonitoringGUI() {
        setTitle("Kids Monitoring System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton monitorBtn = new JButton("Monitor Sensor");
        JButton cameraBtn = new JButton("View Camera");
        JButton analyzeBtn = new JButton("Analyze Data");
        JButton activateBtn = new JButton("Activate Sensor");
        JButton controlBtn = new JButton("Control Sensor");
        JButton historyBtn = new JButton("View History");

        monitorBtn.addActionListener(e -> {
            boolean danger = sensor.isDangerousActivityDetected();
            String msg = danger ? "Dangerous activity detected!" : "All clear.";
            JOptionPane.showMessageDialog(this, msg);
            history.addHistory(msg);
        });

        cameraBtn.addActionListener(e -> camera.viewCameraFeed());

        analyzeBtn.addActionListener(e -> {
            String data = sensor.getData();
            analyzer.analyze(data);
            history.addHistory("Analyzed sensor data.");
        });

        activateBtn.addActionListener(e -> sensor.activate());
        controlBtn.addActionListener(e -> sensor.control());
        historyBtn.addActionListener(e -> history.printHistory());

        JPanel panel = new JPanel();
        panel.add(monitorBtn);
        panel.add(cameraBtn);
        panel.add(analyzeBtn);
        panel.add(activateBtn);
        panel.add(controlBtn);
        panel.add(historyBtn);

        add(panel);
        setVisible(true);
    }
}
