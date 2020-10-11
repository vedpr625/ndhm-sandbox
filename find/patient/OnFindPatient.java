package in.vedprakash.sandbox.find.patient;

public class OnFindPatient {
private String requestId;
private String timeStamp;
private OnPatient patient;
private Resp resp;
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}
public OnPatient getPatient() {
	return patient;
}
public void setPatient(OnPatient patient) {
	this.patient = patient;
}
public Resp getResp() {
	return resp;
}
public void setResp(Resp resp) {
	this.resp = resp;
} 

}
 class OnPatient {
	private String id;
private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}
  class Resp {
	 private String requestId;

	 public String getRequestId() {
	 	return requestId;
	 }

	 public void setRequestId(String requestId) {
	 	this.requestId = requestId;
	 }

	 }
