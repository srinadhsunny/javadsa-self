class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Number out of range (1..3999)");
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 
                        10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", 
                            "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(3));    // III
        System.out.println(sol.intToRoman(58));   // LVIII
        System.out.println(sol.intToRoman(1994)); // MCMXCIV
    }
}

