package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class rt9 {
    public final List a;
    public final bna b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final i80 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final b80 q;
    public final epk r;
    public final c80 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final ive w;
    public final h80 x;
    public final int y;

    public rt9(List list, bna bnaVar, String str, long j, int i, long j2, String str2, List list2, i80 i80Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, b80 b80Var, epk epkVar, List list3, int i5, c80 c80Var, boolean z, ive iveVar, h80 h80Var, int i6) {
        this.a = list;
        this.b = bnaVar;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = i80Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = b80Var;
        this.r = epkVar;
        this.t = list3;
        this.u = i5;
        this.s = c80Var;
        this.v = z;
        this.w = iveVar;
        this.x = h80Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbO = ij0.o(str);
        sbO.append(this.c);
        sbO.append("\n");
        long j = this.f;
        bna bnaVar = this.b;
        rt9 rt9Var = (rt9) bnaVar.i.b(j);
        if (rt9Var != null) {
            sbO.append("\t\tParents: ");
            sbO.append(rt9Var.c);
            for (rt9 rt9Var2 = (rt9) bnaVar.i.b(rt9Var.f); rt9Var2 != null; rt9Var2 = (rt9) bnaVar.i.b(rt9Var2.f)) {
                sbO.append("->");
                sbO.append(rt9Var2.c);
            }
            sbO.append(str);
            sbO.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbO.append(str);
            sbO.append("\tMasks: ");
            sbO.append(list.size());
            sbO.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbO.append(str);
            sbO.append("\tBackground: ");
            sbO.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sbO.append(str);
            sbO.append("\tShapes:\n");
            for (Object obj : list2) {
                sbO.append(str);
                sbO.append("\t\t");
                sbO.append(obj);
                sbO.append("\n");
            }
        }
        return sbO.toString();
    }

    public final String toString() {
        return a("");
    }
}
