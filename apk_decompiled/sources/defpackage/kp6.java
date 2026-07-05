package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp6 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ lp6 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp6(lp6 lp6Var, int i) {
        super(1);
        this.F = i;
        this.G = lp6Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        kl7 kl7Var;
        kl7 kl7Var2;
        int i = this.F;
        zo6 zo6Var = zo6.G;
        zo6 zo6Var2 = zo6.F;
        zo6 zo6Var3 = zo6.E;
        lp6 lp6Var = this.G;
        switch (i) {
            case 0:
                t5i t5iVar = (t5i) obj;
                boolean zA = t5iVar.a(zo6Var3, zo6Var2);
                Object obj2 = null;
                if (zA) {
                    dh2 dh2Var = lp6Var.W.a.c;
                    if (dh2Var != null) {
                        obj2 = dh2Var.c;
                    }
                } else if (t5iVar.a(zo6Var2, zo6Var)) {
                    dh2 dh2Var2 = lp6Var.X.a.c;
                    if (dh2Var2 != null) {
                        obj2 = dh2Var2.c;
                    }
                } else {
                    obj2 = gp6.d;
                }
                return obj2 == null ? gp6.d : obj2;
            default:
                t5i t5iVar2 = (t5i) obj;
                if (t5iVar2.a(zo6Var3, zo6Var2)) {
                    s9g s9gVar = lp6Var.W.a.b;
                    return (s9gVar == null || (kl7Var2 = s9gVar.b) == null) ? gp6.c : kl7Var2;
                }
                if (!t5iVar2.a(zo6Var2, zo6Var)) {
                    return gp6.c;
                }
                s9g s9gVar2 = lp6Var.X.a.b;
                return (s9gVar2 == null || (kl7Var = s9gVar2.b) == null) ? gp6.c : kl7Var;
        }
    }
}
