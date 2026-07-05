package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kak {
    public static jxi a(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            String strM2 = qh9Var.s("type").m();
            strM2.getClass();
            int[] iArrH = sq6.H(3);
            int length = iArrH.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = iArrH[i];
                if (kgh.i(i3).equals(strM2)) {
                    bh9 bh9VarS = qh9Var.s("has_replay");
                    Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
                    bh9 bh9VarS2 = qh9Var.s("is_active");
                    Boolean boolValueOf2 = bh9VarS2 != null ? Boolean.valueOf(bh9VarS2.a()) : null;
                    bh9 bh9VarS3 = qh9Var.s("sampled_for_replay");
                    Boolean boolValueOf3 = bh9VarS3 != null ? Boolean.valueOf(bh9VarS3.a()) : null;
                    strM.getClass();
                    return new jxi(strM, i3, boolValueOf, boolValueOf2, boolValueOf3);
                }
                i++;
                length = i2;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ViewEventSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ViewEventSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ViewEventSession", e3);
            return null;
        }
    }

    public static int b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
