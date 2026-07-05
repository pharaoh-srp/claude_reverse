package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class sjb {
    public final SparseArray a;
    public pbi b;

    public sjb(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(pbi pbiVar, int i, int i2) {
        int iA = pbiVar.a(i);
        SparseArray sparseArray = this.a;
        sjb sjbVar = sparseArray == null ? null : (sjb) sparseArray.get(iA);
        if (sjbVar == null) {
            sjbVar = new sjb(1);
            sparseArray.put(pbiVar.a(i), sjbVar);
        }
        if (i2 > i) {
            sjbVar.a(pbiVar, i + 1, i2);
        } else {
            sjbVar.b = pbiVar;
        }
    }
}
