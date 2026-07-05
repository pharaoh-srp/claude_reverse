package defpackage;

import com.anthropic.claude.types.strings.EmailAddress;

/* JADX INFO: loaded from: classes.dex */
public final class q9j implements s9j {
    public final String a;
    public final String b;

    public q9j(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9j)) {
            return false;
        }
        q9j q9jVar = (q9j) obj;
        return EmailAddress.m1009equalsimpl0(this.a, q9jVar.a) && this.b.equals(q9jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (EmailAddress.m1010hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("ShowLoginMethodChoice(email=", EmailAddress.m1012toStringimpl(this.a), ", ssoUrl=", this.b, ")");
    }
}
