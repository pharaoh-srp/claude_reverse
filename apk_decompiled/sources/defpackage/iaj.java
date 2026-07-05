package defpackage;

import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class iaj {
    public final String a;
    public final String b;
    public final String c;

    public iaj(String str, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaj)) {
            return false;
        }
        iaj iajVar = (iaj) obj;
        return this.a.equals(iajVar.a) && this.b.equals(iajVar.b) && MessageId.m1054equalsimpl0(this.c, iajVar.c);
    }

    public final int hashCode() {
        return (MessageId.m1055hashCodeimpl(this.c) + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31;
    }

    public final String toString() {
        return ij0.m(kgh.r("WiggleArtifact(filename=", this.a, ", encodedPath=", this.b, ", messageId="), MessageId.m1056toStringimpl(this.c), ", content=null)");
    }
}
