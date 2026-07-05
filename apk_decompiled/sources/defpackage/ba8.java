package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ba8 implements co4 {
    public final int a;
    public final b80 b;
    public final b80 c;
    public final b80 d;
    public final b80 e;
    public final c80 f;
    public final int g;
    public final int h;
    public final float i;
    public final ArrayList j;
    public final c80 k;
    public final boolean l;

    public ba8(String str, int i, b80 b80Var, b80 b80Var2, b80 b80Var3, b80 b80Var4, c80 c80Var, int i2, int i3, float f, ArrayList arrayList, c80 c80Var2, boolean z) {
        this.a = i;
        this.b = b80Var;
        this.c = b80Var2;
        this.d = b80Var3;
        this.e = b80Var4;
        this.f = c80Var;
        this.g = i2;
        this.h = i3;
        this.i = f;
        this.j = arrayList;
        this.k = c80Var2;
        this.l = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new ca8(pnaVar, le1Var, this);
    }
}
