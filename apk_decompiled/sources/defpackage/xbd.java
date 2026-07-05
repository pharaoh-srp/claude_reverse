package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xbd {
    public final String a;

    public xbd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xbd)) {
            return false;
        }
        return this.a.equals(((xbd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
