package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.concurrent.futures.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg1 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ lg1(zp3 zp3Var, String str, zy7 zy7Var, bvb bvbVar, b bVar) {
        this.E = 3;
        this.F = zp3Var;
        this.H = str;
        this.G = zy7Var;
        this.I = bvbVar;
        this.J = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        kwb kwbVarC;
        wmj wmjVar;
        Runnable qsbVar;
        switch (this.E) {
            case 0:
                tkh tkhVar = (tkh) this.F;
                fu9 fu9Var = (fu9) this.G;
                String str = (String) this.H;
                cz5 cz5Var = (cz5) this.I;
                wt7 wt7Var = (wt7) this.J;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    rcg rcgVarJ = ycg.j();
                    kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
                    if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        rcg rcgVarJ2 = kwbVarC.j();
                        try {
                            tkh tkhVarY = yfd.Y(tkhVar, fu9Var);
                            lm6 lm6Var = lm6.E;
                            b40 b40Var = new b40(str, tkhVarY, lm6Var, lm6Var, wt7Var, cz5Var);
                            b40Var.j();
                            b40Var.f();
                            kwbVarC.w().p();
                            Trace.endSection();
                            return;
                        } finally {
                            rcg.q(rcgVarJ2);
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 1:
                wk4 wk4Var = (wk4) this.F;
                l4i l4iVar = (l4i) this.G;
                wi7 wi7Var = (wi7) this.H;
                l4i l4iVar2 = (l4i) this.I;
                wi7 wi7Var2 = (wi7) this.J;
                fj0 fj0Var = wk4Var.G;
                wi7Var.getClass();
                l4iVar2.getClass();
                wi7Var2.getClass();
                iuj iujVar = (iuj) fj0Var.G;
                h99 h99Var = (h99) fj0Var.F;
                gmf gmfVar = (gmf) fj0Var.E;
                l4i l4iVar3 = l4i.E;
                l4i l4iVar4 = l4i.F;
                cpc cpcVar = new cpc(l4iVar, l4iVar2);
                l4i l4iVar5 = l4i.G;
                if (cpcVar.equals(new cpc(null, l4iVar5)) ? true : cpcVar.equals(new cpc(null, l4iVar3)) ? true : cpcVar.equals(new cpc(null, l4iVar4)) ? true : cpcVar.equals(new cpc(l4iVar5, l4iVar4))) {
                    qsbVar = new iej(wi7Var.o(), gmfVar, h99Var, iujVar);
                } else if (cpcVar.equals(new cpc(l4iVar3, l4iVar5)) ? true : cpcVar.equals(new cpc(l4iVar4, l4iVar5))) {
                    qsbVar = new iej(wi7Var2.o(), gmfVar, h99Var, iujVar);
                } else if (cpcVar.equals(new cpc(l4iVar5, l4iVar3))) {
                    qsbVar = new qsb(wi7Var.o(), wi7Var2.o(), (gmf) fj0Var.E, (h99) fj0Var.F, (iuj) fj0Var.G);
                } else {
                    if (cpcVar.equals(new cpc(l4iVar5, l4iVar5)) ? true : cpcVar.equals(new cpc(l4iVar3, l4iVar3)) ? true : cpcVar.equals(new cpc(l4iVar3, l4iVar4)) ? true : cpcVar.equals(new cpc(l4iVar4, l4iVar4)) ? true : cpcVar.equals(new cpc(l4iVar4, l4iVar3))) {
                        wmjVar = new wmj(4);
                    } else {
                        dch.I((h99) fj0Var.F, 4, x44.X(g99.F, g99.G), new xz(l4iVar, 5, l4iVar2), null, 56);
                        wmjVar = new wmj(4);
                    }
                    qsbVar = wmjVar;
                }
                qsbVar.run();
                wk4Var.J = wi7Var2;
                return;
            case 2:
                cj6 cj6Var = (cj6) this.F;
                e1h e1hVar = (e1h) this.G;
                e1h e1hVar2 = (e1h) this.H;
                ba4 ba4Var = (ba4) this.I;
                View view = (View) this.J;
                Window window = ba4Var.getWindow();
                window.getClass();
                bz7 bz7Var = e1hVar.d;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) bz7Var.invoke(resources)).booleanValue();
                bz7 bz7Var2 = e1hVar2.d;
                Resources resources2 = view.getResources();
                resources2.getClass();
                cj6Var.b(e1hVar, e1hVar2, window, view, zBooleanValue, ((Boolean) bz7Var2.invoke(resources2)).booleanValue());
                return;
            default:
                zp3 zp3Var = (zp3) this.F;
                String str2 = (String) this.H;
                zy7 zy7Var = (zy7) this.G;
                bvb bvbVar = (bvb) this.I;
                b bVar = (b) this.J;
                zp3Var.getClass();
                boolean zO = mpk.O();
                if (zO) {
                    try {
                        String strSubstring = str2.length() <= 127 ? str2 : null;
                        if (strSubstring == null) {
                            strSubstring = str2.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } finally {
                        if (zO) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    zy7Var.a();
                    zic zicVar = n78.J;
                    bvbVar.g(zicVar);
                    bVar.a(zicVar);
                } catch (Throwable th2) {
                    bvbVar.g(new yic(th2));
                    bVar.b(th2);
                }
                if (zO) {
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ lg1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }
}
