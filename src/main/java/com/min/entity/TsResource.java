package com.min.entity;
// Generated 2018-8-19 21:26:30 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TsRole generated by hbm2java
 */
@Entity
@Table(name = "ts_resource", catalog = "blog")
public class TsResource implements java.io.Serializable {

	private Long id;
	private String name;
	private String description;
	private Date createTime;
	private Date updateTime;
	private Integer jpaVersion;

	public TsResource() {
	}

	public TsResource(String name, String description, Date createTime, Date updateTime, Integer jpaVersion) {
		this.name = name;
		this.description = description;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.jpaVersion = jpaVersion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", length = 100, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "jpa_version", nullable = false)
	public Integer getJpaVersion() {
		return this.jpaVersion;
	}

	public void setJpaVersion(Integer jpaVersion) {
		this.jpaVersion = jpaVersion;
	}

}