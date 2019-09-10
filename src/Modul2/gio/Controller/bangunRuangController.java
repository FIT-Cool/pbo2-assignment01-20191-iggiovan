package Modul2.gio.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
//Nama : Ignatius Giovan
//NRP : 1772003
//PBO2P01-1772003-IgnatiusGiovan
//Modul 2
//bangunRuangController.java
public class bangunRuangController {
    //Declare TextField
    public TextField txtLength;
    public TextField txtWidth;
    public TextField txtRadius;
    public TextField txtHeight;
    //Declare Variable
    public double surfaceArea,vlm; //Variable double penampung hasil Surface Area & Volume
    public int luas,kel; //Variable integer penampung hasil Luas & Keliling
    public int length,width; //Variable integer penampung Length & Width
    public double rad,height; //Variable double penampung Radius & Height
    public int bangunRuang; //Variable pembantu penampung nilai bangunRuang. Square = 1, Ball = 2, Tube = 3
    public String ini;

    //Action Button Square, berguna untuk enable TextField Length dan width
    public void sqrAct(ActionEvent actionEvent){
        txtRadius.setDisable(true);
        txtHeight.setDisable(true);
        txtLength.setDisable(false);
        txtWidth.setDisable(false);
        bangunRuang = 1;
    }
    //Action Button Ball, berguna untuk enable TextField Radius
    public void ballAct(ActionEvent actionEvent) {
        txtRadius.setDisable(false);
        txtHeight.setDisable(true);
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        bangunRuang=2;
    }
    //Action Button Tube, berguna untuk enable TextField Radius & Height
    public void tubeAct(ActionEvent actionEvent) {
        txtRadius.setDisable(false);
        txtHeight.setDisable(false);
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        bangunRuang=3;
    }
    //Action Button Submit, berguna untuk mencari hasil Luas, Keliling, Luas Permukaan, atau Volume
    public void submitAct(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.NONE); //declare Alert
        if(bangunRuang==1){//Pengecekan apakah button square yang ditekan.
            length = Integer.parseInt(txtLength.getText());//mengambil nilai pada TextField txtLength
            width  = Integer.parseInt(txtWidth.getText());//mengambil nilai pada TextField txtWidth
            luas = length*width;//menghitung luas
            kel =2*(length+width);//menghitung keliling
            a.setAlertType(Alert.AlertType.INFORMATION);//Set Alert Type Information
            a.setContentText("Luas : "+String.valueOf(luas)+", Keliling : "+String.valueOf(kel));//Mengisi Context Alert
            a.show();//Menampilkan Alert
            txtLength.clear();
            txtWidth.clear();
            txtLength.setDisable(true);
            txtWidth.setDisable(true);
        }
        else if(bangunRuang==2){//Pengecekan apakah button ball yang ditekan.
            rad = Double.parseDouble(txtRadius.getText());//Mengambil nilai pada TextField txtRadius
            surfaceArea = 4*(Math.PI)*rad*rad;//Menghitung luas permukaan
            vlm = (4/3)*(Math.PI)*rad*rad*rad;//Menghitung Volume
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText("Surface Area : "+String.valueOf(surfaceArea)+", Volume : "+String.valueOf(vlm));
            a.show();
            txtRadius.clear();
            txtRadius.setDisable(true);
        }
        else if(bangunRuang==3){//Pengecekan apakah button Tube yang ditekan.
            rad = Double.parseDouble(txtRadius.getText());//Mengambil nilai pada TextField txtRadius
            height =  Double.parseDouble(txtHeight.getText());//Mengambil nilai pada TextField txtHeight
            surfaceArea = 2*(Math.PI)*rad*(rad+height);//Menghitung luas permukaan
            vlm = (Math.PI)*rad*rad*height;//Menghitung Volume
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText("Surface Area : "+String.valueOf(surfaceArea)+", Volume : "+String.valueOf(vlm));
            a.show();
            txtRadius.clear();
            txtHeight.clear();
            txtRadius.setDisable(true);
            txtHeight.setDisable(true);
        }
    }
}
