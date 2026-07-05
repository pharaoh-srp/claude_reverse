package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0a implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g0a F;

    public /* synthetic */ e0a(g0a g0aVar, int i) {
        this.E = i;
        this.F = g0aVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        g0a g0aVar = this.F;
        switch (i) {
            case 0:
                kz9 kz9Var = (kz9) g0aVar.S.a();
                int iA = kz9Var.a();
                int i2 = 0;
                while (true) {
                    if (i2 >= iA) {
                        i2 = -1;
                    } else if (!kz9Var.c(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                kz9 kz9Var2 = (kz9) g0aVar.S.a();
                if (iIntValue < 0 || iIntValue >= kz9Var2.a()) {
                    StringBuilder sbU = vb7.u("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
                    sbU.append(kz9Var2.a());
                    sbU.append(')');
                    e39.a(sbU.toString());
                }
                gb9.D(g0aVar.d1(), null, null, new e41(g0aVar, iIntValue, null, 3), 3);
                return Boolean.TRUE;
        }
    }
}
