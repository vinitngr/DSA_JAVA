class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> stringList = new ArrayList<>();
        helperFunction(stringList, s, new ArrayList<String>());
        return stringList;
    }

    public static void helperFunction(
            List<List<String>> stringList,
            String s,
            List<String> currentList) {
        if (s.isEmpty()) {
            stringList.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i + 1);

            if (ispalidrom(prefix)) {
                currentList.add(prefix);
                helperFunction(stringList, s.substring(i + 1), currentList);
                currentList.remove(currentList.size() - 1);
            }
        }

    }

    public static boolean ispalidrom(String prefix) {
        boolean isPal = true;
        int left = 0, right = prefix.length() - 1;
        while (left < right) {
            if (prefix.charAt(left++) != prefix.charAt(right--)) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }
}