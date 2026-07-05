package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class ldj {
    public static final xub a;
    public static final jdj[] b;

    static {
        xub xubVar = new xub(8);
        jdj.a.getClass();
        kdj kdjVar = idj.g;
        xubVar.i(1, kdjVar);
        kdj kdjVar2 = idj.f;
        xubVar.i(2, kdjVar2);
        kdj kdjVar3 = idj.b;
        xubVar.i(4, kdjVar3);
        kdj kdjVar4 = idj.d;
        xubVar.i(8, kdjVar4);
        kdj kdjVar5 = idj.h;
        xubVar.i(16, kdjVar5);
        kdj kdjVar6 = idj.e;
        xubVar.i(32, kdjVar6);
        kdj kdjVar7 = idj.i;
        xubVar.i(64, kdjVar7);
        kdj kdjVar8 = idj.c;
        xubVar.i(FreeTypeConstants.FT_LOAD_PEDANTIC, kdjVar8);
        a = xubVar;
        b = new jdj[]{kdjVar, kdjVar2, kdjVar3, kdjVar7, kdjVar5, kdjVar6, kdjVar4, idj.j, kdjVar8};
    }

    public static final void a(cma cmaVar, a49 a49Var, long j, int i, int i2) {
        if (kxk.r(j, -1L)) {
            return;
        }
        cmaVar.b(a49Var.b(), (int) ((j >>> 48) & 65535));
        cmaVar.b(a49Var.d(), (int) ((j >>> 32) & 65535));
        cmaVar.b(a49Var.c(), i - ((int) ((j >>> 16) & 65535)));
        cmaVar.b(a49Var.a(), i2 - ((int) (j & 65535)));
    }
}
