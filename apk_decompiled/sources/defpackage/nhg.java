package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class nhg implements w4a {
    public final /* synthetic */ phg a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;

    public nhg(v4a v4aVar, phg phgVar, Object obj, View view) {
        this.a = phgVar;
        this.b = obj;
        this.c = view;
    }

    @Override // defpackage.w4a
    public final void a() {
        phg phgVar = this.a;
        gb9.D(phgVar.a, null, null, new x1d(phgVar, this.b, (tp4) null), 3);
        this.c.setKeepScreenOn(false);
    }
}
