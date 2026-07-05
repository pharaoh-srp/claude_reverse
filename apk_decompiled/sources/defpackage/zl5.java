package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zl5 {
    public static final qnc a = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 8.0f;

    public static final void a(zy7 zy7Var, ta4 ta4Var, iqb iqbVar, pz7 pz7Var, e0g e0gVar, wl5 wl5Var, c36 c36Var, ta4 ta4Var2, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e0g e0gVar2;
        wl5 wl5Var2;
        c36 c36Var2;
        int i2;
        c36 c36Var3;
        e0g e0gVar3;
        wl5 wl5Var3;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(219718641);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 13312384;
        if (e18Var.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                b79 b79Var = yl5.a;
                e0g e0gVarB = k1g.b(gwk.c, e18Var);
                b79 b79Var2 = yl5.a;
                wl5 wl5VarA = yl5.a(e18Var);
                i2 = i3 & (-3727361);
                c36Var3 = new c36(3);
                e0gVar3 = e0gVarB;
                wl5Var3 = wl5VarA;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-3727361);
                iqbVar3 = iqbVar;
                e0gVar3 = e0gVar;
                wl5Var3 = wl5Var;
                c36Var3 = c36Var;
            }
            e18Var.q();
            nt.d(zy7Var, b.w(iqbVar3, lja.Q, false), c36Var3, fd9.q0(1108953335, new uo(e0gVar3, wl5Var3, ta4Var2, ta4Var, pz7Var, 17), e18Var), e18Var, (i2 & 14) | 3456, 0);
            c36Var2 = c36Var3;
            iqbVar2 = iqbVar3;
            wl5Var2 = wl5Var3;
            e0gVar2 = e0gVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            e0gVar2 = e0gVar;
            wl5Var2 = wl5Var;
            c36Var2 = c36Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(zy7Var, ta4Var, iqbVar2, pz7Var, e0gVar2, wl5Var2, c36Var2, ta4Var2, i);
        }
    }
}
