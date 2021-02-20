import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		// Construction d'une liste d'entier
		Integer[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(tab);

		// Filtrer les element de la liste
		System.out.println("Tous les element de la liste sont < 5 " + list.stream().allMatch(x -> x < 5));
		System.out.println("Tous les element de la liste sont < 10 " + list.stream().allMatch(x -> x < 10));
		System.out.println("Au moins un  element de la liste est < 5 " + list.stream().anyMatch(x -> x < 5));
		System.out.println("Au moins un  element de la liste est < 10 " + list.stream().anyMatch(x -> x < 10));
		System.out.println("Au moins un  element de la liste est > 5 " + list.stream().anyMatch(x -> x > 5));
		System.out.println("Au moins un  element de la liste est > 10 " + list.stream().anyMatch(x -> x > 10));

		// En utilisant les classes anonymes
		Boolean v = list.stream().anyMatch(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t < 10;
			}
		});
		System.out.println("Au moins un element de la liste est < 10 " + v);

		Boolean v2 = list.stream().allMatch(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t < 4;
			}
		});
		System.out.println("Tous les elements de la liste sont < 4 " + v2);

	}
}
