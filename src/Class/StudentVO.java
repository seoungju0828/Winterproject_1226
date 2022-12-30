package Class;                                                                                                                                                                                    
//학생의 정보를 보관하는 클래스                                                                                                                                                                              
                                                                                                                                                                                                  
public class StudentVO {    		//값을 저장하는 Value Object                                                                                                                                                                      
	                                                                                                                                                                                              
	//멤버 변수                                                                                                                                                                                       
	private String name;			//이름                                                                                                                                                          
	private int stuld;				//학번                                                                                                                                                          
	private int grade;				//학년                                                                                                                                                          
	private String major;			//전공                                                                                                                                                          
	private String address;			//주소                                                                                                                                                          
	private String mobile;			//연락처    
	
	//생성자
	public StudentVO(String name, int stuld, int grade, String major, String address, String mobile) {
		this.name = name;
		this.stuld = stuld;
		this.grade = grade;
		this.major = major;
		this.address = address;
		this.mobile = mobile;
	}
	                                                                                                                                                                                              
	//getter setter                                                                                                                                                                               
	public String getName() {                                                                                                                                                                     
		return name;                                                                                                                                                                              
	}                                                                                                                                                                                         	
	public void setName(String name) {                                                                                                                                                            
		this.name = name;                                                                                                                                                                         
	}                                                                                                                                                                                             
	public int getStuld() {                                                                                                                                                                       
		return stuld;                                                                                                                                                                             
	}                                                                                                                                                                                             
	public void setStuld(int stuld) {                                                                                                                                                             
		this.stuld = stuld;                                                                                                                                                                       
	}                                                                                                                                                                                             
	public int getGrade() {                                                                                                                                                                       
		return grade;                                                                                                                                                                             
	}                                                                                                                                                                                             
	public void setGrade(int grade) {                                                                                                                                                             
		this.grade = grade;                                                                                                                                                                       
	}                                                                                                                                                                                             
	public String getMajor() {                                                                                                                                                                    
		return major;                                                                                                                                                                             
	}                                                                                                                                                                                             
	public void setMajor(String major) {                                                                                                                                                          
		this.major = major;                                                                                                                                                                       
	}                                                                                                                                                                                             
	public String getAddress() {                                                                                                                                                                  
		return address;                                                                                                                                                                           
	}                                                                                                                                                                                             
	public void setAddress(String address) {                                                                                                                                                      
		this.address = address;                                                                                                                                                                   
	}                                                                                                                                                                                             
	public String getMobile() {                                                                                                                                                                   
		return mobile;                                                                                                                                                                            
	}                                                                                                                                                                                             
	public void setMobile(String mobile) {                                                                                                                                                        
		this.mobile = mobile;                                                                                                                                                                     
	}
	
	//toString
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", stuld=" + stuld + ", grade=" + grade + ", major=" + major + ", address="
				+ address + ", mobile=" + mobile + "]";
	}                                                                                                                                                                                             
	                                                                                                                                                                                             
	                                                                                                                                                                                          
                                                                                                                                                                                                  
}                                                                                                                                                                                                 
                                                                                                                                                                                                  