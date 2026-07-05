package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t7g extends x59 {
    public Object b;

    @Override // defpackage.x59
    public final Object a(ra4 ra4Var) {
        Object obj = this.b;
        if (obj == null) {
            return super.a(ra4Var);
        }
        if (obj != null) {
            return obj;
        }
        sz6.j("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.x59
    public final Object b(ra4 ra4Var) {
        synchronized (this) {
            if (this.b == null) {
                this.b = a(ra4Var);
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        sz6.j("Single instance created couldn't return value");
        return null;
    }
}
