package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class yqj implements lsj {
    public final Double E;

    public yqj(Double d) {
        if (d == null) {
            this.E = Double.valueOf(Double.NaN);
        } else {
            this.E = d;
        }
    }

    @Override // defpackage.lsj
    public final Double a() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqj) {
            return this.E.equals(((yqj) obj).E);
        }
        return false;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        Double d = this.E;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        Double d = this.E;
        return Boolean.valueOf((Double.isNaN(d.doubleValue()) || d.doubleValue() == 0.0d) ? false : true);
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return new yqj(this.E);
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new qsj(h());
        }
        sz6.p(kgh.p(h(), ".", str, " is not a function."));
        return null;
    }

    public final String toString() {
        return h();
    }
}
