package be.project.mylibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;
import java.util.StringTokenizer;


/**
 * Repr�sente la biblioth�que
 * D�finie par son nom, la liste des membres et la liste des livres.
 *  
 * @author C. Ruth
 * @version 0.1
 * @see Book
 * @see Person
 */
public class MyLibrary {
	/**
	 * Nom de la biblioth�que
	 */
	private String name;
	
	/**
	 * Liste des livres
	 */
	private ArrayList<Book> books;
	
	/**
	 * Liste des membres
	 */
	private ArrayList<Person> people;
	
	/**
	 * Cr�e une biblioth�que en sp�cifiant son nom
	 * 
	 * @param name Nom de la biblioth�que
	 */
	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.people = new ArrayList<Person>();
	}

	/**
	 * Renvoie le nom de la biblioth�que
	 * 
	 * @return Le nom de la biblioth�que
	 */
	public String getName() {
		return name;
	}

	/**
	 * Modifie le nom de la biblioth�que
	 * 
	 * @param name Nouveau nom de la biblioth�que
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Renvoie la liste des livres
	 * 
	 * @return la liste des livres
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * Renvoie la liste des membres
	 * 
	 * @return la liste des membres
	 */
	public ArrayList<Person> getPeople() {
		return people;
	}

	@Override
	public String toString() {
		final int maxLen = 3;
		return "MyLibrary " + name + ": books="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ", people="
				+ (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}
	
	public int printBooks() {
		int cpt = 0;

		Iterator<Book> it = this.getBooks().iterator();
		
		while(it.hasNext()) {
			Book b = it.next();
								
			System.out.println(++cpt + ": " 
					+b.getTitle() + " - "
					+b.getAuthor());
		}
		return cpt;
	}
	
	public int printMembers() {
		int cpt = 0;

		Iterator<Person> itp = this.getPeople().iterator();
		
		while(itp.hasNext()) {
			Person p = itp.next();
			
			System.out.println(++cpt + ": " + p.getName());
		}
		return cpt;
	}
	
	public int loadMembers(String filename) {
		int cpt = 0;
		
		File f = new File(filename);
		
		if(f.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			String[] data = null;
			
			try {
				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);

					//Convertir en objet Person
					//StringTokenizer st = new StringTokenizer(ligne, ";");
					String ligne = br.readLine();
					
					//Lire une ligne du fichier					
					while ((ligne = br.readLine()) != null) {
						//"a7aa0ae7-9ce3-44bc-a72a-894edb9a4653;Bob Smith;2;01-03-20"
						data = ligne.split(";");
						Person p = new Person(UUID.fromString(data[0]), data[1]);
						
						//ajouter cette Person dans people
						this.people.add(p);
						cpt++;
					}
				} finally {
					br.close();
				}
			} catch (IOException e) {
				
			}
			
			System.out.println(people);
		} 
		
		return cpt;
	}
	
}



