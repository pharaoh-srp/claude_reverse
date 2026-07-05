package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t1d implements pzi {
    public final pu0 a;

    public t1d(pu0 pu0Var) {
        this.a = pu0Var;
    }

    @Override // defpackage.pzi
    public final f5i a(zb0 zb0Var) {
        zb0Var.getClass();
        StringBuilder sb = new StringBuilder();
        String str = zb0Var.F;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        if (sb.length() == 0) {
            return new f5i(new zb0(""), c0l.K);
        }
        pu0 pu0Var = this.a;
        pu0Var.c.setLength(0);
        pu0Var.d.setLength(0);
        pu0Var.a.setLength(0);
        pu0Var.m = 0;
        pu0Var.b = "";
        pu0Var.n.setLength(0);
        pu0Var.p = "";
        pu0Var.q.setLength(0);
        pu0Var.e = true;
        pu0Var.f = false;
        pu0Var.g = false;
        pu0Var.h = false;
        pu0Var.r.clear();
        pu0Var.o = false;
        if (!pu0Var.l.equals(pu0Var.k)) {
            String str2 = pu0Var.j;
            u1d u1dVar = pu0Var.i;
            n2d n2dVarH = u1dVar.h(u1dVar.l(u1dVar.f(str2)));
            if (n2dVarH == null) {
                n2dVarH = pu0.t;
            }
            pu0Var.l = n2dVarH;
        }
        int length2 = sb.length() - 1;
        for (int i2 = 0; i2 < length2; i2++) {
            pu0Var.g(sb.charAt(i2));
        }
        String strG = pu0Var.g(bsg.J0(sb));
        return new f5i(new zb0(strG), new qb5((Object) zb0Var, (Object) strG, false));
    }
}
