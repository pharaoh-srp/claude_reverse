package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class le1 implements pg6, ge1 {
    public ps9 A;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final ps9 d = new ps9(1, 0);
    public final ps9 e;
    public final ps9 f;
    public final ps9 g;
    public final ps9 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final pna o;
    public final rt9 p;
    public final xv8 q;
    public final g54 r;
    public le1 s;
    public le1 t;
    public List u;
    public final ArrayList v;
    public final c5i w;
    public boolean x;
    public float y;
    public BlurMaskFilter z;

    public le1(pna pnaVar, rt9 rt9Var) {
        char c = 1;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new ps9(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new ps9(mode2);
        ps9 ps9Var = new ps9(1, 0);
        this.g = ps9Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ps9 ps9Var2 = new ps9();
        ps9Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = ps9Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.y = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.o = pnaVar;
        this.p = rt9Var;
        List list = rt9Var.h;
        int i = 3;
        if (rt9Var.u == 3) {
            ps9Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            ps9Var.setXfermode(new PorterDuffXfermode(mode));
        }
        i80 i80Var = rt9Var.i;
        i80Var.getClass();
        c5i c5iVar = new c5i(i80Var);
        this.w = c5iVar;
        c5iVar.b(this);
        if (list != null && !list.isEmpty()) {
            xv8 xv8Var = new xv8(list);
            this.q = xv8Var;
            Iterator it = ((ArrayList) xv8Var.F).iterator();
            while (it.hasNext()) {
                ((ke1) it.next()).a(this);
            }
            for (ke1 ke1Var : (ArrayList) this.q.G) {
                d(ke1Var);
                ke1Var.a(this);
            }
        }
        rt9 rt9Var2 = this.p;
        if (rt9Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        g54 g54Var = new g54(rt9Var2.t, c == true ? 1 : 0);
        this.r = g54Var;
        g54Var.b = true;
        g54Var.a(new b5i(i, this));
        boolean z = ((Float) this.r.d()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        d(this.r);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
    }

    @Override // defpackage.pg6
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        g();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((le1) this.u.get(size)).w.d());
                }
            } else {
                le1 le1Var = this.t;
                if (le1Var != null) {
                    matrix2.preConcat(le1Var.w.d());
                }
            }
        }
        matrix2.preConcat(this.w.d());
    }

    public final void d(ke1 ke1Var) {
        if (ke1Var == null) {
            return;
        }
        this.v.add(ke1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // defpackage.pg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, defpackage.gh6 r25) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le1.f(android.graphics.Canvas, android.graphics.Matrix, int, gh6):void");
    }

    public final void g() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (le1 le1Var = this.t; le1Var != null; le1Var = le1Var.t) {
            this.u.add(le1Var);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i, gh6 gh6Var);

    public ive j() {
        return this.p.w;
    }

    public final boolean k() {
        xv8 xv8Var = this.q;
        return (xv8Var == null || ((ArrayList) xv8Var.F).isEmpty()) ? false : true;
    }

    public final void l() {
        hz4 hz4Var = this.o.E.a;
        String str = this.p.c;
        HashMap map = hz4Var.a;
    }

    public void m(float f) {
        c5i c5iVar = this.w;
        g54 g54Var = c5iVar.p;
        if (g54Var != null) {
            g54Var.g(f);
        }
        g54 g54Var2 = c5iVar.v;
        if (g54Var2 != null) {
            g54Var2.g(f);
        }
        g54 g54Var3 = c5iVar.w;
        if (g54Var3 != null) {
            g54Var3.g(f);
        }
        sp9 sp9Var = c5iVar.l;
        if (sp9Var != null) {
            sp9Var.g(f);
        }
        ke1 ke1Var = c5iVar.m;
        if (ke1Var != null) {
            ke1Var.g(f);
        }
        x98 x98Var = c5iVar.n;
        if (x98Var != null) {
            x98Var.g(f);
        }
        g54 g54Var4 = c5iVar.o;
        if (g54Var4 != null) {
            g54Var4.g(f);
        }
        g54 g54Var5 = c5iVar.q;
        if (g54Var5 != null) {
            g54Var5.g(f);
        }
        g54 g54Var6 = c5iVar.r;
        if (g54Var6 != null) {
            g54Var6.g(f);
        }
        g54 g54Var7 = c5iVar.s;
        if (g54Var7 != null) {
            g54Var7.g(f);
        }
        g54 g54Var8 = c5iVar.t;
        if (g54Var8 != null) {
            g54Var8.g(f);
        }
        g54 g54Var9 = c5iVar.u;
        if (g54Var9 != null) {
            g54Var9.g(f);
        }
        int i = 0;
        xv8 xv8Var = this.q;
        if (xv8Var != null) {
            ArrayList arrayList = (ArrayList) xv8Var.F;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ke1) arrayList.get(i2)).g(f);
            }
        }
        g54 g54Var10 = this.r;
        if (g54Var10 != null) {
            g54Var10.g(f);
        }
        le1 le1Var = this.s;
        if (le1Var != null) {
            le1Var.m(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((ke1) arrayList2.get(i)).g(f);
            i++;
        }
    }
}
