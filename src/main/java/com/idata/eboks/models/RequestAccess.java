package com.idata.eboks.models;
//

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestAccess {
    private String request_key; // Read-only
    private String created_at; // Read-only
    private String created_by; // Read-only
    private String status; // Read-only
    private String client_id;
    private String client_name; // Read-only
    private String tenant_name; // Read-only
    private TenantKey tenantKey; // Read-only
    private String vatNumber;

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }
}
