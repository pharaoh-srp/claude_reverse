package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import defpackage.grc;
import defpackage.okk;
import defpackage.pmf;
import defpackage.sz6;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final int f;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = okk.q(context, attributeSet, i, i2).b;
        if (i3 == this.f) {
            return;
        }
        if (i3 < 1) {
            sz6.p(grc.p(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.f = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d0(boolean z) {
        if (z) {
            pmf.n("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.d0(false);
        }
    }
}
