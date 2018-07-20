package com.drogenidesoftwares.infra.Admin.controller;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;

public class IdTokenVerifierAndParser {
    private static final String GOOGLE_CLIENT_ID = "579470552693-1mundnbs21jom23kopq2gcs3mightu8f.apps.googleusercontent.com";

    public static void demo()
    {
    	System.out.println("Hello");
    }
    public static GoogleIdToken.Payload getPayload (String tokenString) throws Exception {

        JacksonFactory jacksonFactory = new JacksonFactory();
        GoogleIdTokenVerifier googleIdTokenVerifier =
                            new GoogleIdTokenVerifier(new NetHttpTransport(), jacksonFactory);

        GoogleIdToken token = GoogleIdToken.parse(jacksonFactory, tokenString);

        //if (googleIdTokenVerifier.verify(token)) {
            GoogleIdToken.Payload payload = token.getPayload();
            /*if (!GOOGLE_CLIENT_ID.equals(payload.getAudience())) {
                throw new IllegalArgumentException("Audience mismatch");
            } else if (!GOOGLE_CLIENT_ID.equals(payload.getAuthorizedParty())) {
                throw new IllegalArgumentException("Client ID mismatch");
            }*/
            return payload;
        //} else {
        //    throw new IllegalArgumentException("id token cannot be verified");
       // }
    }
}