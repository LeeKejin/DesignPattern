package com.designpattern.flyweight;

public class Manager implements Employee
{
    private String department;
    private String reportCentents;

    public Manager( String department )
    {
        this.department = department;
    }

    public void report()
    {
        System.out.println( reportCentents );
    }

    public String getReportCentents()
    {
        return reportCentents;
    }

    public void setReportCentents( String reportCentents )
    {
        this.reportCentents = reportCentents;
    }
}
