import java.util.*;

class Solution {

    List<String> list = new ArrayList<>();

    public void solve(String s, int i, String curr, int parts) {

        // If 4 parts formed and string completely used
        if (parts == 4 && i == s.length()) {
            list.add(curr.substring(0, curr.length() - 1)); // remove last dot
            return;
        }

        // If 4 parts already but string not finished
        if (parts == 4 || i == s.length()) {
            return;
        }

        // Try taking 1 to 3 digits
        for (int len = 1; len <= 3 && i + len <= s.length(); len++) {

            String part = s.substring(i, i + len);

            // Leading zero case
            if (part.length() > 1 && part.startsWith("0")) {
                continue;
            }

            int value = Integer.parseInt(part);

            if (value <= 255) {
                solve(s, i + len, curr + part + ".", parts + 1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {

        solve(s, 0, "", 0);
        return list;
    }
}
