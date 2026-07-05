package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o1e implements c4f, cgd {
    public volatile q28 E = new q28(1.0d);

    @Override // defpackage.cgd
    public final void a(cf5 cf5Var) {
        d26 d26Var;
        String str = cf5Var.c.N;
        Object objB = cf5Var.b("env");
        if (objB == null) {
            objB = "";
        }
        q28 q28Var = this.E;
        d26 d26Var2 = (d26) q28Var.F;
        Map map = (Map) ((HashMap) q28Var.G).get((String) objB);
        if (map != null && (d26Var = (d26) map.get(str)) != null) {
            d26Var2 = d26Var;
        }
        boolean zB = d26Var2.b(cf5Var);
        float f = d26Var2.E;
        if (zB) {
            cf5Var.d(1, "_dd.agent_psr", f, 1);
        } else {
            cf5Var.d(0, "_dd.agent_psr", f, 1);
        }
    }

    @Override // defpackage.c4f
    public final boolean b(cf5 cf5Var) {
        return true;
    }
}
