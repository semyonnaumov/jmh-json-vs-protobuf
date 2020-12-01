package com.naumov;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;

public final class SerializerHelper {
    private static ObjectMapper OM = new ObjectMapper();

    private SerializerHelper() {
    }

    public static String serializeJson(com.naumov.json.Person person) throws JsonProcessingException {
        return OM.writeValueAsString(person);
    }

    public static byte[] serializeProtobuf(com.naumov.proto.PersonProtos.Person person) {
        return person.toByteArray();
    }

    public static com.naumov.json.Person deserializeJson(String jsonString) throws JsonProcessingException {
        return OM.readValue(jsonString, com.naumov.json.Person.class);
    }

    public static com.naumov.proto.PersonProtos.Person deserializeProtobuf(byte[] protobuf) throws InvalidProtocolBufferException {
        return com.naumov.proto.PersonProtos.Person.parseFrom(protobuf);
    }
}
