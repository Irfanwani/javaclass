import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            FileUtility fileUtility = new FileUtility();
            Client[] clients = fileUtility.readFileData(br);
            sortClientsById(clients);
            fileUtility.writeDataToFile(clients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortClientsById(Client[] clients) {
        //Fill your code here
        Arrays.sort(clients, (c1, c2) -> Integer.compare(c1.getClientId(), c2.getClientId()));
    }
}



class Client {
    private Integer clientId;
    private String name;
    private String email;
    private String phoneNumber;
    private String country;

    // Constructor
    public Client(Integer clientId, String name, String email, String phoneNumber, String country) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    // Getters and Setters
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return clientId + "," + name + "," + email + "," + phoneNumber + "," + country;
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class FileUtility {
    public Client[] readFileData(BufferedReader br) throws IOException {
        //Fill your code here
        String line;
        ArrayList<Client> clients = new ArrayList<>();
        while((line = br.readLine()) != null) {
            String[] d = line.split(",");

            clients.add(new Client(Integer.parseInt(d[0]), d[1], d[2], d[3], d[4]));
        } 
        Client[] clientArray = new Client[clients.size()];
        return clients.toArray(clientArray);
    }

    public void writeDataToFile(Client[] clientArray) throws IOException {
        //Fill your code here
        FileWriter fr = new FileWriter("output.csv");
        for(Client c : clientArray) {
            String content = String.format("%d,%s,%s,%s,%s\n", c.getClientId(), c.getName(), c.getEmail(), c.getPhoneNumber(), c.getCountry());
            fr.write(content);
        }

        fr.close();
    }
}