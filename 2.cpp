
long long numberOfZeroDigits(int n)
{   
    long long res = 0;
    for (int i = 5; i<=n;i=i*5) {
        long long m = n/i;
        res = res + m*(n-i+1) - (m*(m-1)/2)*i;
    }
   
    return res;
}
