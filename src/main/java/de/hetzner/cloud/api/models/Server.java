package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    
    private int id;
    private String name;
    private ServerStatus status;
    private String created;
    private PublicNet public_net;
    private ServerType server_type;
    private DataCenter datacenter;
    private ServerImage image;
    private ServerIso iso;
    private boolean rescue_enabled;
    private boolean locked;
    private String backup_window;
    private long outgoing_traffic;
    private long ingoing_traffic;
    private long included_traffic;
    
}
