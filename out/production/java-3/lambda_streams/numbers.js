let nums = new Array(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500);



    const isOdd = (i) => i % 2 != 0;
    const isEven = (i) => i % 2 == 0;
   const isPrime = (i) => i % 2 != 0 && i / i == 1;
    const added = (nums) => {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    };
    const subtracted = (nums) => {
        int sub = 2500;
        for (int i : nums) {
            sub -= i;
        }
        return sub;
    };

  const multiplied = (n) => {
        let mult = 1;
        for (let i = 1; i < nums.length, nums++) {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        return mult;
    };

        const divided = (k, j) => {
            int div = nums.get(j) / nums.get(k);
            return div;
        };
        const findMax = (p) => {
            int b;
            int max = 0;
            for (b = 1; b < nums.size(); b++)
                if (nums.get(b) > max) {
                    max = nums.get(b);
                }
            return Collections.singletonList(max);
        };

        const findMin = (d) => {
            int min = 10;
            for (int c = 1; c < nums.size(); c++) {
                if (nums.get(c) < min) {
                    min = nums.get(c);
                }
            }
            return min;
        };

        const compare = (l, m) => {
            l = nums.get(l);
            m = nums.get(m);
            if (l > m) {
                return 1;
            } else if (m > l) {
                return -1;
            } else if (l == m) {
                return 0;
            } else {
                return l;
            }
        };

        const append = (a) -> {
            nums[0] = a;
            return a;
        };
    };
