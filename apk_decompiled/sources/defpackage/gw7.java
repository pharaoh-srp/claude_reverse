package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gw7 extends yj6 {
    public final ck6 N;

    static {
        String[] strArr = xvj.b;
        String[] strArr2 = xrg.a;
        wzd.K(xrg.j(", ", Arrays.asList(strArr)));
    }

    public gw7(z3h z3hVar, n31 n31Var) {
        super(z3hVar, null, n31Var);
        this.N = new ck6();
    }

    @Override // defpackage.c5c
    public final void L(c5c c5cVar) {
        super.L(c5cVar);
        this.N.remove(c5cVar);
    }

    @Override // defpackage.yj6
    /* JADX INFO: renamed from: X */
    public final yj6 clone() {
        return (gw7) super.clone();
    }

    @Override // defpackage.yj6, defpackage.c5c
    public final Object clone() {
        return (gw7) super.clone();
    }

    @Override // defpackage.yj6, defpackage.c5c
    /* JADX INFO: renamed from: q */
    public final c5c clone() {
        return (gw7) super.clone();
    }
}
