package com.example.callRest;

import java.util.ArrayList;
import java.util.List;

public class LongTest {

	public static void main(String[] args) {
		
//		Long l = Long.valueOf(null);
//		Long valueOf = Long.valueOf(0L);
//		System.out.println("null long = "+valueOf);
		
		
//		StringTest st = new StringTest();
//		st.main(args);
		
		
		
		List<Long> listRefundId = new ArrayList<>();
		listRefundId.add(1L);
		listRefundId.add(2L);
		listRefundId.add(4L);
		String ids = "";
		for (Long refundId : listRefundId) {
			if(!ids.equals("")) {
				ids = ids + ",";
			}
			ids = ids + String.valueOf(refundId);
		}
		System.out.println(ids);
		System.out.println(listRefundId.size());
		
	}
}
