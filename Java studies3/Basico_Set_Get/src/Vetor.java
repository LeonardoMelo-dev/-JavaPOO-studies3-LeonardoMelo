import java.util.Arrays;


public class Vetor {

	public static void main(String[] args) {
		
		int vet[] = {3 , 7 , 6 , 1, 9, 4, 2};
		int vetor[] = new int[10];
		int p = 0;
		
		// Auto inclementa
		Arrays.fill(vetor, 1);
		for(int total: vetor)
		{
			System.out.println(total);
		}
		
		// Procura dentro do vetor o valor 1
		p = Arrays.binarySearch(vet, 1);
		System.out.println("Encontrei " + p);
		
		// Organiza em ordem do menor pro maior
		Arrays.sort(vet);
		for(int valor: vet)
		{
			System.out.println(valor);
		    
			
		}
		
		
		
	}
}
