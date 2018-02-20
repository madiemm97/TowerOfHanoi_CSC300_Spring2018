package com.example.awesomefat.towerofhanoi_csc300_spring2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private Button tower1button;
    private Button tower2button;
    private Button tower3button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tower tower1 = new Tower();
        Tower tower2 = new Tower();
        Tower tower3 = new Tower();

        Disk disk0 = new Disk(1);
        Disk disk1 = new Disk(2);
        Disk disk2 = new Disk(3);

    }

    public void tower1POPbuttonPressed(Tower tower1)
    {
        tower1.pop();
    }

    public void tower2POPbuttonPressed(Tower tower2)
    {
        tower2.pop();
    }

    public void tower3POPbuttonPressed(Tower tower3)
    {
        tower3.pop();
    }

    public void tower1PUSHbuttonPressed(Tower tower1, Disk disk)
    {
        tower1.push(disk);
    }

    public void tower2PUSHbuttonPressed(Tower tower2, Disk disk)
    {
        tower2.push(disk);
    }

    public void tower3PUSHbuttonPressed(Tower tower3, Disk disk)
    {
        tower3.push(disk);
    }
}
