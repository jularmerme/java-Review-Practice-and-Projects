package main;

public class Main {
    public static void main(String[] args) {

        AuthenticationHandler chain = new BasicAuthenticationHandler(new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(null)));

        chain.handleRequest("basic");
        chain.handleRequest("digest");
        chain.handleRequest("client certificate");

    }
}