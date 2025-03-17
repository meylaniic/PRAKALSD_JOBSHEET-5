public class sum {
    double keuntungan[];
    sum(int el){
        keuntungan = new double[el];
    }

    double totalbf(){
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];   
        }
        return total;
    }

    double totaldc(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        double lsum = totaldc(arr, l, mid);
        double rsum = totaldc(arr, mid+1, r);
        return lsum+rsum;
    }
}
