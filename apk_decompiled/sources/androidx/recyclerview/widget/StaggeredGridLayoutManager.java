package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.am4;
import defpackage.okk;
import defpackage.r9e;
import defpackage.sz6;
import defpackage.vkc;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends okk {
    public final int b;
    public final am4[] c;
    public final vkc d;
    public final vkc e;
    public final int f;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = -1;
        new Rect();
        r9e r9eVarQ = okk.q(context, attributeSet, i, i2);
        int i3 = r9eVarQ.a;
        if (i3 != 0 && i3 != 1) {
            sz6.p("invalid orientation.");
            throw null;
        }
        if (i3 != this.f) {
            this.f = i3;
            vkc vkcVar = this.d;
            this.d = this.e;
            this.e = vkcVar;
        }
        int i4 = r9eVarQ.b;
        if (i4 != this.b) {
            this.b = i4;
            new BitSet(this.b);
            this.c = new am4[this.b];
            for (int i5 = 0; i5 < this.b; i5++) {
                am4[] am4VarArr = this.c;
                am4 am4Var = new am4(20);
                new ArrayList();
                am4VarArr[i5] = am4Var;
            }
        }
        this.d = vkc.g(this, this.f);
        this.e = vkc.g(this, 1 - this.f);
    }
}
