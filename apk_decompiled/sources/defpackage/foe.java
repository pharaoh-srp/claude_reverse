package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class foe {
    public final String a;

    public foe(String str) {
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
        return (obj instanceof foe) && this.a.equals(((foe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("CiTest(testExecutionId=", this.a, ")");
    }
}
