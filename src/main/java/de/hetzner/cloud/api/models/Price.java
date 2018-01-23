package de.hetzner.cloud.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    
    private String location;
    private SinglePrice price_hourly;
    private SinglePrice price_monthly;
    
}
