package com.example.architecturepatternmvp;

import com.example.architecturepatternmvp.util.myModel;

public class AppPresenter {

    private AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    public myModel getAppFromModel()
    {

        return new myModel("Master Coding App",9000,4.7f);

    }
    public void onGetAllDetails()
    {
        appView.onGetAppName(getAppFromModel().getName());
    }


}
