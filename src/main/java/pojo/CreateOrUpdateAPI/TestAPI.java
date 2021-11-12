package pojo.CreateOrUpdateAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestAPI {
    public static void main(String arg[]) {
        for (int i = 0; i < 2; i++) {
            RestAssured.baseURI = "http://backend.scd.gov.ae/";
            Response res =  given().header("Content-Type", "application/json")
                    .body("{\n" +
                            "\"applicationId\":0,\n" +
                            "\"serviceId\":1,\n" +
                            "\"channelId\":1,\n" +
                            "\"submitterId\":11,\n" +
                            "\"submitterName\":\"Ranjith Billakanti\",\n" +
                            "\"applicationBuildings\":{\n" +
                            "\"recordAction\":0,\n" +
                            "\"applicationBuildings\":[\n" +
                            "{\n" +
                            "\"id\":0,\n" +
                            "\"buildingId\":null,\n" +
                            "\"applicationBuildingNickname\":\"billaComplex\",\n" +
                            "\"applicationBuildingHeight\":\"1250\",\n" +
                            "\"applicationBuildingNumberOfFloors\":\"12\",\n" +
                            "\"applicationBuildingNumberofBasementFloors\":\"2\",\n" +
                            "\"applicationBuildingGroundFloorSize\":\"5000\",\n" +
                            "\"applicationBuildingNumberOfStaircases\":\"1200\",\n" +
                            "\"applicationBuildingNumberOfExits\":\"2\",\n" +
                            "\"applicationBuildingNumberOfLifts\":\"2\",\n" +
                            "\"applicationBuildingTotalArea\":\"6000\",\n" +
                            "\"recordAction\":1\n" +
                            "}\n" +
                            "]\n" +
                            "},\n" +
                            "\"submitter\":{\n" +
                            "\"id\":0,\n" +
                            "\"submitterName\":\"Ranjith\",\n" +
                            "\"submitterType\":\"Establishment\",\n" +
                            "\"recordAction\":1\n" +
                            "},\n" +
                            "\"applicationProject\":{\n" +
                            "\"id\":0,\n" +
                            "\"projectId\":\"\",\n" +
                            "\"applicationProjectDescription\":\"TestProjectDescription\",\n" +
                            "\"applicationProjectTotalArea\":\"5000\",\n" +
                            "\"applicationProjectLocationLongitude\":\"1234.45\",\n" +
                            "\"applicationProjectLocationLatitude\":\"1243.54\",\n" +
                            "\"applicationProjectConstructionLicenseNumber\":\"12345\",\n" +
                            "\"recordAction\":1\n" +
                            "},\n" +
                            "\"contact\":{\n" +
                            "\"id\":0,\n" +
                            "\"mobile\":\"97098765\",\n" +
                            "\"recordAction\":1\n" +
                            "},\n" +
                            "\"projectOwners\":{\n" +
                            "\"ownerType\":\"Establishment\",\n" +
                            "\"recordAction\":0,\n" +
                            "\"establishmentOwners\":[\n" +
                            "{\n" +
                            "\"id\":0,\n" +
                            "\"establishmentLicense\":\"123\",\n" +
                            "\"establishmentName\":\"est123\",\n" +
                            "\"recordAction\":1\n" +
                            "}\n" +
                            "]\n" +
                            "},\n" +
                            "\"applicationAssignBuildingEquipments\":{\n" +
                            "\"assignBuildingEquipments\":[\n" +
                            "{\n" +
                            "\"id\":0,\n" +
                            "\"buildingEquipmentSubCategoryId\":null,\n" +
                            "\"applicationBuilding\":{\n" +
                            "\"applicationBuildingId\":24,\n" +
                            "\"buildingId\":null,\n" +
                            "\"applicationBuildingNickname\":\"billaComplex\"\n" +
                            "},\n" +
                            "\"equipmentCategory\":{\n" +
                            "\"equipmentCategoryId\":1,\n" +
                            "\"equipmentCategoryNameEnglish\":\"Fire Safety\",\n" +
                            "\"equipmentCategoryNameArabic\":\"السلامة من الحرائق\"\n" +
                            "},\n" +
                            "\"equipmentSubCategory\":{\n" +
                            "\"equipmentSubCategoryId\":1,\n" +
                            "\"equipmentCategoryId\":1,\n" +
                            "\"equipmentSubCategoryNameEnglish\":\"Sprinklers\",\n" +
                            "\"equipmentSubCategoryNameArabic\":\"الرشاشات\"\n" +
                            "},\n" +
                            "\"recordAction\":1\n" +
                            "}\n" +
                            "],\n" +
                            "\"recordAction\":1\n" +
                            "}\n" +
                            "}").when().post("/api/services/app/Application/CreateOrUpdateApplication")
                    .then().assertThat().statusCode(200).extract().response();

            System.out.println(res.asString());
        }
    }
}