package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class c09 {
    public static final String[] d = {"image/*", "text/*", "application/pdf", "application/rtf", "application/epub+zip"};
    public final Uri a;
    public final String b;
    public final String c;

    public c09(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c09)) {
            return false;
        }
        c09 c09Var = (c09) obj;
        return x44.r(this.a, c09Var.a) && this.b.equals(c09Var.b) && this.c.equals(c09Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingSharedAttachment(uri=");
        sb.append(this.a);
        sb.append(", intentMimeType=");
        sb.append(this.b);
        sb.append(", uriMimeType=");
        return ij0.m(sb, this.c, ")");
    }
}
