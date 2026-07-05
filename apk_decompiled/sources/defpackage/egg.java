package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class egg implements vb0 {
    public final ejh a;
    public final long b;
    public final dv7 c;
    public final wu7 d;
    public final xu7 e;
    public final xt7 f;
    public final String g;
    public final long h;
    public final ue1 i;
    public final fjh j;
    public final gea k;
    public final long l;
    public final qeh m;
    public final uzf n;
    public final r5d o;
    public final yd6 p;

    public egg(long j, long j2, dv7 dv7Var, wu7 wu7Var, xu7 xu7Var, xt7 xt7Var, String str, long j3, ue1 ue1Var, fjh fjhVar, gea geaVar, long j4, qeh qehVar, uzf uzfVar, int i) {
        this((i & 1) != 0 ? d54.h : j, (i & 2) != 0 ? clh.c : j2, (i & 4) != 0 ? null : dv7Var, (i & 8) != 0 ? null : wu7Var, (i & 16) != 0 ? null : xu7Var, (i & 32) != 0 ? null : xt7Var, (i & 64) != 0 ? null : str, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? clh.c : j3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : ue1Var, (i & 512) != 0 ? null : fjhVar, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : geaVar, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? d54.h : j4, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : qehVar, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : uzfVar, (r5d) null, (yd6) null);
    }

    public static egg a(egg eggVar, long j, int i) {
        long jB = (i & 1) != 0 ? eggVar.a.b() : j;
        long j2 = eggVar.b;
        dv7 dv7Var = eggVar.c;
        wu7 wu7Var = eggVar.d;
        xu7 xu7Var = eggVar.e;
        xt7 xt7Var = (i & 32) != 0 ? eggVar.f : null;
        String str = eggVar.g;
        long j3 = eggVar.h;
        ue1 ue1Var = eggVar.i;
        fjh fjhVar = eggVar.j;
        gea geaVar = eggVar.k;
        long j4 = eggVar.l;
        qeh qehVar = eggVar.m;
        uzf uzfVar = eggVar.n;
        r5d r5dVar = eggVar.o;
        yd6 yd6Var = eggVar.p;
        ejh v54Var = eggVar.a;
        if (!d54.c(jB, v54Var.b())) {
            v54Var = jB != 16 ? new v54(jB) : djh.a;
        }
        return new egg(v54Var, j2, dv7Var, wu7Var, xu7Var, xt7Var, str, j3, ue1Var, fjhVar, geaVar, j4, qehVar, uzfVar, r5dVar, yd6Var);
    }

    public final boolean b(egg eggVar) {
        if (this == eggVar) {
            return true;
        }
        return clh.a(this.b, eggVar.b) && x44.r(this.c, eggVar.c) && x44.r(this.d, eggVar.d) && x44.r(this.e, eggVar.e) && x44.r(this.f, eggVar.f) && x44.r(this.g, eggVar.g) && clh.a(this.h, eggVar.h) && x44.r(this.i, eggVar.i) && x44.r(this.j, eggVar.j) && x44.r(this.k, eggVar.k) && d54.c(this.l, eggVar.l) && x44.r(this.o, eggVar.o);
    }

    public final boolean c(egg eggVar) {
        return x44.r(this.a, eggVar.a) && x44.r(this.m, eggVar.m) && x44.r(this.n, eggVar.n) && x44.r(this.p, eggVar.p);
    }

    public final egg d(egg eggVar) {
        if (eggVar == null) {
            return this;
        }
        ejh ejhVar = eggVar.a;
        return fgg.a(this, ejhVar.b(), ejhVar.c(), ejhVar.a(), eggVar.b, eggVar.c, eggVar.d, eggVar.e, eggVar.f, eggVar.g, eggVar.h, eggVar.i, eggVar.j, eggVar.k, eggVar.l, eggVar.m, eggVar.n, eggVar.o, eggVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egg)) {
            return false;
        }
        egg eggVar = (egg) obj;
        return b(eggVar) && c(eggVar);
    }

    public final int hashCode() {
        ejh ejhVar = this.a;
        long jB = ejhVar.b();
        int i = d54.i;
        int iHashCode = Long.hashCode(jB) * 31;
        jy1 jy1VarC = ejhVar.c();
        int iHashCode2 = (Float.hashCode(ejhVar.a()) + ((iHashCode + (jy1VarC != null ? jy1VarC.hashCode() : 0)) * 31)) * 31;
        dlh[] dlhVarArr = clh.b;
        int iE = vb7.e(iHashCode2, 31, this.b);
        dv7 dv7Var = this.c;
        int i2 = (iE + (dv7Var != null ? dv7Var.E : 0)) * 31;
        wu7 wu7Var = this.d;
        int iHashCode3 = (i2 + (wu7Var != null ? Integer.hashCode(wu7Var.a) : 0)) * 31;
        xu7 xu7Var = this.e;
        int iHashCode4 = (iHashCode3 + (xu7Var != null ? Integer.hashCode(xu7Var.a) : 0)) * 31;
        xt7 xt7Var = this.f;
        int iHashCode5 = (iHashCode4 + (xt7Var != null ? xt7Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iE2 = vb7.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        ue1 ue1Var = this.i;
        int iHashCode6 = (iE2 + (ue1Var != null ? Float.hashCode(ue1Var.a) : 0)) * 31;
        fjh fjhVar = this.j;
        int iHashCode7 = (iHashCode6 + (fjhVar != null ? fjhVar.hashCode() : 0)) * 31;
        gea geaVar = this.k;
        int iE3 = vb7.e((iHashCode7 + (geaVar != null ? geaVar.E.hashCode() : 0)) * 31, 31, this.l);
        qeh qehVar = this.m;
        int i3 = (iE3 + (qehVar != null ? qehVar.a : 0)) * 31;
        uzf uzfVar = this.n;
        int iHashCode8 = (i3 + (uzfVar != null ? uzfVar.hashCode() : 0)) * 31;
        r5d r5dVar = this.o;
        int iHashCode9 = (iHashCode8 + (r5dVar != null ? r5dVar.hashCode() : 0)) * 31;
        yd6 yd6Var = this.p;
        return iHashCode9 + (yd6Var != null ? yd6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        ejh ejhVar = this.a;
        sb.append((Object) d54.i(ejhVar.b()));
        sb.append(", brush=");
        sb.append(ejhVar.c());
        sb.append(", alpha=");
        sb.append(ejhVar.a());
        sb.append(", fontSize=");
        sb.append((Object) clh.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) clh.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        y6a.q(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public egg(long j, long j2, dv7 dv7Var, wu7 wu7Var, xu7 xu7Var, xt7 xt7Var, String str, long j3, ue1 ue1Var, fjh fjhVar, gea geaVar, long j4, qeh qehVar, uzf uzfVar, r5d r5dVar, yd6 yd6Var) {
        this(j != 16 ? new v54(j) : djh.a, j2, dv7Var, wu7Var, xu7Var, xt7Var, str, j3, ue1Var, fjhVar, geaVar, j4, qehVar, uzfVar, r5dVar, yd6Var);
    }

    public egg(ejh ejhVar, long j, dv7 dv7Var, wu7 wu7Var, xu7 xu7Var, xt7 xt7Var, String str, long j2, ue1 ue1Var, fjh fjhVar, gea geaVar, long j3, qeh qehVar, uzf uzfVar, r5d r5dVar, yd6 yd6Var) {
        this.a = ejhVar;
        this.b = j;
        this.c = dv7Var;
        this.d = wu7Var;
        this.e = xu7Var;
        this.f = xt7Var;
        this.g = str;
        this.h = j2;
        this.i = ue1Var;
        this.j = fjhVar;
        this.k = geaVar;
        this.l = j3;
        this.m = qehVar;
        this.n = uzfVar;
        this.o = r5dVar;
        this.p = yd6Var;
    }

    public egg(long j, long j2, dv7 dv7Var, wu7 wu7Var, xt7 xt7Var, String str, long j3, ue1 ue1Var, fjh fjhVar, gea geaVar, long j4, qeh qehVar, uzf uzfVar) {
        this(j != 16 ? new v54(j) : djh.a, j2, dv7Var, wu7Var, (xu7) null, xt7Var, str, j3, ue1Var, fjhVar, geaVar, j4, qehVar, uzfVar, (r5d) null, (yd6) null);
    }
}
