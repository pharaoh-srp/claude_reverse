package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cb2 implements a45, b45 {
    public static final dd8 F = new dd8(14);
    public static final cb2 G = new cb2(1);
    public static final cb2 H = new cb2(2);
    public final /* synthetic */ int E;

    public /* synthetic */ cb2(int i) {
        this.E = i;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        switch (this.E) {
        }
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        switch (this.E) {
        }
        return nai.W(this, b45Var);
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        switch (this.E) {
            case 0:
                return F;
            case 1:
                return G;
            default:
                return this;
        }
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        switch (this.E) {
        }
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        switch (this.E) {
        }
        return nai.C(this, b45Var);
    }
}
