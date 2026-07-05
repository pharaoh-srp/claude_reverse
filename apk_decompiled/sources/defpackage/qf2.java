package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qf2 {
    public static final qnc a = new qnc(12.0f, 8.0f, 16.0f, 8.0f);

    public static nxf a(ld4 ld4Var) {
        return c0l.g(0L, 0L, gm3.a(ld4Var).O, gm3.a(ld4Var).O, gm3.a(ld4Var).O, ld4Var, 7);
    }

    public static oxf b(tf2 tf2Var, ld4 ld4Var, int i) {
        e0g e0gVar;
        e0g e0gVarC;
        int iOrdinal = tf2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e18 e18Var = (e18) ld4Var;
                e18Var.a0(1899392251);
                e18Var.p(false);
                e0gVarC = xve.c(16.0f, 16.0f, 2.0f, 2.0f);
            } else if (iOrdinal == 2) {
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.a0(1446741704);
                e0gVar = gm3.b(e18Var2).a;
                e18Var2.p(false);
            } else {
                if (iOrdinal != 3) {
                    throw ebh.u((e18) ld4Var, 1446738633, false);
                }
                e18 e18Var3 = (e18) ld4Var;
                e18Var3.a0(1899585691);
                e18Var3.p(false);
                e0gVarC = xve.c(2.0f, 2.0f, 16.0f, 16.0f);
            }
            return new oxf(e0gVarC, gm3.a(ld4Var).n);
        }
        e18 e18Var4 = (e18) ld4Var;
        e18Var4.a0(1446740100);
        e0gVar = gm3.b(e18Var4).h;
        e18Var4.p(false);
        e0gVarC = e0gVar;
        return new oxf(e0gVarC, gm3.a(ld4Var).n);
    }

    public static oxf c(ld4 ld4Var) {
        return new oxf(gm3.b(ld4Var).a, gm3.a(ld4Var).n);
    }
}
