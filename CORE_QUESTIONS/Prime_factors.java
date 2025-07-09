class Solution {
        public List<List<Integer>> primeFactors(int[] queries) {
            List<List<Integer>> list = new ArrayList<>();
            for(int x :queries){
                list.add(primeFactors(x));
            }
            return list;
        }

        static List<Integer> primeFactors(int n){
            List<Integer> factors = new ArrayList<>();
            for(int i = 2; i * i <=n; i++){
                while(n % i == 0){
                    factors.add(i);
                    n /= i;
                    
                }
            }
            if( n > 1){
                factors.add(n);
            }
            return factors;

        }
}