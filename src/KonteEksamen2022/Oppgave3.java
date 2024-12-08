package KonteEksamen2022;

class Personalia{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Personalia(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Navn: "+navn+"\n"+"Adresse: "+adresse+"\n"+"TelefonNr: "+telefonnr;
    }
}


class Student {
    private Personalia personalia;
    private String studentnr;

    public Student(Personalia personalia, String studentnr) {
        this.personalia = personalia;
        this.studentnr = studentnr;
    }

    @Override

    public String toString() {
        return "Student( "+"\n"+personalia+"\n" + "StudentNr: " + studentnr +"\n"+")";
    }

}
class Ansatt{
    private Personalia personalia;
    private String tittel;

    public Ansatt(Personalia personalia, String tittel){
        this.personalia = personalia;
        this.tittel = tittel;
    }

    @Override
    public String toString(){
        return "Ansatt( "+"\n"+personalia+"\n"+"Tittel: "+"\n"+tittel+"\n"+")";
    }
}






public class Oppgave3 {
    public static void main(String[] args) {
        Personalia Hugh = new Personalia("Hugh Janus", "Haukerudbakken 69", "7716249");
        Student HughTheStudent = new Student(Hugh, "64758329");
        Personalia Mike = new Personalia( "Mike Hunt", "Skinnbekksviddaveien 117", "66496372" );
        Ansatt MikeTheTeacher = new Ansatt(Mike, "Lærer");

        System.out.println(HughTheStudent);
        System.out.println(MikeTheTeacher);

    }

}
