class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i=0; i<details.length; i++) {
            String phoneNumber = details[i].substring(0, 10);
            if (details[i] != null && details[i].contains(phoneNumber) && details[i].length() == 15) {
                int age = Integer.parseInt(details[i].substring(11,13));
                if (age > 60) {
                    count++;
                }
            }
        }
        System.out.println("details:"+ count);
        return count;
    }
}