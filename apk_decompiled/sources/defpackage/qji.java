package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qji {
    public final String a;

    public qji(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qji) && x44.r(this.a, ((qji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("NavigateToProject(projectId=", this.a, ")");
    }
}
