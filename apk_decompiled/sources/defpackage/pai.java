package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class pai {
    public static final pai k = new pai(false, false, false, false, false, new pai(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final pai f;
    public final boolean g;
    public final pai h;
    public final pai i;
    public final boolean j;

    public pai(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, pai paiVar, boolean z6, pai paiVar2, pai paiVar3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        paiVar = (i & 32) != 0 ? null : paiVar;
        z6 = (i & 64) != 0 ? true : z6;
        paiVar2 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? paiVar : paiVar2;
        paiVar3 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? paiVar : paiVar3;
        boolean z7 = (i & 512) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = paiVar;
        this.g = z6;
        this.h = paiVar2;
        this.i = paiVar3;
        this.j = z7;
    }
}
