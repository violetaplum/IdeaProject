package calcJava;

public class CalcVO {
    private String one;
    private String two;
    private String math;
    private String result;
    public CalcVO(){}
    public String getResult()
    {
        return this.result;
    }
    public CalcVO(String one, String two,String math)
    {
        this.one=one;
        this.two=two;
        this.math=math;
        if(math.equals("+"))
        {
            this.result = String.valueOf(Integer.parseInt(one)+Integer.parseInt(two));
        }
        else if(math.equals("-"))
        {
            this.result = String.valueOf(Integer.parseInt(one)-Integer.parseInt(two));
        }
        else if(math.equals("*"))
        {
            this.result = String.valueOf(Integer.parseInt(one)*Integer.parseInt(two));
        }
        else if(math.equals("/"))
        {
            if(two.equals("0"))
            {
                this.result="0 으로 나눌 수 없습니다.";
            }
            else
            {
                this.result = String.valueOf(Integer.parseInt(one)/Integer.parseInt(two));
            }
        }

    }
    public String getOne()
    {
        return this.one;
    }
    public String getTwo()
    {
        return this.two;
    }
    public String getMath()
    {
        return this.math;
    }


}
