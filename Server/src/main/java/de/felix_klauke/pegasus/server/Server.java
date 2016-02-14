/*
 * Copyright 2016 Felix Klauke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.felix_klauke.pegasus.server;

import de.felix_klauke.pegasus.server.network.NettyServer;

import java.util.logging.Logger;

/**
 * Created by Felix Klauke for project Pegasus on 05.02.2016.
 */
public class Server {

    //27816
    private Logger logger;
    private NettyServer nettyServer;

    public Server() {
        logger = Logger.getLogger(Server.class.getSimpleName());

        nettyServer = new NettyServer(logger);
    }

    public static void main( String[] args ) {
        new Server().start();
    }

    public void start() {
        nettyServer.start();
    }

}
