package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mme implements nme {
    public final int a;

    public mme(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mme) && this.a == ((mme) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("Minutes(minutes=", this.a, ")");
    }
}
