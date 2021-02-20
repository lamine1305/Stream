import java.util.Arrays;
import java.util.List;

public class Sort {
	public static void main(String[] args) {

		// Construction d'une liste d'entier
		Integer[] tab = { 3, 2, 5, 4, 9, 6, 8, 7, 1 };
		List<Integer> list = Arrays.asList(tab);

		// Trier la liste par ordre croissant
		System.out.println("\n" + "ordre croissant ... ");
		list.stream().sorted().forEach(a -> System.out.print(a + " "));

		// Trier la liste par ordre décroissant
		System.out.println("\n" + "ordre décroissant ... ");
		list.stream().sorted((o1, o2) -> {
			return o2 - o1;
		}).forEach(x -> System.out.print(x + " "));

	}
}
