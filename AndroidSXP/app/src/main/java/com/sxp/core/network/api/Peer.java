package com.sxp.core.network.api;

import com.sxp.core.network.api.service.Service;

import java.io.IOException;
import java.util.Collection;

/**
 * Interface for the whole peer
 * @author Julien Prudhomme
 **/

public interface Peer {
    /**
     * Starts the peer
     * @param cache cache folder
     * @param port listening port
     * @throws IOException
     */
    public void start(String cache, int port, String ...ips) throws IOException;

    /**
     * Add a service to this Peer
     * @param service
     */
    public void addService(Service service);

    /**
     * Return a string representation of the peer id (uri)
     * @return
     */
    public String getUri();

    public void bootstrap(String ...ips);

    /**
     * Stop the server
     */
    public void stop();

    /**
     * Should return this Peer public IP address
     * @return a String that represent an IP address
     */
    public String getIp();

    /**
     * Get a collection of all services supported by this peer
     * @return
     */
    public Collection<Service> getServices();

    /**
     * Get a service by its name
     * @param name The service's name
     * @return The Service
     */
    public Service getService(String name);
}
