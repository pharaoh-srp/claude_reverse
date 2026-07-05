package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class je4 implements fjc, a45 {
    public static final a5 F = new a5(15);
    public final e18 E;

    public je4(e18 e18Var) {
        this.E = e18Var;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final /* bridge */ c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    @Override // defpackage.fjc
    public final List a(Integer num) {
        return this.E.G();
    }

    @Override // defpackage.fjc
    public final boolean g() {
        return this.E.C;
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return F;
    }

    @Override // defpackage.c45
    public final /* bridge */ c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final /* bridge */ a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
