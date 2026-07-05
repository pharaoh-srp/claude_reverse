package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d07 implements fjb {
    public static final jw7 g;
    public static final jw7 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        iw7 iw7Var = new iw7();
        iw7Var.n = gkb.k("application/id3");
        g = new jw7(iw7Var);
        iw7 iw7Var2 = new iw7();
        iw7Var2.n = gkb.k("application/x-scte35");
        h = new jw7(iw7Var2);
    }

    public d07(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.fjb
    public final jw7 a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.fjb
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d07.class != obj.getClass()) {
            return false;
        }
        d07 d07Var = (d07) obj;
        return this.c == d07Var.c && this.d == d07Var.d && this.a.equals(d07Var.a) && this.b.equals(d07Var.b) && Arrays.equals(this.e, d07Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            int iL = kgh.l(kgh.l(527, 31, this.a), 31, this.b);
            long j = this.c;
            int i = (iL + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
