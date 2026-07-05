package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class dgb extends jgb {
    public final String a;
    public final ModelSelection b;
    public final String c;
    public final String d;
    public final String e;

    public dgb(String str, ModelSelection modelSelection, String str2, String str3, String str4) {
        str.getClass();
        modelSelection.getClass();
        str2.getClass();
        this.a = str;
        this.b = modelSelection;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgb)) {
            return false;
        }
        dgb dgbVar = (dgb) obj;
        return MessageId.m1054equalsimpl0(this.a, dgbVar.a) && x44.r(this.b, dgbVar.b) && x44.r(this.c, dgbVar.c) && x44.r(this.d, dgbVar.d) && x44.r(this.e, dgbVar.e);
    }

    public final int hashCode() {
        int iL = kgh.l((this.b.hashCode() + (MessageId.m1055hashCodeimpl(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.a);
        StringBuilder sb = new StringBuilder("ModelUpdate(humanMessageId=");
        sb.append(strM1056toStringimpl);
        sb.append(", fromModel=");
        sb.append(this.b);
        sb.append(", toModelName=");
        kgh.u(sb, this.c, ", explanation=", this.d, ", learnMoreUrl=");
        return ij0.m(sb, this.e, ")");
    }
}
