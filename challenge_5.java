public class challenge_5 {

    // Demonstrates the use of a while loop in Java
    public void Count() {
        int count = 0;
        while (count <= 10) {
            System.out.println("The value of count is " + count);
            count++;
        }
    }
    public static void main(String[] args){
        challenge_5 counter = new challenge_5();
        counter.Count();
    }
}
