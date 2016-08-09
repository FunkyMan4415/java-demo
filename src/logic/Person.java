package logic;

public class Person {
    private String vorname;
    private String nachname;
    private String email;
    private String telefon;

    public Person(String vorname, String nachname, String email, String telefon) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.telefon = telefon;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
