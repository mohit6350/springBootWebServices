package com.example.webservices.soap;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.webservices.pojo.ElectronicProductsRequest;
import com.example.webservices.pojo.ElectronicProductsResponse;
import com.example.webservices.pojo.Mobile;
import com.example.webservices.pojo.Television;



@Endpoint
@Component
public class CourseDetailsEndpoint {
	
	@ResponsePayload
	@PayloadRoot(namespace="http://www.example.org/products", localPart="ElectronicProductsRequest")
	public ElectronicProductsResponse processRequest(@RequestPayload ElectronicProductsRequest request) {
		ElectronicProductsResponse response = new ElectronicProductsResponse();
		System.err.println(request);
		
		// populate mobile object
		Mobile mobile = new Mobile();
		mobile.setProductName("SamsungGalaxy Note 10");
		mobile.setBrandName("samsung");
		mobile.setPrice(90000);
		mobile.setYearLaunched(2019);
		
		// populate television object
		Television tv = new Television();
		tv.setProductName("VU california");
		tv.setPrice(40000);
		tv.setBrandName("VU");
		tv.setWaranty("3 years");
		
		// population response object
		response.setMobile(mobile);
		response.setTelevision(tv);
		
		return response;
	}


}
