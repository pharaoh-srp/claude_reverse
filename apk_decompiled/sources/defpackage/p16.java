package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p16 extends c7g implements u06 {
    public final usd h0;
    public final txb i0;
    public final cbi j0;
    public final zp3 k0;
    public final d16 l0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public p16(defpackage.bo5 r8, defpackage.c7g r9, defpackage.wc0 r10, defpackage.sxb r11, int r12, defpackage.usd r13, defpackage.txb r14, defpackage.cbi r15, defpackage.zp3 r16, defpackage.d16 r17, defpackage.neg r18) {
        /*
            r7 = this;
            r8.getClass()
            r10.getClass()
            if (r12 == 0) goto L3a
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16.getClass()
            if (r18 != 0) goto L20
            zp3 r0 = defpackage.neg.n
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            goto L28
        L20:
            r6 = r18
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
        L28:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.h0 = r13
            r7.i0 = r14
            r7.j0 = r15
            r1 = r16
            r7.k0 = r1
            r1 = r17
            r7.l0 = r1
            return
        L3a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p16.<init>(bo5, c7g, wc0, sxb, int, usd, txb, cbi, zp3, d16, neg):void");
    }

    @Override // defpackage.g16
    public final cbi C() {
        return this.j0;
    }

    @Override // defpackage.g16
    public final txb J() {
        return this.i0;
    }

    @Override // defpackage.g16
    public final d16 L() {
        return this.l0;
    }

    @Override // defpackage.c7g, defpackage.j08
    public final j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        sxb sxbVar2;
        bo5Var.getClass();
        if (i == 0) {
            throw null;
        }
        wc0Var.getClass();
        c7g c7gVar = (c7g) h08Var;
        if (sxbVar == null) {
            sxb name = getName();
            name.getClass();
            sxbVar2 = name;
        } else {
            sxbVar2 = sxbVar;
        }
        p16 p16Var = new p16(bo5Var, c7gVar, wc0Var, sxbVar2, i, this.h0, this.i0, this.j0, this.k0, this.l0, negVar);
        p16Var.Z = this.Z;
        return p16Var;
    }

    @Override // defpackage.g16
    public final b3 t() {
        return this.h0;
    }

    public /* synthetic */ p16(bo5 bo5Var, wc0 wc0Var, sxb sxbVar, int i, usd usdVar, txb txbVar, cbi cbiVar, zp3 zp3Var, d16 d16Var) {
        this(bo5Var, null, wc0Var, sxbVar, i, usdVar, txbVar, cbiVar, zp3Var, d16Var, null);
    }
}
