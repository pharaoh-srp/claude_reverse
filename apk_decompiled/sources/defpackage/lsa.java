package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lsa {
    public static gsa a(Object obj, Object obj2) {
        gsa gsaVarC = (gsa) obj;
        gsa gsaVar = (gsa) obj2;
        if (!gsaVar.isEmpty()) {
            if (!gsaVarC.E) {
                gsaVarC = gsaVarC.c();
            }
            gsaVarC.a();
            if (!gsaVar.isEmpty()) {
                gsaVarC.putAll(gsaVar);
            }
        }
        return gsaVarC;
    }
}
