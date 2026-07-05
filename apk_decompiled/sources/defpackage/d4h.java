package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d4h extends b4h {
    public static final g11 G = new g11(64, 4);
    public final String E;
    public final String[] F = new String[a4h.I];

    public d4h(String str, int i, int i2) {
        this.E = (i == 0 && i2 == str.length()) ? str : str.substring(i, i2);
        for (a4h a4hVar : a4h.H) {
            this.F[a4hVar.ordinal()] = a4hVar.E + this.E;
        }
    }

    public static d4h b(String str) {
        int length = str.length();
        int length2 = str.length();
        if (length <= 0 || length <= 0 || length2 <= 0 || length2 < length) {
            return null;
        }
        return (d4h) G.i(str, 0, str.length(), new pmf(5), new pmf(6), new pmf(7));
    }

    @Override // defpackage.b4h
    public final CharSequence a(a4h a4hVar) {
        return this.F[a4hVar.ordinal()];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.E.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d4h.class != obj.getClass()) {
            return false;
        }
        return this.E.equals(((d4h) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.E.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.E.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.E;
    }
}
