package com.example.callRest;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Base64DecodeExample {
    public static void main1(String[] args) {
        String encodedString = "PHByb2R1Y3RzPjxwcm9kdWN0Pjxjb2RlPkFDQzU8L2NvZGU+PG5hbWU+RGlnaXRhbCBGZWU8L25hbWU+PGFtb3VudD4yMjAwLjA8L2Ftb3VudD48L3Byb2R1Y3Q+PHByb2R1Y3Q+PGNvZGU+QUNDNjwvY29kZT48bmFtZT5NaXNjZWxsYW5lb3VzIEFjdGl2aXR5PC9uYW1lPjxhbW91bnQ+MTAwMC4wPC9hbW91bnQ+PC9wcm9kdWN0Pjxwcm9kdWN0Pjxjb2RlPkFDQzg8L2NvZGU+PG5hbWU+UHJpbWFyeSBUZXJtIDEgRmVlLCBQcmltYXJ5IFRlcm0gMiBGZWU8L25hbWU+PGFtb3VudD40ODAwLjA8L2Ftb3VudD48L3Byb2R1Y3Q+PHByb2R1Y3Q+PGNvZGU+QUNDMjwvY29kZT48bmFtZT5QcmltYXJ5IFR1aXRpb24gRmVlIEp1biAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIEp1bCAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIEF1ZyAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIFNlcCAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIE9jdCAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIE5vdiAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIERlYyAyMDI2LCBQcmltYXJ5IFR1aXRpb24gRmVlIEphbiAyMDI3LCBQcmltYXJ5IFR1aXRpb24gRmVlIEZlYiAyMDI3LCBQcmltYXJ5IFR1aXRpb24gRmVlIE1hciAyMDI3LCBQcmltYXJ5IFR1aXRpb24gRmVlIEFwciAyMDI3LCBQcmltYXJ5IFR1aXRpb24gRmVlIE1heSAyMDI3PC9uYW1lPjxhbW91bnQ+Mjg4MDAuMDwvYW1vdW50PjwvcHJvZHVjdD48L3Byb2R1Y3RzPg=="; // "Hello World!" in Base64

        // 1. Decode Base64 string to a byte array
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

        // 2. Convert the byte array back to a String using UTF-8 charset
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

        System.out.println(decodedString); // Output: Hello World!
    }
    
    public static void main(String[] args) {
		
    	String s = "";
    	System.out.println("length : " + s.length());
	}
    
}