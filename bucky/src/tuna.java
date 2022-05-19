public class tuna {
    public void simpleMessage(String name){
        System.out.println("Hello " + name);
    }
    private String girlName;

    public tuna(String name){
        girlName = name;
    }

    public void setGirlName(String name){
        girlName = name;
    }
    public String getGirlName(){
        return girlName;
    }

    public void saying(){
        System.out.printf("Your first girlfriend was %s\n", getGirlName());
    }
}
