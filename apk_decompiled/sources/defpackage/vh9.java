package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vh9 extends bh9 {
    public final Serializable E;

    public vh9(Boolean bool) {
        Objects.requireNonNull(bool);
        this.E = bool;
    }

    public static boolean o(vh9 vh9Var) {
        Serializable serializable = vh9Var.E;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.bh9
    public final boolean a() {
        Serializable serializable = this.E;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(m());
    }

    @Override // defpackage.bh9
    public final int b() {
        return this.E instanceof Number ? l().intValue() : Integer.parseInt(m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vh9.class != obj.getClass()) {
            return false;
        }
        vh9 vh9Var = (vh9) obj;
        Serializable serializable = vh9Var.E;
        Serializable serializable2 = this.E;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (o(this) && o(vh9Var)) {
            return l().longValue() == vh9Var.l().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = l().doubleValue();
        double dDoubleValue2 = vh9Var.l().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.E;
        if (serializable == null) {
            return 31;
        }
        if (o(this)) {
            jDoubleToLongBits = l().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(l().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.bh9
    public final long k() {
        return this.E instanceof Number ? l().longValue() : Long.parseLong(m());
    }

    @Override // defpackage.bh9
    public final Number l() {
        Serializable serializable = this.E;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new jw9((String) serializable);
        }
        pmf.n("Primitive is neither a number nor a string");
        return null;
    }

    @Override // defpackage.bh9
    public final String m() {
        Serializable serializable = this.E;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return l().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public vh9(Number number) {
        Objects.requireNonNull(number);
        this.E = number;
    }

    public vh9(String str) {
        Objects.requireNonNull(str);
        this.E = str;
    }
}
