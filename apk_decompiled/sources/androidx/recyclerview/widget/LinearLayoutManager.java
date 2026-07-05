package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.grc;
import defpackage.okk;
import defpackage.r9e;
import defpackage.sz6;
import defpackage.vkc;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends okk {
    public final int b;
    public final vkc c;
    public final boolean d;
    public boolean e = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = 1;
        this.d = false;
        r9e r9eVarQ = okk.q(context, attributeSet, i, i2);
        int i3 = r9eVarQ.a;
        if (i3 != 0 && i3 != 1) {
            sz6.p(grc.p(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.b || this.c == null) {
            this.c = vkc.g(this, i3);
            this.b = i3;
        }
        boolean z = r9eVarQ.c;
        if (z != this.d) {
            this.d = z;
        }
        d0(r9eVarQ.d);
    }

    public void d0(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
    }
}
