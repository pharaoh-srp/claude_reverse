package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class g33 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    public /* synthetic */ g33(t53 t53Var, int i) {
        this.E = i;
        this.F = t53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.skd r7, defpackage.tp4 r8) {
        /*
            r6 = this;
            t53 r0 = r6.F
            kdg r1 = r0.l1
            boolean r2 = r8 instanceof defpackage.h33
            if (r2 == 0) goto L17
            r2 = r8
            h33 r2 = (defpackage.h33) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.H = r3
            goto L1c
        L17:
            h33 r2 = new h33
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r2.F
            int r8 = r2.H
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L32
            if (r8 != r3) goto L2c
            skd r7 = r2.E
            defpackage.sf5.h0(r6)
            goto L50
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L32:
            defpackage.sf5.h0(r6)
            if (r7 == 0) goto L3a
            java.lang.String r6 = r7.a
            goto L3b
        L3a:
            r6 = r4
        L3b:
            if (r6 == 0) goto L50
            omd r8 = r0.o
            koi r5 = r0.d
            java.lang.String r5 = r5.e
            r2.E = r7
            r2.H = r3
            java.lang.Object r6 = r8.c(r5, r6, r2)
            m45 r8 = defpackage.m45.E
            if (r6 != r8) goto L50
            return r8
        L50:
            if (r7 == 0) goto L61
            com.anthropic.claude.project.create.ProjectTemplateId r6 = r7.c
            if (r6 == 0) goto L61
            fod r7 = r0.p
            java.util.Map r7 = r7.c
            java.lang.Object r6 = r7.get(r6)
            r4 = r6
            znd r4 = (defpackage.znd) r4
        L61:
            if (r4 == 0) goto L6d
            r1.clear()
            java.util.ArrayList r6 = defpackage.yjk.q(r4)
            r1.addAll(r6)
        L6d:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g33.a(skd, tp4):java.lang.Object");
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                if (ChatId.m981equalsimpl0(((ChatId) obj).m984unboximpl(), t53Var.L0) && t53Var.L0() == null) {
                    t53Var.m1();
                }
                return ieiVar;
            case 1:
                return a((skd) obj, tp4Var);
            case 2:
                t53Var.A0.setValue(((Boolean) obj).booleanValue() ? fm3.H : fm3.E);
                return ieiVar;
            default:
                ((Boolean) obj).getClass();
                return t53.f0(t53Var, tp4Var);
        }
    }
}
