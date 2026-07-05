package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w5d {
    public static final umg a = new umg(re4.Z);

    public static final void a(bv2 bv2Var, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1892278287);
        int i2 = (e18Var.f(bv2Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fvd fvdVar = a;
            yg2 yg2Var = (yg2) e18Var.j(fvdVar);
            boolean zF = e18Var.f(yg2Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new yg2(bv2Var, yg2Var);
                e18Var.k0(objN);
            }
            yg2 yg2Var2 = (yg2) objN;
            yg2Var2.b.setValue(bv2Var);
            j8.c(fvdVar.a(yg2Var2), ta4Var, e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new z00(bv2Var, ta4Var, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.t5d r4, defpackage.pz7 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.u5d
            if (r0 == 0) goto L13
            r0 = r6
            u5d r0 = (defpackage.u5d) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            u5d r0 = new u5d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r6)
            throw r4
        L2c:
            defpackage.sf5.h0(r6)
            r6 = r4
            hqb r6 = (defpackage.hqb) r6
            hqb r6 = r6.E
            boolean r6 = r6.R
            if (r6 == 0) goto L55
            androidx.compose.ui.node.Owner r6 = defpackage.yfd.X(r4)
            av9 r4 = defpackage.yfd.W(r4)
            qe4 r4 = r4.g0
            hyc r4 = (defpackage.hyc) r4
            r4.getClass()
            umg r1 = defpackage.w5d.a
            java.lang.Object r4 = defpackage.u00.I(r4, r1)
            yg2 r4 = (defpackage.yg2) r4
            r0.F = r2
            c(r6, r4, r5, r0)
            return
        L55:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            defpackage.sz6.p(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5d.b(t5d, pz7, vp4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.node.Owner r4, defpackage.yg2 r5, defpackage.pz7 r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.v5d
            if (r0 == 0) goto L13
            r0 = r7
            v5d r0 = (defpackage.v5d) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            v5d r0 = new v5d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.F
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L2a:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r7)
            throw r4
        L2f:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r7)
            throw r4
        L34:
            defpackage.sf5.h0(r7)
            if (r5 != 0) goto L41
            r0.F = r3
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r4.J(r6, r0)
            return
        L41:
            r0.F = r2
            r5.a(r4, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5d.c(androidx.compose.ui.node.Owner, yg2, pz7, vp4):void");
    }
}
