/**Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

 */



class Solution {
    public int numberOfBoomerangs(int[][] points) {

    		HashMap<Integer, Integer> mp = new HashMap<>();
    		int ret = 0; int d;
    		for(int i=0; i<points.length; i++){
    			for(int j=0; j<points.length; j++){
    				d = distance(points[i], points[j]);
    				mp.put(d, mp.getOrDefault(d, 0) + 1);

    			}

    			for(int t : mp.values()){
    				if(t > 0) ret += t*(t-1);
    			}
    			mp.clear();

    		}

    		return ret;
        
    }


    public int distance(int[] a, int[] b){

    	int x = a[0] - b[0]; int y= a[1] - b[1];
    	return x*x + y*y;
    }
}