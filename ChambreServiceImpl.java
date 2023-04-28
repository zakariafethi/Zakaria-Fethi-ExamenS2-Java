import java.util.ArrayList;
import java.util.List;

public class ChambreServiceImpl implements ChambreService {
    private List<Chambre> chambres = new ArrayList<>();

    @Override
    public void createChambre(Chambre chambre) {
        chambres.add(chambre);
        System.out.println("Chambre créée : " + chambre);
    }


    @Override
    public void supprimerChambre(Chambre chambre) {
        if (chambres.remove(chambre)) {
            System.out.println("Chambre supprimée : " + chambre);
        } else {
            System.out.println("Chambre introuvable : " + chambre);
        }
    }

    @Override
    public Chambre trouverChambre(int numeroChambre) {
        for (Chambre chambre : chambres) {
            if (chambre.getNumeroChambre() == numeroChambre) {
                return chambre;
            }
        }
        return null;
    }
}
