public class LargestNumber {
    public void largest_num(int x, int y, int z){
        if(x > y && x > z){
            System.out.println(x+ " is the Largest number");
        }
        else if(y > z && y > x){
            System.out.println(y+ " is the largest number");
        }
        else{
            System.out.println(z+ " is the largest number");
        }
    }
}
