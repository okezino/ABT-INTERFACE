
public class Sprinter extends Athletes implements Properties {
    public String name;

    Sprinter(String name){
        this.name = name;
    }




    /**
     * Overriding the Abstract functions
     *
     */
    @Override
    public boolean trackEvent(){

        return true;
    }

    @Override
    public boolean fieldEvent(){
     return false;
    }

    @Override
    public  boolean waterEvent(){
        return false;
    }

    @Override
    public boolean retired(){
        return true;
    }
    /**
     * over riding the interface function
     */

    @Override
    public String energylevel(){
        return "very good energy level";
    }
    @Override
    public String speed(){
        return "An average sprinters runs 34KM/H";
    }

    @Override
    public String drugged(){
        return  this.name+ " " + "is on drugs";
    }
    @Override
    public String experience(){
        return "All sprinters are well experience";
    }

    @Override
    public String fieldTrack() {
        return "Sprinters are men track men and women";
    }

    /**
     * Algorithm on modulus and  foobar
     */

    public String foobar(int input){
        if(input % 5 == 0 && input % 3 == 0){
            return "foobar";
        }else if(input % 5 == 0){
            return "foo";
        }else if(input % 3 == 0){
            return "bar";
        }else return "neither divisible by 5 0r 3";
    }
}
