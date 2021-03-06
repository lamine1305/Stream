import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Integer[] tab = { 1, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(tab));
		Stream s = list.stream();
		s.forEach(System.out::print);
	}

}
