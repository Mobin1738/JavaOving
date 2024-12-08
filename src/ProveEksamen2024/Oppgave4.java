package ProveEksamen2024;

 class SmartLight{
    public int brightnessPercentage;
    public boolean isOn;

     public SmartLight(int brightnessPercentage, boolean isOn) {
         this.brightnessPercentage = brightnessPercentage;
         this.isOn = isOn;
     }

     public int getBrightnessPercentage() {
         return brightnessPercentage;
     }

     public void setBrightnessPercentage(int brightnessPercentage) {

         if (0 < brightnessPercentage && brightnessPercentage < 100) {
             this.brightnessPercentage = brightnessPercentage;
         }
         else{
             System.out.println("Du må oppgi verdi mellom 0 og 100!");
         }
     }


 }

class SmartLamp{
    public SmartLight installedBulb;
    public String wifiName;


    public SmartLamp(){
        this.installedBulb = null;
        this.wifiName = null;
    }

    public SmartLamp(SmartLight installedBulb) {
        this.installedBulb = installedBulb;
    }

    public SmartLight getInstalledBulb(){
        return installedBulb;
    }

    public void setInstalledBulb(SmartLight installedBulb){
        this.installedBulb = installedBulb;
    }

    public String getWifiName(){
        return wifiName;
    }

    public void setWifiName(String wifiName){
        this.wifiName = wifiName;
    }



    public void setBrightness(int brightness){
        installedBulb.setBrightnessPercentage(brightness);
    }



}
public class Oppgave4 {

}



