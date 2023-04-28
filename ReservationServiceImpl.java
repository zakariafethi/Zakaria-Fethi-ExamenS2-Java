import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    private List<Reservation> reservations = new ArrayList<>();

    @Override
    public void createReservation(Reservation reservation) {
        reservations.add(reservation);
        System.out.println("Réservation créée : " + reservation);
    }
    
    @Override
    public void supprimerReservation(Reservation reservation) {
        if (reservations.contains(reservation)) {
            reservations.remove(reservation);
            System.out.println("Réservation supprimée : " + reservation);
        } else {
            System.out.println("Réservation introuvable : " + reservation);
        }
    }

    public Reservation trouverReservation(String nomClient, int numeroChambre, Date dateDebut, Date dateFin) {
        for (Reservation reservation : reservations) {
            if (reservation.getClient().getNom().equals(nomClient) &&
                reservation.getChambre().getNumeroChambre() == numeroChambre &&
                reservation.getDateDebut().equals(dateDebut) &&
                reservation.getDateFin().equals(dateFin)) {
                return reservation;
            }
        }
        return null;
    }
}
