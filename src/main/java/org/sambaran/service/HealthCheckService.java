package org.sambaran.service;

import javax.ejb.Stateless;

@Stateless
public class HealthCheckService {
    public String checkStatus() {
        return "Success";
    }
}
