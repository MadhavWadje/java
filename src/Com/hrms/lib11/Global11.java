package Com.hrms.lib11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Global11 {
WebDriver driver;
	
    //****TEST DATA****
//LOGIN
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
//Add
	public String ln="Maharastra";
	public String fn="Nanded";
//Edit
	public String Eln="Selenium";
	public String Efn="Testing";
//Delete
	public String empidno="4024";
	
	
//object
	//login
	public String untbx = "txtUserName";
	public String pwtbx ="txtPassword";
	public String loginbtn="Submit";
	public String logoutbtn ="Logout";
  //Add
    public String addbtn1="//input[@value='Add']";
    public String lntbx="txtEmpLastName";
    public String fntbx="txtEmpFirstName";
    public String savebtn="btnEdit"; //id
 //Edit
    public String Elntbx2="txtEmpLastName";
    public String Efntbx2="txtEmpFirstName";
    public String Editbtn2="EditMain";
    public String savebtn2="EditMain";
    public String Backbtn2="//input[@value='Back']";
 //Delete
    public String searchdropdown4="loc_code";
    public String empid3="Emp. ID";
    public String checkbx3="chkLocID[]";
    public String searchbx3="loc_name";
    public String searchbtn3="//input[@value='Search']";
    public String deletebtn3="//input[@value='Delete']";
    
    
}
