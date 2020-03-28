/**The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows); */


class Solution {
    public String convert(String s, int numRows) {
      if (numRows <= 1 || s.length() == 0)
           return s;

        String res = "";
        int len = s.length();
        for (int i = 0; i < len && i < numRows; ++i)
        {
            int indx = i;
            res +=""+ s.charAt(indx);

            for (int k = 1; indx < len; ++k)
            {
                if (i == 0 || i == numRows - 1)
                {
                    indx += 2 * numRows - 2;
                }
                else
                {
                    if (k % 2 == 1)  
                        indx += 2 * (numRows - 1 - i);
                    else indx += 2 * i;
                }

    
                if (indx < len)
                {
                  res +=""+ s.charAt(indx);
                }   
            }
        }
        return res;

        
        
    }
}
