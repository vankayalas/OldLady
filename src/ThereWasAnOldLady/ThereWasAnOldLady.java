package ThereWasAnOldLady;

public class ThereWasAnOldLady {

	public static void main(String[] args)
	{
		printSong();
	}

	public static void printSong() {
		// TODO: Insert your code here 
		//define different methods of repeated lines
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		verse7();
		verse8();
	}
	public static void why() {
			//Error with the word 'why' and i dont know what the problem is
		System.out.println("I don't know why she swallowed the fly." );
		System.out.println("I guess she'll die.\n");
	}
	public static void wiggles() {
		System.out.println("that wiggled and wiggled and tickled inside her.");
		System.out.println("She swallowed the spider to catch the fly.");
	}
	public static void reasonbird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void reasoncat() {
		System.out.println("She swallowed the cat to catch the bird.");
					
	}
	public static void reasondog() {
		System.out.println("She swallowed the dog to catch the cat.");
	}
	public static void reasongoat() {
		System.out.println("She swallowed the goat to catch the dog.");
	}
	public static void verse1() {
			//print the first verse
		System.out.println("There was an old lady who swallowed a fly.");
		why();
		//Theres an error 
	}
	public static void verse2() {
		System.out.println("There was an old lady who swallowed a spider," );
		wiggles();
		why();
	}
	public static void verse3() {
		System.out.println("There was an old lady who swallowed a bird sravya." );
		System.out.println("How absurd to swallow a bird!" );
		reasonbird();
		wiggles();
		why();
	}
	public static void verse4() {
		System.out.println("There was an old lady who swallowed a cat.");
		System.out.println("Imagine that, she swallowed a cat!");
		reasoncat();
		reasonbird();
		wiggles();
		why();
	}
	public static void verse5() {
		System.out.println("There was an old lady who swallowed a dog.");
		System.out.println("My what a hog, to swallow a dog!");
		reasondog();
		reasoncat();
		reasonbird();
		wiggles();
		why();
	}
	public static void verse6() {
		System.out.println("There was an old lady who swallowed a goat.");
		System.out.println("Just opened her throat and swallowed a goat!");
		reasongoat();
		reasondog();
		reasoncat();
		reasonbird();
		wiggles();
		why();
		
	}
	public static void verse7() {
		System.out.println("There was an old lady who swallowed a cow.");
		System.out.println("I don't know how she swallowed a cow!");
		System.out.println("She swallowed the cow to catch the goat.");
		reasongoat();
		reasondog();
		reasoncat();
		reasonbird();
		wiggles();
		why();
	}
	public static void verse8() {
		System.out.println("There was an old lady who swallowed a horse.");
		System.out.println("She's dead, of course.");
	}
}
