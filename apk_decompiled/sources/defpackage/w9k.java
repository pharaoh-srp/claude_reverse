package defpackage;

import com.google.android.gms.internal.play_billing.zzgc;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class w9k implements Iterable, Serializable {
    public static final z9k F = new z9k(kfk.b);
    public int E = 0;

    static {
        int i = p8k.a;
    }

    public static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            xh6.j(grc.u("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            xh6.j(grc.o(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        xh6.j(grc.o(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static z9k o(byte[] bArr, int i, int i2) {
        try {
            m(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new z9k(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean p(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        m(i, i4, bArr.length);
        m(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w9k)) {
            return false;
        }
        w9k w9kVar = (w9k) obj;
        int iG = g();
        if (iG != w9kVar.g()) {
            return false;
        }
        if (iG == 0) {
            return true;
        }
        int i = this.E;
        int i2 = w9kVar.E;
        if (i == 0 || i2 == 0 || i == i2) {
            return l(w9kVar);
        }
        return false;
    }

    public abstract int g();

    public abstract w9k h(int i, int i2);

    public final int hashCode() {
        int iE = this.E;
        if (iE == 0) {
            int iG = g();
            iE = e(iG, iG);
            if (iE == 0) {
                iE = 1;
            }
            this.E = iE;
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new m31(this);
    }

    public abstract void k(xak xakVar);

    public abstract boolean l(w9k w9kVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        return ij0.m(ij0.p("<ByteString@", Integer.toHexString(System.identityHashCode(this)), g(), " size=", " contents=\""), g() <= 50 ? rrk.l(this) : rrk.l(h(0, 47)).concat("..."), "\">");
    }
}
