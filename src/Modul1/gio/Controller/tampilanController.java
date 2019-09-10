package Modul1.gio.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;
//Nama : Ignatius Giovan
//NRP : 1772003
//PBO2P01-1772003-IgnatiusGiovan
//Modul 1
//tampilanController.java

public class tampilanController {
//    public TextField txtWin, txtDraw, txtLose;
    public ImageView imageUser, imageComputer;//Untuk menampilkan gambar pilihan user dan computer

    public int jumlahWin = 0; //Var untuk menampung jumlah win user
    public int jumlahLose = 0; //Var untuk menampung jumlah lose user
    public int jumlahDraw = 0; //Var untuk menampung jumlah draw user

    public TextField txtWin; //Untuk menampilkan jumlah win user pada TextField txtWin
    public TextField txtDraw; //Untuk menampilkan jumlah draw user pada TextField txtDraw
    public TextField txtLose; //Untuk menampilkan jumlah lose user pada TextField txtLose
    //public Button clickPaper;
    Random rdm = new Random(); //Variable random
    public int comp;    //Variable untuk menyimpan nilai random computer
    public int prevButton;  //Variable untuk menyimpan value Paper, Rock, atau Sciccors pilihan user sebelumnya


    //exitAct. Apabila button Exit ditekan, maka exitAct jalan dan mengakibatkan kita keluar dari aplikasi.
    public void exitAct(ActionEvent actionEvent) {
        Platform.exit();
    }

    //paperAct. Apabila button Paper ditekan oleh user, maka ImageView User akan menampilkan foto Kertas.
    //Computer akan merandom hasilnya dan menampilkan gambarnya pada ImageView Computer.
    //Hasil computer akan menampilkan total jumlah Win, Draw, atau Lose tergantung dengan jawaban Computer.
    //Apabila jawaban computer adalah Kertas, maka jumlahDraw+1
    //Apabila jawaban computer adalah Batu, maka jumlahWin+1
    //Apabila jawaban computer adalah Gunting, maka jumlahLose+1
    public void paperAct(ActionEvent actionEvent ) {
        if(prevButton == 1){}//Pengecekan apakah pilihan user sebelummnya adalah kertas, maka tidak akan terjadi apapun.
        else{//Pengecekan apakah pilihan user sebelumnya bukan kertas, maka program suit dijalankan
            imageUser.setImage(new Image("kertas.jpg"));
            comp = rdm.nextInt(3);
            if(comp == 0){//Pengecekan apabila computer menampilkan kertas, maka jumlahDraw+1
                imageComputer.setImage(new Image("kertas.jpg"));
                jumlahDraw+=1;
                txtDraw.setText(String.valueOf(jumlahDraw));
            }
            else if(comp == 1){//Pengecekan apabila computer menampilkan batu, maka jumlahWin+1
                imageComputer.setImage(new Image("batu.jpg"));
                jumlahWin+=1;
                txtWin.setText(String.valueOf(jumlahWin));
            }
            else if(comp == 2){//Pengecekan apabila computer menampilkan gunting, maka jumlahLose+1
                imageComputer.setImage(new Image("gunting.jpg"));
                jumlahLose+=1;
                txtLose.setText(String.valueOf(jumlahLose));
            }
            prevButton = 1;
        }
    }

    //rockAct. Apabila button Rock ditekan oleh user, maka ImageView User akan menampilkan foto Batu.
    //Computer akan merandom hasilnya dan menampilkan gambarnya pada ImageView Computer.
    //Hasil computer akan menampilkan total jumlah Win, Draw, atau Lose tergantung dengan jawaban Computer.
    //Apabila jawaban computer adalah Batu, maka jumlahDraw+1
    //Apabila jawaban computer adalah Gunting, maka jumlahWin+1
    //Apabila jawaban computer adalah Kertas, maka jumlahLose+1
    public void rockAct(ActionEvent actionEvent) {
        if (prevButton==2){}//Pengecekan apakah pilihan user sebelummnya adalah batu, maka tidak akan terjadi apapun.
        else{//Pengecekan apakah pilihan user sebelumnya bukan batu, maka program suit dijalankan
            imageUser.setImage(new Image("batu.jpg"));
            comp = rdm.nextInt(3);
            if(comp == 0){//Pengecekan apabila computer menampilkan kertas, maka jumlahLose+1
                imageComputer.setImage(new Image("kertas.jpg"));
                jumlahLose+=1;
                txtLose.setText(String.valueOf(jumlahLose));
            }
            else if(comp == 1){//Pengecekan apabila computer menampilkan batu, maka jumlahDraw+1
                imageComputer.setImage(new Image("batu.jpg"));
                jumlahDraw+=1;
                txtDraw.setText(String.valueOf(jumlahDraw));
            }
            else if(comp == 2){//Pengecekan apabila computer menampilkan gunting, maka jumlahWin+1
                imageComputer.setImage(new Image("gunting.jpg"));
                jumlahWin+=1;
                txtWin.setText(String.valueOf(jumlahWin));
            }
            prevButton=2;
        }
    }

    //paperAct. Apabila button Paper ditekan oleh user, maka ImageView User akan menampilkan foto Gunting.
    //Computer akan merandom hasilnya dan menampilkan gambarnya pada ImageView Computer.
    //Hasil computer akan menampilkan total jumlah Win, Draw, atau Lose tergantung dengan jawaban Computer.
    //Apabila jawaban computer adalah Gunting, maka jumlahDraw+1
    //Apabila jawaban computer adalah Kertas, maka jumlahWin+1
    //Apabila jawaban computer adalah Batu, maka jumlahLose+1
    public void sciccorsAct(ActionEvent actionEvent) {
        if (prevButton == 3) {
        }//Pengecekan apakah pilihan user sebelummnya adalah gunting, maka tidak akan terjadi apapun.
        else {
            {//Pengecekan apakah pilihan user sebelumnya bukan gunting, maka program suit dijalankan
                imageUser.setImage(new Image("gunting.jpg"));
                comp = rdm.nextInt(3);
                if (comp == 0) {//Pengecekan apabila computer menampilkan kertas, maka jumlahWin+1
                    imageComputer.setImage(new Image("kertas.jpg"));
                    jumlahWin += 1;
                    txtWin.setText(String.valueOf(jumlahWin));
                } else if (comp == 1) {//Pengecekan apabila computer menampilkan batu, maka jumlahLose+1
                    imageComputer.setImage(new Image("batu.jpg"));
                    jumlahLose += 1;
                    txtLose.setText(String.valueOf(jumlahLose));
                } else if (comp == 2) {//Pengecekan apabila computer menampilkan gunting, maka jumlahDraw+1
                    imageComputer.setImage(new Image("gunting.jpg"));
                    jumlahDraw += 1;
                    txtDraw.setText(String.valueOf(jumlahDraw));
                }
                prevButton = 3;
            }
        }
    }
}
