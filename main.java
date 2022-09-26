public class main {
        public static void main(String[] args){
            String sapa = "1 “Danu Jailani” 5000000 2 “Jumari Kusumo” 3500000 3 “Cahyadi Hidayanto” 6700000 1-H!2-H!3-H\n" +
                    "1-H!2-H!3-H 1-i!2-H!3-H 1-H!2-H!3-H 1-H!2-H!3-H 1-H!2-H!3-H 1-H!2-H 3-i" ;
            String [] mainSplit = sapa.split("!");
            for (int i = 0; i < mainSplit.length; i++){
                System.out.println(mainSplit[i]);
            }

            int input = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length;i += 3){
                int nik = Integer.parseInt(args[i]);
                int gajipokok = Integer.parseInt(args[i+2]);

                Karyawan k = new Karyawan(nik,args[i+1], gajipokok);

                System.out.print(k.getNik() + " - " + k.getNama() + "-");
                k.hitunggaji();}
        }
    }
