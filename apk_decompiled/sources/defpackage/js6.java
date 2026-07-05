package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class js6 {
    public final String a;

    public js6(String str) {
        this.a = str;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("test_execution_id", this.a);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js6) && this.a.equals(((js6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("CiTest(testExecutionId=", this.a, ")");
    }
}
