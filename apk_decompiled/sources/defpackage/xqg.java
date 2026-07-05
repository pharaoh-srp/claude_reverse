package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xqg implements zy5 {
    public final boolean a;

    public xqg(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zy5
    public final int a(yy5 yy5Var, yy5 yy5Var2) {
        if (yy5Var.g() != yy5Var2.g() || yy5Var.g() > 2) {
            return 0;
        }
        edh edhVarE = yy5Var.e();
        wqg wqgVar = new wqg();
        dn0 dn0Var = new dn0(3);
        dn0Var.i(yy5Var.f(yy5Var.g()));
        Iterator it = fuk.q(edhVarE, yy5Var2.c()).iterator();
        while (true) {
            a6c a6cVar = (a6c) it;
            if (!a6cVar.hasNext()) {
                dn0Var.i(yy5Var2.d(yy5Var2.g()));
                wqgVar.g(dn0Var.n());
                edhVarE.e(wqgVar);
                return yy5Var.g();
            }
            b5c b5cVar = (b5c) a6cVar.next();
            wqgVar.c(b5cVar);
            dn0Var.h(b5cVar.d());
        }
    }

    @Override // defpackage.zy5
    public final char b() {
        return '~';
    }

    @Override // defpackage.zy5
    public final int c() {
        return this.a ? 2 : 1;
    }

    @Override // defpackage.zy5
    public final char d() {
        return '~';
    }
}
