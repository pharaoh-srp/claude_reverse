package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h4d implements ztc {
    public final String a;

    public h4d(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            sz6.p("Empty string is not allowed");
            throw null;
        }
        if (otj.k(str.charAt(0))) {
            mr9.q(ij0.j("String '", str, "' starts with a digit"));
            throw null;
        }
        if (otj.k(str.charAt(str.length() - 1))) {
            mr9.q(ij0.j("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // defpackage.ztc
    public final Object a(l25 l25Var, String str, int i) {
        String str2 = this.a;
        if (str2.length() + i > str.length()) {
            return new usc(i, new pza(11, this));
        }
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i + i2) != str2.charAt(i2)) {
                return new usc(i, new tr8(this, str, i, i2));
            }
        }
        return Integer.valueOf(str2.length() + i);
    }

    public final String toString() {
        return vb7.s(new StringBuilder("'"), this.a, '\'');
    }
}
