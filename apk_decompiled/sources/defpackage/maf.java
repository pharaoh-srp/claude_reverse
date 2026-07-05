package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class maf {
    public final aaf a;
    public final l45 b;
    public final mx1 c;
    public fkg d;
    public final zy1 e;

    public maf(x0a x0aVar, l45 l45Var, mx1 mx1Var) {
        x0aVar.getClass();
        this.a = x0aVar;
        this.b = l45Var;
        this.c = mx1Var;
        this.e = wd6.P(-1, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
    
        if (defpackage.eve.k(r2, r10, r3, r1) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0057, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Path cross not found for [B:41:0x00d7, B:45:0x00ed], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.maf r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maf.a(maf, vp4):java.lang.Object");
    }

    public final boolean b(haf hafVar, float f, zy7 zy7Var, bz7 bz7Var) {
        boolean zB;
        int iOrdinal = hafVar.ordinal();
        int i = 0;
        aaf aafVar = this.a;
        if (iOrdinal == 0) {
            zB = aafVar.b();
        } else {
            if (iOrdinal != 1) {
                mr9.b();
                return false;
            }
            zB = aafVar.d();
        }
        if (!zB) {
            return false;
        }
        if (this.d == null) {
            this.d = gb9.D(this.b, null, null, new kaf(this, null, i), 3);
        }
        this.e.r(new iaf(hafVar, f, zy7Var, bz7Var));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (defpackage.knk.p(r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.laf
            if (r0 == 0) goto L13
            r0 = r7
            laf r0 = (defpackage.laf) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            laf r0 = new laf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            maf r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L5e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L33:
            maf r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L4f
        L39:
            defpackage.sf5.h0(r7)
            iaf r7 = defpackage.iaf.e
            iaf r7 = defpackage.yuk.f()
            r0.E = r6
            r0.H = r4
            zy1 r1 = r6.e
            java.lang.Object r7 = r1.b(r0, r7)
            if (r7 != r5) goto L4f
            goto L5d
        L4f:
            fkg r7 = r6.d
            if (r7 == 0) goto L5e
            r0.E = r6
            r0.H = r3
            java.lang.Object r7 = defpackage.knk.p(r7, r0)
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            r6.d = r2
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maf.c(vp4):java.lang.Object");
    }
}
