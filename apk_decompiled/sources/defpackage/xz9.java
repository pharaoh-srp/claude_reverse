package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xz9 {
    public final bz7 a;
    public bm7 c;
    public int f;
    public final w3c b = new w3c((byte) 0, 3);
    public int d = -1;
    public int e = -1;

    public xz9(bz7 bz7Var) {
        this.a = bz7Var;
    }

    public final wz9 a(int i, long j, boolean z, bz7 bz7Var) {
        bm7 bm7Var = this.c;
        if (bm7Var == null) {
            return th6.a;
        }
        lcd lcdVar = (lcd) bm7Var.d;
        boolean z2 = lcdVar instanceof h50;
        kcd kcdVar = new kcd(bm7Var, i, j, this.b, bz7Var);
        if (!z2) {
            lcdVar.a(kcdVar);
        } else if (z) {
            h50 h50Var = (h50) lcdVar;
            h50Var.F.add(new dgd(1, kcdVar));
            if (!h50Var.G) {
                h50Var.G = true;
                h50Var.E.post(h50Var);
            }
        } else {
            h50 h50Var2 = (h50) lcdVar;
            h50Var2.F.add(new dgd(0, kcdVar));
            if (!h50Var2.G) {
                h50Var2.G = true;
                h50Var2.E.post(h50Var2);
            }
        }
        dgj.U(i, "compose:lazy:schedule_prefetch:index");
        return kcdVar;
    }
}
