package ua.opnu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

    // ======== Boolean expressions ========
    // test workflow trigger

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // ======== Loops and Arrays ========

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 9) count++;
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String lastTwo(String str) {
        int len = str.length();
        if (len < 2) return str;
        return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }
}
