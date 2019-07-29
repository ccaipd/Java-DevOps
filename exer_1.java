public class exer_1 {

    public static void main(String args[]) {
        int var_1 = 500;
        short var_2 = 10;
        byte var_3 = 30;
        long var_4 = 70000 + (15 * var_1) + var_2 + var_3;
        System.out.println("The long variable equal to " + var_4);

        final double constant = 0.45359237;
        int lb = 100;
        double result = lb * constant;
        System.out.println("100 lbs equals to " + result + " kg");

        double var_5 = 20, var_6 = 80;
        double var_7 = (var_5 + var_6) * 25;
        System.out.println("The double number is " + var_7);

        double var_8 = var_7 % 40;
        if(var_8 <= 20)
            System.out.println("Total was over the limit");

        char ch = 'C';
        switch(ch){
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case'C':
                System.out.println("Cherry");
                break;
            case 'D':
                System.out.println("Dragon Fruit");
                break;
            case 'E':
                System.out.println("Elderberry");
                break;
            default:
                System.out.println("Non in fruit basket");
                break;
        }
    }
}
