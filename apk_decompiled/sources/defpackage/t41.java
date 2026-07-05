package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t41 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Object yr7Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                v41 v41Var = (v41) obj;
                v41Var.getClass();
                if (i == -3 || i == -2) {
                    if (i == -2) {
                        d87 d87Var = v41Var.c;
                        if (d87Var != null) {
                            k1h k1hVar = d87Var.L;
                            k1hVar.getClass();
                            j1h j1hVarC = k1h.c();
                            j1hVarC.a = k1hVar.a.obtainMessage(33, 0, 0);
                            j1hVarC.b();
                        }
                        v41Var.b(3);
                    } else {
                        v41Var.b(4);
                    }
                } else if (i == -1) {
                    d87 d87Var2 = v41Var.c;
                    if (d87Var2 != null) {
                        k1h k1hVar2 = d87Var2.L;
                        k1hVar2.getClass();
                        j1h j1hVarC2 = k1h.c();
                        j1hVarC2.a = k1hVar2.a.obtainMessage(33, -1, 0);
                        j1hVarC2.b();
                    }
                    v41Var.a();
                    v41Var.b(1);
                } else if (i == 1) {
                    v41Var.b(2);
                    d87 d87Var3 = v41Var.c;
                    if (d87Var3 != null) {
                        k1h k1hVar3 = d87Var3.L;
                        k1hVar3.getClass();
                        j1h j1hVarC3 = k1h.c();
                        j1hVarC3.a = k1hVar3.a.obtainMessage(33, 1, 0);
                        j1hVarC3.b();
                    }
                } else {
                    ebh.z("Unknown focus change type: ", i, "AudioFocusManager");
                }
                break;
            case 1:
                pi1 pi1Var = (pi1) obj;
                if (!pi1Var.k) {
                    if (i == -3) {
                        yr7Var = as7.a;
                    } else if (i == -2) {
                        yr7Var = zr7.a;
                    } else if (i == -1) {
                        yr7Var = new yr7(gwk.k(pi1Var.a), gwk.l(pi1Var.a));
                    } else if (i == 1) {
                        yr7Var = xr7.a;
                    }
                    pi1Var.g.r(yr7Var);
                    break;
                }
                break;
            default:
                l5j l5jVar = (l5j) obj;
                if (i == -2 || i == -1) {
                    l5jVar.O();
                }
                break;
        }
    }
}
