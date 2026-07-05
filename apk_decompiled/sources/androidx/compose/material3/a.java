package androidx.compose.material3;

import defpackage.cue;
import defpackage.due;
import defpackage.eue;
import defpackage.iei;
import defpackage.l50;
import defpackage.w79;
import defpackage.xe4;
import defpackage.yb5;
import defpackage.yte;
import defpackage.z8i;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements zy7 {
    public final /* synthetic */ DelegatingThemeAwareRippleNode E;

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.E = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.zy7
    public final Object a() {
        xe4 xe4Var = due.b;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.E;
        yte yteVar = (yte) yb5.o(delegatingThemeAwareRippleNode, xe4Var);
        eue eueVar = delegatingThemeAwareRippleNode.c0;
        if (yteVar == null) {
            if (eueVar != null) {
                delegatingThemeAwareRippleNode.q1(eueVar);
            }
            delegatingThemeAwareRippleNode.c0 = null;
        } else if (eueVar == null) {
            c cVar = new c(delegatingThemeAwareRippleNode, 0);
            b bVar = new b(delegatingThemeAwareRippleNode, new c(delegatingThemeAwareRippleNode, 2), new c(delegatingThemeAwareRippleNode, 1));
            w79 w79Var = delegatingThemeAwareRippleNode.U;
            boolean z = delegatingThemeAwareRippleNode.V;
            float f = delegatingThemeAwareRippleNode.W;
            z8i z8iVar = cue.a;
            eue eueVar2 = new eue();
            eueVar2.p1(new l50(w79Var, z, f, cVar, bVar));
            delegatingThemeAwareRippleNode.p1(eueVar2);
            delegatingThemeAwareRippleNode.c0 = eueVar2;
        }
        return iei.a;
    }
}
