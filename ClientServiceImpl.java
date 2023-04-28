import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void createClient(Client client) {
        clients.add(client);
        System.out.println("Client créé : " + client);
    }


    @Override
    public void supprimerClient(Client client) {
        if (clients.remove(client)) {
            System.out.println("Client supprimé : " + client);
        } else {
            System.out.println("Client introuvable : " + client);
        }
    }

    @Override
    public Client trouverClient(String nomClient) {
        for (Client client : clients) {
            if (client.getNom().equals(nomClient)) {
                return client;
            }
        }
        return null;
    }
}
