package odev1;

public class soru1b {

	public static void main(String[] args) {
		int[][] matris = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] degistirilmisMatris = satirSutunDegistirMatris(matris);

	        // Satır ve sütunları değiştirilmiş matrisi yazdırma
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(degistirilmisMatris[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] satirSutunDegistirMatris(int[][] matris) {
	        int satirSayisi = matris.length;
	        int sutunSayisi = matris[0].length;

	        int[][] degistirilmisMatris = new int[sutunSayisi][satirSayisi];

	        for (int i = 0; i < satirSayisi; i++) {
	            for (int j = 0; j < sutunSayisi; j++) {
	                // Matrisin satır ve sütunlarını değiştirme işlemi
	                degistirilmisMatris[j][i] = matris[i][j];
	            }
	        }

	        return degistirilmisMatris;

	}

}
