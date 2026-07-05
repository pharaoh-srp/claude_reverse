package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p25 extends xjk {
    public final /* synthetic */ int c;
    public final Object d;

    public p25() {
        this.c = 0;
        this.d = new StringBuilder();
    }

    @Override // defpackage.xjk
    public void C(aeg aegVar) {
        switch (this.c) {
            case 0:
                ((StringBuilder) this.d).append('\n');
                break;
            default:
                super.C(aegVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [b5c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [b5c, q39] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b5c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [b5c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.xjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.edh r11) {
        /*
            r10 = this;
            int r0 = r10.c
            java.lang.Object r10 = r10.d
            switch(r0) {
                case 0: goto L9e;
                default: goto L7;
            }
        L7:
            ot9 r10 = (defpackage.ot9) r10
            java.util.List r10 = r10.a
            java.lang.String r0 = r11.g
            r0.getClass()
            r1 = 6
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = 0
            int r1 = defpackage.bsg.F0(r0, r2, r3, r1)
            if (r1 >= 0) goto L1d
            goto L9d
        L1d:
            r4 = r11
        L1e:
            if (r1 < 0) goto L88
            int r5 = r1 + 1
            r6 = 57345(0xe001, float:8.0357E-41)
            r7 = 4
            int r6 = defpackage.bsg.F0(r0, r6, r5, r7)
            if (r6 < 0) goto L88
            if (r3 >= r1) goto L3b
            edh r8 = new edh
            java.lang.String r3 = r0.substring(r3, r1)
            r8.<init>(r3)
            r4.e(r8)
            r4 = r8
        L3b:
            java.lang.String r3 = r0.substring(r5, r6)
            r5 = 10
            java.lang.Integer r3 = defpackage.isg.r0(r5, r3)
            if (r3 == 0) goto L6f
            r5 = r10
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            int r8 = r3.intValue()
            if (r8 < 0) goto L6f
            if (r8 >= r5) goto L6f
            q39 r1 = new q39
            r1.<init>()
            java.lang.String r5 = ""
            r1.g = r5
            int r3 = r3.intValue()
            java.lang.Object r3 = r10.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            r1.g = r3
            goto L7b
        L6f:
            edh r3 = new edh
            int r5 = r6 + 1
            java.lang.String r1 = r0.substring(r1, r5)
            r3.<init>(r1)
            r1 = r3
        L7b:
            r4.e(r1)
            int r3 = r6 + 1
            int r4 = defpackage.bsg.F0(r0, r2, r3, r7)
            r9 = r4
            r4 = r1
            r1 = r9
            goto L1e
        L88:
            int r10 = r0.length()
            if (r3 >= r10) goto L9a
            edh r10 = new edh
            java.lang.String r0 = r0.substring(r3)
            r10.<init>(r0)
            r4.e(r10)
        L9a:
            r11.i()
        L9d:
            return
        L9e:
            java.lang.StringBuilder r10 = (java.lang.StringBuilder) r10
            java.lang.String r11 = r11.g
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p25.E(edh):void");
    }

    public void H(b5c b5cVar, String str) {
        b5c b5cVar2 = b5cVar.b;
        if (b5cVar2 instanceof edh) {
            edh edhVar = (edh) b5cVar2;
            if (edhVar.e != null) {
                return;
            }
            ot9 ot9Var = (ot9) this.d;
            String str2 = edhVar.g;
            str2.getClass();
            String strB = ot9.b(ot9Var, str2);
            if (!x44.r(strB, str)) {
                if (!isg.h0(str, "://" + strB, false)) {
                    return;
                }
            }
            edhVar.g = strB;
        }
    }

    @Override // defpackage.xjk
    public void s(lf8 lf8Var) {
        switch (this.c) {
            case 0:
                ((StringBuilder) this.d).append('\n');
                break;
            default:
                super.s(lf8Var);
                break;
        }
    }

    @Override // defpackage.xjk
    public void w(vv8 vv8Var) {
        switch (this.c) {
            case 1:
                ot9 ot9Var = (ot9) this.d;
                String str = vv8Var.g;
                str.getClass();
                vv8Var.g = ot9.b(ot9Var, str);
                String str2 = vv8Var.h;
                vv8Var.h = str2 != null ? ot9.b(ot9Var, str2) : null;
                String str3 = vv8Var.g;
                str3.getClass();
                H(vv8Var, str3);
                G(vv8Var);
                break;
            default:
                super.w(vv8Var);
                break;
        }
    }

    @Override // defpackage.xjk
    public void y(l6a l6aVar) {
        switch (this.c) {
            case 1:
                ot9 ot9Var = (ot9) this.d;
                String str = l6aVar.g;
                str.getClass();
                l6aVar.g = ot9.b(ot9Var, str);
                String str2 = l6aVar.h;
                l6aVar.h = str2 != null ? ot9.b(ot9Var, str2) : null;
                String str3 = l6aVar.g;
                str3.getClass();
                H(l6aVar, str3);
                G(l6aVar);
                break;
            default:
                super.y(l6aVar);
                break;
        }
    }

    public p25(ot9 ot9Var) {
        this.c = 1;
        this.d = ot9Var;
    }
}
