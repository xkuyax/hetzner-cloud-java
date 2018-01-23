package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerIso {
    
    private int id;
    private String name;
    private String description;
    private String type;
    
}
