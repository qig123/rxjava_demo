package com.simulation.qig.rxjavasamplesqig;

import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;

import butterknife.OnClick;
import io.reactivex.disposables.Disposable;

/**
 * Created by qig on 2018/1/29.
 */

public abstract class BaseFragment extends Fragment {
    protected Disposable disposable;
    //TODO why need abstract
    @OnClick(R.id.tipBt)
    void tip() {
        new AlertDialog.Builder(getActivity())
                .setTitle(getTitleRes())
                .setView(getActivity().getLayoutInflater().inflate(getDialogRes(), null))
                .show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //TODO
        unsubscribe();
    }

    protected void unsubscribe() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    //TODO why need protected
    protected abstract int getDialogRes();

    protected abstract int getTitleRes();
}

