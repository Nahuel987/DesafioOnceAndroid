package com.example.desafiopassword.presenter;

import com.example.desafiopassword.model.Verifier;

public class Presenter {

    IPresenter view;
    Verifier verifier;

    public Presenter(IPresenter view) {
        this.view = view;
        verifier = new Verifier();
    }

    public void evaluatePass(final String pass) {

        int res = verifier.evaluatePass(pass);
        switch (res ){
            case Verifier.WEAK:
                this.view.showWeak();
                break;
            case Verifier.MEDIUM:
                this.view.showMedium();
                break;
            case Verifier.STRONG:
                this.view.showStrong();
                break;
            case Verifier.VERY_STRONG:
                this.view.showVeryStrong();
                break;
        }
    }
}
