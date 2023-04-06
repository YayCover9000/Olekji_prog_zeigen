public class IIDimZugriff {
    public static void ArrayBuild (int twodim [][]) {
        int upper = 0;
        for (int i = 0; i < twodim.length; i++) {
            for (int j = 0; j < twodim[i].length; j++) {
                twodim[i][j] = j * upper;
            }
            upper++;
        }
        print(twodim);
    }

    public static void print(int[][] ausgabeArray) {
            for(int i=0;i<ausgabeArray.length ;i++){
                for(int j=0;j<ausgabeArray[i].length;j++){
                    if(ausgabeArray[i][j] % 2 != 0) {
                        System.out.print(ausgabeArray[i][j] + 11 +"\t");

                    } else {
                        System.out.print(ausgabeArray[i][j] -1 +"\t");
                    }
                }
                System.out.println();
            }
        }
    }
