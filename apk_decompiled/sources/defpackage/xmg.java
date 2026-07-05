package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xmg implements zqi {
    public final Object a;

    public xmg(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.zqi
    public final Object a(hyc hycVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmg) && x44.r(this.a, ((xmg) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
