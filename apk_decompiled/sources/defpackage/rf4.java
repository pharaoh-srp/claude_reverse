package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rf4 implements wf4 {
    public final Object a;

    public rf4(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf4) && x44.r(this.a, ((rf4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return grc.t(this.a, "Extra(config=", ")");
    }
}
