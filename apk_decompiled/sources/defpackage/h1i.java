package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h1i implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Toolbar F;

    public /* synthetic */ h1i(Toolbar toolbar, int i) {
        this.E = i;
        this.F = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Toolbar toolbar = this.F;
        switch (i) {
            case 0:
                j1i j1iVar = toolbar.s0;
                adb adbVar = j1iVar == null ? null : j1iVar.F;
                if (adbVar != null) {
                    adbVar.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
