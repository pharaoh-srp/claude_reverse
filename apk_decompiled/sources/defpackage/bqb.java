package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes2.dex */
public final class bqb {
    public final String a;
    public final ModelSelection b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bqb(String str, ModelSelection modelSelection, String str2, String str3, String str4, String str5) {
        str.getClass();
        modelSelection.getClass();
        str2.getClass();
        this.a = str;
        this.b = modelSelection;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.e;
    }

    public final ModelSelection b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqb)) {
            return false;
        }
        bqb bqbVar = (bqb) obj;
        return MessageId.m1054equalsimpl0(this.a, bqbVar.a) && x44.r(this.b, bqbVar.b) && ModelId.m1061equalsimpl0(this.c, bqbVar.c) && this.d.equals(bqbVar.d) && x44.r(this.e, bqbVar.e) && x44.r(this.f, bqbVar.f);
    }

    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        int iL = kgh.l((ModelId.m1062hashCodeimpl(this.c) + ((this.b.hashCode() + (MessageId.m1055hashCodeimpl(this.a) * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.a);
        String strM1063toStringimpl = ModelId.m1063toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("ModelUpdateInfo(humanMessageId=");
        sb.append(strM1056toStringimpl);
        sb.append(", fromModel=");
        sb.append(this.b);
        sb.append(", toModelId=");
        kgh.u(sb, strM1063toStringimpl, ", toModelName=", this.d, ", explanation=");
        return vb7.t(sb, this.e, ", learnMoreUrl=", this.f, ")");
    }
}
