
package controller;


import java.util.HashMap;
import java.util.Map;
import view.Main;


import model.Counter_Model;

public class Counter_Controller {

    private Counter_Model model;

    public Counter_Controller(Counter_Model model) {
        this.model = model;
    }

    public void analyzeContent(String content) {
        model.analyze(content);
    }
}
