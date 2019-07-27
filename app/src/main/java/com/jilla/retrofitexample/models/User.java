package com.jilla.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    Integer id;

    @SerializedName("name")
    String name;

    @SerializedName("username")
    String userName;

    @SerializedName("email")
    String emailID;

    @SerializedName("phone")
    String phone;

    @SerializedName("website")
    String website;

    @SerializedName("address")
    Address address;

    @SerializedName("company")
    Company company;

    @Override
    public String toString(){
        return userName +"--" +emailID + (address == null?"address not found":address.toString());
    }

    public class Address{

        @SerializedName("street")
        String streetName = "";

        @SerializedName("suite")
        String suite = "";

        @SerializedName("city")
        String city = "";

        @SerializedName("zipcode")
        String zipCode = "";

        @SerializedName("geo")
        Coordinates coordinates;

        @Override
        public String toString(){
            return "--" + streetName + "--" + suite + "--" + zipCode + "--" + city + coordinates.toString();
        }

        public class Coordinates{

            @SerializedName("lat")
            Double latitude = 0.0;

            @SerializedName("lng")
            Double longitude = 0.0;

            @Override
            public String toString(){
                return "--" + latitude + "--" + longitude;
            }
        }
    }

    public class Company{

        @SerializedName("name")
        String name = "";

        @SerializedName("catchPhrase")
        String catchPhrase = "";

        @SerializedName("bs")
        String usp = "";

        @Override
        public String toString(){
            return "--" + name + "--" + catchPhrase + "--" + usp;
        }
    }
}
