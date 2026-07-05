package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class n9i {
    public static final h9i A;
    public static final jp0 B;
    public static final h9i a = new h9i(Class.class, new ajg(new eac(13), 3), 0);
    public static final h9i b = new h9i(BitSet.class, new ajg(new eac(23), 3), 0);
    public static final eac c;
    public static final vce d;
    public static final vce e;
    public static final vce f;
    public static final vce g;
    public static final h9i h;
    public static final h9i i;
    public static final h9i j;
    public static final eac k;
    public static final vce l;
    public static final eac m;
    public static final eac n;
    public static final eac o;
    public static final h9i p;
    public static final h9i q;
    public static final h9i r;
    public static final h9i s;
    public static final h9i t;
    public static final h9i u;
    public static final h9i v;
    public static final h9i w;
    public static final cac x;
    public static final h9i y;
    public static final eac z;

    static {
        eac eacVar = new eac(24);
        c = new eac(25);
        d = new vce(Boolean.TYPE, Boolean.class, eacVar);
        e = new vce(Byte.TYPE, Byte.class, new eac(26));
        f = new vce(Short.TYPE, Short.class, new eac(27));
        g = new vce(Integer.TYPE, Integer.class, new eac(28));
        h = new h9i(AtomicInteger.class, new ajg(new k9i(1), 3), 0);
        i = new h9i(AtomicBoolean.class, new ajg(new k9i(0), 3), 0);
        j = new h9i(AtomicIntegerArray.class, new ajg(new eac(3), 3), 0);
        k = new eac(4);
        l = new vce(Character.TYPE, Character.class, new eac(7));
        eac eacVar2 = new eac(8);
        m = new eac(9);
        n = new eac(10);
        o = new eac(11);
        int i2 = 0;
        p = new h9i(String.class, eacVar2, i2);
        q = new h9i(StringBuilder.class, new eac(12), i2);
        r = new h9i(StringBuffer.class, new eac(14), i2);
        s = new h9i(URL.class, new eac(15), i2);
        t = new h9i(URI.class, new eac(16), i2);
        u = new h9i(InetAddress.class, new eac(17), 1);
        v = new h9i(UUID.class, new eac(18), 0);
        w = new h9i(Currency.class, new ajg(new eac(19), 3), 0);
        x = new cac(new eac(20), 1);
        y = new h9i(Locale.class, new eac(21), 0);
        eac eacVar3 = new eac(22);
        z = eacVar3;
        A = new h9i(bh9.class, eacVar3, 1);
        B = new jp0(6);
    }
}
