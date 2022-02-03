public class divide {
    //take a String of fraction (7/6), and return the float form of this fraction
    public String div(String toSolve) {
        String[] nums = toSolve.split("/");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        return String.valueOf(num1/num2);
    }
}