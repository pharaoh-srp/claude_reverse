package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye4 implements zqi {
    public final bz7 a;

    public ye4(bz7 bz7Var) {
        this.a = bz7Var;
    }

    @Override // defpackage.zqi
    public final Object a(hyc hycVar) {
        return this.a.invoke(hycVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye4) && this.a.equals(((ye4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
