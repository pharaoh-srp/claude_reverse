package defpackage;

import com.anthropic.claude.sessions.types.AskUserQuestionInput;

/* JADX INFO: loaded from: classes3.dex */
public final class awc {
    public final String a;
    public final String b;
    public final AskUserQuestionInput c;

    public awc(String str, String str2, AskUserQuestionInput askUserQuestionInput) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = askUserQuestionInput;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awc)) {
            return false;
        }
        awc awcVar = (awc) obj;
        return this.a.equals(awcVar.a) && x44.r(this.b, awcVar.b) && this.c.equals(awcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("PendingAskUserQuestion(requestId=", this.a, ", toolUseId=", this.b, ", input=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
