package com.designpattern.command;

public class CloseCourseCommand implements Command
{
    private CouresVideo couresVideo;

    public CloseCourseCommand( CouresVideo couresVideo )
    {
        this.couresVideo = couresVideo;
    }

    public void execute()
    {
        couresVideo.close();
    }
}
