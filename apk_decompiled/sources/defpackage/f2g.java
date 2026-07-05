package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f2g extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ g2g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2g(g2g g2gVar, int i) {
        super(0);
        this.F = i;
        this.G = g2gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        tp4 tp4Var;
        Object obj;
        int i = this.F;
        int i2 = 0;
        g2g g2gVar = this.G;
        switch (i) {
            case 0:
                boolean z = g2gVar.g;
                a80 a80Var = g2gVar.f;
                k3g k3gVar = g2gVar.b;
                if (!z && k3gVar.a() && a80Var.f()) {
                    List listC = g2gVar.c();
                    int size = listC.size();
                    while (true) {
                        tp4Var = null;
                        if (i2 < size) {
                            obj = listC.get(i2);
                            if (!((h2g) obj).c().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    h2g h2gVar = (h2g) obj;
                    if (h2gVar != null) {
                        kl7 kl7Var = h2gVar.c().f;
                        if (kl7Var instanceof yig) {
                            yig yigVar = (yig) kl7Var;
                            gb9.D(k3gVar.F, null, null, new o6e(g2gVar, new yig(yigVar.a, yigVar.b, new fcc((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), tp4Var, 19), 3);
                        }
                        g2gVar.g = true;
                    }
                }
                return new fcc(((fcc) a80Var.e()).a);
            default:
                List listB = g2gVar.b();
                int size2 = listB.size();
                while (i2 < size2) {
                    h2g h2gVar2 = (h2g) listB.get(i2);
                    if (h2gVar2.c().b() && h2gVar2.h()) {
                        return iei.a;
                    }
                    i2++;
                }
                return iei.a;
        }
    }
}
