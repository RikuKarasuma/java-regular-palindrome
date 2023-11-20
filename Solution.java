class Solution {
    public boolean isPalindrome(final String potentialPalindrome) {
        final String strippedString = potentialPalindrome.replaceAll("[^A-Za-z0-9]","")
                                                         .toLowerCase();

        for ( int i = 0, e = (strippedString.length() - 1); i < (strippedString.length() / 2); i ++, e --)
            if (strippedString.charAt(i) != strippedString.charAt(e))
                return false;

        return true;
    }
}

