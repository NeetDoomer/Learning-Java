public class GettersAndSettersPractice {
    private String fName;//private operators can only be accessed by methods inside the class
    private String lName;

    public String getfName(){
        return fName;
    }
    public String getlName(){//sends reference of  the names back as a return
        return lName;
    }

    public void setfName(String newfName){//capable of interacting with the private strings due to method being in class
        this.fName = newfName;
    }
    public void setlName(String newlName){
        this.lName = newlName;
    }
}

