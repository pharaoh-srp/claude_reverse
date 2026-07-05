package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import defpackage.n40;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final Rect f;
    public ArrayList g;

    public g(int i, int i2, float f, g gVar, boolean z, boolean z2, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = rect;
    }

    public final void a(n40 n40Var) {
        ArrayList arrayList;
        if (!((Boolean) n40Var.invoke(this)).booleanValue() || (arrayList = this.g) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(n40Var);
        }
    }
}
