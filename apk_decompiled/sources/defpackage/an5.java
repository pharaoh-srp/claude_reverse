package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class an5 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public an5(ps7 ps7Var, boolean z, x0a x0aVar, l45 l45Var) {
        this.G = ps7Var;
        this.F = z;
        this.H = x0aVar;
        this.I = l45Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Boolean bool;
        int i = this.E;
        boolean z = this.F;
        Object obj2 = this.G;
        Object obj3 = this.H;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((so9) obj).a;
                l45 l45Var = (l45) obj4;
                x0a x0aVar = (x0a) obj3;
                it5 it5Var = x0aVar.j;
                ps7 ps7Var = (ps7) obj2;
                if (cn5.q(keyEvent)) {
                    if (ps7Var.a(6)) {
                        ps7Var.a(z ? 3 : 4);
                    } else if (!it5Var.a()) {
                        gb9.D(l45Var, null, null, new bn5(x0aVar, 1, ps7Var, 1, (tp4) null), 3);
                    }
                    return Boolean.TRUE;
                }
                if (it5Var.a()) {
                    return Boolean.TRUE;
                }
                if (z ? cn5.r(keyEvent) : cn5.s(keyEvent)) {
                    gb9.D(l45Var, null, null, new bn5(x0aVar, 1, ps7Var, 1, (tp4) null), 3);
                    return Boolean.TRUE;
                }
                if (!(z ? cn5.s(keyEvent) : cn5.r(keyEvent))) {
                    return Boolean.FALSE;
                }
                ps7Var.a(2);
                return Boolean.TRUE;
            default:
                KeyEvent keyEvent2 = ((so9) obj).a;
                nwb nwbVar = (nwb) obj4;
                gt0 gt0Var = (gt0) obj3;
                String str = (String) obj2;
                if (ssj.j(keyEvent2) == 1 && (kkk.e(keyEvent2) || no9.a(zsj.b(keyEvent2.getKeyCode()), no9.q))) {
                    if (!str.equals("PrimaryEditable")) {
                        gt0Var.a();
                    } else if (kkk.e(keyEvent2)) {
                        gt0Var.a();
                        return Boolean.TRUE;
                    }
                }
                if (str.equals("PrimaryEditable") && z && (no9.a(zsj.b(keyEvent2.getKeyCode()), no9.p) || no9.a(zsj.b(keyEvent2.getKeyCode()), no9.e) || no9.a(zsj.b(keyEvent2.getKeyCode()), no9.d))) {
                    bool = Boolean.TRUE;
                    nwbVar.setValue(bool);
                } else {
                    bool = Boolean.FALSE;
                    nwbVar.setValue(bool);
                }
                return bool;
        }
    }

    public an5(String str, gt0 gt0Var, boolean z, nwb nwbVar) {
        this.G = str;
        this.H = gt0Var;
        this.F = z;
        this.I = nwbVar;
    }
}
