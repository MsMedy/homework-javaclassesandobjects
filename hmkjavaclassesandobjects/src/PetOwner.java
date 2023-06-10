public class PetOwner {
    private String ownerName = "Medhen";
    private int ownerAge = 65;
    private String preferredOfficeLocation = "phoenix";

    //CONSTRUCTORS
    public PetOwner(){
        //empty constructor
    }
    public PetOwner(String ownerName, int OwnerAge){
        // accepts two variables

        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
    }
    public PetOwner(String ownerName, int ownerAge, String preferredOfficeLocation){
        // accepts three variables

        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
        this.preferredOfficeLocation = preferredOfficeLocation;
    }

    //GETTERS
    public String getOwnerName(){
        return ownerName;
    }
    public int getOwnerAge(){
        return ownerAge;
    }
    public String getPreferredOfficeLocation(){
        return preferredOfficeLocation;
    }

    //SETTERS
    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setPreferredOfficeLocation(String preferredOfficeLocation) {
        this.preferredOfficeLocation = preferredOfficeLocation;
    }


    //METHOD THAT RETURNS A BOOLEAN

    public boolean checkOwnerName(){
        System.out.println("Will return false");
        return false;
    }

    //METHOD THAT RETURNS A STRING
    public String returnOwnerName(){
        System.out.println("will return owner name");
        return ownerName;
    }





} //closing braces for class
