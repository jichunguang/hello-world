package jcg.bean;

import java.sql.Timestamp;

/**
 * ClassInfo entity. @author MyEclipse Persistence Tools
 */

public class ClassInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private String createdata;
	private String classfullname;
	private String classeasyname;
	private Integer classnature;
	private String startclass;
	private String endclass;
	private Integer state;
	private String classnaturename;
	private String statename;
	public String getClassnaturename() {
		if(classnature==1){
			
			return "个体班";
		}else if(classnature==2){
			return "政府班";
		}
		
		return "";
	}
	public void setClassnaturename(String classnaturename) {
		this.classnaturename = classnaturename;
	}
	public String getStatename() {
		if(state == 1){
			return "可用";
		} else if(state == 2){
			return "不可用";
		}
		return "";
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}



	/** default constructor */
	public ClassInfo() {
	}

	


	public ClassInfo(Integer id, Integer cid) {
		super();
		this.id = id;
		this.cid = cid;
	}




	/** minimal constructor */
	public ClassInfo(String classfullname, String classeasyname) {
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
	}

	/** full constructor */
	
	public ClassInfo(Integer cid,  String classfullname,
			String classeasyname, Integer classnature, String startclass,
			String endclass, Integer state) {
		this.cid = cid;
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
		this.classnature = classnature;
		this.startclass = startclass;
		this.endclass = endclass;
		this.state = state;
	}

	// Property accessors

	public ClassInfo(Integer id, Integer cid, String createdata,
			String classfullname, String classeasyname, Integer classnature,
			String startclass, String endclass, Integer state) {
		super();
		this.id = id;
		this.cid = cid;
		this.createdata = createdata;
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
		this.classnature = classnature;
		this.startclass = startclass;
		this.endclass = endclass;
		this.state = state;
	}
	
	public ClassInfo(Integer cid, String createdata, String classfullname,
			String classeasyname, Integer classnature, String startclass,
			String endclass, Integer state, String classnaturename,
			String statename) {
		super();
		this.cid = cid;
		this.createdata = createdata;
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
		this.classnature = classnature;
		this.startclass = startclass;
		this.endclass = endclass;
		this.state = state;
		this.classnaturename = classnaturename;
		this.statename = statename;
	}
		
	public ClassInfo(Integer cid, String createdata, String classfullname,
			String classeasyname, Integer classnature, String startclass,
			String endclass, Integer state) {
		super();
		this.cid = cid;
		this.createdata = createdata;
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
		this.classnature = classnature;
		this.startclass = startclass;
		this.endclass = endclass;
		this.state = state;
	}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCreatedata() {
		return this.createdata;
	}

	public void setCreatedata(String createdata) {
		this.createdata = createdata;
	}

	public String getClassfullname() {
		return this.classfullname;
	}

	public void setClassfullname(String classfullname) {
		this.classfullname = classfullname;
	}

	public String getClasseasyname() {
		return this.classeasyname;
	}

	public void setClasseasyname(String classeasyname) {
		this.classeasyname = classeasyname;
	}

	public Integer getClassnature() {
		return this.classnature;
	}

	public void setClassnature(Integer classnature) {
		this.classnature = classnature;
	}

	public String getStartclass() {
		return this.startclass;
	}

	public void setStartclass(String startclass) {
		this.startclass = startclass;
	}

	public String getEndclass() {
		return this.endclass;
	}

	public void setEndclass(String endclass) {
		this.endclass = endclass;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	
	public ClassInfo(Integer id, Integer cid, String createdata,
			String classfullname, String classeasyname, Integer classnature,
			String startclass, String endclass, Integer state,
			String classnaturename, String statename) {
		super();
		this.id = id;
		this.cid = cid;
		this.createdata = createdata;
		this.classfullname = classfullname;
		this.classeasyname = classeasyname;
		this.classnature = classnature;
		this.startclass = startclass;
		this.endclass = endclass;
		this.state = state;
		this.classnaturename = classnaturename;
		this.statename = statename;
	}
		
	@Override
	public String toString() {
		return "ClassInfo [cid=" + cid + ", classeasyname=" + classeasyname
				+ ", classfullname=" + classfullname + ", classnature="
				+ classnature + ", createdata=" + createdata + ", endclass="
				+ endclass + ", id=" + id + ", startclass=" + startclass
				+ ", state=" + state + "]";
	}
	
	
}