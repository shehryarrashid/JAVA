package Learn;

class Solution {

    public static void main(String[] args) {
        int[] sol = solution(new int[]{3, 8, 9, 7, 6},3);
        for(int i = 0; i < sol.length; i++){
            System.out.print(sol[i] + ",");
        }
    }
    public static int[] solution(int[] A, int K) {
        int idx = 0;
        int[] sol = new int[A.length];
        if(K != A.length){
            for (int j = 0 ; j < A.length; j++){
                sol[j] = A[j];
            }
            for(int i = 0; i < A.length;i++){
                idx = K + i - 1;
                if(idx >= A.length){
                    idx = idx - A.length;
                }
                System.out.println("A[i]:"+A[i] + "    i:" + i + "   idx: " + idx + "   A[idx]:" + A[idx] );
                sol[i] = A[idx];
            }
        }

        return sol;
    }
}