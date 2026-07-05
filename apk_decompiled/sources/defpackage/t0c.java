package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class t0c implements fh7 {
    public final u0h a;
    public final u0h b;
    public final cbf c;
    public final u0h d;

    public t0c(zy7 zy7Var) {
        oob oobVar = new oob(10);
        s0c s0cVar = s0c.E;
        oob oobVar2 = new oob(11);
        this.a = new u0h(zy7Var);
        this.b = yb5.x(oobVar);
        cbf cbfVar = new cbf(6);
        cbfVar.F = s0cVar;
        cbfVar.G = lz1.S;
        this.c = cbfVar;
        this.d = yb5.x(oobVar2);
    }

    @Override // defpackage.fh7
    public final hh7 a(Object obj, qjc qjcVar, r4e r4eVar) {
        dli dliVar = (dli) obj;
        if (!x44.r(dliVar.c, "http") && !x44.r(dliVar.c, "https")) {
            return null;
        }
        String str = dliVar.a;
        u0h u0hVar = this.a;
        u0h u0hVar2 = new u0h(new pza(1, r4eVar));
        u0h u0hVar3 = this.b;
        cbf cbfVar = this.c;
        Context contextB = qjcVar.b();
        Object obj2 = cbfVar.G;
        lz1 lz1Var = lz1.S;
        if (obj2 == lz1Var) {
            synchronized (cbfVar) {
                obj2 = cbfVar.G;
                if (obj2 == lz1Var) {
                    bz7 bz7Var = (bz7) cbfVar.F;
                    bz7Var.getClass();
                    Object objInvoke = bz7Var.invoke(contextB);
                    cbfVar.G = objInvoke;
                    cbfVar.F = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new x0c(str, qjcVar, u0hVar, u0hVar2, u0hVar3, new t29(obj2), this.d);
    }
}
