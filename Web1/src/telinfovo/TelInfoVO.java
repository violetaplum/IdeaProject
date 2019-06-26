package telinfovo;
import java.util.Date;

public class TelInfoVO {
    private int id;
    private String name;
    private String tel;
    private Date d;

    public TelInfoVO(){}
    public TelInfoVO(int id, String name, String tel, Date d)
    {
        this.id=id;
        this.name=name;
        this.tel=tel;
        this.d=d;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setTel(String tel)
    {
        this.tel=tel;
    }
    public void setDate(Date d)
    {
        this.d=d;
    }


    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getTel()
    {
        return this.tel;
    }
    public Date getDate()
    {
        return this.d;
    }

}
