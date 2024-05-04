import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventBO eventBO = new EventBO();  // Create an instance of EventBO

        try {
            // Read event details from the input file
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            List<Event> eventList = eventBO.readFromFile(br);
            br.close();

            // Write unique event details to the output file
            FileWriter fw = new FileWriter("output.txt");
            eventBO.writeFile(eventList, fw);  // Write to output.txt after removing duplicates
            fw.close();  // Ensure file is closed

            System.out.println("Events have been written to output.txt with unique owners.");

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}

public class Event {
    private String eventName;
    private Integer attendeesCount;
    private String ownerName;

    public Event() {
        // Default constructor
    }

    public Event(String eventName, Integer attendeesCount, String ownerName) {
        this.eventName = eventName;
        this.attendeesCount = attendeesCount;
        this.ownerName = ownerName;
    }

    // Getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(Integer attendeesCount) {
        this.attendeesCount = attendeesCount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedWriter;
import java.io.FileWriter;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventBO {
    // Reads events from a file and returns a list of Event objects
    public List<Event> readFromFile(BufferedReader br) throws IOException {
        List<Event> eventList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {  // Ensure correct format
                String eventName = parts[0].trim();
                Integer attendeesCount = Integer.parseInt(parts[1].trim());
                String ownerName = parts[2].trim();

                Event event = new Event(eventName, attendeesCount, ownerName);
                eventList.add(event);
            }
        }

        return eventList;
    }

    // Writes unique events to a file, ensuring no duplicate owner names
    public void writeFile(List<Event> eventList, FileWriter fw) throws IOException {
        Set<String> owners = new HashSet<>();  // Set to track unique owners

        for (Event event : eventList) {
            if (!owners.contains(event.getOwnerName())) {  // Only write unique owner names
                fw.write(String.format("%s,%d,%s\n", event.getEventName(), event.getAttendeesCount(), event.getOwnerName()));
                owners.add(event.getOwnerName());
            }
        }

        fw.flush();  // Ensure data is written to the file
    }
}