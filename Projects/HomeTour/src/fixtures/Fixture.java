package fixtures;

public abstract class Fixture {

	//a short name / title for the fixture
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	//a one-sentence-long description of a fixture, used to briefly mention the fixture
	private String shortDescription;
	
	//a paragraph-long description of the thing, displayed when the player investigates the fixture thoroughly (looks at it, or enters a room)
	private String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
}
