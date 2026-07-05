package io.sentry.android.replay;

import android.view.View;
import defpackage.bz7;
import defpackage.ts9;
import defpackage.x44;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ View G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(View view, int i) {
        super(1);
        this.F = i;
        this.G = view;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        View view = this.G;
        switch (i) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(x44.r(weakReference.get(), view));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                weakReference2.getClass();
                return Boolean.valueOf(x44.r(weakReference2.get(), view));
        }
    }
}
