package ThereWasAnOldLady;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ThereWasAnOldLady.ThereWasAnOldLady;

public class ThereWasAnOldLadyTest {

	/**
	 * Declare and initialize two streams to redirect 
	 * the standard output and error streams 
	 */
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
	/**
	 * Set the Standard output and error streams to
	 * send to our private streams instead of the
	 * console before each test runs
	 */
	@Before
	public void setup()
	{
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	/**
	 * Reset the Standard output, error, and input
	 * streams back to their default (Console and
	 * System.in) after each test runs
	 */
	@After
	public void cleanUpStreams()
	{
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}
	
	@Test
	public void testPrintSong() {
		String expectedOutput = "There was an old lady who swallowed a fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a bird.\n" + 
				"How absurd to swallow a bird!\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a cat.\n" + 
				"Imagine that, she swallowed a cat!\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a dog.\n" + 
				"My what a hog, to swallow a dog!\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a goat.\n" + 
				"Just opened her throat and swallowed a goat!\n" + 
				"She swallowed the goat to catch the dog.\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a cow.\n" + 
				"I don't know how she swallowed a cow!\n" + 
				"She swallowed the cow to catch the goat.\n" + 
				"She swallowed the goat to catch the dog.\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a horse.\n" + 
				"She's dead, of course.\n";

		try {
			outContent.flush();
			ThereWasAnOldLady.printSong();
		} catch (Exception e) {
			fail("Caught an Exception");
		}
		
		assertEquals("printSong() output didn't match the expected.", expectedOutput, outContent.toString().replace("\r", ""));

	}

	@Test
	public void testMain() {
		String expectedOutput = "There was an old lady who swallowed a fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a bird.\n" + 
				"How absurd to swallow a bird!\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a cat.\n" + 
				"Imagine that, she swallowed a cat!\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a dog.\n" + 
				"My what a hog, to swallow a dog!\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a goat.\n" + 
				"Just opened her throat and swallowed a goat!\n" + 
				"She swallowed the goat to catch the dog.\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a cow.\n" + 
				"I don't know how she swallowed a cow!\n" + 
				"She swallowed the cow to catch the goat.\n" + 
				"She swallowed the goat to catch the dog.\n" + 
				"She swallowed the dog to catch the cat.\n" + 
				"She swallowed the cat to catch the bird.\n" + 
				"She swallowed the bird to catch the spider,\n" + 
				"that wiggled and wiggled and tickled inside her.\n" + 
				"She swallowed the spider to catch the fly.\n" + 
				"I don't know why she swallowed the fly.\n" + 
				"I guess she'll die.\n" + 
				"\n" + 
				"There was an old lady who swallowed a horse.\n" + 
				"She's dead, of course.\n";

		try {
			outContent.flush();
			ThereWasAnOldLady.main(null);
		} catch (Exception e) {
			fail("Caught an Exception");
		}
		
		assertEquals("main() output didn't match the expected.", expectedOutput, outContent.toString().replace("\r", ""));

	}

}
