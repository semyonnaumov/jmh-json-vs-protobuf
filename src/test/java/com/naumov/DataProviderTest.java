package com.naumov;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataProviderTest {

    @Test
    public void getPersonProto() {
        String ref = "name: \"Name\"\n" +
                "id: 1\n" +
                "email: \"name@host.com\"\n" +
                "phones {\n" +
                "  number: \"1234567890\"\n" +
                "  type: MOBILE\n" +
                "}\n";
        assertEquals(DataProvider.getPersonProto().toString(), ref);
    }

    @Test
    public void getPersonJson() throws JsonProcessingException {
        String ref = "Person{name='Name', id=1, email='name@host.com', phones=[PhoneNumber{number='1234567890', type=MOBILE}]}";
        assertEquals(DataProvider.getPersonJson().toString(), ref);
    }
}