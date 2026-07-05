package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class baa extends DataSetObserver {
    public final /* synthetic */ eaa a;

    public baa(eaa eaaVar) {
        this.a = eaaVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        eaa eaaVar = this.a;
        if (eaaVar.d0.isShowing()) {
            eaaVar.g();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
