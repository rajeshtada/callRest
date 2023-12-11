package com.example.callRest;

public class MerchantSettlementSetting {

	public static void main(String[] args) {
		
		String processor = "ICICI";
		int input = 4;
		String merchantSS = "";

		Integer[] c1 = { 1 };
		Integer[] c12 = { 1, 2 }; // part1 + Part2
		Integer[] c2 = { 2 };
		Integer[] c14 = { 1, 4 };
		Integer[] c1234 = { 1, 2, 3, 4 };
		Integer[] c12345 = { 1, 2, 3, 4, 5 };
		Integer[] c123456 = { 1, 2, 3, 4, 5, 6 };
		Integer[] c139 = { 1, 3,9 };
		Integer[] merchantCycle = c139;

		if (processor.equalsIgnoreCase("AUBANK")) {
			if (merchantSS == null || merchantSS.equalsIgnoreCase("Both")) {
				merchantCycle = c12;
			} else if (merchantSS.equalsIgnoreCase("Part1")) {
				merchantCycle = c1;
			} else if (merchantSS.equalsIgnoreCase("Part2")) {
				merchantCycle = c2;
			} else {
				merchantCycle = c12;
			}
		} else if (processor.equalsIgnoreCase("ICICI")) {
			if (merchantSS == null || merchantSS.equalsIgnoreCase("")) {
				merchantCycle = c14;
			} else if (merchantSS.equalsIgnoreCase("Part1")) {
				merchantCycle = c1;
			} else if (merchantSS.equalsIgnoreCase("ALL")) {
				merchantCycle = c1234;
			} else if (merchantSS.equalsIgnoreCase("5C")) {
				merchantCycle = c12345;
			} else if (merchantSS.equalsIgnoreCase("6C")) {
				merchantCycle = c123456;
			} else {
				merchantCycle = c14;
			}
		} else {
			merchantCycle = c14;
		}

		String result = "TRUE_NEXTDATE_Part" + merchantCycle[0];
		for (Integer part : merchantCycle) {
			if (part == input) {
				result = "FALSE_SAMEDATE_Part" + part;
				break;
			} else if (part > input) {
				result = "TRUE_SAMEDATE_Part" + part;
				break;
			} else if (part < input) {
				continue;
			}
		}

		System.out.println(result);

	}
}
