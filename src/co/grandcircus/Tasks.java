package co.grandcircus;

public class Tasks {

	private String name;
	private String description;
	private String date;
	private boolean finished;

	public Tasks() {
		return;
	}

	public Tasks(String strName, String strDescription, String strDate, boolean userFinished) {
		name = strName;
		description = strDescription;
		date = strDate;
		finished = userFinished;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

//	public boolean getFinished() {
//		return finished;
//	}
//
//	public void setFinished(boolean userFinished) {
//		finished = userFinished;
//	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	
	@Override
	public String toString()
	{
		return ("Name: " + name + "\n" +
				"Description: " + description + "\n" +
				"Date: " + date + "\n" +
				"Task Complete: " + finished + "\n");
	}


}