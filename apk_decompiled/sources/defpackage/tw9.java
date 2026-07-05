package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tw9 implements xy9 {
    public final lx9 a;

    public tw9(lx9 lx9Var) {
        this.a = lx9Var;
    }

    @Override // defpackage.xy9
    public final int a() {
        return this.a.g().p;
    }

    @Override // defpackage.xy9
    public final int b() {
        return ((ex9) w44.U0(this.a.g().m)).a;
    }

    @Override // defpackage.xy9
    public final int c() {
        int i;
        lx9 lx9Var = this.a;
        int i2 = 0;
        if (lx9Var.g().m.isEmpty()) {
            return 0;
        }
        dx9 dx9VarG = lx9Var.g();
        ukc ukcVar = dx9VarG.q;
        ukc ukcVar2 = ukc.E;
        int iG = (int) (ukcVar == ukcVar2 ? dx9VarG.g() & 4294967295L : dx9VarG.g() >> 32);
        dx9 dx9VarG2 = lx9Var.g();
        ukc ukcVar3 = dx9VarG2.q;
        List list = dx9VarG2.m;
        boolean z = ukcVar3 == ukcVar2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                ex9 ex9Var = (ex9) list.get(i3);
                int i6 = z ? ex9Var.u : ex9Var.v;
                if (i6 == -1) {
                    i3++;
                } else {
                    int iMax = 0;
                    while (i3 < list.size()) {
                        ex9 ex9Var2 = (ex9) list.get(i3);
                        if ((z ? ex9Var2.u : ex9Var2.v) != i6) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((ex9) list.get(i3)).s & 4294967295L : ((ex9) list.get(i3)).s >> 32));
                        i3++;
                    }
                    i4 += iMax;
                    i5++;
                }
            }
            i2 = (i4 / i5) + dx9VarG2.s;
        }
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.xy9
    public final boolean d() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.xy9
    public final int e() {
        return ((isc) this.a.d.b).h();
    }
}
