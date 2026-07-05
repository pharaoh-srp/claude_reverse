package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yai implements eo9 {
    public final cm9 E;

    public yai(cm9 cm9Var) {
        List list = Collections.EMPTY_LIST;
        cm9Var.getClass();
        list.getClass();
        this.E = cm9Var;
    }

    public final String a(boolean z) {
        List list = Collections.EMPTY_LIST;
        cm9 cm9Var = this.E;
        pl9 pl9Var = cm9Var instanceof pl9 ? (pl9) cm9Var : null;
        Class clsI = pl9Var != null ? ez1.I(pl9Var) : null;
        return ij0.C(clsI == null ? cm9Var.toString() : clsI.isArray() ? clsI.equals(boolean[].class) ? "kotlin.BooleanArray" : clsI.equals(char[].class) ? "kotlin.CharArray" : clsI.equals(byte[].class) ? "kotlin.ByteArray" : clsI.equals(short[].class) ? "kotlin.ShortArray" : clsI.equals(int[].class) ? "kotlin.IntArray" : clsI.equals(float[].class) ? "kotlin.FloatArray" : clsI.equals(long[].class) ? "kotlin.LongArray" : clsI.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsI.isPrimitive()) ? ez1.J((pl9) cm9Var).getName() : clsI.getName(), list.isEmpty() ? "" : w44.S0(list, ", ", "<", ">", new r2i(this), 24), "");
    }

    @Override // defpackage.eo9
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yai)) {
            return false;
        }
        if (!x44.r(this.E, ((yai) obj).E)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return x44.r(list, list);
    }

    @Override // defpackage.eo9
    public final List g() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.eo9
    public final cm9 h() {
        return this.E;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + kgh.m(this.E.hashCode() * 31, 31, Collections.EMPTY_LIST);
    }

    public final String toString() {
        return a(false).concat(" (Kotlin reflection is not available)");
    }
}
