package com.ipartek.formacion.modelo;

public class SearchForm {

    private String productName;
    private float maximumPrice;
    private float minimumPrice;
    private int idManufacturer;

    public SearchForm() {
	super();
	this.productName = "";
	this.maximumPrice = 0f;
	this.minimumPrice = 0f;
	this.idManufacturer = 0;
    }

    public SearchForm(String productName, float maximumPrice, float minimumPrice, int idManufacturer) {
	this();
	this.setProductName(productName);
	this.setMaximumPrice(maximumPrice);
	this.setMinimumPrice(minimumPrice);
	this.setIdManufacturer(idManufacturer);
    }

    public String getProductName() {
	return productName;
    }

    public void setProductName(String productName) {

	if (productName == null) { // At first use, the form values are not filled, so they are null
	    this.productName = ""; // If null, set to empty
	} else {
	    this.productName.trim(); // If the form field has a value, trim the value and set it
	}
    }

    public float getMaximumPrice() {
	return maximumPrice;
    }

    public void setMaximumPrice(float maximumPrice) {
	this.maximumPrice = maximumPrice;
    }

    // Setter for maximumPrice as string (value from the form)
    public void setMaximumPrice(String maximumPrice) {

	if (maximumPrice == null) { // At first use, the form values are not filled, so they are null
	    this.maximumPrice = 0;  // If null, set to 0

	} else if ("".equals(maximumPrice.trim())) {
	    this.maximumPrice = 0; // If empty string, set to 0

	} else {
	    this.maximumPrice = Float.parseFloat(maximumPrice);
	}
    }

    public float getMinimumPrice() {
	return minimumPrice;
    }

    public void setMinimumPrice(float minimumPrice) {
	this.minimumPrice = minimumPrice;
    }

    // Setter for minimumPrice as string (value from the form)
    public void setMinimumPrice(String minimumPrice) { 
	
	if (minimumPrice == null) { // At first use, the form values are not filled, so they are null
	    this.minimumPrice = 0;  // If null, set to 0

	} else if ("".equals(minimumPrice.trim())) {
	    this.minimumPrice = 0; // If empty string, set to 0

	} else {
	    this.minimumPrice = Float.parseFloat(minimumPrice);
	}
    }

    public int getIdManufacturer() {
	return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
	this.idManufacturer = idManufacturer;
    }

    // Setter for idFabricante as string (value from the form)
    public void setIdManufacturer(String idManufacturer) {
	if ( idManufacturer == null ) {
		this.idManufacturer = 0;
		
	}else if ( "".equals(idManufacturer.trim())  ) {
		this.idManufacturer = 0;
		
	}else {	
		this.idManufacturer = Integer.parseInt(idManufacturer);
	}
	
}
    
    @Override
    public String toString() {
	return "SearchForm [productName=" + productName + ", maximumPrice=" + maximumPrice + ", minimumPrice=" + minimumPrice + ", idManufacturarer=" + idManufacturer + "]";
    }

}
