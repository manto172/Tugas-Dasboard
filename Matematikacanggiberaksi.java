Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2 : ");
        int nilai2 = input.nextInt();
        
        System.out.println("Hasil Pertambahan " + nilai1 + " + " +nilai2 + " = " + mtk.pertambahan(nilai1, nilai2));
        System.out.println("Hasil Perkalian " + nilai1 + " * " +nilai2 + " = " + mtk.perkalian(nilai1, nilai2));
        System.out.println("Hasil Modulus " + nilai1 + " % " +nilai2 + " = " + mtk.modulus(nilai1, nilai2));
    }
}
