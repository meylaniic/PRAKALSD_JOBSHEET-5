public class latihanpraktikum {
    String nama;
        String nim;
        int tahunmsk;
        int uts, uas;

    
    latihanpraktikum() {
        
    }

    latihanpraktikum(String nama, String nim, int tahunmsk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunmsk =  tahunmsk;
        this.uts = uts;
        this.uas = uas;
    }


    void tampilkandata(latihanpraktikum[] datamhs) {
        for (int i = 0; i < datamhs.length; i++) {
            System.out.println("Nama: " + datamhs[i].nama + "  |NIM: " + datamhs[i].nim +
                                   "  |Tahun Masuk: " + datamhs[i].tahunmsk +  "  |Nilai UTS: " + datamhs[i].uts + 
                                   "  |Nilai UAS: " + datamhs[i].uas);
            }
    }

    int nilaitertinggiuts(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }

        int mid = (kiri+kanan) /2;
        int maxkiri = nilaitertinggiuts(uts, kiri, mid);
        int maxkanan = nilaitertinggiuts(uts, mid+1, kanan);
        return Math.max(maxkiri, maxkanan);
    }

    int nilaiterendahuts(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }

        int mid = (kiri+kanan) /2;
        int minkiri = nilaiterendahuts(uts, kiri, mid);
        int minkanan = nilaiterendahuts(uts, mid+1, kanan);
        return Math.min(minkiri, minkanan);
    }

    double rataratauas(latihanpraktikum[] datamhs) {
        double total = 0;
        for (int i = 0; i < datamhs.length; i++) {
            total += datamhs[i].uas;
        }

        double ratarata = total / datamhs.length;
        return ratarata;
    }

    
}
