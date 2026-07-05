package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qj1 implements rj1 {
    public final String a;

    public qj1(String str) {
        this.a = str;
    }

    @Override // defpackage.rj1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj1) && x44.r(this.a, ((qj1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("PromptTooLong(displayMessage=", this.a, ")");
    }
}
