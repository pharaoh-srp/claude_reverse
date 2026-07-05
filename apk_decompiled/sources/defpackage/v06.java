package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v06 extends tg3 implements u06 {
    public final gsd i0;
    public final txb j0;
    public final cbi k0;
    public final zp3 l0;
    public final d16 m0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public v06(defpackage.qqb r8, defpackage.dm4 r9, defpackage.wc0 r10, boolean r11, int r12, defpackage.gsd r13, defpackage.txb r14, defpackage.cbi r15, defpackage.zp3 r16, defpackage.d16 r17, defpackage.neg r18) {
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
            r7.i0 = r13
            r7.j0 = r14
            r7.k0 = r15
            r1 = r16
            r7.l0 = r1
            r1 = r17
            r7.m0 = r1
            return
        L3a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v06.<init>(qqb, dm4, wc0, boolean, int, gsd, txb, cbi, zp3, d16, neg):void");
    }

    @Override // defpackage.j08, defpackage.h08
    public final boolean B() {
        return false;
    }

    @Override // defpackage.g16
    public final cbi C() {
        return this.k0;
    }

    @Override // defpackage.g16
    public final txb J() {
        return this.j0;
    }

    @Override // defpackage.g16
    public final d16 L() {
        return this.m0;
    }

    @Override // defpackage.tg3, defpackage.j08
    public final /* bridge */ /* synthetic */ j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        return e1(bo5Var, h08Var, i, wc0Var, negVar);
    }

    @Override // defpackage.tg3
    /* JADX INFO: renamed from: Y0 */
    public final /* bridge */ /* synthetic */ tg3 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        return e1(bo5Var, h08Var, i, wc0Var, negVar);
    }

    public final v06 e1(bo5 bo5Var, h08 h08Var, int i, wc0 wc0Var, neg negVar) {
        bo5Var.getClass();
        if (i == 0) {
            throw null;
        }
        wc0Var.getClass();
        v06 v06Var = new v06((qqb) bo5Var, (dm4) h08Var, wc0Var, this.h0, i, this.i0, this.j0, this.k0, this.l0, this.m0, negVar);
        v06Var.Z = this.Z;
        return v06Var;
    }

    @Override // defpackage.j08, defpackage.w9b
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.j08, defpackage.h08
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.j08, defpackage.h08
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.g16
    public final b3 t() {
        return this.i0;
    }

    public /* synthetic */ v06(qqb qqbVar, wc0 wc0Var, boolean z, gsd gsdVar, txb txbVar, cbi cbiVar, zp3 zp3Var, d16 d16Var) {
        this(qqbVar, null, wc0Var, z, 1, gsdVar, txbVar, cbiVar, zp3Var, d16Var, null);
    }
}
