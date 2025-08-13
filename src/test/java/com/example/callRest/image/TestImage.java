package com.example.callRest.image;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.io.* ;

public class TestImage {

	
	
	public static void main(String[] args) throws Exception {
		
		String filePath = "/media/shared/file_1747379929727_may2025.png"; 
		
			File file = new File(filePath);
	       byte[] fileContent = Files.readAllBytes(file.toPath());
	        String encodeToString = Base64.getEncoder().encodeToString(fileContent);
	        System.out.println(encodeToString);
	        
//	        String testFileBase64 = "iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAD8klEQVR4nO1aTWgVVxSe0tZGpZJC6t9CRXdC20Wpisbc+57RRoi+IMw5Lz8Q3ARciKIbF64FW8EWBe2u6kJw4UJNq2jeOS8/kpZsCqH5saua/qBRXBSijSZyZt4j0cwkM/Pum3lIDhx48Gbuvd853z33nHPHshblHZXanpZPFEGTZvhWEXYqxmFN8FQRvhCV35phSP6TZ3QOM4oy1VYlSMNPDR/pPLQqgjuK8aVmnA6j7jvwc4qxRcay4pZt9+2lmvGYIvgr7OLnATWmCI4qaq+KBUQd417F8IcpAB76QOfg67IBENcrgu/LCOAthcvieaMg0veyqxTjQHwg0FXCX3f3ta00AkIRbnDcHTcILoKBUVlDSSBqu+1PnTCaFAh2VfakInt1RE+0VyVCJ/anWaQQrRkvJL54flvhXOgQm/yi0VNTedwTJsyOJL1g7a8PAh2acmJXwGKnF9AjQbxhLO0IrjCRzttbdA52BHz+4bwbXxLAZCwMx2X+dHf286DvKLKbfYFIFhs3CEXQZ1+z31ekPlCEvwR/Dzv964kIqXhJIBj+S3XhpoIRT4Z8f7Khv3WFlzea4vcGHpK5U13whVN8cej3Gz2A4JmYgdy1pq337EF7iSL4LdoY8I0XkM74KIXP6nvsdU6AYTwVeSzCG3MjFsFofJSCg86cuexW4XoJBhme6xHG8QiDXdWMV6JY0S2XYag0o8BjL2qF3mzFqKEIT2jCqQAWHN+Zb11ToNRZAxR9bgSIeOTLgY4PncjD2LFQ+FYEWZdStlIEr8oF5EmkwQg7Gwcal82EcJjwphRcl2d232lbbqziJHzkdY6UkvH2FJtt0gGRg+5Ny8G/ipprCga7aAQEi8KQ8fCrGAbre7NrZaw6hq9mB48U44GCseqD7CVdUviVNqbBRkEd259pgr8V4Y8uiEy1ZK3mvIFC69NzgeQwY2RwxrF0t71ZxtzV07KxSDlFeMkkCO2fomSqTSWNQiupL0wbSb/p/f89k0YHDONto5ltHvfIJteM/xj3BsMty0+kK252MnwepsbQoWjlnkn+pS7jWDkmNqvwULJmXyDuXoGjyS8UF/LG4XlBzPJK4m1S7acEo4E7jnI6VyYInJJDNRCIWRQ7X4GU+i4UiCLFpHFcMSAY+hfc4P5eaa6plGuF9L3sqkggZsDghjjLYD2XTiOprpb1lgmR668kaKYY+uWyySrLZajJNHx+T/xQ1rt3yZ/KSTXFOBw6xEYVJ6IxHjFaXxD8KSd2Il9AuHSzmwvVZZT+1KRksZIARg6tpkVqgzqGfdLG1Aw3nQ9oGMeLH9U4pS/B71KeSmUnRdH23v0fG1/IoliVIa8BrNIxjCdlGcQAAAAASUVORK5CYII=";
	        String testFileBase64 = "iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAD8klEQVR4nO1aTWgVVxSe0tZGpZJC6t9CRXdC20Wpisbc+57RRoi+IMw5Lz8Q3ARciKIbF64FW8EWBe2u6kJw4UJNq2jeOS8/kpZsCqH5saua/qBRXBSijSZyZt4j0cwkM/Pum3lIDhx48Gbuvd853z33nHPHshblHZXanpZPFEGTZvhWEXYqxmFN8FQRvhCV35phSP6TZ3QOM4oy1VYlSMNPDR/pPLQqgjuK8aVmnA6j7jvwc4qxRcay4pZt9+2lmvGYIvgr7OLnATWmCI4qaq+KBUQd417F8IcpAB76QOfg67IBENcrgu/LCOAthcvieaMg0veyqxTjQHwg0FXCX3f3ta00AkIRbnDcHTcILoKBUVlDSSBqu+1PnTCaFAh2VfakInt1RE+0VyVCJ/anWaQQrRkvJL54flvhXOgQm/yi0VNTedwTJsyOJL1g7a8PAh2acmJXwGKnF9AjQbxhLO0IrjCRzttbdA52BHz+4bwbXxLAZCwMx2X+dHf286DvKLKbfYFIFhs3CEXQZ1+z31ekPlCEvwR/Dzv964kIqXhJIBj+S3XhpoIRT4Z8f7Khv3WFlzea4vcGHpK5U13whVN8cej3Gz2A4JmYgdy1pq337EF7iSL4LdoY8I0XkM74KIXP6nvsdU6AYTwVeSzCG3MjFsFofJSCg86cuexW4XoJBhme6xHG8QiDXdWMV6JY0S2XYag0o8BjL2qF3mzFqKEIT2jCqQAWHN+Zb11ToNRZAxR9bgSIeOTLgY4PncjD2LFQ+FYEWZdStlIEr8oF5EmkwQg7Gwcal82EcJjwphRcl2d232lbbqziJHzkdY6UkvH2FJtt0gGRg+5Ny8G/ipprCga7aAQEi8KQ8fCrGAbre7NrZaw6hq9mB48U44GCseqD7CVdUviVNqbBRkEd259pgr8V4Y8uiEy1ZK3mvIFC69NzgeQwY2RwxrF0t71ZxtzV07KxSDlFeMkkCO2fomSqTSWNQiupL0wbSb/p/f89k0YHDONto5ltHvfIJteM/xj3BsMty0+kK252MnwepsbQoWjlnkn+pS7jWDkmNqvwULJmXyDuXoGjyS8UF/LG4XlBzPJK4m1S7acEo4E7jnI6VyYInJJDNRCIWRQ7X4GU+i4UiCLFpHFcMSAY+hfc4P5eaa6plGuF9L3sqkggZsDghjjLYD2XTiOprpb1lgmR668kaKYY+uWyySrLZajJNHx+T/xQ1rt3yZ/KSTXFOBw6xEYVJ6IxHjFaXxD8KSd2Il9AuHSzmwvVZZT+1KRksZIARg6tpkVqgzqGfdLG1Aw3nQ9oGMeLH9U4pS/B71KeSmUnRdH23v0fG1/IoliVIa8BrNIxjCdlGcQAAAAASUVORK5CYII=";
	        
	        
	        String file2 = generateFile(testFileBase64);
	        System.out.println(file2);
	        
	        
	        
		
	}
	
	
	public static String generateFile ( String fileBase64) throws IOException {
		System.out.println("generate file ");
		String fileName = "file_1747379929727_may2025_3.png";
		File targetFile = new File("/media/shared/", fileName);

		byte[] fileBytes = Base64.getDecoder().decode(fileBase64.replaceAll("\\s+", ""));
		try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fileBytes);
				OutputStream outputStream = new FileOutputStream(targetFile)) {
			byte[] buffer = new byte[8192];
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
		}

		return "formdatauploadfile/" + fileName;
	}
}


