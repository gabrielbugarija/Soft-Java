//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BuddyInfo {


    private String name;
    private String adress;
    private int phoneNum;

    public BuddyInfo(String name,String adress,int phoneNum) {
        this.name = name;
        this.adress = adress;
        this.phoneNum = phoneNum;

    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNum() {
        return phoneNum;
    }


    public static void main(String[] args) {

        String name = "homer";
        System.out.println("Hello " + name);

    }
}