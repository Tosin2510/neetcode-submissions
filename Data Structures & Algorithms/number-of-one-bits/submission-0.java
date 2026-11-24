class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int noOfOnes = 0;
        for (int j=0; j<binary.length(); j++) {
            if (binary.charAt(j) == '1') {
                noOfOnes += 1;
            }
        }

        return noOfOnes;
    }
}
