package androidx.compose.ui.draw;

import defpackage.bpc;
import defpackage.hr1;
import defpackage.iqb;
import defpackage.jo4;
import defpackage.lja;
import defpackage.tt;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static iqb a(iqb iqbVar, bpc bpcVar, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            ttVar = lja.K;
        }
        tt ttVar2 = ttVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            hr1Var = null;
        }
        return iqbVar.B(new PainterElement(bpcVar, z, ttVar2, jo4Var, f2, hr1Var));
    }
}
