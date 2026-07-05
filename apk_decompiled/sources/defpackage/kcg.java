package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kcg implements eo7 {
    public final ocg a;
    public final zn5 b;
    public final mb0 c;
    public final n9f d = r9f.c;

    public kcg(ocg ocgVar, zn5 zn5Var, mb0 mb0Var) {
        this.a = ocgVar;
        this.b = zn5Var;
        this.c = mb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.kcg r4, defpackage.h9f r5, float r6, float r7, defpackage.hcg r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.jcg
            if (r0 == 0) goto L14
            r0 = r9
            jcg r0 = (defpackage.jcg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            jcg r0 = new jcg
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.E
            int r1 = r9.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.sf5.h0(r0)
            goto L84
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 28
            if (r0 != 0) goto L3d
            goto L45
        L3d:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
        L45:
            nb0 r4 = defpackage.yb5.a(r6, r7, r3)
            return r4
        L4a:
            r9.G = r2
            zn5 r0 = r4.b
            float r1 = defpackage.wd6.W(r0, r1, r7)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L65
            ive r4 = new ive
            r4.<init>(r3, r0)
        L63:
            r0 = r6
            goto L70
        L65:
            xzd r0 = new xzd
            mb0 r4 = r4.c
            r1 = 13
            r0.<init>(r1, r4)
            r4 = r0
            goto L63
        L70:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.l(r5, r6, r7, r8, r9)
            m45 r4 = defpackage.m45.E
            if (r0 != r4) goto L84
            return r4
        L84:
            jb0 r0 = (defpackage.jb0) r0
            nb0 r4 = r0.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcg.b(kcg, h9f, float, float, hcg, vp4):java.lang.Object");
    }

    @Override // defpackage.eo7
    public Object a(h9f h9fVar, float f, tp4 tp4Var) {
        return d(h9fVar, f, owj.b, (vp4) tp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.h9f r10, float r11, defpackage.bz7 r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.gcg
            if (r0 == 0) goto L13
            r0 = r13
            gcg r0 = (defpackage.gcg) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            gcg r0 = new gcg
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bz7 r12 = r0.E
            defpackage.sf5.h0(r13)
            goto L4b
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.sf5.h0(r13)
            cd2 r3 = new cd2
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.E = r6
            r0.H = r2
            n9f r9 = r4.d
            java.lang.Object r13 = defpackage.gb9.c0(r9, r3, r0)
            m45 r9 = defpackage.m45.E
            if (r13 != r9) goto L4a
            return r9
        L4a:
            r12 = r6
        L4b:
            jb0 r13 = (defpackage.jb0) r13
            java.lang.Float r9 = new java.lang.Float
            r10 = 0
            r9.<init>(r10)
            r12.invoke(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcg.c(h9f, float, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.h9f r5, float r6, defpackage.bz7 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.icg
            if (r0 == 0) goto L13
            r0 = r8
            icg r0 = (defpackage.icg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            icg r0 = new icg
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r8)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r8)
            r0.G = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            m45 r4 = defpackage.m45.E
            if (r8 != r4) goto L3a
            return r4
        L3a:
            jb0 r8 = (defpackage.jb0) r8
            java.lang.Object r4 = r8.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            nb0 r5 = r8.b()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L50
            goto L5a
        L50:
            java.lang.Object r4 = r5.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L5a:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcg.d(h9f, float, bz7, vp4):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kcg)) {
            return false;
        }
        kcg kcgVar = (kcg) obj;
        return x44.r(kcgVar.c, this.c) && x44.r(kcgVar.b, this.b) && kcgVar.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
