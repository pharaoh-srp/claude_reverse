package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class ie2 implements ke2 {
    public final DecimalFormat b;

    public ie2(DecimalFormat decimalFormat) {
        this.b = decimalFormat;
    }

    @Override // defpackage.ke2
    public final String a(ge2 ge2Var, double d) {
        ge2Var.getClass();
        String str = this.b.format(d);
        str.getClass();
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ie2) {
            return this.b.equals(((ie2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
