package boulderstudios.com.boilerplate.presentation.presenters;

import boulderstudios.com.boilerplate.presentation.IMvpPresenter;
import boulderstudios.com.boilerplate.presentation.mvpviewinterfaces.IMainView;

/**
 * Created by yuval on 2/24/18.
 */

public class DefaultMainViewPresenter extends IMvpPresenter<IMainView> implements
        IMainView.PresenterInterface {

    public DefaultMainViewPresenter(IMainView view) {
        super(view);
    }

    @Override
    protected void setViewInterface(IMainView view) {
        view.setPresenterInterface(this);
    }

    @Override
    public void onViewShown() {

    }

    @Override
    public void onViewRemoved() {

    }
}
