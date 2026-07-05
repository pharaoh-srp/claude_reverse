package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class euf implements fvf {
    public final String a;

    public euf(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euf) && x44.r(this.a, ((euf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("AskUserQuestionResolved(toolUseId=", this.a, ")");
    }
}
