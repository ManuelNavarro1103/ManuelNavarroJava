package fixtures;

public abstract class Fixture {

	//a short name / title for the fixture
	public String name;
	
	//a one-sentence-long description of a fixture, used to briefly mention the fixture
	public String shortDescription;
	
	//a paragraph-long description of the thing, displayed when the player investigates the fixture thoroughly (looks at it, or enters a room)
	public String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		
	}
	
}
