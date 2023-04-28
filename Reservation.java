import java.util.Date;

public class Reservation extends PreReservation{

	private double identifiant; 
	private Client client;
    private Chambre chambre;
    private Date dateDebut;
    private Date dateFin;
    
	public Reservation(int identifiant, Client client, Chambre chambre, Date dateDebut, Date dateFin) {
		this.identifiant = identifiant;
		this.client = client;
		this.chambre = chambre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Reservation(Client client, Chambre chambre, Date dateDebut, Date dateFin) {
		this.identifiant = Math.random();
		this.client = client;
		this.chambre = chambre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
    
	public Reservation(Client client, Chambre chambre) {
		this.client = client;
		this.chambre = chambre;
	}
    
	@Override
	public void modifierReservation(Date dateDebut, Date dateFin) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public Chambre getChambre() {
        return chambre;
    }
    
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
    
    public Date getDateDebut() {
        return dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    
    public Date getDateFin() {
        return dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }


}
