package com.lls.comics.rpc;

import com.lls.comics.common.URL;

import java.net.InetSocketAddress;

/************************************
 * Client
 * @author liliangshan
 * @date 2019/1/9
 ************************************/
public interface Client {

    URL getURL();

    boolean connect();

    void close();

    boolean isClosed();

    boolean isConnected();

    InetSocketAddress getLocalAddress();

    InetSocketAddress getRemoteAddress();

    Response send(Request request);

}
