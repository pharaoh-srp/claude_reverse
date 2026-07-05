package defpackage;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qxi extends m08 implements bz7 {
    public static final qxi E = new qxi(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
