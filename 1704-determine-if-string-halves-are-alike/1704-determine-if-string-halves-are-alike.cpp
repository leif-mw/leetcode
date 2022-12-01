class Solution {
public:
    bool halvesAreAlike(string s) {
        int aVowels = 0, bVowels = 0;
        int midIndex = s.length() / 2;
        for (int i = 0; i < midIndex; i++) {
            if (isVowel(s[i]))
                aVowels++;
        }
        for (int i = midIndex; i < s.length(); i++) {
            if (isVowel(s[i]))
                bVowels++;
        }
        return aVowels == bVowels;
    }
    
    bool isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'; 
    }
};