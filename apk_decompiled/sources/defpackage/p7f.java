package defpackage;

import com.anthropic.claude.types.strings.AccountId;

/* JADX INFO: loaded from: classes.dex */
public final class p7f implements s7f {
    public final String a;
    public final String b;

    public p7f(String str) {
        str.getClass();
        this.a = str;
        this.b = "AccountScope:".concat(str);
    }

    @Override // defpackage.s7f
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7f) && AccountId.m946equalsimpl0(this.a, ((p7f) obj).a);
    }

    public final int hashCode() {
        return AccountId.m947hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Account(accountId=", AccountId.m948toStringimpl(this.a), ")");
    }
}
