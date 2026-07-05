package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x03 extends b13 {
    public final ne7 a;

    public x03(ne7 ne7Var) {
        this.a = ne7Var;
    }

    @Override // defpackage.b13
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x03) && this.a == ((x03) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PollingRecoveryExhausted(recovery=" + this.a + ")";
    }
}
