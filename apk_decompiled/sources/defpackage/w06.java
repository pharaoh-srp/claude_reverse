package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class w06 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ y06 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w06(y06 y06Var, int i) {
        super(0);
        this.F = i;
        this.G = y06Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        y06 y06Var = this.G;
        switch (i) {
            case 0:
                c06 c06Var = c06.m;
                fab.a.getClass();
                return y06Var.i(c06Var, f06.c0);
            default:
                es9 es9Var = y06Var.g;
                c16 c16Var = y06Var.j;
                es9Var.getClass();
                c16Var.getClass();
                Collection collectionB = ((m4) c16Var.p()).b();
                collectionB.getClass();
                return collectionB;
        }
    }
}
