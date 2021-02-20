import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		// Construction d'une liste d'entier
		Integer[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(tab);

		// Filtrer les element de la liste
		list.stream().filter(t -> t > 5).forEach(x -> System.out.print(x + " "));
	}
}
