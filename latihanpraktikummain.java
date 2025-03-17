public class latihanpraktikummain {
    public static void main(String[] args) {
        latihanpraktikum[] datamhs = new latihanpraktikum[] {
            new latihanpraktikum("Ahmad", "220101001", 2022, 78, 82),
            new latihanpraktikum("Budi", "220101002", 2022, 85, 88),
            new latihanpraktikum("Cindy", "220101003", 2021, 90, 87),
            new latihanpraktikum("Dian", "220101004", 2021, 76, 79),
            new latihanpraktikum("Eko", "220101005", 2023, 92, 95),
            new latihanpraktikum("Fajar", "220101006", 2020, 88, 85),
            new latihanpraktikum("Gina", "220101007", 2023, 80, 83),
            new latihanpraktikum("Hadi", "220101008", 2020, 82, 84)
        };
        System.out.println("==================== DATA NILAI MAHASISWA ====================");
        datamhs[0].tampilkandata(datamhs);


        int [] utsarray = new int[datamhs.length];
        for (int i = 0; i < datamhs.length; i++) {
            utsarray[i] = datamhs[i].uts;
        }

        System.out.println();
        System.out.println("========== INFORMASI NILAI ==========");

        int nilaimaxuts = datamhs[0].nilaitertinggiuts(utsarray, 0, utsarray.length-1);
        System.out.println("Nilai UTS Tertinggi : " + nilaimaxuts);

        int nilaiminuts = datamhs[0].nilaiterendahuts(utsarray, 0, utsarray.length-1);
        System.out.println("Nilai UTS Terendah : " + nilaiminuts);

        double rataratauas = datamhs[0].rataratauas(datamhs);
        System.out.println("Rata Rata Nilai UAS : " +rataratauas);
    }
}
