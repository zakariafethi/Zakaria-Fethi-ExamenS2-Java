import java.util.Date;

public interface ReservationService {
    void createReservation(Reservation reservation);
    void supprimerReservation(Reservation reservation);
    public Reservation trouverReservation(String nomClient, int numeroChambre, Date dateDebut, Date dateFin);
}
