package srcYeni.day27Constructor;

public class Volvo_01 {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();
    public Volvo_01(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
    }
    public Volvo_01(){
    }
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
        return arabaOzellikleri;
    }

}
