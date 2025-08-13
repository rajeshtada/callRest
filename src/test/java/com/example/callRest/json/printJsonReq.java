package com.example.callRest.json;


public class printJsonReq {

	public static void main(String[] args) {
		
		String transactionId = "515757857";
		String number = "5100010000000049";
		String month = "02";
		String year = "2027";

		String cvc = "123";
		String deReq = "{\n" + "    \"method\": \"upiPay\",\n" + "    \"requestParams\": {\n"
				+ "        \"browserLanguage\": \"en-US\",\n" + "        \"browserColorDepth\": \"24\",\n"
				+ "        \"browserScreenHeight\": \"768\",\n" + "        \"browserScreenWidth\": \"1366\",\n"
				+ "        \"browserTZ\": \"330\",\n" + "        \"javaEnabled\": \"false\",\n"
				+ "        \"jsEnabled\": \"false\",\n" + "        \"ipAddress\": \"183.83.176.69\",\n"
				+ "        \"amt\": \"1000.0\",\n" + "        \"txncurr\": \"INR\",\n"
				+ "        \"paymentMode\": \"UPI\",\n" + "        \"transactionId\": \"515759677\",\n"
				+ "        \"login\": \"887729\",\n" + "        \"number\": null,\n" + "        \"month\": null,\n"
				+ "        \"year\": null,\n" + "        \"cvc\": null,\n" + "        \"name\": null,\n"
				+ "        \"mobile\": null,\n" + "        \"udf3\": \"s@gmail.com\",\n"
				+ "        \"nbbankid\": null,\n" + "        \"nbmobile\": null,\n"
				+ "        \"merchantTxnId\": null,\n" + "        \"neftName\": null,\n"
				+ "        \"neftNumber\": null,\n" + "        \"upiId\": \"6350043232@apl\"\n" + "    }\n" + "}";
		
		System.out.println(deReq);
	}
}
