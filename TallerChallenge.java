public static void main(String[] args) {
        String text = "jhuuhgs";
        int k = 3; //output should be 3

        String text2 = "abcc";
        int k2 = 2; //output should be 2

        String text3 = "aabab";
        int k3 = 3; //output should be 0

        System.out.println(countSubstrings(text, k));
        System.out.println(countSubstrings(text2, k2));
        System.out.println(countSubstrings(text3, k3));
    }

    public static int countSubstrings(String text, Integer k) {
        int n = text.length();
        int count = 0;

        //bigO(n^2)  -> bigO (log n)
        for (int i = 0; i <= n - k; i++) {
            String substring = text.substring(i, i + k);
            HashSet<Character> characters = new HashSet<>();
            for (char c : substring.toCharArray()) {
                characters.add(c);
            }
            if (characters.size() == k) {
                count++;
            }
        }
        return count;
    }