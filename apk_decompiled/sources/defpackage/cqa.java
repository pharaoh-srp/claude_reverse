package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cqa implements mhb {
    public mhb[] a;

    @Override // defpackage.mhb
    public final d2e a(Class cls) {
        for (mhb mhbVar : this.a) {
            if (mhbVar.b(cls)) {
                return mhbVar.a(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.mhb
    public final boolean b(Class cls) {
        for (mhb mhbVar : this.a) {
            if (mhbVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
