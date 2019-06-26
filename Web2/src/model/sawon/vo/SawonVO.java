package model.sawon.vo;

public class SawonVO {
    private String name;
    private String tel;
    private String age;
    private String address;
    public SawonVO(){}
    public SawonVO(String name, String tel, String age, String address)
    {
        this.name=name;
        this.tel=tel;
        this.age=age;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName()
    {
        return this.name;
    }
    public String getTel()
    {
        return this.tel;
    }
    public String getAge()
    {
        return this.age;
    }
    public String getAddress()
    {
        return this.address;
    }

            //이름 번호 나이 주소
}
