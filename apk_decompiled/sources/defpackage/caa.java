package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes2.dex */
public final class caa implements AbsListView.OnScrollListener {
    public final /* synthetic */ eaa a;

    public caa(eaa eaaVar) {
        this.a = eaaVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        eaa eaaVar = this.a;
        aaa aaaVar = eaaVar.V;
        jh0 jh0Var = eaaVar.d0;
        if (i != 1 || jh0Var.getInputMethodMode() == 2 || jh0Var.getContentView() == null) {
            return;
        }
        eaaVar.Z.removeCallbacks(aaaVar);
        aaaVar.run();
    }
}
