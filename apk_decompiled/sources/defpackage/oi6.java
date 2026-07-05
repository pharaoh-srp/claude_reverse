package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi6 implements zqi {
    public final lsc a;

    public oi6(lsc lscVar) {
        this.a = lscVar;
    }

    @Override // defpackage.zqi
    public final Object a(hyc hycVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi6) && this.a == ((oi6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
