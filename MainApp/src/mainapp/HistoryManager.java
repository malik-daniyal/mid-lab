/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

import java.util.ArrayList;

/**
 *
 * @author sp23-bse-001
 */


public class HistoryManager {
    private ArrayList<String> history = new ArrayList<>();

    public void addHistory(String entry) {
        history.add(entry);
    }

    public void printHistory() {
        for (String h : history) {
            System.out.println(h);
        }
    
    }
}


