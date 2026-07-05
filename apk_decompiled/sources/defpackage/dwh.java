package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwh implements fwh {
    public final String a = "Backend tool";

    @Override // defpackage.fwh
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwh) && this.a.equals(((dwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("BackendTool(reason=", this.a, ")");
    }
}
