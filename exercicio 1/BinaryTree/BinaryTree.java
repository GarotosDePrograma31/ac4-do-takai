package BinaryTree;

import  exceptions.BoundaryViolationException;
import  exceptions.InvalidPositionException;
import  Position.Position;

 interface  pública BinaryTree <E> extends  Tree < E > {
	public  Position < E >  left ( Position < E >  v ) lança  InvalidPositionException , BoundaryViolationException ;
	public  Position < E >  right ( Position < E >  v ) lança  InvalidPositionException , BoundaryViolationException ;
	public  boolean  hasLeft ( Position < E >  v ) lança  InvalidPositionException ;
	public  boolean  hasRight ( Position < E >  v ) lança  InvalidPositionException ;
}