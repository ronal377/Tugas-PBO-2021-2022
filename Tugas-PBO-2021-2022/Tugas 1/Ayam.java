  
  
  class Ayam {
	private static String jenis_unggas = "Ayam";
	private static int jumlah_kaki = 2;

public static String getJenisUnggas() {
	return jenis_unggas;
}
public static int getJumlahKaki() {
	return jumlah_kaki;
}
private static void berkokok() {
	System.out.println("aku berkokok");
}
private static void berlari() {
	System.out.println("aku berlari");
}
public static void main (String [] arg) {
	System.out.println(String.format("Jenis Unggas :%S", getJenisUnggas()));
	System.out.println(String.format("Jumlah kaki :%S", getJumlahKaki()));

berkokok();
berlari();
}

}
