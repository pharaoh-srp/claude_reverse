package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lb4 implements wz7 {
    @Override // defpackage.wz7
    public final Object j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, e18 e18Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        yo4 yo4Var = (yo4) obj2;
        rz7 rz7Var = (rz7) obj3;
        zy7 zy7Var = (zy7) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        fqb fqbVar = fqb.E;
        if (i2 == 0) {
            i = (e18Var.f(fqbVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= e18Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= e18Var.g(zBooleanValue) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((iIntValue & 3072) == 0) {
            i |= e18Var.f(yo4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((iIntValue & 24576) == 0) {
            i |= e18Var.h(rz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((iIntValue & 196608) == 0) {
            i |= e18Var.h(zy7Var) ? 131072 : 65536;
        }
        if (e18Var.Q(i & 1, (599187 & i) != 599186)) {
            ip4.c(str, zBooleanValue, yo4Var, fqbVar, rz7Var, zy7Var, e18Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
