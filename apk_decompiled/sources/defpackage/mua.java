package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class mua implements wsa {
    public final c18 a;
    public final fua b;
    public final pua c;
    public bz7 d;
    public bz7 e;
    public bz7 f;
    public bz7 g;
    public rz7 h;
    public rz7 i;

    public mua(c18 c18Var, fua fuaVar, pua puaVar, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4) {
        puaVar.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        this.a = c18Var;
        this.b = fuaVar;
        this.c = puaVar;
        this.d = bz7Var;
        this.e = bz7Var2;
        this.f = bz7Var3;
        this.g = bz7Var4;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.wsa
    public final void a() {
        this.c.a(null);
        try {
            tqj tqjVar = (tqj) this.b.a;
            tqjVar.L(tqjVar.H(), 1);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }

    @Override // defpackage.wsa
    public final void b() {
        this.c.a(this.b);
    }

    @Override // defpackage.wsa
    public final void c() {
        this.c.a(null);
        try {
            tqj tqjVar = (tqj) this.b.a;
            tqjVar.L(tqjVar.H(), 1);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }
}
