
package in.vedprakash.sandbox.carecontexts.discover;

import java.util.List;

public class Patient {

    private String id;
    private List<VerifiedIdentifier> verifiedIdentifiers = null;
    private List<UnverifiedIdentifier> unverifiedIdentifiers = null;
    private String name;
    private String gender;
    private Integer yearOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<VerifiedIdentifier> getVerifiedIdentifiers() {
        return verifiedIdentifiers;
    }

    public void setVerifiedIdentifiers(List<VerifiedIdentifier> verifiedIdentifiers) {
        this.verifiedIdentifiers = verifiedIdentifiers;
    }

    public List<UnverifiedIdentifier> getUnverifiedIdentifiers() {
        return unverifiedIdentifiers;
    }

    public void setUnverifiedIdentifiers(List<UnverifiedIdentifier> unverifiedIdentifiers) {
        this.unverifiedIdentifiers = unverifiedIdentifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
