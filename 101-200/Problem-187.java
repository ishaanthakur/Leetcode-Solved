/**All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

Example:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

Output: ["AAAAACCCCC", "CCCCCAAAAA"] */

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i=0; i<=s.length()-10; i++){
            if(mp.containsKey(s.substring(i, i+10)))mp.put(s.substring(i, i+10), mp.get(s.substring(i, i+10)) + 1);
            else mp.put(s.substring(i, i+10), 1);
        }
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            if(e.getValue() > 1) arr.add(e.getKey());
        }
        return arr;
        
    }
}