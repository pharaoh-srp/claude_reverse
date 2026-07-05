package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w40 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ e50 F;

    public /* synthetic */ w40(e50 e50Var, int i) {
        this.E = i;
        this.F = e50Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        fqb fqbVar = fqb.E;
        e50 e50Var = this.F;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) e50Var.a.e()).floatValue());
            case 1:
                return Float.valueOf(((Number) e50Var.c.e()).floatValue());
            case 2:
                return Float.valueOf(((Number) e50Var.e.e()).floatValue());
            case 3:
                return kxk.p(fqbVar, new d50(e50Var, 0));
            default:
                return kxk.p(fqbVar, new d50(e50Var, 1));
        }
    }
}
