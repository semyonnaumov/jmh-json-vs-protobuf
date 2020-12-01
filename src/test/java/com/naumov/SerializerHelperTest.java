package com.naumov;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializerHelperTest {
    byte[] protobufMsg;
    String jsonMsg;

    @Before
    public void prepare() throws JsonProcessingException {
        protobufMsg = SerializerHelper.serializeProtobuf(DataProvider.getPersonProto());
        jsonMsg = SerializerHelper.serializeJson(DataProvider.getPersonJson());
    }

    @Test
    public void testDeserializeJson() throws JsonProcessingException {
        String ref = "Person{name='Name', id=1, email='name@host.com', phones=[PhoneNumber{number='1234567890', type=MOBILE}]}";
        assertEquals(SerializerHelper.deserializeJson(jsonMsg).toString(), ref);
    }

    @Test
    public void testDeserializeProtobuf() throws InvalidProtocolBufferException {
        String ref = "name: \"Name\"\n" +
                "id: 1\n" +
                "email: \"name@host.com\"\n" +
                "phones {\n" +
                "  number: \"1234567890\"\n" +
                "  type: MOBILE\n" +
                "}\n";
        assertEquals(SerializerHelper.deserializeProtobuf(protobufMsg).toString(), ref);
    }

}