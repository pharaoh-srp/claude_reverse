package defpackage;

import com.anthropic.claude.types.strings.EmailAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class o9j implements s9j {
    public final String a;
    public final String b;

    public o9j(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9j)) {
            return false;
        }
        o9j o9jVar = (o9j) obj;
        return EmailAddress.m1009equalsimpl0(this.a, o9jVar.a) && this.b.equals(o9jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (EmailAddress.m1010hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("InitiateSSO(email=", EmailAddress.m1012toStringimpl(this.a), ", ssoUrl=", this.b, ")");
    }
}
