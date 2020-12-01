package com.naumov;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.naumov.json.Person;
import com.naumov.proto.PersonProtos;

import java.util.Collections;

public final class DataProvider {

    public static PersonProtos.Person getPersonProto() {
        PersonProtos.Person.Builder personBuilder = PersonProtos.Person.newBuilder();

        personBuilder.setName("Name");
        personBuilder.setId(1);
        personBuilder.setEmail("name@host.com");

        PersonProtos.Person.PhoneNumber.Builder phoneNumberBuilder = PersonProtos.Person.PhoneNumber.newBuilder();
        phoneNumberBuilder.setNumber("1234567890");
        phoneNumberBuilder.setType(PersonProtos.Person.PhoneType.MOBILE);

        personBuilder.addPhones(phoneNumberBuilder);

        return personBuilder.build();
    }

    public static Person getPersonJson() throws JsonProcessingException {
        com.naumov.json.Person person = new com.naumov.json.Person();
        person.setName("Name");
        person.setId(1);
        person.setEmail("name@host.com");

        com.naumov.json.Person.PhoneNumber phoneNumber1 = new com.naumov.json.Person.PhoneNumber("1234567890",
                com.naumov.json.Person.PhoneType.MOBILE);

        person.setPhones(Collections.singletonList(phoneNumber1));

        return person;
    }

}
