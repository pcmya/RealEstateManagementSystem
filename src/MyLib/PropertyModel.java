/*
<<<<<<< HEAD
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
>>>>>>> 860cf8b3b77e9c15bf7ec10c506cbd3db1153afd
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class PropertyModel {
    private String modelName;
    private int bedNum;
    private int bathNum;
    
    public PropertyModel(String modelName) {
        this.modelName = modelName;
    }
    
    public String displayModelDetails() {
        if (modelName.equals("Thea")) {
            bedNum = 3;
            bathNum = 2;
        }
        
        if (modelName.equals("Alice")) {
            bedNum = 3;
            bathNum = 1;
        }
        
        if (modelName.equals("Anica")) {
            bedNum = 3;
            bathNum = 2;
        }
        
        if (modelName.equals("Adelle")) {
            bedNum = 4;
            bathNum = 2;
        }
        return modelName + " (" + bedNum + " BR, " + bathNum + " T&B)";
    }
    
    public String getModelName() {
        return modelName;
    }
}
