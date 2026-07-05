package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class v6e implements v86 {
    public final /* synthetic */ Window a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cbi c;
    public final /* synthetic */ boolean d;

    public v6e(Window window, int i, cbi cbiVar, boolean z) {
        this.a = window;
        this.b = i;
        this.c = cbiVar;
        this.d = z;
    }

    @Override // defpackage.v86
    public final void a() {
        this.a.setStatusBarColor(this.b);
        this.c.d(this.d);
    }
}
