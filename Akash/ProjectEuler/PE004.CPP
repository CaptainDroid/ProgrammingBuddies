#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, a, p, p1, p2, m1, m2, t;
    bool found = false;
    scanf("%d", &t);
    for(int j = 1; j<=t; j++) {
        scanf("%d", &n);

        for(int i=n-1; i>=100000; i--) {
            found = false;
            a = i;
            if(a > 999999) {
                p = 6;
            } else {
                p = 5;
            }
            p1 = p;
            while(p1 >= 0) {
                p2 = p - p1;
                m1 = (int)pow(10, p1);
                m2 = (int)pow(10, p2);
                if(a / m1 % 10 != a / m2 % 10) break;
                p1--;
            }
            if(p1 <= 0){
                for(int k=100; k<=999; k++){
                    if(((int)(i/k))*k == i && (int)(i/k) < 1000) {
                        printf("%d\n", i);
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }
        }
    }
    return 0;
}
