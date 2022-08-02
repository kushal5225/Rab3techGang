import java.util.Comparator;

public class SortOnColor implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		int x=(o2.color).compareTo(o1.color);
		return x;
	}

}
