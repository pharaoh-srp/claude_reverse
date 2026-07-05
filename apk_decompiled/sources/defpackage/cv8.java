package defpackage;

import androidx.compose.foundation.layout.b;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class cv8 {
    public static final iqb a = b.o(fqb.E, xn5.e);

    public static final void a(final py8 py8Var, String str, iqb iqbVar, long j, ld4 ld4Var, final int i, final int i2) {
        int i3;
        String str2;
        final long j2;
        final iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-126890956);
        int i4 = (e18Var.f(py8Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= e18Var.f(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i6 = i3 | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i6 & 1, (i6 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                if (i5 != 0) {
                    iqbVar = fqb.E;
                }
                j = ((d54) e18Var.j(on4.a)).a;
            } else {
                e18Var.T();
            }
            int i7 = i6 & (-7169);
            iqb iqbVar3 = iqbVar;
            long j3 = j;
            e18Var.q();
            str2 = str;
            b(yb5.B(py8Var, e18Var), str2, iqbVar3, j3, e18Var, (i7 & 112) | 8 | (i7 & 896), 0);
            iqbVar2 = iqbVar3;
            j2 = j3;
        } else {
            str2 = str;
            e18Var.T();
            j2 = j;
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final String str3 = str2;
            r7eVarS.d = new pz7() { // from class: av8
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cv8.a(py8Var, str3, iqbVar2, j2, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.bpc r18, final java.lang.String r19, defpackage.iqb r20, long r21, defpackage.ld4 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv8.b(bpc, java.lang.String, iqb, long, ld4, int, int):void");
    }
}
