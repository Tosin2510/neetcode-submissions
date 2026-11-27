class Solution {
    public int reverseBits(int n) {
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] chars = binaryString.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l<r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l+=1;
            r-=1;
        }

        String reversedString = new String(chars);
        int unsignedInteger = Integer.parseUnsignedInt(reversedString, 2);
        return unsignedInteger;

    }

}
