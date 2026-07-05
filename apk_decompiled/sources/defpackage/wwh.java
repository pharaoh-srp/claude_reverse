package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wwh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wwh(String str, String str2, String str3, String str4) {
        grc.B(str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwh)) {
            return false;
        }
        wwh wwhVar = (wwh) obj;
        return this.a.equals(wwhVar.a) && x44.r(this.b, wwhVar.b) && x44.r(this.c, wwhVar.c) && x44.r(this.d, wwhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return vb7.t(kgh.r("ToolExecutionContext(messageId=", this.a, ", conversationId=", this.b, ", organizationId="), this.c, ", toolUseId=", this.d, ")");
    }
}
