package pojo;

public class BuildingDetails {

    private int id;
    private int buildingId;
    private String applicationBuildingNickname;
    private int applicationBuildingHeight;
    private int applicationBuildingNumberOfFloors;
    private int applicationBuildingNumberofBasementFloors;
    private int applicationBuildingGroundFloorSize;
    private int applicationBuildingNumberOfStaircases;
    private int applicationBuildingNumberOfExits;
    private int applicationBuildingNumberOfLifts;
    private int applicationBuildingTotalArea;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int BuildingId) {
        this.buildingId = BuildingId;
    }

    public String applicationBuildingNickname()
    {
        return applicationBuildingNickname;
    }
}
