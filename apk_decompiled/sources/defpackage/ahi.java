package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahi extends v9c {
    public final Integer c;
    public final Integer d;
    public final drd e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ahi(Integer num, Integer num2, drd drdVar, String str, boolean z) {
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, str);
        this.c = num;
        this.d = num2;
        this.e = drdVar;
        this.f = z;
        if (num3 == null || new b79(1, 9, 1).h(num3.intValue())) {
            return;
        }
        poc.o("Invalid length for field ", str, ": ", num3);
        throw null;
    }

    @Override // defpackage.v9c
    public final w9c a(int i, int i2, Object obj, String str) {
        Integer numValueOf;
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new x9c(num.intValue(), 7);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new x9c(num2.intValue(), 6);
        }
        int iCharAt = 0;
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return pyk.P;
        }
        boolean z = this.f;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objB = this.e.b(obj, Integer.valueOf(iIntValue));
        if (objB == null) {
            return null;
        }
        return new g6(objB);
    }
}
