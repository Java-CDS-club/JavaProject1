package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="global_settings")
public class GlobalSettings {
	
	@Id
	private int slno;
	private String currencyIcon;
	private String allowProfileUpdate;
	private String selfRegistrationAllow;
	private String print;
	private String mediaStorageUrl;
	private String homeWorkEditBy;
	private String afterHomeWorksubDate;
	private String examsCanbeEnteredBy;
	private String feeFrequencyMonthly;
	private String transportFeeDisabled;
	private String receiptIncrement;
	private String onlineFeePartialPay;
	private String gstEnable;
	private long gstNumber;
	private double gstPercent;
	private String backDateChangesAllowedByNonAdmin;
	private String noOfDaysPriorToCurrentDateAllowed;

}
