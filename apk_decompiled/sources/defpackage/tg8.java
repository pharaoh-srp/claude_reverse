package defpackage;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class tg8 {
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;
    public final ByteString a;
    public final ByteString b;
    public final int c;

    static {
        ByteString byteString = ByteString.H;
        d = ByteString.Companion.b(":");
        e = ByteString.Companion.b(":status");
        f = ByteString.Companion.b(":method");
        g = ByteString.Companion.b(":path");
        h = ByteString.Companion.b(":scheme");
        i = ByteString.Companion.b(":authority");
    }

    public tg8(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString2.e() + byteString.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg8)) {
            return false;
        }
        tg8 tg8Var = (tg8) obj;
        return x44.r(this.a, tg8Var.a) && x44.r(this.b, tg8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.t() + ": " + this.b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tg8(String str, String str2) {
        this(ByteString.Companion.b(str), ByteString.Companion.b(str2));
        ByteString byteString = ByteString.H;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tg8(String str, ByteString byteString) {
        this(byteString, ByteString.Companion.b(str));
        byteString.getClass();
        str.getClass();
        ByteString byteString2 = ByteString.H;
    }
}
