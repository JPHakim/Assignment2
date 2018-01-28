public class BeerSong {
	public static void main(String[] args) {
		Ninety_Nine_Bottles_of_Beer(99);
		 
	}
	
		public static void 	 Ninety_Nine_Bottles_of_Beer(int n){
			if(n == 0){
				System.out.println("take one down,	pass it	around,	no more bottles of beer on the wall.");
			}else{
			if(n == 1){
				
				System.out.println(n +	" bottles of beer on the wall, " + n
						+ " bottle	of beer" );
				System.out.println();
				
			}else{
				
				System.out.println(n +	" bottles of beer on the wall, " + n
					+ " bottles of beer" + 
					" take one down, pass it around, " + (n-1) +	" bottles of beer on the wall.");
				System.out.println();
				
			}
			Ninety_Nine_Bottles_of_Beer(n-1);
			
		}
		}
}