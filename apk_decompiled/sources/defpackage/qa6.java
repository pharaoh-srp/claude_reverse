package defpackage;

import android.net.Uri;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes3.dex */
public final class qa6 {
    public final Uri a;
    public final String b;
    public final String c;

    public qa6(Uri uri, String str, String str2) {
        str2.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa6)) {
            return false;
        }
        qa6 qa6Var = (qa6) obj;
        return this.a.equals(qa6Var.a) && this.b.equals(qa6Var.b) && ChatId.m981equalsimpl0(this.c, qa6Var.c);
    }

    public final int hashCode() {
        return ChatId.m982hashCodeimpl(this.c) + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("OpenRequest(uri=");
        sb.append(this.a);
        sb.append(", mimeType=");
        sb.append(this.b);
        sb.append(", chatId=");
        return ij0.m(sb, strM983toStringimpl, ")");
    }
}
