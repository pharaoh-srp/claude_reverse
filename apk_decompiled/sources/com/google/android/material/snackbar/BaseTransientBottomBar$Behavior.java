package com.google.android.material.snackbar;

import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public BaseTransientBottomBar$Behavior() {
        Math.min(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, 0.1f), 1.0f);
        Math.min(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, 0.6f), 1.0f);
    }
}
