package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n31 implements Iterable, Cloneable {
    public int E = 0;
    public String[] F = new String[3];
    public Object[] G = new Object[3];

    public static String h(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    public static boolean s(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final void a(n31 n31Var) {
        int size = n31Var.size();
        if (size == 0) {
            return;
        }
        g(this.E + size);
        boolean z = this.E != 0;
        m31 m31Var = new m31(n31Var);
        while (m31Var.hasNext()) {
            l31 l31Var = (l31) m31Var.next();
            String str = l31Var.E;
            if (z) {
                t(str, h(l31Var.F));
                l31Var.G = this;
            } else {
                b(str, h(l31Var.F));
            }
        }
    }

    public final void b(String str, Serializable serializable) {
        g(this.E + 1);
        String[] strArr = this.F;
        int i = this.E;
        strArr[i] = str;
        this.G[i] = serializable;
        this.E = i + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n31.class == obj.getClass()) {
            n31 n31Var = (n31) obj;
            if (this.E == n31Var.E) {
                for (int i = 0; i < this.E; i++) {
                    int iQ = n31Var.q(this.F[i]);
                    if (iQ != -1 && Objects.equals(this.G[i], n31Var.G[iQ])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i) {
        pqi.m(i >= this.E);
        String[] strArr = this.F;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.E * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.F = (String[]) Arrays.copyOf(strArr, i);
        this.G = Arrays.copyOf(this.G, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.G) + (((this.E * 31) + Arrays.hashCode(this.F)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m31(this);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final n31 clone() {
        try {
            n31 n31Var = (n31) super.clone();
            n31Var.E = this.E;
            n31Var.F = (String[]) Arrays.copyOf(this.F, this.E);
            n31Var.G = Arrays.copyOf(this.G, this.E);
            int iQ = q("/jsoup.userdata");
            if (iQ != -1) {
                this.G[iQ] = new HashMap((Map) this.G[iQ]);
            }
            return n31Var;
        } catch (CloneNotSupportedException e) {
            xh6.h(e);
            return null;
        }
    }

    public final String l(String str) {
        int iQ = q(str);
        return iQ == -1 ? "" : h(this.G[iQ]);
    }

    public final String m(String str) {
        int iR = r(str);
        return iR == -1 ? "" : h(this.G[iR]);
    }

    public final boolean o(String str) {
        return q(str) != -1;
    }

    public final void p(gjk gjkVar, n96 n96Var) {
        String strA;
        int i = this.E;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.F[i2];
            if (!s(str) && (strA = l31.a(n96Var.J, str)) != null) {
                l31.b(strA, (String) this.G[i2], gjkVar.g(' '), n96Var);
            }
        }
    }

    public final int q(String str) {
        pqi.p(str);
        for (int i = 0; i < this.E; i++) {
            if (str.equals(this.F[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int r(String str) {
        pqi.p(str);
        for (int i = 0; i < this.E; i++) {
            if (str.equalsIgnoreCase(this.F[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int size() {
        if (this.E == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.E; i2++) {
            if (!s(this.F[i2])) {
                i++;
            }
        }
        return i;
    }

    public final void t(String str, String str2) {
        pqi.p(str);
        int iQ = q(str);
        if (iQ != -1) {
            this.G[iQ] = str2;
        } else {
            b(str, str2);
        }
    }

    public final String toString() {
        StringBuilder sbB = xrg.b();
        p(gjk.m(sbB), new n96());
        return xrg.k(sbB);
    }

    public final void u(int i) {
        int i2 = this.E;
        if (i >= i2) {
            throw new ValidationException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.F;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.G;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.E - 1;
        this.E = i5;
        this.F[i5] = null;
        this.G[i5] = null;
    }

    public final Map v() {
        int iQ = q("/jsoup.userdata");
        if (iQ != -1) {
            return (Map) this.G[iQ];
        }
        HashMap map = new HashMap();
        b("/jsoup.userdata", map);
        return map;
    }
}
