package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class se9 extends qd9 {
    public static final /* synthetic */ wn9[] g;
    public final dfa f;

    static {
        kce kceVar = jce.a;
        g = new wn9[]{kceVar.g(new mrd(kceVar.b(se9.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se9(zae zaeVar, el5 el5Var) {
        super(el5Var, zaeVar, okg.t);
        zaeVar.getClass();
        el5Var.getClass();
        gfa gfaVar = ((ke9) el5Var.E).a;
        v01 v01Var = new v01(18, this);
        gfaVar.getClass();
        this.f = new dfa(gfaVar, v01Var);
    }

    @Override // defpackage.qd9, defpackage.jc0
    public final Map f() {
        return (Map) wd6.s0(this.f, g[0]);
    }
}
