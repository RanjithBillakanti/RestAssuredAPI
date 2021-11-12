package pojo.GetServiceAPI;

import pojo.RegistrationAPI.RegisterAPI;

public class Service {
    private Category Category;
    private SubCategory Subcategory;

    public pojo.GetServiceAPI.Category getCategory() {
        return Category;
    }

    public void setCategory(pojo.GetServiceAPI.Category category) {
        Category = category;
    }

    public SubCategory getSubcategory() {
        return Subcategory;
    }

    public void setSubcategory(SubCategory subcategory) {
        Subcategory = subcategory;
    }
}
