public interface ClientService {
    void createClient(Client client);
    void supprimerClient(Client client);
    Client trouverClient(String nomClient);
}
