package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eqa implements ohb {
    public ohb[] a;

    @Override // defpackage.ohb
    public final f2e a(Class cls) {
        for (ohb ohbVar : this.a) {
            if (ohbVar.b(cls)) {
                return ohbVar.a(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.ohb
    public final boolean b(Class cls) {
        for (ohb ohbVar : this.a) {
            if (ohbVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
