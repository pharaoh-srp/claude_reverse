package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c01 implements zy5 {
    public final char a;

    public c01(char c) {
        this.a = c;
    }

    @Override // defpackage.zy5
    public final int a(yy5 yy5Var, yy5 yy5Var2) {
        b5c bm6Var;
        if ((yy5Var.a() || yy5Var2.b()) && yy5Var2.h() % 3 != 0) {
            if ((yy5Var2.h() + yy5Var.h()) % 3 == 0) {
                return 0;
            }
        }
        int iG = yy5Var.g();
        char c = this.a;
        int i = 2;
        if (iG < 2 || yy5Var2.g() < 2) {
            bm6Var = new bm6(String.valueOf(c));
            i = 1;
        } else {
            bm6Var = new msg(String.valueOf(c) + c);
        }
        dn0 dn0VarL = dn0.l();
        dn0VarL.i(yy5Var.f(i));
        edh edhVarE = yy5Var.e();
        Iterator it = fuk.q(edhVarE, yy5Var2.c()).iterator();
        while (true) {
            a6c a6cVar = (a6c) it;
            if (!a6cVar.hasNext()) {
                dn0VarL.i(yy5Var2.d(i));
                bm6Var.g(dn0VarL.n());
                edhVarE.e(bm6Var);
                return i;
            }
            b5c b5cVar = (b5c) a6cVar.next();
            bm6Var.c(b5cVar);
            dn0VarL.h(b5cVar.d());
        }
    }

    @Override // defpackage.zy5
    public final char b() {
        return this.a;
    }

    @Override // defpackage.zy5
    public final int c() {
        return 1;
    }

    @Override // defpackage.zy5
    public final char d() {
        return this.a;
    }
}
