package org.example.easy;
//reverse integer
public class Task7 {

    public int reverse(int x) {
        int res = 0;
        int div = 0;
        while (x != 0) {
            div = x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE && div > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE && div < -8)) {
                return 0;
            }

            res = res * 10 + div;

        }
        return res;
    }
}
