public class Client {

	private String nom;
    private String genre;
    private int age;
    private String nationalite;
    private String adresse;
    private String mail;
    private String telephone;
    
    public Client(String nom, String genre, int age, String nationalite, String adresse, String mail,
			String telephone) {
		this.nom = nom;
		this.genre = genre;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
	}
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getNationalite() {
        return nationalite;
    }
    
    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
