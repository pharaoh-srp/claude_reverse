package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class jw9 extends Number {
    public final String E;

    public jw9(String str) {
        this.E = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw9)) {
            return false;
        }
        Object obj2 = ((jw9) obj).E;
        String str = this.E;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.E;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.E;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.E;
    }
}
