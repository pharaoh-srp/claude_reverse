package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mrg implements rzd {
    public final String a;

    public mrg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrg) && this.a.equals(((mrg) obj).a);
    }

    @Override // defpackage.rzd
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
