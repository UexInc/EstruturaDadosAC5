package auxs.interfaces;

import auxs.exceptions.BoundaryViolationException;
import auxs.exceptions.InvalidPositionException;

public interface BinaryTree<T> {
	public Position<T> left(Position<T> v) throws InvalidPositionException, BoundaryViolationException;
	public Position<T> right(Position<T> v) throws InvalidPositionException, BoundaryViolationException;
	public boolean hasLeft(Position<T> v) throws InvalidPositionException;
	public boolean hasRight(Position<T> v) throws InvalidPositionException;
}
