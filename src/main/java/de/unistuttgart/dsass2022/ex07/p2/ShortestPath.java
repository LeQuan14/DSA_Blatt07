package de.unistuttgart.dsass2022.ex07.p2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


import java.util.LinkedList;
import java.util.PriorityQueue;



public class ShortestPath implements IShortestPath {

	private final IWeightedGraph graph;
	private final long startNode;

	/*
	 * syntactic sugar function to conveniently create shortest path objects from
	 * graphs
	 */
	public static ShortestPath calculateFor(IWeightedGraph g, long startNode) {
		return new ShortestPath(g, startNode);
	}

	/**
	 * Initializes the shortest path for weighted graph <tt>graph</tt> from starting
	 * node <tt>startNode</tt>. Calls the dijkstra(graph, startNode) method to
	 * execute the Dijkstra algorithm.
	 * 
	 * @param graph     the weighted graph
	 * @param startNode the starting node
	 */
	public ShortestPath(IWeightedGraph graph, long startNode) {
		this.graph = graph;
		this.startNode = startNode;
		dijkstra(this.graph, this.startNode);
	}

}
