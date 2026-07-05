package defpackage;

import com.anthropic.claude.types.strings.AccountId;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 implements u7 {
    public final String a;

    public t7(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7) && AccountId.m946equalsimpl0(this.a, ((t7) obj).a);
    }

    public final int hashCode() {
        return AccountId.m947hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Switch(accountId=", AccountId.m948toStringimpl(this.a), ")");
    }
}
