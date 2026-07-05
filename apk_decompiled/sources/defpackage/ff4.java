package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff4 {
    public static final sqb a = new sqb("CLOSED", 1);

    public static final Object a(lff lffVar, long j, pz7 pz7Var) {
        while (true) {
            if (lffVar.I >= j && !lffVar.g()) {
                return lffVar;
            }
            Object objE = lffVar.e();
            sqb sqbVar = a;
            if (objE == sqbVar) {
                return sqbVar;
            }
            lff lffVar2 = (lff) ((gf4) objE);
            if (lffVar2 == null) {
                lffVar2 = (lff) pz7Var.invoke(Long.valueOf(lffVar.I + 1), lffVar);
                if (lffVar.j(lffVar2)) {
                    if (lffVar.g()) {
                        lffVar.i();
                    }
                }
            }
            lffVar = lffVar2;
        }
    }
}
