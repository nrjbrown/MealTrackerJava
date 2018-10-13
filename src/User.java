

class User{
    public final String firstName;
    public final String lastName;
    public final String email;
    public final double targetAdherence;

    User(String firstName, String lastName, String email, double target){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.targetAdherence = target;
    }
    String getFirstName(){

        return this.firstName;
    }

    String getLastName(){

        return this.lastName;
    }

    String getEmail(){

        return this.email;
    }

    double getTargetAdherence(){

        return this.targetAdherence;
    }
}