package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ry {
    public final bz7 a;
    public bz7 b;
    public zy7 c;
    public yig d;
    public zn5 e;
    public final fxb f;
    public final lsc g;
    public final lsc h;
    public final wz5 i;
    public final hsc j;
    public final hsc k;
    public final lsc l;
    public final lsc m;
    public final qy n;

    public ry(Object obj) {
        this.a = new b8(11);
        this.f = new fxb();
        this.g = mpk.P(obj);
        this.h = mpk.P(obj);
        final int i = 0;
        this.i = mpk.w(new zy7(this) { // from class: ly
            public final /* synthetic */ ry F;

            {
                this.F = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    r4 = this;
                    int r0 = r2
                    ry r4 = r4.F
                    switch(r0) {
                        case 0: goto L4f;
                        default: goto L7;
                    }
                L7:
                    vq5 r0 = r4.c()
                    lsc r1 = r4.h
                    java.lang.Object r1 = r1.getValue()
                    float r0 = r0.f(r1)
                    vq5 r1 = r4.c()
                    wz5 r2 = r4.i
                    java.lang.Object r2 = r2.getValue()
                    float r1 = r1.f(r2)
                    float r1 = r1 - r0
                    float r2 = java.lang.Math.abs(r1)
                    boolean r3 = java.lang.Float.isNaN(r2)
                    if (r3 != 0) goto L48
                    r3 = 897988541(0x358637bd, float:1.0E-6)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 <= 0) goto L48
                    float r4 = r4.f()
                    float r4 = r4 - r0
                    float r4 = r4 / r1
                    int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                    if (r0 >= 0) goto L41
                    r4 = 0
                    goto L4a
                L41:
                    r0 = 1065353199(0x3f7fffef, float:0.999999)
                    int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L4a
                L48:
                    r4 = 1065353216(0x3f800000, float:1.0)
                L4a:
                    java.lang.Float r4 = java.lang.Float.valueOf(r4)
                    return r4
                L4f:
                    lsc r0 = r4.l
                    java.lang.Object r0 = r0.getValue()
                    if (r0 != 0) goto L94
                    hsc r0 = r4.j
                    float r0 = r0.h()
                    lsc r1 = r4.g
                    boolean r2 = java.lang.Float.isNaN(r0)
                    if (r2 != 0) goto L90
                    vq5 r2 = r4.c()
                    java.lang.Object r3 = r1.getValue()
                    float r2 = r2.f(r3)
                    boolean r3 = java.lang.Float.isNaN(r2)
                    if (r3 != 0) goto L8b
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L7c
                    goto L8b
                L7c:
                    vq5 r4 = r4.c()
                    java.lang.Object r0 = r4.a(r0)
                    if (r0 != 0) goto L94
                    java.lang.Object r0 = r1.getValue()
                    goto L94
                L8b:
                    java.lang.Object r0 = r1.getValue()
                    goto L94
                L90:
                    java.lang.Object r0 = r1.getValue()
                L94:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.a():java.lang.Object");
            }
        });
        this.j = new hsc(Float.NaN);
        final int i2 = 1;
        mpk.x(new zy7(this) { // from class: ly
            public final /* synthetic */ ry F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                /*
                    this = this;
                    int r0 = r2
                    ry r4 = r4.F
                    switch(r0) {
                        case 0: goto L4f;
                        default: goto L7;
                    }
                L7:
                    vq5 r0 = r4.c()
                    lsc r1 = r4.h
                    java.lang.Object r1 = r1.getValue()
                    float r0 = r0.f(r1)
                    vq5 r1 = r4.c()
                    wz5 r2 = r4.i
                    java.lang.Object r2 = r2.getValue()
                    float r1 = r1.f(r2)
                    float r1 = r1 - r0
                    float r2 = java.lang.Math.abs(r1)
                    boolean r3 = java.lang.Float.isNaN(r2)
                    if (r3 != 0) goto L48
                    r3 = 897988541(0x358637bd, float:1.0E-6)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 <= 0) goto L48
                    float r4 = r4.f()
                    float r4 = r4 - r0
                    float r4 = r4 / r1
                    int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                    if (r0 >= 0) goto L41
                    r4 = 0
                    goto L4a
                L41:
                    r0 = 1065353199(0x3f7fffef, float:0.999999)
                    int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L4a
                L48:
                    r4 = 1065353216(0x3f800000, float:1.0)
                L4a:
                    java.lang.Float r4 = java.lang.Float.valueOf(r4)
                    return r4
                L4f:
                    lsc r0 = r4.l
                    java.lang.Object r0 = r0.getValue()
                    if (r0 != 0) goto L94
                    hsc r0 = r4.j
                    float r0 = r0.h()
                    lsc r1 = r4.g
                    boolean r2 = java.lang.Float.isNaN(r0)
                    if (r2 != 0) goto L90
                    vq5 r2 = r4.c()
                    java.lang.Object r3 = r1.getValue()
                    float r2 = r2.f(r3)
                    boolean r3 = java.lang.Float.isNaN(r2)
                    if (r3 != 0) goto L8b
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L7c
                    goto L8b
                L7c:
                    vq5 r4 = r4.c()
                    java.lang.Object r0 = r4.a(r0)
                    if (r0 != 0) goto L94
                    java.lang.Object r0 = r1.getValue()
                    goto L94
                L8b:
                    java.lang.Object r0 = r1.getValue()
                    goto L94
                L90:
                    java.lang.Object r0 = r1.getValue()
                L94:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.a():java.lang.Object");
            }
        }, a5.N);
        this.k = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.l = mpk.P(null);
        this.m = mpk.P(new vq5(lm6.E, new float[0]));
        this.n = new qy(this);
    }

    public static Object b(ry ryVar, rz7 rz7Var, vp4 vp4Var) {
        Object objB = ryVar.f.b(zwb.E, new ny(ryVar, rz7Var, null, 0), vp4Var);
        return objB == m45.E ? objB : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, defpackage.zwb r12, defpackage.sz7 r13, defpackage.vp4 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.oy
            if (r0 == 0) goto L13
            r0 = r14
            oy r0 = (defpackage.oy) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            oy r0 = new oy
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.E
            int r1 = r0.G
            lsc r2 = r10.l
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r14)     // Catch: java.lang.Throwable -> L28
            goto L55
        L28:
            r0 = move-exception
            r10 = r0
            goto L59
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            r10 = 0
            return r10
        L32:
            defpackage.sf5.h0(r14)
            vq5 r14 = r10.c()
            boolean r14 = r14.c(r11)
            if (r14 == 0) goto L5d
            fxb r14 = r10.f     // Catch: java.lang.Throwable -> L28
            py r4 = new py     // Catch: java.lang.Throwable -> L28
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            r0.G = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r14.b(r12, r4, r0)     // Catch: java.lang.Throwable -> L28
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L55
            return r11
        L55:
            r2.setValue(r8)
            goto L75
        L59:
            r2.setValue(r8)
            throw r10
        L5d:
            r5 = r10
            r6 = r11
            bz7 r10 = r5.a
            java.lang.Object r10 = r10.invoke(r6)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L75
            lsc r10 = r5.h
            r10.setValue(r6)
            r5.g(r6)
        L75:
            iei r10 = defpackage.iei.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry.a(java.lang.Object, zwb, sz7, vp4):java.lang.Object");
    }

    public final vq5 c() {
        return (vq5) this.m.getValue();
    }

    public final boolean d() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float e(float f) {
        hsc hscVar = this.j;
        return wd6.d0((Float.isNaN(hscVar.h()) ? MTTypesetterKt.kLineSkipLimitMultiplier : hscVar.h()) + f, c().e(), c().d());
    }

    public final float f() {
        hsc hscVar = this.j;
        if (Float.isNaN(hscVar.h())) {
            e39.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return hscVar.h();
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(vq5 vq5Var, Object obj) {
        if (x44.r(c(), vq5Var)) {
            return;
        }
        this.m.setValue(vq5Var);
        fxb fxbVar = this.f;
        jxb jxbVar = fxbVar.b;
        jxb jxbVar2 = fxbVar.b;
        boolean zH = jxbVar.h();
        lsc lscVar = this.l;
        if (zH) {
            try {
                qy qyVar = this.n;
                float f = c().f(obj);
                if (!Float.isNaN(f)) {
                    qyVar.a(f, MTTypesetterKt.kLineSkipLimitMultiplier);
                    lscVar.setValue(null);
                }
                g(obj);
                this.h.setValue(obj);
                jxbVar2.d(null);
            } catch (Throwable th) {
                jxbVar2.d(null);
                throw th;
            }
        }
        if (zH) {
            return;
        }
        lscVar.setValue(obj);
    }

    public ry(bz7 bz7Var, Object obj) {
        this(obj);
        this.a = bz7Var;
    }
}
