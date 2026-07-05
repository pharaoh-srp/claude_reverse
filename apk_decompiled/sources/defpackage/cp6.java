package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cp6 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ wp6 G;
    public final /* synthetic */ d77 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp6(wp6 wp6Var, d77 d77Var, int i) {
        super(1);
        this.F = i;
        this.G = wp6Var;
        this.H = d77Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        kl7 kl7Var;
        kl7 kl7Var2;
        int i = this.F;
        wp6 wp6Var = this.G;
        d77 d77Var = this.H;
        switch (i) {
            case 0:
                t5i t5iVar = (t5i) obj;
                zo6 zo6Var = zo6.E;
                zo6 zo6Var2 = zo6.F;
                if (t5iVar.a(zo6Var, zo6Var2)) {
                    he7 he7Var = wp6Var.a.a;
                    return (he7Var == null || (kl7Var2 = he7Var.b) == null) ? gp6.b : kl7Var2;
                }
                if (!t5iVar.a(zo6Var2, zo6.G)) {
                    return gp6.b;
                }
                he7 he7Var2 = d77Var.a.a;
                return (he7Var2 == null || (kl7Var = he7Var2.b) == null) ? gp6.b : kl7Var;
            default:
                int iOrdinal = ((zo6) obj).ordinal();
                float f = 1.0f;
                if (iOrdinal == 0) {
                    he7 he7Var3 = wp6Var.a.a;
                    if (he7Var3 != null) {
                        f = he7Var3.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        mr9.b();
                        return null;
                    }
                    he7 he7Var4 = d77Var.a.a;
                    if (he7Var4 != null) {
                        f = he7Var4.a;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
