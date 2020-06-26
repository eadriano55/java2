package aulasjavaavc;

import java.util.ArrayList;
import java.util.List;

//API Collection de java.util: serve para tratar as limitações do Array
//algumabiblioteca.jar
//Interface Raiz da API Collection de Java: Collection
//Interfaces filha de Collection: Set e List
//filhas concretas de Set: HashSet, treeSet
//Filhas concretas de List: ArrayList, LinkedList
//Set: coleção não ordenada e sem duplicidade
//List: coleção ordenada e que permite duplicidade
//Set: {0,0,1,3,1} => #3 => Ordene: N/A
//List: {0,0,1,3,1} => #5 => Ordene: {0,0,1,1,3}

public class TestaLista {
	public static void main(String[] args) {
		List alunos = new ArrayList();
		alunos.add("Marcelo");
		alunos.add("Robert");
		alunos.add("Kamilla");
		System.out.println(alunos.size());
		
	//	for (int i = 0; i < alunos.size(); i++) {
	//		System.out.println();
	//	}
	//Métodos importantes de ArrayList: add, size, get, remove, contains	
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}
	//Busca cega	
		System.out.println(alunos.contains("Clayton"));
	//Remoção
		alunos.remove("Marcelo");
		System.out.println("\n");
		
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("\n");
		
		alunos.removeAll(alunos);
		for (Object aluno : alunos) {
			System.out.println(alunos);
		}
	
	}

}
