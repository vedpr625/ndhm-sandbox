package in.vedprakash.sandbox.find.patient;

public class FindPatient {
private String requestId;
private String timestamp;


public FindPatient(String requestId, String timestamp) {
	this.requestId = requestId;
	this.timestamp = timestamp;
}
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getTimestamp() {
	return timestamp;
}
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}


}
class Patient{
	
	
	private String id;

	
	public Patient(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
class Query{
	private Patient patient;

	public Query(Patient patient) {
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
class Requester{
	private String type;
	private String id;
	public Requester(String type, String id) {
		this.type = type;
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}