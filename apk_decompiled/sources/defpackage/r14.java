package defpackage;

import com.anthropic.claude.api.chat.messages.ApiHelpline;

/* JADX INFO: loaded from: classes2.dex */
public final class r14 {
    public final String a;
    public final ApiHelpline b;

    public r14(String str, ApiHelpline apiHelpline) {
        str.getClass();
        apiHelpline.getClass();
        this.a = str;
        this.b = apiHelpline;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r14)) {
            return false;
        }
        r14 r14Var = (r14) obj;
        return x44.r(this.a, r14Var.a) && x44.r(this.b, r14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoworkHelplineSheet(apiMessageId=" + this.a + ", helpline=" + this.b + ")";
    }
}
