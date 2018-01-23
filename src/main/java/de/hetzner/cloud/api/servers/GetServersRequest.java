package de.hetzner.cloud.api.servers;

import de.hetzner.cloud.api.requests.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetServersRequest extends BaseRequest {
    
    private int id;
    
}
