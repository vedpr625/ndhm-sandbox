
package in.vedprakash.sandbox.consents.hip.notify;

import java.util.List;

public class ConsentDetail {

    private String schemaVersion;
    private String consentId;
    private String createdAt;
    private Patient patient;
    private List<CareContext> careContexts = null;
    private Purpose purpose;
    private Hip hip;
    private ConsentManager consentManager;
    private List<String> hiTypes = null;
    private Permission permission;

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<CareContext> getCareContexts() {
        return careContexts;
    }

    public void setCareContexts(List<CareContext> careContexts) {
        this.careContexts = careContexts;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Hip getHip() {
        return hip;
    }

    public void setHip(Hip hip) {
        this.hip = hip;
    }

    public ConsentManager getConsentManager() {
        return consentManager;
    }

    public void setConsentManager(ConsentManager consentManager) {
        this.consentManager = consentManager;
    }

    public List<String> getHiTypes() {
        return hiTypes;
    }

    public void setHiTypes(List<String> hiTypes) {
        this.hiTypes = hiTypes;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

}
