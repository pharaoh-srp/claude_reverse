package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l22 implements Iterable {
    public static final oba E = new oba(new byte[0]);

    public static l22 a(Iterator it, int i) {
        if (i == 1) {
            return (l22) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static j22 m() {
        return new j22();
    }

    public final l22 b(l22 l22Var) {
        int size = size();
        int size2 = l22Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = lve.L;
        lve lveVar = this instanceof lve ? (lve) this : null;
        if (l22Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return l22Var;
        }
        int size3 = l22Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = l22Var.size();
            byte[] bArr = new byte[size4 + size5];
            e(0, 0, size4, bArr);
            l22Var.e(0, size4, size5, bArr);
            return new oba(bArr);
        }
        if (lveVar != null) {
            l22 l22Var2 = lveVar.H;
            if (l22Var.size() + l22Var2.size() < 128) {
                int size6 = l22Var2.size();
                int size7 = l22Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                l22Var2.e(0, 0, size6, bArr2);
                l22Var.e(0, size6, size7, bArr2);
                return new lve(lveVar.G, new oba(bArr2));
            }
        }
        if (lveVar != null) {
            l22 l22Var3 = lveVar.H;
            l22 l22Var4 = lveVar.G;
            if (l22Var4.h() > l22Var3.h() && lveVar.J > l22Var.h()) {
                return new lve(l22Var4, new lve(l22Var3, l22Var));
            }
        }
        return size3 >= lve.L[Math.max(h(), l22Var.h()) + 1] ? new lve(this, l22Var) : xzd.n(new xzd(7), this, l22Var);
    }

    public final void e(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            sz6.g(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            sz6.g(30, "Target offset < 0: ", i2);
            return;
        }
        if (i3 < 0) {
            sz6.g(23, "Length < 0: ", i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            sz6.g(34, "Source end offset < 0: ", i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            sz6.g(34, "Target end offset < 0: ", i5);
        } else if (i3 > 0) {
            g(i, i2, i3, bArr);
        }
    }

    public abstract void g(int i, int i2, int i3, byte[] bArr);

    public abstract int h();

    public abstract boolean k();

    public abstract boolean l();

    public abstract int o(int i, int i2, int i3);

    public abstract int p(int i, int i2, int i3);

    public abstract int q();

    public abstract String r();

    public final String s() {
        try {
            return r();
        } catch (UnsupportedEncodingException e) {
            xh6.f("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract int size();

    public abstract void t(OutputStream outputStream, int i, int i2);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
