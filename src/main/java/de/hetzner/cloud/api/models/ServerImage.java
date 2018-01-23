package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerImage {
    
    private int id;
    private String type;
    private String status;
    private String name;
    private String description;
    private double image_size;
    private double disk_size;
    private String created;
    private CreatedFrom created_from;
    private int bound_to;
    private String os_flavor;
    private String os_version;
    private boolean rapid_deploy;
    
}
