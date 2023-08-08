package seminar_05.model;

public abstract class User {
    private String lastname;
    private String firstname;
    private String secondname;

    public String getLastName(){
        return lastname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    public String getFirstName(){
        return firstname;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public String getSecondName(){
        return secondname;
    }

    public void setSecondName(String secondname){
        this.secondname = secondname;
    }

    public User (String lastname, String firstname, String secondname){
        this.lastname = lastname;
        this.firstname = firstname;
        this.secondname = secondname;
    }

}
