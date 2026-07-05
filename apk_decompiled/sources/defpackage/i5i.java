package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i5i {
    public final yih a;
    public k6e b;
    public final lja c;
    public final wz5 d;
    public final lsc e;

    public i5i(yih yihVar, k6e k6eVar, lja ljaVar) {
        this.a = yihVar;
        this.b = k6eVar;
        this.c = ljaVar;
        this.d = ljaVar != null ? mpk.w(new vc8(this, 25, ljaVar)) : null;
        d9j d9jVar = d9j.E;
        this.e = mpk.P(new vif(d9jVar, d9jVar));
    }

    public static void h(i5i i5iVar, CharSequence charSequence, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        cgh cghVar = (i & 4) != 0 ? cgh.E : cgh.F;
        if ((i & 8) != 0) {
            z = true;
        }
        yih yihVar = i5iVar.a;
        k6e k6eVar = i5iVar.b;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        if (z2) {
            dfhVar.e(null);
        }
        long j = dfhVar.H;
        dfhVar.c(kkh.g(j), kkh.f(j), charSequence);
        int length = charSequence.length() + kkh.g(j);
        bok.k(dfhVar, length, length);
        i5iVar.l(dfhVar);
        yih.a(yihVar, k6eVar, z, cghVar);
        yihVar.f(true);
    }

    public static void i(i5i i5iVar, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        yih yihVar = i5iVar.a;
        k6e k6eVar = i5iVar.b;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        long jE = i5iVar.e(j);
        dfhVar.c(kkh.g(jE), kkh.f(jE), str);
        int length = str.length() + kkh.g(jE);
        bok.k(dfhVar, length, length);
        i5iVar.l(dfhVar);
        yih.a(yihVar, k6eVar, z, cgh.E);
        yihVar.f(true);
    }

    public final void a() {
        k6e k6eVar = this.b;
        yih yihVar = this.a;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        int iF = kkh.f(dfhVar.H);
        bok.k(dfhVar, iF, iF);
        yih.a(yihVar, k6eVar, true, cgh.E);
        yihVar.f(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.n60 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.h5i
            if (r0 == 0) goto L13
            r0 = r6
            h5i r0 = (defpackage.h5i) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            h5i r0 = new h5i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            defpackage.sf5.h0(r6)
            goto L56
        L2b:
            defpackage.sf5.h0(r6)
            r0.G = r2
            ua2 r6 = new ua2
            tp4 r0 = defpackage.zni.I(r0)
            r6.<init>(r2, r0)
            r6.t()
            yih r0 = r4.a
            wwb r0 = r0.g
            r0.b(r5)
            y73 r0 = new y73
            r1 = 10
            r0.<init>(r4, r1, r5)
            r6.w(r0)
            java.lang.Object r4 = r6.r()
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L56
            return
        L56:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5i.b(n60, vp4):void");
    }

    public final void c() {
        k6e k6eVar = this.b;
        yih yihVar = this.a;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        bok.g(dfhVar, kkh.g(dfhVar.H), kkh.f(dfhVar.H));
        int iG = kkh.g(dfhVar.H);
        bok.k(dfhVar, iG, iG);
        l(dfhVar);
        yih.a(yihVar, k6eVar, true, cgh.F);
        yihVar.f(true);
    }

    public final efh d() {
        g5i g5iVar;
        wz5 wz5Var = this.d;
        return (wz5Var == null || (g5iVar = (g5i) wz5Var.getValue()) == null) ? this.a.d() : g5iVar.b();
    }

    public final long e(long j) {
        g5i g5iVar;
        wz5 wz5Var = this.d;
        h79 h79VarA = (wz5Var == null || (g5iVar = (g5i) wz5Var.getValue()) == null) ? null : g5iVar.a();
        if (h79VarA == null) {
            return j;
        }
        int i = kkh.c;
        long jA = h79VarA.a((int) (j >> 32), false);
        long jA2 = kkh.d(j) ? jA : h79VarA.a((int) (4294967295L & j), false);
        int iMin = Math.min(kkh.g(jA), kkh.g(jA2));
        int iMax = Math.max(kkh.f(jA), kkh.f(jA2));
        return kkh.h(j) ? mwa.m(iMax, iMin) : mwa.m(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5i)) {
            return false;
        }
        i5i i5iVar = (i5i) obj;
        return x44.r(this.a, i5iVar.a) && x44.r(this.c, i5iVar.c);
    }

    public final long f(long j) {
        g5i g5iVar;
        wz5 wz5Var = this.d;
        h79 h79VarA = (wz5Var == null || (g5iVar = (g5i) wz5Var.getValue()) == null) ? null : g5iVar.a();
        return h79VarA != null ? bm4.p(j, h79VarA, (vif) this.e.getValue()) : j;
    }

    public final void g(CharSequence charSequence) {
        k6e k6eVar = this.b;
        yih yihVar = this.a;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        bok.g(dfhVar, 0, dfhVar.F.length());
        dfhVar.append(charSequence.toString());
        l(dfhVar);
        yih.a(yihVar, k6eVar, true, cgh.E);
        yihVar.f(true);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lja ljaVar = this.c;
        return (iHashCode + (ljaVar != null ? ljaVar.hashCode() : 0)) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        k6e k6eVar = this.b;
        yih yihVar = this.a;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        int i = kkh.c;
        bok.k(dfhVar, (int) (j >> 32), (int) (j & 4294967295L));
        yih.a(yihVar, k6eVar, true, cgh.E);
        yihVar.f(true);
    }

    public final void l(dfh dfhVar) {
        if (((wwb) dfhVar.a().F).G <= 0 || !kkh.d(dfhVar.H)) {
            return;
        }
        d9j d9jVar = d9j.E;
        this.e.setValue(new vif(d9jVar, d9jVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        yih yihVar = this.a;
        sb.append(yihVar);
        sb.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb.append(this.c);
        sb.append(", codepointTransformedText=");
        sb.append(this.d);
        sb.append(", outputText=\"");
        sb.append((Object) yihVar.d());
        sb.append("\", visualText=\"");
        sb.append((Object) d());
        sb.append("\")");
        return sb.toString();
    }
}
