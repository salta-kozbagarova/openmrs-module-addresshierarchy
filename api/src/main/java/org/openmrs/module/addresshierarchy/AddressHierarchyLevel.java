package org.openmrs.module.addresshierarchy;

import org.openmrs.BaseOpenmrsObject;

/**
 * Represents an Address Hierarchy level (ie., like "Country", or "State", or "City")
 */
public class AddressHierarchyLevel extends BaseOpenmrsObject {
	
	private Integer levelId;
	
	private String name;
	
	// the parent of this level
	private AddressHierarchyLevel parent;
	
	// the associated address field (see AddressField enum) this level maps to (may be null)
	private AddressField addressField;
	
	private Boolean nonHierarchical = false;
	
	// whether or not the associated address field should be allowed to be empty in an Address
	private Boolean required = false;
	
	/**
	 * To string
	 */
	public String toString() {
		return getName();
	}
	
	public boolean equals(Object obj) {
		if (this.getId() == null)
			return false;
		if (obj instanceof AddressHierarchyLevel) {
			AddressHierarchyLevel c = (AddressHierarchyLevel) obj;
			return (this.getId().equals(c.getId()));
		}
		return false;
	}

	/**
	 * Getters and Setters
	 */
	
	public void setName(String name) {
	    this.name = name;
    }

	public String getName() {
	    return name;
    }
	
	public AddressHierarchyLevel getParent() {
		return parent;
	}
	
	public void setParent(AddressHierarchyLevel parent) {
		this.parent = parent;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}
	
	public Integer getLevelId() {
		return this.levelId;
	}

	public void setAddressField(AddressField addressField) {
	    this.addressField = addressField;
    }

	public AddressField getAddressField() {
	    return addressField;
    }
	
    public Boolean getNonHierarchical() {
		return nonHierarchical;
	}

	public void setNonHierarchical(Boolean nonHierarchical) {
		this.nonHierarchical = nonHierarchical;
	}

	public Integer getId() {
	    return this.levelId;
    }

    public void setId(Integer id) {
	   this.levelId = id;
    }

	public void setRequired(Boolean required) {
	    this.required = required;
    }

	public Boolean getRequired() {
	    return required;
    }

}
