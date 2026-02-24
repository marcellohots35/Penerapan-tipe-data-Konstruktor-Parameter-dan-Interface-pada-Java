public class LaguLaguan {
    public static
    String[] bingo ={"B","I","N","G","0"};
        public LaguLaguan(){
            tampilkanLagu();
        }
        public void tampilkanLagu() {
        int ulang = 3;
            for (int i = 0;i <= bingo.length;i++){
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o,");
                for(int j =0;j < ulang;j++){
                    for(int k =0;k < bingo.length;k++){
                        if(k < i) {
                            System.out.print("(clap)");
                        }else{
                            System.out.print(bingo[k]);
                        }
                        if (j < bingo.length -1){
                            System.out.print("-");
                        }
                    }
                    System.out.println();
                }

                System.out.println("And Bingo was his name-o.");
                System.out.println();
            }
        }
public static void main(String[] args) {
            new LaguLaguan();
}
}
