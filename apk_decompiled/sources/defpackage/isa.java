package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class isa {
    public static dsa a(Object obj, Object obj2) {
        dsa dsaVarD = (dsa) obj;
        dsa dsaVar = (dsa) obj2;
        if (!dsaVar.isEmpty()) {
            if (!dsaVarD.E) {
                dsaVarD = dsaVarD.d();
            }
            dsaVarD.c();
            if (!dsaVar.isEmpty()) {
                dsaVarD.putAll(dsaVar);
            }
        }
        return dsaVarD;
    }
}
