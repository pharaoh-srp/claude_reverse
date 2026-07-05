package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes2.dex */
public final class re0 extends SegmentFinder {
    public final /* synthetic */ dke a;

    public re0(dke dkeVar) {
        this.a = dkeVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.q(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.k(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.l(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.p(i);
    }
}
