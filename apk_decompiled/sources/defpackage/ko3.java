package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ko3 extends u0 {
    public z7d p0;
    public m19 q0;

    @Override // defpackage.u19
    public final void A(s20 s20Var, u7d u7dVar) {
        z1();
        if (this.Z && this.d0 == null) {
            e38 e38VarF = npk.f(this);
            p1(e38VarF);
            this.d0 = e38VarF;
        }
        if (u7dVar != u7d.F) {
            if (u7dVar != u7d.G || this.q0 == null) {
                return;
            }
            List listF = s20Var.f();
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                m19 m19Var = (m19) ((ArrayList) listF).get(i);
                if (m19Var.f() && m19Var != this.q0) {
                    E1(true);
                    return;
                }
            }
            return;
        }
        if (this.q0 == null) {
            List listF2 = s20Var.f();
            int size2 = listF2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (xb5.f((m19) ((ArrayList) listF2).get(i2))) {
                    m19 m19Var2 = (m19) ((ArrayList) s20Var.f()).get(0);
                    m19Var2.a();
                    this.q0 = m19Var2;
                    if (this.Z) {
                        x1(m19Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        List listF3 = s20Var.f();
        int size3 = listF3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            m19 m19Var3 = (m19) ((ArrayList) listF3).get(i3);
            if (m19Var3.f() || !m19Var3.d() || m19Var3.c()) {
                float f = ((ovi) yb5.o(this, ve4.u)).f();
                List listF4 = s20Var.f();
                int size4 = listF4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    m19 m19Var4 = (m19) ((ArrayList) listF4).get(i4);
                    long jB = m19Var4.b();
                    m19 m19Var5 = this.q0;
                    m19Var5.getClass();
                    boolean z = Math.abs(fcc.d(fcc.h(jB, m19Var5.b()))) > f;
                    if (m19Var4.f() || z) {
                        E1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((m19) ((ArrayList) s20Var.f()).get(0)).a();
        if (this.Z) {
            m19 m19Var6 = this.q0;
            m19Var6.getClass();
            w1(m19Var6.b(), true);
            this.a0.a();
        }
        this.q0 = null;
    }

    @Override // defpackage.u0
    public final boolean B1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.u0, defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        super.C(t7dVar, u7dVar, j);
        if (u7dVar != u7d.F) {
            if (u7dVar != u7d.G || this.p0 == null) {
                return;
            }
            List list = t7dVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                z7d z7dVar = (z7d) list.get(i);
                if (z7dVar.l() && z7dVar != this.p0) {
                    E1(false);
                    return;
                }
            }
            return;
        }
        if (this.p0 == null) {
            if (x4h.g(t7dVar, true, false)) {
                z7d z7dVar2 = (z7d) t7dVar.a.get(0);
                z7dVar2.a();
                this.p0 = z7dVar2;
                if (this.Z) {
                    y1(z7dVar2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = t7dVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!hvj.i((z7d) list2.get(i2))) {
                long jU1 = u1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    z7d z7dVar3 = (z7d) list2.get(i3);
                    if (z7dVar3.l() || hvj.l(z7dVar3, j, jU1)) {
                        E1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((z7d) list2.get(0)).a();
        if (this.Z) {
            z7d z7dVar4 = this.p0;
            z7dVar4.getClass();
            w1(z7dVar4.e(), false);
            this.a0.a();
        }
        this.p0 = null;
    }

    @Override // defpackage.u0
    public final void C1(KeyEvent keyEvent) {
        this.a0.a();
    }

    public final void E1(boolean z) {
        if (z) {
            this.q0 = null;
        } else {
            this.p0 = null;
        }
        v1(z);
    }

    @Override // defpackage.u0, defpackage.d8d
    public final void R() {
        super.R();
        E1(false);
    }

    @Override // defpackage.u19
    public final void v0() {
        E1(true);
    }
}
