package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class msa {
    public final hsa a(Object obj, Object obj2) {
        hsa hsaVarC = (hsa) obj;
        hsa hsaVar = (hsa) obj2;
        if (!hsaVar.isEmpty()) {
            if (!hsaVarC.E) {
                hsaVarC = hsaVarC.c();
            }
            hsaVarC.a();
            if (!hsaVar.isEmpty()) {
                hsaVarC.putAll(hsaVar);
            }
        }
        return hsaVarC;
    }
}
