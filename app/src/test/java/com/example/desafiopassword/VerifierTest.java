package com.example.desafiopassword;

import com.example.desafiopassword.model.Verifier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VerifierTest {

    private Verifier verifier;
    @Before
    public void setUP() {
        verifier = new Verifier();
    }

    @Test
    public void evaluador(){
        String pass = "aaaAo";
        assertTrue(verifier.evaluaMayuscula(pass));

    }




}//class
