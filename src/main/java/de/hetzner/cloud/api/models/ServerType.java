package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerType {
    
    private int id;
    private String name;
    private String description;
    private int cores;
    private int memory;
    private int disk;
    private List<Price> price;
    private String storage_type;
    
}
