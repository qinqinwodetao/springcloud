package com.wucy.provider.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author wucy
 * Date: 2017-12-21 17:13:00
 */
@Entity
public class Holiday {

	@Id
	@GeneratedValue
	private Integer id;

	private Date date;

	private String status;


}
