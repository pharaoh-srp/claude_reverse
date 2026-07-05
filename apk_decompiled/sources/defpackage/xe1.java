package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xe1 implements c6c {
    public final oh7 a;

    public xe1(oh7 oh7Var) {
        this.a = oh7Var;
    }

    @Override // defpackage.kw7
    public final af4 a() {
        return this.a.a();
    }

    @Override // defpackage.kw7
    public final auc b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xe1) {
            return this.a.equals(((xe1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
