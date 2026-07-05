package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rjf implements p68 {
    public final pjf a;

    public rjf(pjf pjfVar) {
        this.a = pjfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjf) && this.a == ((rjf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.a + ')';
    }
}
