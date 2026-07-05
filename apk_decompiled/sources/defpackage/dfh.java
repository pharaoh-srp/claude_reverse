package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dfh implements Appendable {
    public final h79 E;
    public final euc F;
    public nyj G;
    public long H;
    public kkh I;
    public wwb J;
    public cpc K;

    public dfh(efh efhVar, nyj nyjVar, h79 h79Var, int i) {
        wwb wwbVar = null;
        nyjVar = (i & 2) != 0 ? null : nyjVar;
        this.E = (i & 8) != 0 ? null : h79Var;
        euc eucVar = new euc();
        eucVar.E = efhVar;
        eucVar.G = -1;
        eucVar.H = -1;
        this.F = eucVar;
        this.G = nyjVar != null ? new nyj(nyjVar) : null;
        long j = efhVar.H;
        List list = efhVar.E;
        this.H = j;
        this.I = efhVar.I;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            yb0[] yb0VarArr = new yb0[size];
            for (int i2 = 0; i2 < size; i2++) {
                yb0VarArr[i2] = (yb0) list.get(i2);
            }
            wwbVar = new wwb(size, yb0VarArr);
        }
        this.J = wwbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.efh g(defpackage.dfh r9, long r10, defpackage.kkh r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L6
            long r10 = r9.H
        L6:
            r2 = r10
            r10 = r13 & 2
            if (r10 == 0) goto Ld
            kkh r12 = r9.I
        Ld:
            r4 = r12
            wwb r10 = r9.J
            r11 = 0
            if (r10 == 0) goto L1f
            java.util.List r10 = r10.g()
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L1f
            r6 = r10
            goto L20
        L1f:
            r6 = r11
        L20:
            efh r0 = new efh
            euc r9 = r9.F
            java.lang.String r1 = r9.toString()
            r5 = 0
            r8 = 8
            r7 = 0
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfh.g(dfh, long, kkh, int):efh");
    }

    public final nyj a() {
        nyj nyjVar = this.G;
        if (nyjVar != null) {
            return nyjVar;
        }
        nyj nyjVar2 = new nyj((nyj) null);
        this.G = nyjVar2;
        return nyjVar2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            euc eucVar = this.F;
            b(eucVar.length(), eucVar.length(), charSequence.length());
            eucVar.a(eucVar.length(), eucVar.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r11, int r12, int r13) {
        /*
            r10 = this;
            nyj r0 = r10.a()
            if (r11 != r12) goto La
            if (r13 != 0) goto La
            goto La2
        La:
            int r1 = java.lang.Math.min(r11, r12)
            int r2 = java.lang.Math.max(r11, r12)
            int r3 = r2 - r1
            int r3 = r13 - r3
            r4 = 0
            r5 = 0
            r6 = r5
            r5 = r4
        L1a:
            java.lang.Object r7 = r0.F
            wwb r7 = (defpackage.wwb) r7
            int r8 = r7.G
            if (r4 >= r8) goto L8e
            java.lang.Object[] r7 = r7.E
            r7 = r7[r4]
            eh2 r7 = (defpackage.eh2) r7
            int r8 = r7.d()
            if (r1 > r8) goto L31
            if (r8 > r2) goto L31
            goto L53
        L31:
            int r8 = r7.c()
            if (r1 > r8) goto L3a
            if (r8 > r2) goto L3a
            goto L53
        L3a:
            int r8 = r7.d()
            int r9 = r7.c()
            if (r1 > r9) goto L47
            if (r8 > r1) goto L47
            goto L53
        L47:
            int r8 = r7.d()
            int r9 = r7.c()
            if (r2 > r9) goto L68
            if (r8 > r2) goto L68
        L53:
            if (r6 != 0) goto L57
            r6 = r7
            goto L65
        L57:
            int r8 = r7.c()
            r6.g(r8)
            int r7 = r7.a()
            r6.e(r7)
        L65:
            int r4 = r4 + 1
            goto L1a
        L68:
            int r8 = r7.d()
            if (r8 <= r2) goto L74
            if (r5 != 0) goto L74
            r0.z(r6, r1, r2, r3)
            r5 = 1
        L74:
            if (r5 == 0) goto L86
            int r8 = r7.d()
            int r8 = r8 + r3
            r7.h(r8)
            int r8 = r7.c()
            int r8 = r8 + r3
            r7.g(r8)
        L86:
            java.lang.Object r8 = r0.G
            wwb r8 = (defpackage.wwb) r8
            r8.b(r7)
            goto L65
        L8e:
            if (r5 != 0) goto L93
            r0.z(r6, r1, r2, r3)
        L93:
            java.lang.Object r1 = r0.F
            wwb r1 = (defpackage.wwb) r1
            java.lang.Object r2 = r0.G
            wwb r2 = (defpackage.wwb) r2
            r0.F = r2
            r0.G = r1
            r1.h()
        La2:
            h79 r0 = r10.E
            if (r0 == 0) goto La9
            r0.i(r11, r12, r13)
        La9:
            long r0 = r10.H
            long r11 = defpackage.bok.e(r11, r12, r13, r0)
            r10.H = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfh.b(int, int, int):void");
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            e39.a("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            e39.a("Expected textStart=0 <= textEnd=" + length);
        }
        euc eucVar = this.F;
        int iE0 = wd6.e0(i, 0, eucVar.length());
        int iE02 = wd6.e0(i2, 0, eucVar.length());
        int iE03 = wd6.e0(0, 0, charSequence.length());
        int iE04 = wd6.e0(length, 0, charSequence.length());
        b(iE0, iE02, iE04 - iE03);
        eucVar.a(iE0, iE02, charSequence, iE03, iE04);
        e(null);
        this.K = null;
    }

    public final void d(int i, int i2, List list) {
        euc eucVar = this.F;
        if (i < 0 || i > eucVar.length()) {
            mr9.e(eucVar.length(), vb7.u("start (", i, ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > eucVar.length()) {
            mr9.e(eucVar.length(), vb7.u("end (", i2, ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            sz6.p(grc.o(i, i2, "Do not set reversed or empty range: ", " > "));
            return;
        }
        e(new kkh(mwa.m(i, i2)));
        wwb wwbVar = this.J;
        if (wwbVar != null) {
            wwbVar.h();
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.J == null) {
            this.J = new wwb(0, new yb0[16]);
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            yb0 yb0Var = (yb0) list.get(i3);
            wwb wwbVar2 = this.J;
            if (wwbVar2 != null) {
                wwbVar2.b(yb0.a(yb0Var, null, yb0Var.b + i, yb0Var.c + i, 9));
            }
        }
    }

    public final void e(kkh kkhVar) {
        if (kkhVar != null && !kkh.d(kkhVar.a)) {
            this.I = kkhVar;
            return;
        }
        this.I = null;
        wwb wwbVar = this.J;
        if (wwbVar != null) {
            wwbVar.h();
        }
    }

    public final void f(long j) {
        long jM = mwa.m(0, this.F.length());
        if (!kkh.a(jM, j)) {
            e39.a("Expected " + ((Object) kkh.i(j)) + " to be in " + ((Object) kkh.i(jM)));
        }
        this.H = j;
        this.K = null;
    }

    public final String toString() {
        return this.F.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        euc eucVar = this.F;
        b(eucVar.length(), eucVar.length(), 1);
        int length = eucVar.length();
        int length2 = eucVar.length();
        String strValueOf = String.valueOf(c);
        eucVar.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            euc eucVar = this.F;
            b(eucVar.length(), eucVar.length(), i2 - i);
            int length = eucVar.length();
            int length2 = eucVar.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            eucVar.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
