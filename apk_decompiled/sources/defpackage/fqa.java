package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fqa implements phb {
    public phb[] a;

    @Override // defpackage.phb
    public final g2e a(Class cls) {
        for (phb phbVar : this.a) {
            if (phbVar.b(cls)) {
                return phbVar.a(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.phb
    public final boolean b(Class cls) {
        for (phb phbVar : this.a) {
            if (phbVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
