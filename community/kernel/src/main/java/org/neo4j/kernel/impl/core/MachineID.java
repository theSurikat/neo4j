package org.neo4j.kernel.impl.core;

import java.io.File;
import java.net.*;

/**
 * Created by granteverett on 4/11/17.
 */
public final class MachineID {

    //private static String[] ips = new String[] {"127.0.0.1"};

    private static InetSocketAddress[] connections = new InetSocketAddress[] {
            new InetSocketAddress("127.0.0.1", 10)
    };

    //private static int[] ports = new int[] {10};

    //public static InetSocketAddress lookup(int machineId) throws Exception {
    //    return new InetSocketAddress(ips[machineId], ports[machineId]);
    //}

    public static InetSocketAddress lookup(int machineId) throws Exception {
        return connections[machineId];
    }
}
