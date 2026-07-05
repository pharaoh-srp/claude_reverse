package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ea {
    public final String a;

    public ea(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea) && this.a.equals(((ea) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("CiTest(testExecutionId=", this.a, ")");
    }
}
