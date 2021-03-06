package address;

import Main.VaccinatedP;

public class domaine {
 private String domaineName;
 
//Default Constructor
 public domaine() 
 {super();}
 
//Copy Constructor
 public domaine( domaine Domaine)
 {
   super();
   domaineName = Domaine.domaineName;
 }

//Retrieves the variables
public String getDomaineName() {
	return domaineName;
}

//Sets the variables
public void setDomaineName(String domaineName) {
	this.domaineName = domaineName;
}

//Equals Method
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return true;
		else if (getClass() != obj.getClass())
			return false;
		else {
			domaine  other = (domaine) obj;
			return (domaineName == (other.domaineName));
		}
	}

//ToString method
	@Override
	public String toString() {
		return "The domaine name is" + getDomaineName() + ".";
	}
 
}
