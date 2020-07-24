package com.prafulla.blureffect;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlurDialogFragment extends SupportBlurDialogFragment {


    public BlurDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blur_dialog, container, false);
    }

    @Override
    protected float getDownScaleFactor() {
        return 4.0f;
    }

    @Override
    protected int getBlurRadius() {
        return 8;
    }

    @Override
    protected boolean isDimmingEnable() {
        return true;
    }

    @Override
    protected boolean isDebugEnable() {
        return false;
    }

    @Override
    protected boolean isRenderScriptEnable() {
        return true;
    }
}