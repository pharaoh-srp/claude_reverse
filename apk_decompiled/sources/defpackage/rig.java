package defpackage;

import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class rig extends ke1 {
    public final PointF h;
    public final PointF i;
    public final g54 j;
    public final g54 k;

    public rig(g54 g54Var, g54 g54Var2) {
        super(Collections.EMPTY_LIST);
        this.h = new PointF();
        this.i = new PointF();
        this.j = g54Var;
        this.k = g54Var2;
        g(this.d);
    }

    @Override // defpackage.ke1
    public final Object d() {
        PointF pointF = this.h;
        float f = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f, MTTypesetterKt.kLineSkipLimitMultiplier);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // defpackage.ke1
    public final Object e(rp9 rp9Var, float f) {
        PointF pointF = this.h;
        float f2 = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f2, MTTypesetterKt.kLineSkipLimitMultiplier);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // defpackage.ke1
    public final void g(float f) {
        g54 g54Var = this.j;
        g54Var.g(f);
        g54 g54Var2 = this.k;
        g54Var2.g(f);
        this.h.set(((Float) g54Var.d()).floatValue(), ((Float) g54Var2.d()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((ge1) arrayList.get(i)).a();
            i++;
        }
    }
}
