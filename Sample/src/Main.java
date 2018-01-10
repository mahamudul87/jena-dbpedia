import dbpedia.jena.graph.Graph;
import dbpedia.jena.graph.Node;
import dbpedia.jena.graph.Relation;


public class Main {
public static void main(String[] args){
	Graph graph=new Graph();
	Node nodea=new Node("re1","<http://dbpedia.org/ontology/Organisation> ");
	Node nodeb=new Node("re2","<http://dbpedia.org/ontology/Company>");
	Relation r1=new Relation("r1","owl:sameAs");
	graph.addNode(nodea);
	graph.addNode(nodeb);
	graph.addRelation(r1);
	graph.prepareSimpleGraph();		
	int directa=graph.getDegree("re1", "re2", "r1");
	int directb=graph.getDegree("re2", "re1", "r1");
	System.out.println("Direct from re1 to re2: "+directa);
	System.out.println("Direct from re2 to re1: "+directb);
}
}
