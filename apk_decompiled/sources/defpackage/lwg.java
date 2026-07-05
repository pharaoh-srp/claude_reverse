package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lwg implements pwg {
    public final ovg a;

    public lwg(ovg ovgVar) {
        ovgVar.getClass();
        this.a = ovgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwg) && this.a == ((lwg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
