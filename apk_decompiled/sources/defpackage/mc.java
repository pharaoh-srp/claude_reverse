package defpackage;

import com.anthropic.claude.mainactivity.MainActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mc {
    public ArrayList a;
    public ArrayList b;
    public ad c;
    public ad d;
    public MainActivity e;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ic
            if (r0 == 0) goto L13
            r0 = r7
            ic r0 = (defpackage.ic) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ic r0 = new ic
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            boolean r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L5b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.sf5.h0(r7)
            goto L45
        L37:
            defpackage.sf5.h0(r7)
            r0.H = r3
            java.lang.String r7 = "android.permission.READ_CALENDAR"
            java.lang.Object r7 = r6.c(r7, r0)
            if (r7 != r4) goto L45
            goto L57
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0.E = r7
            r0.H = r2
            java.lang.String r1 = "android.permission.WRITE_CALENDAR"
            java.lang.Object r6 = r6.c(r1, r0)
            if (r6 != r4) goto L58
        L57:
            return r4
        L58:
            r5 = r7
            r7 = r6
            r6 = r5
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r6 == 0) goto L66
            if (r7 == 0) goto L66
            goto L67
        L66:
            r3 = 0
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r13, boolean r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc.b(java.util.Set, boolean, vp4):java.lang.Object");
    }

    public final Object c(String str, vp4 vp4Var) {
        MainActivity mainActivity = this.e;
        if (mainActivity != null && x44.x(mainActivity, str) == 0) {
            return Boolean.TRUE;
        }
        ua2 ua2Var = new ua2(1, zni.I(vp4Var));
        ua2Var.t();
        if (this.c == null) {
            ua2Var.resumeWith(Boolean.FALSE);
        } else {
            this.a.add(new lc(ua2Var, 0));
            ad adVar = this.c;
            if (adVar != null) {
                adVar.t(str);
            }
        }
        return ua2Var.r();
    }
}
