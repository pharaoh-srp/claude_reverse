package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adi implements CharSequence {
    public final String E;

    static {
        a("");
    }

    public adi(String str) {
        this.E = str;
    }

    public static adi a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence instanceof adi ? (adi) charSequence : new adi(String.valueOf(charSequence));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.E.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.E.equals(obj instanceof adi ? ((adi) obj).E : null);
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
