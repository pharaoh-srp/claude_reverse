package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sp6 {
    public final String a;

    public sp6(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp6) && x44.r(this.a, ((sp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("PhoneNumberSubmitted(phoneNumber=", this.a, ")");
    }
}
