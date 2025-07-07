# Concepts 

### recursion stack 
``` java
    static int recurse(int n) {
        // Base case // stoping condition
        if (n == 0) {
            return 1; //base case return 
        }
        //modify input before passing to function again
        n = n/2

        //recursion calls 
        int res = recurse(n)

        // here goes the logic
        int answer = res + 1;

        //main return
        return answer 
    }
```

- 1
```java
    while(t-- > 0){} ====> while(t>0){ t-- ;};
    while(--t > 0){} ====> t-- ; while(t>0){};
```

### dynamic programming
    recursion + memorization 
    reuse the result by saving it in the memory to save up conputation power is dynamic programming