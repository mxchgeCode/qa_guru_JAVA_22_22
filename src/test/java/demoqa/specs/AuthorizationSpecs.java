package demoqa.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static demoqa.helpers.CustomAllureListeners.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class AuthorizationSpecs {
    public static RequestSpecification authorizationRequestSpecs = with()
            .filter(withCustomTemplates())
            .log().uri()
            .log().method()
            .contentType(JSON);

    public static ResponseSpecification authorizationResponseSpecs = new ResponseSpecBuilder()
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .build();
}
