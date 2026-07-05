package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class duf implements fvf {
    public final awc a;

    public duf(awc awcVar) {
        this.a = awcVar;
    }

    public final awc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duf) && this.a.equals(((duf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AskUserQuestionRequired(pending=" + this.a + ")";
    }
}
