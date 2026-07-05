package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wy5 implements Iterator, mm9 {
    public int E = -1;
    public int F;
    public int G;
    public b79 H;
    public int I;
    public final /* synthetic */ xy5 J;

    public wy5(xy5 xy5Var) {
        this.J = xy5Var;
        int iE0 = wd6.e0(0, 0, xy5Var.a.length());
        this.F = iE0;
        this.G = iE0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            xy5 r0 = r8.J
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.G
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.E = r3
            r0 = 0
            r8.H = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.I
            int r7 = r7 + r6
            r8.I = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L36
        L22:
            b79 r0 = new b79
            int r2 = r8.F
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.H = r0
            r8.G = r5
            goto L7b
        L36:
            pz7 r0 = r0.c
            int r2 = r8.G
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            cpc r0 = (defpackage.cpc) r0
            if (r0 != 0) goto L5a
            b79 r0 = new b79
            int r2 = r8.F
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.H = r0
            r8.G = r5
            goto L7b
        L5a:
            java.lang.Object r1 = r0.E
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.F
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.F
            b79 r2 = defpackage.wd6.H0(r2, r1)
            r8.H = r2
            int r1 = r1 + r0
            r8.F = r1
            if (r0 != 0) goto L78
            r3 = r6
        L78:
            int r1 = r1 + r3
            r8.G = r1
        L7b:
            r8.E = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy5.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.E == -1) {
            a();
        }
        return this.E == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.E == -1) {
            a();
        }
        if (this.E == 0) {
            pmf.d();
            return null;
        }
        b79 b79Var = this.H;
        b79Var.getClass();
        this.H = null;
        this.E = -1;
        return b79Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
