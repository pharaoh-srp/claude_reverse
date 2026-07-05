package androidx.compose.material3;

import defpackage.due;
import defpackage.e0g;
import defpackage.gue;
import defpackage.gwa;
import defpackage.hue;
import defpackage.iue;
import defpackage.jue;
import defpackage.jwa;
import defpackage.kue;
import defpackage.lue;
import defpackage.mue;
import defpackage.nue;
import defpackage.oue;
import defpackage.pue;
import defpackage.rsk;
import defpackage.rue;
import defpackage.sue;
import defpackage.sz6;
import defpackage.tue;
import defpackage.umg;
import defpackage.vsk;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.yig;
import defpackage.zrb;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements zy7 {
    public final /* synthetic */ DelegatingThemeAwareRippleNode E;
    public final /* synthetic */ c F;
    public final /* synthetic */ c G;

    public /* synthetic */ b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, c cVar, c cVar2) {
        this.E = delegatingThemeAwareRippleNode;
        this.F = cVar;
        this.G = cVar2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        rsk iueVar;
        umg umgVar = jwa.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.E;
        zrb zrbVar = ((gwa) yb5.o(delegatingThemeAwareRippleNode, umgVar)).d;
        tue tueVar = (tue) yb5.o(delegatingThemeAwareRippleNode, due.a);
        vsk oueVar = delegatingThemeAwareRippleNode.Y ? new oue() : nue.b;
        if (delegatingThemeAwareRippleNode.Z) {
            wd6 wd6Var = tueVar.a;
            if (wd6Var instanceof sue) {
                iueVar = new kue();
            } else {
                if (!(wd6Var instanceof rue)) {
                    sz6.j("Unknown focus ripple theme configuration");
                    return null;
                }
                e0g e0gVar = delegatingThemeAwareRippleNode.X;
                zrbVar.getClass();
                yig yigVar = zrb.c;
                yigVar.getClass();
                yig yigVar2 = zrb.f;
                yigVar2.getClass();
                iueVar = new iue(e0gVar, this.F, this.G, yigVar, yigVar2);
            }
        } else {
            iueVar = jue.d;
        }
        return new pue(oueVar, iueVar, delegatingThemeAwareRippleNode.a0 ? new mue() : lue.c, delegatingThemeAwareRippleNode.b0 ? new hue() : gue.g);
    }
}
