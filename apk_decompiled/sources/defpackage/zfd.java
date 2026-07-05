package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class zfd extends lrb {
    public boolean J;

    public static boolean X(c5c c5cVar) {
        return (c5cVar instanceof ikh) && xrg.f(((ikh) c5cVar).O());
    }

    public boolean Y(c5c c5cVar) {
        if (c5cVar != null && (c5cVar instanceof yj6)) {
            yj6 yj6Var = (yj6) c5cVar;
            if (!yj6Var.w("br") && !yj6Var.g0()) {
                if ((yj6Var.H.H & 1) == 0) {
                    if (!(yj6Var.E instanceof o96)) {
                        yj6 yj6VarC0 = yj6Var.c0();
                        for (int i = 0; i < 5 && yj6VarC0 != null; i++) {
                            if (!yj6VarC0.g0() && (yj6VarC0.H.H & 1) != 0) {
                                yj6VarC0 = yj6VarC0.y();
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean a0(c5c c5cVar) {
        if (c5cVar != null && c5cVar != ((c5c) this.F) && !this.J && !X(c5cVar)) {
            if (Y(c5cVar)) {
                return true;
            }
            c5c c5cVarI = c5cVar.I();
            while (X(c5cVarI)) {
                c5cVarI = c5cVarI.I();
            }
            if (Y(c5cVarI)) {
                return true;
            }
            yj6 yj6Var = c5cVar.E;
            if (Y(yj6Var) && !yj6Var.H.b(8)) {
                c5c c5cVarT = yj6Var.t();
                int i = 0;
                while (true) {
                    if (i >= 5 || c5cVarT == null) {
                        break;
                    }
                    if (!(c5cVarT instanceof ikh)) {
                        if (c5cVarI == null) {
                            return true;
                        }
                        if ((c5cVarI instanceof ikh) || (!Y(c5cVarI) && (c5cVarI instanceof yj6))) {
                            break;
                        }
                        return true;
                    }
                    c5cVarT = c5cVarT.z();
                    i++;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lrb
    public final void o(yj6 yj6Var, int i) {
        if (a0(yj6Var)) {
            N(i);
        }
        yj6Var.E((gjk) this.G, (n96) this.H);
        if (yj6Var.H.b(64)) {
            this.J = true;
        }
    }

    @Override // defpackage.lrb
    public final void p(a2a a2aVar, int i) {
        if (a0(a2aVar)) {
            N(i);
        }
        a2aVar.E((gjk) this.G, (n96) this.H);
    }

    @Override // defpackage.lrb
    public final void q(yj6 yj6Var, int i) {
        c5c c5cVarT = yj6Var.t();
        while (X(c5cVarT)) {
            c5cVarT = c5cVarT.z();
        }
        if (a0(c5cVarT)) {
            N(i);
        }
        yj6Var.h0((gjk) this.G, (n96) this.H);
        if (this.J && yj6Var.H.b(64)) {
            do {
                yj6Var = yj6Var.E;
                if (yj6Var == null) {
                    this.J = false;
                    return;
                }
            } while ((yj6Var.H.H & 64) == 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[PHI: r1
      0x000e: PHI (r1v3 int) = (r1v0 int), (r1v2 int), (r1v2 int) binds: [B:5:0x000c, B:27:0x004a, B:29:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.ikh r5, int r6, int r7) {
        /*
            r4 = this;
            boolean r6 = r4.J
            r0 = 0
            if (r6 != 0) goto L7a
            yj6 r6 = r5.E
            boolean r6 = r4.Y(r6)
            r1 = 4
            if (r6 != 0) goto L10
        Le:
            r0 = r1
            goto L5f
        L10:
            c5c r6 = r5.I()
            c5c r2 = r5.z()
            boolean r3 = r6 instanceof defpackage.yj6
            if (r3 == 0) goto L22
            boolean r3 = r4.Y(r6)
            if (r3 == 0) goto L30
        L22:
            if (r6 == 0) goto L2e
            boolean r3 = r6 instanceof defpackage.ikh
            if (r3 != 0) goto L30
            boolean r6 = r4.a0(r6)
            if (r6 == 0) goto L30
        L2e:
            r1 = 12
        L30:
            if (r2 == 0) goto L5c
            boolean r6 = r2 instanceof defpackage.ikh
            if (r6 != 0) goto L3d
            boolean r6 = r4.a0(r2)
            if (r6 == 0) goto L3d
            goto L5c
        L3d:
            boolean r6 = X(r2)
            if (r6 == 0) goto L48
            c5c r2 = r2.z()
            goto L3d
        L48:
            boolean r6 = r2 instanceof defpackage.ikh
            if (r6 == 0) goto Le
            a2a r2 = (defpackage.a2a) r2
            java.lang.String r6 = r2.O()
            int r6 = r6.codePointAt(r0)
            boolean r6 = defpackage.xrg.i(r6)
            if (r6 == 0) goto Le
        L5c:
            r6 = r1 | 16
            r0 = r6
        L5f:
            java.lang.String r6 = r5.O()
            boolean r6 = defpackage.xrg.f(r6)
            if (r6 != 0) goto L7a
            yj6 r6 = r5.E
            boolean r6 = r4.Y(r6)
            if (r6 == 0) goto L7a
            boolean r6 = r4.a0(r5)
            if (r6 == 0) goto L7a
            r4.N(r7)
        L7a:
            super.r(r5, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfd.r(ikh, int, int):void");
    }
}
