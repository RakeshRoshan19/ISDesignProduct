package com.Rakesh.Products.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ProductsDetails")

public class ProductsDetails {
	@Id
	private String pId;
	private String pName;
	private String pDetails;
	private String pImgLink;
	private float price;
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDetails() {
		return pDetails;
	}
	public void setpDetails(String pDetails) {
		this.pDetails = pDetails;
	}
	public String getpImgLink() {
		return pImgLink;
	}
	public void setpImgLink(String pImgLink) {
		this.pImgLink = pImgLink;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public ProductsDetails(String pId, String pName, String pDetails, String pImgLink, float price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDetails = pDetails;
		this.pImgLink = pImgLink;
		this.price = price;
	}
	public ProductsDetails() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pDetails == null) ? 0 : pDetails.hashCode());
		result = prime * result + ((pId == null) ? 0 : pId.hashCode());
		result = prime * result + ((pImgLink == null) ? 0 : pImgLink.hashCode());
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsDetails other = (ProductsDetails) obj;
		if (pDetails == null) {
			if (other.pDetails != null)
				return false;
		} else if (!pDetails.equals(other.pDetails))
			return false;
		if (pId == null) {
			if (other.pId != null)
				return false;
		} else if (!pId.equals(other.pId))
			return false;
		if (pImgLink == null) {
			if (other.pImgLink != null)
				return false;
		} else if (!pImgLink.equals(other.pImgLink))
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
}
