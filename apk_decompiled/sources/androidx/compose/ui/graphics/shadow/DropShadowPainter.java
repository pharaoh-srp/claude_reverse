package androidx.compose.ui.graphics.shadow;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.e0g;
import defpackage.efe;
import defpackage.ewb;
import defpackage.fu9;
import defpackage.hr1;
import defpackage.jh6;
import defpackage.mdj;
import defpackage.tzf;
import defpackage.u50;
import defpackage.wd6;
import defpackage.xv8;
import defpackage.ya6;
import defpackage.zni;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Lbpc;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class DropShadowPainter extends bpc {
    public final e0g J;
    public final tzf K;
    public final xv8 L;
    public float M = 1.0f;
    public hr1 N;

    public DropShadowPainter(e0g e0gVar, tzf tzfVar, xv8 xv8Var) {
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
    /* JADX INFO: renamed from: i */
    public final long getN() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        jh6 jh6Var;
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
            u50Var.e = new tzf(tzfVar.a, tzfVar.b, 0L, tzfVar.e, tzfVar.f, tzfVar.g, tzfVar.d);
            ewb ewbVar = (ewb) xv8Var.F;
            if (ewbVar == null) {
                ewbVar = new ewb();
                xv8Var.F = ewbVar;
            }
            jh6Var = (jh6) ewbVar.g(u50Var);
            if (jh6Var == null) {
                jh6Var = new jh6(tzfVar, e0gVar.a(jG, layoutDirection, cv9Var));
                ewb ewbVar2 = (ewb) xv8Var.F;
                if (ewbVar2 == null) {
                    ewbVar2 = new ewb();
                    xv8Var.F = ewbVar2;
                }
                ewbVar2.m(u50.a(u50Var), jh6Var);
            }
        }
        float fQ0 = cv9Var.q0(ya6.a(this.K.c));
        float fQ02 = cv9Var.q0(ya6.b(this.K.c));
        ((efe) cv9Var.E.F.E).G(fQ0, fQ02);
        try {
            hr1 hr1Var = this.N;
            long jG2 = cv9Var.E.g();
            tzf tzfVar2 = jh6Var.i;
            jh6Var.b(cv9Var, hr1Var, jG2, tzfVar2.e, tzfVar2.f, wd6.d0(this.M * tzfVar2.g, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f), jh6Var.i.d);
        } finally {
            ((efe) cv9Var.E.F.E).G(-fQ0, -fQ02);
        }
    }
}
