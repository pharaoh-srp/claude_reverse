package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ux9 extends j0 {
    public final dfa c;
    public final /* synthetic */ vx9 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ux9(vx9 vx9Var) {
        this.d = vx9Var;
        el5 el5Var = vx9Var.N;
        super(((ke9) el5Var.E).a);
        gfa gfaVar = ((ke9) el5Var.E).a;
        tx9 tx9Var = new tx9(vx9Var, 0);
        gfaVar.getClass();
        this.c = new dfa(gfaVar, tx9Var);
    }

    @Override // defpackage.j0, defpackage.u9i
    public final xh3 a() {
        return this.d;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023f  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    @Override // defpackage.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection e() {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux9.e():java.util.Collection");
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return (List) this.c.a();
    }

    @Override // defpackage.m4
    public final zp3 h() {
        return ((ke9) this.d.N.E).m;
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: m */
    public final qqb a() {
        return this.d;
    }

    public final String toString() {
        String strB = this.d.getName().b();
        strB.getClass();
        return strB;
    }
}
