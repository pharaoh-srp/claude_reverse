package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class om5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dn5 F;

    public /* synthetic */ om5(dn5 dn5Var, int i) {
        this.E = i;
        this.F = dn5Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        dn5 dn5Var = this.F;
        switch (i) {
            case 0:
                o72 o72Var = dn5Var.c;
                int i2 = ((o86) obj).a;
                Long lB = dn5Var.b();
                if (lB != null) {
                    u72 u72VarB = o72Var.b(o72Var.b(lB.longValue()).e);
                    if (dn5Var.a.h(u72VarB.a)) {
                        dn5Var.e.setValue(u72VarB);
                    }
                }
                dn5Var.g.setValue(new o86(i2));
                break;
            case 1:
                Long l = (Long) obj;
                lsc lscVar = dn5Var.f;
                if (l == null) {
                    lscVar.setValue(null);
                } else {
                    q62 q62VarA = dn5Var.c.a(l.longValue());
                    lscVar.setValue(dn5Var.a.h(q62VarA.E) ? q62VarA : null);
                }
                break;
            default:
                u72 u72VarB2 = dn5Var.c.b(((Long) obj).longValue());
                if (dn5Var.a.h(u72VarB2.a)) {
                    dn5Var.e.setValue(u72VarB2);
                }
                break;
        }
        return ieiVar;
    }
}
