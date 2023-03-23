/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanprogapp2023;

import model.TimerModel;
import view.TimerView;
import controller.TimerController;


public class QuanProGApp2023 {

    public static void main(String[] args) {
        TimerModel model = new TimerModel();
        TimerView view = new TimerView(new TimerController(model, new TimerView()));
        view.getFrame().setVisible(true);
    }
}
