package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lo implements so {
    public final yk a;

    public lo(yk ykVar) {
        ykVar.getClass();
        this.a = ykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo) && x44.r(this.a, ((lo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewMessage(message=" + this.a + ")";
    }
}
