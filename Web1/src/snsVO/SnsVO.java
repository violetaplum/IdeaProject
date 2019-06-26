package snsVO;

public class SnsVO {
    private int bunho;
    private String snsjemok;
    private String snswriter;
    private String snscontent;
    private int basebun;
    private int daetbun;
    private int daetdaetbun;

    public SnsVO(){}
    public SnsVO(int bunho,String snsjemok,String snswriter,String snscontent,int basebun,int daetbun,int daetdaetbun)
    {
        this.bunho = bunho;
        this.snsjemok = snsjemok;
        this.snswriter = snswriter;
        this.snscontent = snscontent;
        this.basebun  =basebun;
        this.daetbun = daetbun;
        this.daetdaetbun = daetdaetbun;

    }

    public int getBunho()
    {
        return this.bunho;
    }
    public String getSnsjemok()
    {
        return this.snsjemok;
    }
    public String getSnswriter()
    {
        return this.snswriter;
    }
    public String getSnscontent()
    {
        return this.snscontent;
    }
    public int getBasebun()
    {
        return this.basebun;
    }
    public int getDaetbun()
    {
        return this.daetbun;
    }
    public int getDaetdaetbun()
    {
        return this.daetdaetbun;
    }

}

/*    Name                                      Null?    Type
        ----------------------------------------- -------- ----------------------------
        BUNHO                                     NOT NULL NUMBER(5)
        SNSJEMOK                                           VARCHAR2(30)
        SNSWRITER                                          VARCHAR2(30)
        SBSCONTENT                                         VARCHAR2(200)
        BASEBUN                                            NUMBER(5)
        DAETBUN                                            NUMBER(5)
        DAETDAETBUN                                        NUMBER(5)*/

