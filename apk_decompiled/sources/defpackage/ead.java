package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ead {
    public static int roundToPowerOfTwo(int i) {
        if (i > 1073741824) {
            sz6.p(grc.u("There is no larger power of 2 int for value:", i, " since it exceeds 2^31."));
            return 0;
        }
        if (i >= 0) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        }
        sz6.p(grc.u("Given value:", i, ". Expecting value >= 0."));
        return 0;
    }
}
