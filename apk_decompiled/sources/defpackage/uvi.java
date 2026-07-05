package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uvi {
    public final String a;

    public uvi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvi) && this.a.equals(((uvi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("CiTest(testExecutionId=", this.a, ")");
    }
}
