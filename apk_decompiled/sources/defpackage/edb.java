package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class edb extends FrameLayout implements l44 {
    public final CollapsibleActionView E;

    /* JADX WARN: Multi-variable type inference failed */
    public edb(View view) {
        super(view.getContext());
        this.E = (CollapsibleActionView) view;
        addView(view);
    }
}
