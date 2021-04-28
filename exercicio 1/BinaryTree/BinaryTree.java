package BinaryTree;

import  exceptions.BoundaryViolationException;
import  exceptions.InvalidPositionException;
import  Position.Position;

 interface  p�blica BinaryTree <E> extends  Tree < E > {
	public  Position < E >  left ( Position < E >  v ) lan�a  InvalidPositionException , BoundaryViolationException ;
	public  Position < E >  right ( Position < E >  v ) lan�a  InvalidPositionException , BoundaryViolationException ;
	public  boolean  hasLeft ( Position < E >  v ) lan�a  InvalidPositionException ;
	public  boolean  hasRight ( Position < E >  v ) lan�a  InvalidPositionException ;
}