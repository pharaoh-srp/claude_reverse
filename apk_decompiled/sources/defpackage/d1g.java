package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d1g implements co4 {
    public final c80 a;
    public final ArrayList b;
    public final b80 c;
    public final b80 d;
    public final c80 e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;

    public d1g(String str, c80 c80Var, ArrayList arrayList, b80 b80Var, b80 b80Var2, c80 c80Var2, int i, int i2, float f, boolean z) {
        this.a = c80Var;
        this.b = arrayList;
        this.c = b80Var;
        this.d = b80Var2;
        this.e = c80Var2;
        this.f = i;
        this.g = i2;
        this.h = f;
        this.i = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new lsg(pnaVar, le1Var, this);
    }
}
