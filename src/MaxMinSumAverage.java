import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxMinSumAverage {

	public static void main(String[] args) {
		// Construction d'une liste d'entier
		Integer[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(tab);
		// Construction des stream à partir de la liste
		Stream<Integer> sMin = list.stream();
		Stream<Integer> sMax = list.stream();
		Stream<Integer> sSomme = list.stream();
		Stream<Integer> sMulti = list.stream();
		Stream<Integer> sAverage = list.stream();

		// Optional si la liste est vide
		Optional<Integer> valMin = sMin.min((o1, o2) -> o1 - o2);
		if (valMin.isPresent())
			System.out.println("le min de 1,2,3,4,5,6,7,8,9 est : " + valMin.get());

		Optional<Integer> valMax = sMax.max((o1, o2) -> o1 - o2);
		if (valMax.isPresent())
			System.out.println("le max de 1,2,3,4,5,6,7,8,9 est : " + valMax.get());

		Optional<Integer> valSomme = sSomme.reduce((o1, o2) -> o1 + o2);
		if (valSomme.isPresent())
			System.out.println("le somme de 1,2,3,4,5,6,7,8,9 est : " + valSomme.get());

		Optional<Integer> valMultiplication = sMulti.reduce((o1, o2) -> o1 * o2);
		if (valMultiplication.isPresent())
			System.out.println("le somme de 1,2,3,4,5,6,7,8,9 est : " + valMultiplication.get());

		// Clcul de la moyenne
		Double valAverage = sAverage.mapToInt(x -> x).average().getAsDouble();
		System.out.println("le moyenne de 1,2,3,4,5,6,7,8,9 est : " + valAverage);
	}

}
