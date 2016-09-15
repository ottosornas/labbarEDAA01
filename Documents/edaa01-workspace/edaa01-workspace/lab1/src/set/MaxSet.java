package set;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class MaxSet<E extends Comparable<E>> extends ArraySet<E> {
	private E maxElement;

	/**
	 * Constructs a new empty set.
	 */
	public MaxSet() {
		super();
	}

	/**
	 * Returns the currently largest element in this set. pre: the set is not
	 * empty post: the set is unchanged
	 * 
	 * @return the currently largest element in this set
	 * @throws NoSuchElementException
	 *             if this set is empty
	 */
	public E getMax() {
		if (!isEmpty()) {
			return maxElement;
		}
		throw new NoSuchElementException("Finns inget s�dan element tillagt");
	}

	/**
	 * Adds the specified element to this set, if it is not already present.
	 * post: x is added to the set if it is not already present
	 * 
	 * @param x
	 *            the element to be added
	 * @return true if the specified element was added
	 */
	@Override
	public boolean add(E x) {
		if (maxElement == null || x.compareTo(maxElement) > 0) {
			maxElement = x;
		}
		return super.add(x);
	}

	/**
	 * Removes the specified element from this set if it is present. post: x is
	 * removed if it was present
	 * 
	 * @param x
	 *            the element to remove - if present
	 * @return true if the set contained the specified element
	 */

	public boolean remove(Object x) {

		if (maxElement.equals(x)) {

			if (size() == 1) {
				maxElement = null;
				super.remove(x);
			} else {
				super.remove(x);
				Iterator<? extends E> itr = iterator();
				E biggest = itr.next();
				while (itr.hasNext()) {
					E k = itr.next();
					if (biggest.compareTo(k) < 0) {
						biggest = k;
					}
				}
				maxElement = biggest;
			}
			return true;

		} else {
			return super.remove(x);
		}
	}

	/**
	 * Adds all of the elements in the specified set, for which it is possible,
	 * to this set. post: all elements, for which it is possible, in the
	 * specified set are added to this set.
	 * 
	 * @return true if this set changed as a result of the call
	 */
	@Override
	public boolean addAll(SimpleSet<? extends E> c) {
		return super.addAll(c);
	}

}