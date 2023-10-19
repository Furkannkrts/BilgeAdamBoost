package odev1;

public class soru1a {

	public static void main(String[] args) {
		
				int[][] matris = {
			            {1, 2, 3},
			            {4, 5, 6},
			            {7, 8, 9}
			        };

			       // int[][] tersCevrilmisMatris = tersCevirMatris(matris);

			        // Ters çevrilmiş matrisi yazdırma
			        for (int i = matris.length-1; i >= 0; i--) {
			            for (int j = matris[i].length-1; j >= 0; j--) {
			                System.out.print(matris[i][j] + " ");
			            }
			            System.out.println();
			        }
			        
			        
			    }

			    public static int[][] tersCevirMatris(int[][] matris) {
			        int[][] tersCevrilmisMatris = new int[3][3];

			        for (int i = 0; i < 3; i++) {
			        	
			        	
			        	
			            for (int j = 0; j < 3; j++) {
			               
			                //tersCevrilmisMatris[i][j] = matris[2 - i][2 - j];
			            }
			        }

			        return tersCevrilmisMatris;
	}

}
