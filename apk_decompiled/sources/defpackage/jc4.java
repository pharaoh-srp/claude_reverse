package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final class jc4 implements tz7 {
    public static final jc4 E = new jc4();

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f = ((va6) obj).E;
        long j = ((d54) obj2).a;
        long j2 = ((d54) obj3).a;
        ld4 ld4Var = (ld4) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).c(f) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).e(j) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 1043) != 1042)) {
            dw1.a(yfd.p(xn5.V(b.o(fqb.E, f), xve.a), j, zni.b), e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
