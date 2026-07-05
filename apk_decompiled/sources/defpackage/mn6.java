package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mn6 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nn6 F;

    public /* synthetic */ mn6(nn6 nn6Var, int i) {
        this.E = i;
        this.F = nn6Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        nn6 nn6Var = this.F;
        switch (i) {
            case 0:
                if (!(nn6Var.O() instanceof ve0)) {
                    return nn6Var.O();
                }
                return new ve0(((String) nn6Var.e.getValue()) + "://" + ((String) nn6Var.f.getValue()) + ":" + nn6Var.g.h());
            default:
                ze0 ze0Var = (ze0) nn6Var.h.getValue();
                ze0Var.getClass();
                gb9.D(nn6Var.a, null, null, new ix5(nn6Var, ze0Var, null, 2), 3);
                return iei.a;
        }
    }
}
