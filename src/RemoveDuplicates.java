import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {

	public static Integer[] removeDuplicates(Integer[] array) {
		Set<Integer> set = new HashSet<>();
		Integer[] newArray = new Integer[array.length];
		int j = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (set.add(array[i]))
				newArray[j++] = array[i];
		}

		return Arrays.copyOf(newArray, j);
	}

	public static void main(String[] args) {
		Integer[] array = { 5, 6, 1, 2, 3, 3, 6, 1 };
		array = removeDuplicates(array);

		for (Integer element : array)
			System.out.println(element);
	}
}
