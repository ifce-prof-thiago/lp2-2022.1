package eda.orders;

public record Address(
        String id,
        String street,
        String number,
        String district,
        String city,
        String state,
        String zip
) { }
