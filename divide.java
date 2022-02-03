public class divide {
    //take a String of fraction (7/6), and return the float form of this fraction
    public String div(String toSolve) {
        String[] nums = toSolve.split("/");
        int num1 = Integer.parseInt(nums[0]);
        double num1_new = num1;
        int num2 = Integer.parseInt(nums[1]);
        double num2_new = num2;
        return String.valueOf(num1_new/num2_new);
    }
}