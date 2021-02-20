import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		// Cas 1 :List<List<Integer>> -> List<Integer>
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		System.out.println("*********AVANT **********");
		System.out.println(listOfLists);
		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("*********APRES **********");
		System.out.println(listOfAllIntegers);

		// Cas 2 :List<List<List<Integer>>> -> List<Integer>
		List<Integer> list10A = Arrays.asList(10, 20, 30);
		List<Integer> list10B = Arrays.asList(100, 200, 300);
		List<Integer> list10C = Arrays.asList(1000, 2000, 3000);

		List<Integer> list20A = Arrays.asList(6, 12, 18);
		List<Integer> list20B = Arrays.asList(60, 120, 180);
		List<Integer> list20C = Arrays.asList(600, 1200, 1800);

		List<List<Integer>> list10 = Arrays.asList(list10A, list10B, list10C);
		List<List<Integer>> list20 = Arrays.asList(list20A, list20B, list20C);
		System.out.println("*********AVANT **********");
		List<List<List<Integer>>> listGlob = Arrays.asList(list10, list20);
		System.out.println(listGlob);

		List<Integer> listSimple = listGlob.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).stream()
				.flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("*********APRES **********");

		System.out.println(listSimple);
		Optional<Integer> in = listSimple.stream().max((x, y) -> x - y);
		if (in.isPresent())
			System.out.println("le max = " + in.get());
	}

}
