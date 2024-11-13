package com.idata.eboks.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestAccess {
    private String requestKey; // Read-only
    private String createdAt; // Read-only
    private String createdBy; // Read-only
    private String status; // Read-only
    private String clientId;
    private String clientName; // Read-only
    private String tenantName; // Read-only
    private String tenantKey; // Read-only

}