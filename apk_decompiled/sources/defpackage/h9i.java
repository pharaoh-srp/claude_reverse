package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9i implements g9i {
    public final /* synthetic */ int E;
    public final /* synthetic */ Class F;
    public final /* synthetic */ f9i G;

    public /* synthetic */ h9i(Class cls, f9i f9iVar, int i) {
        this.E = i;
        this.F = cls;
        this.G = f9iVar;
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        int i = this.E;
        Class cls = this.F;
        switch (i) {
            case 0:
                if (dbiVar.a == cls) {
                    return this.G;
                }
                return null;
            default:
                Class<?> cls2 = dbiVar.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new i9i(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.E;
        f9i f9iVar = this.G;
        Class cls = this.F;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + f9iVar + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + f9iVar + "]";
        }
    }
}
