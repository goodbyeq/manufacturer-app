/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beatus.app.manufacturer.utils;

import javax.ws.rs.client.Client;

public interface HttpClientFactory {

    public Client createClient();
}


