package androidx.compose.ui.graphics.shadow;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.b49;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.e0g;
import defpackage.ewb;
import defpackage.fu9;
import defpackage.hr1;
import defpackage.mdj;
import defpackage.tzf;
import defpackage.u50;
import defpackage.wd6;
import defpackage.xv8;
import defpackage.zni;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Lbpc;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class InnerShadowPainter extends bpc {
    public final e0g J;
    public final tzf K;
    public final xv8 L;
    public float M = 1.0f;
    public hr1 N;

    public InnerShadowPainter(e0g e0gVar, tzf tzfVar, xv8 xv8Var) {
        this.J = e0gVar;
        this.K = tzfVar;
        this.L = xv8Var;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.M = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.N = hr1Var;
        return true;
    }

    @Override // defpackage.bpc
    public final void e(fu9 fu9Var) {
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        b49 b49Var;
        xv8 xv8Var = this.L;
        e0g e0gVar = this.J;
        long jG = cv9Var.E.g();
        fu9 layoutDirection = cv9Var.getLayoutDirection();
        tzf tzfVar = this.K;
        synchronized (xv8Var) {
            u50 u50Var = (u50) xv8Var.H;
            if (u50Var == null) {
                u50 u50Var2 = new u50(zni.b, 0L, fu9.E, 1.0f, null);
                xv8Var.H = u50Var2;
                u50Var = u50Var2;
            }
            u50Var.a = e0gVar;
            u50Var.b = jG;
            u50Var.c = layoutDirection;
            u50Var.d = cv9Var.E.getDensity();
            u50Var.e = tzfVar;
            ewb ewbVar = (ewb) xv8Var.G;
            if (ewbVar == null) {
                ewbVar = new ewb();
                xv8Var.G = ewbVar;
            }
            b49 b49Var2 = (b49) ewbVar.g(u50Var);
            if (b49Var2 == null) {
                b49Var2 = new b49(tzfVar, e0gVar.a(jG, layoutDirection, cv9Var));
                ewb ewbVar2 = (ewb) xv8Var.G;
                if (ewbVar2 == null) {
                    ewbVar2 = new ewb();
                    xv8Var.G = ewbVar2;
                }
                ewbVar2.m(u50.a(u50Var), b49Var2);
            }
            b49Var = b49Var2;
        }
        hr1 hr1Var = this.N;
        long jG2 = cv9Var.E.g();
        tzf tzfVar2 = this.K;
        b49Var.b(cv9Var, hr1Var, jG2, tzfVar2.e, tzfVar2.f, wd6.d0(this.M * tzfVar2.g, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f), this.K.d);
    }
}
