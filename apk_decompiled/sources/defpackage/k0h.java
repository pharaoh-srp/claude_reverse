package defpackage;

import android.graphics.Canvas;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class k0h implements wv8 {
    public final lrb a;
    public final qb5 b;
    public final int c;
    public final int d;

    public k0h(lrb lrbVar, qb5 qb5Var, int i, int i2) {
        this.a = lrbVar;
        this.b = qb5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.wv8
    public final int a() {
        return this.d;
    }

    @Override // defpackage.wv8
    public final int b() {
        return this.c;
    }

    @Override // defpackage.wv8
    public final long c() {
        return 2048L;
    }

    @Override // defpackage.wv8
    public final boolean d() {
        return true;
    }

    @Override // defpackage.wv8
    public final void e(Canvas canvas) {
        ArrayList arrayList;
        lrb lrbVar = this.a;
        lrbVar.getClass();
        d80 d80Var = (d80) lrbVar.G;
        qb5 qb5Var = this.b;
        if (qb5Var == null) {
            qb5Var = new qb5(29);
        }
        if (((sp0) qb5Var.F) == null) {
            qb5Var.F = new sp0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, canvas.getWidth(), canvas.getHeight(), 2);
        }
        h2f h2fVar = new h2f(0);
        h2fVar.b = canvas;
        h2fVar.c = lrbVar;
        c1f c1fVar = (c1f) lrbVar.F;
        if (c1fVar == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        sp0 sp0Var = c1fVar.o;
        gdd gddVar = c1fVar.n;
        d80 d80Var2 = (d80) qb5Var.E;
        if (d80Var2 != null) {
            ArrayList arrayList2 = d80Var2.F;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                d80Var.e((d80) qb5Var.E);
            }
        }
        h2fVar.d = new f2f();
        h2fVar.e = new Stack();
        h2fVar.U((f2f) h2fVar.d, b1f.a());
        f2f f2fVar = (f2f) h2fVar.d;
        f2fVar.f = null;
        f2fVar.h = false;
        ((Stack) h2fVar.e).push(new f2f(f2fVar));
        h2fVar.g = new Stack();
        h2fVar.f = new Stack();
        Boolean bool = c1fVar.d;
        if (bool != null) {
            ((f2f) h2fVar.d).h = bool.booleanValue();
        }
        h2fVar.R();
        sp0 sp0Var2 = new sp0((sp0) qb5Var.F);
        n0f n0fVar = c1fVar.r;
        if (n0fVar != null) {
            sp0Var2.d = n0fVar.b(h2fVar, sp0Var2.d);
        }
        n0f n0fVar2 = c1fVar.s;
        if (n0fVar2 != null) {
            sp0Var2.e = n0fVar2.b(h2fVar, sp0Var2.e);
        }
        h2fVar.I(c1fVar, sp0Var2, sp0Var, gddVar);
        h2fVar.Q();
        d80 d80Var3 = (d80) qb5Var.E;
        if (d80Var3 != null) {
            ArrayList arrayList3 = d80Var3.F;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = d80Var.F) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((u42) it.next()).c == 2) {
                    it.remove();
                }
            }
        }
    }
}
