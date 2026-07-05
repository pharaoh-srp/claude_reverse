package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class a0f extends wif {
    public final bg9 d;
    public final h86 e;
    public p5e f;
    public final zy1 g = wd6.P(FreeTypeConstants.FT_LOAD_PEDANTIC, 4, py1.F);
    public final yp7 h = new yp7(j8.r(new b3f(new o6e(this, (tp4) null, 7))), new qv(this, (tp4) null), 0);

    public a0f(bg9 bg9Var, h86 h86Var) {
        this.d = bg9Var;
        this.e = h86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.a0f r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.xze
            if (r0 == 0) goto L13
            r0 = r6
            xze r0 = (defpackage.xze) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xze r0 = new xze
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 != r2) goto L22
            goto L28
        L22:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return
        L28:
            defpackage.sf5.h0(r6)
        L2b:
            y6j r6 = r5.s()
            java.lang.String r1 = "{ \"type\": \"KeepAlive\" }"
            p5e r6 = (defpackage.p5e) r6
            r6.i(r1)
            r0.G = r2
            r3 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r6 = defpackage.d4c.K(r3, r0)
            m45 r1 = defpackage.m45.E
            if (r6 != r1) goto L2b
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0f.q(a0f, vp4):void");
    }

    public static void r(a0f a0fVar) {
        ((p5e) a0fVar.s()).c(1000, null);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void j(y6j y6jVar, int i, String str) {
        y6jVar.getClass();
        str.getClass();
        super.j(y6jVar, i, str);
        this.g.m(null);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
        super.l(y6jVar, exc, pqeVar);
        this.g.i(exc, false);
    }

    @Override // defpackage.rkk
    public final void m(y6j y6jVar, String str) throws Throwable {
        Object objI = iik.i(this.g, str);
        if (objI instanceof zh2) {
            Throwable thA = ai2.a(objI);
            if (thA != null) {
                throw thA;
            }
            sz6.j("trySendBlocking should always return non-null");
        }
    }

    public final y6j s() {
        p5e p5eVar = this.f;
        if (p5eVar != null) {
            return p5eVar;
        }
        x44.o0("ws");
        throw null;
    }

    public final void t() {
        ((p5e) s()).i("{ \"type\": \"CloseStream\" }");
    }
}
