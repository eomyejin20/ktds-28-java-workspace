package com.ktdsuniversity.edu.fp.objects;

import com.ktdsuniversity.edu.fp.objects.utils.ArrayUtil;

public class City {
	private int id; // 0
	private String name; // 1
	private int stateId; // 2
	private String stateCode; // 3
	private String stateName; // 4
	private int countryId; // 5
	private String countryCode; // 6
	private String countryName; // 7
	private String latitude; // 8
	private String longitude; // 9
	private String nativeStr; // 10
	private String type; // 11
	private int level; // 12
	private int parentId; // 13
	private int population; // 14
	private String timezone; // 15
	private String wikiDataId; // 16

	public City() {}
	
	City(String cityLineString) {
		// CSV: Comma Separate Value
		String[] values = cityLineString.split(",");

		this.id = ArrayUtil.getInt(values, 0);
		this.name = ArrayUtil.getValue(values, 1);
		this.stateId = ArrayUtil.getInt(values, 2);
		this.stateCode = ArrayUtil.getValue(values, 3);
		this.stateName = ArrayUtil.getValue(values, 4);
		this.countryId = ArrayUtil.getInt(values, 5);
		this.countryCode = ArrayUtil.getValue(values, 6);
		this.countryName = ArrayUtil.getValue(values, 7);
		this.latitude = ArrayUtil.getValue(values, 8);
		this.longitude = ArrayUtil.getValue(values, 9);
		this.nativeStr = ArrayUtil.getValue(values, 10);
		this.type = ArrayUtil.getValue(values, 11);
		this.level = ArrayUtil.getInt(values, 12);
		this.parentId = ArrayUtil.getInt(values, 13);
		this.population = ArrayUtil.getInt(values, 14);
		this.timezone = ArrayUtil.getValue(values, 15);
		this.wikiDataId = ArrayUtil.getValue(values, 16);
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getStateId() {
		return this.stateId;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public String getStateName() {
		return this.stateName;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public String getNativeStr() {
		return this.nativeStr;
	}

	public String getType() {
		return this.type;
	}

	public int getLevel() {
		return this.level;
	}

	public int getParentId() {
		return this.parentId;
	}

	public int getPopulation() {
		return this.population;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public String getWikiDataId() {
		return this.wikiDataId;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("City [id=" + this.id);
		buffer.append(", name=" + this.name);
		buffer.append(", stateId=" + this.stateId);
		buffer.append(", stateCode=" + this.stateCode);
		buffer.append(", stateName=" + this.stateName);
		buffer.append(", countryId=" + this.countryId);
		buffer.append(", countryCode=" + this.countryCode);
		buffer.append(", countryName=" + this.countryName);
		buffer.append(", latitude=" + this.latitude);
		buffer.append(", longitude=" + this.longitude);
		buffer.append(", nativeStr=" + this.nativeStr);
		buffer.append(", type=" + this.type);
		buffer.append(", level=" + this.level);
		buffer.append(", parentId=" + this.parentId);
		buffer.append(", population=" + this.population);
		buffer.append(", timezone=" + this.timezone);
		buffer.append(", wikiDataId=" + this.wikiDataId);
		buffer.append("]");
		return buffer.toString();
	}
	
}