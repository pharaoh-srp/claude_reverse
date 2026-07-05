package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf4 implements wf4 {
    public final Object a;

    public tf4(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tf4) && x44.r(this.a, ((tf4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return grc.t(this.a, "Main(config=", ")");
    }
}
