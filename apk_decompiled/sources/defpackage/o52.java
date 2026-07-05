package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o52 {
    public final xjh a;

    public o52(xjh xjhVar) {
        this.a = xjhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o52)) {
            return false;
        }
        xjh xjhVar = this.a;
        zb0 zb0Var = xjhVar.a;
        xjh xjhVar2 = ((o52) obj).a;
        return x44.r(zb0Var, xjhVar2.a) && xjhVar.b.e(xjhVar2.b) && x44.r(xjhVar.c, xjhVar2.c) && xjhVar.d == xjhVar2.d && xjhVar.e == xjhVar2.e && xjhVar.f == xjhVar2.f && x44.r(xjhVar.g, xjhVar2.g) && xjhVar.h == xjhVar2.h && xjhVar.i == xjhVar2.i && rl4.b(xjhVar.j, xjhVar2.j);
    }

    public final int hashCode() {
        xjh xjhVar = this.a;
        int iHashCode = xjhVar.a.hashCode() * 31;
        tkh tkhVar = xjhVar.b;
        egg eggVar = tkhVar.a;
        long j = eggVar.b;
        dlh[] dlhVarArr = clh.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        dv7 dv7Var = eggVar.c;
        int i = (iHashCode2 + (dv7Var != null ? dv7Var.E : 0)) * 31;
        wu7 wu7Var = eggVar.d;
        int iHashCode3 = (i + (wu7Var != null ? Integer.hashCode(wu7Var.a) : 0)) * 31;
        xu7 xu7Var = eggVar.e;
        int iHashCode4 = (iHashCode3 + (xu7Var != null ? Integer.hashCode(xu7Var.a) : 0)) * 31;
        xt7 xt7Var = eggVar.f;
        int iHashCode5 = (iHashCode4 + (xt7Var != null ? xt7Var.hashCode() : 0)) * 31;
        String str = eggVar.g;
        int iE = vb7.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, eggVar.h);
        ue1 ue1Var = eggVar.i;
        int iHashCode6 = (iE + (ue1Var != null ? Float.hashCode(ue1Var.a) : 0)) * 31;
        fjh fjhVar = eggVar.j;
        int iHashCode7 = (iHashCode6 + (fjhVar != null ? fjhVar.hashCode() : 0)) * 31;
        gea geaVar = eggVar.k;
        int iHashCode8 = (iHashCode7 + (geaVar != null ? geaVar.E.hashCode() : 0)) * 31;
        long j2 = eggVar.l;
        int i2 = d54.i;
        int iE2 = vb7.e(iHashCode8, 31, j2);
        r5d r5dVar = eggVar.o;
        int iHashCode9 = (tkhVar.b.hashCode() + ((iE2 + (r5dVar != null ? r5dVar.hashCode() : 0)) * 31)) * 31;
        z5d z5dVar = tkhVar.c;
        return Long.hashCode(xjhVar.j) + ((xjhVar.i.hashCode() + ((xjhVar.h.hashCode() + ((xjhVar.g.hashCode() + vb7.c(xjhVar.f, fsh.p((kgh.m((iHashCode9 + (z5dVar != null ? z5dVar.hashCode() : 0) + iHashCode) * 31, 31, xjhVar.c) + xjhVar.d) * 31, 31, xjhVar.e), 31)) * 31)) * 31)) * 31);
    }
}
