/**In an infinite binary tree where every node has two children, the nodes are labelled in row order.

In the odd numbered rows (ie., the first, third, fifth,...), the labelling is left to right, 
while in the even numbered rows (second, fourth, sixth,...), the labelling is right to left.

 */

class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        
    List<Integer> res = new ArrayList<>();
        int height = (int) (Math.log(label) / Math.log(2));
        res.add(label);
        while (label != 1) {
            int parent = label / 2;
            height--;
            int start = (int) Math.pow(2, height);
            int end = start + (int) Math.pow(2, height) - 1;
            label = start + (end - parent);
            res.add(0, label);
        }
        return res;
    }
}