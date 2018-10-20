package com.sicau.devicemanager.constants;

/**
 * 设备状态
 * @author Yazhe
 * Created at 16:22 2018/9/3
 */
public enum DeviceStatusEnum implements CodeEnum{

	UNCONNECTED(-1,"未接入"),

	IN_STORAGE(1,"库存中"),
	USING(2,"使用中"),
	DISCARDED(3,"报废"),
	FIXING(4,"维修")
	;

	/**
	 * 状态码
	 */
	private int code;

	/**
	 * 中文释义，可用于前端展示
	 */
	private String value;

	DeviceStatusEnum(int code, String value) {
		this.code = code;
		this.value = value;
	}

	@Override
	public Integer getCode() {
		return code;
	}
}
