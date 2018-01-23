package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicNet {
    
    private Ipv4Net ipv4;
    private Ipv4Net ipv6;
    
}
