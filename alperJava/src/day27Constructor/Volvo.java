package day27Constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();
    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }
    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if(elektrikliMi){
            sonuc=true;
        }
        return sonuc;
    }
    public String toString(){
        String arabaOzellikleri= "Model : " + model +
                " Yakit : " + yakit +
                " Max Hiz : " +maxHiz;
        return arabaOzellikleri;}

    }

