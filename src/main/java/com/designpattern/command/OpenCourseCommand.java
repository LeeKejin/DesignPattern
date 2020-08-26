package com.designpattern.command;

public class OpenCourseCommand implements Command
{
    private CouresVideo couresVideo;

    public OpenCourseCommand( CouresVideo couresVideo )
    {
        this.couresVideo = couresVideo;
    }

    public void execute()
    {
        this.couresVideo.open();
    }
}
