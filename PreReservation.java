import java.util.Date;

public abstract class PreReservation {

	private Client client;
    private Chambre chambre;
    
    public abstract void modifierReservation(Date dateDebut, Date dateFin);
}
