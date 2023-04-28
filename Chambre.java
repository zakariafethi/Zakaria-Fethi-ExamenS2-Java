public class Chambre {

	private int numeroChambre;
    private int etage;
    private String vue;
    private String type;
    private double tarif;
    
    public Chambre(int numeroChambre, int etage, String vue, String type, double tarif) {
		super();
		this.numeroChambre = numeroChambre;
		this.etage = etage;
		this.vue = vue;
		this.type = type;
		this.tarif = tarif;
	}

    
    public int getNumeroChambre() {
        return numeroChambre;
    }
    
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    
    public int getEtage() {
        return etage;
    }
    
    public void setEtage(int etage) {
        this.etage = etage;
    }
    
    public String getVue() {
        return vue;
    }
    
    public void setVue(String vue) {
        this.vue = vue;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getTarif() {
        return tarif;
    }
    
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
