package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    
    private int id;
    private String name;
    private String description;
    private String country;
    private String city;
    private long latitude;
    private long longitude;
    
}
