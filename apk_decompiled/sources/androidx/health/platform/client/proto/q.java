package androidx.health.platform.client.proto;

import defpackage.d7f;
import defpackage.f22;
import defpackage.f28;
import defpackage.ij0;
import defpackage.po0;
import defpackage.poj;
import defpackage.rc7;
import defpackage.uei;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements d7f {
    public final a a;
    public final a0 b;
    public final rc7 c;

    public q(a0 a0Var, rc7 rc7Var, a aVar) {
        this.b = a0Var;
        rc7Var.getClass();
        this.c = rc7Var;
        this.a = aVar;
    }

    @Override // defpackage.d7f
    public final void a(Object obj, Object obj2) {
        y.j(this.b, obj, obj2);
    }

    @Override // defpackage.d7f
    public final void b(Object obj) {
        ((uei) this.b).getClass();
        b0 b0Var = ((n) obj).unknownFields;
        if (b0Var.e) {
            b0Var.e = false;
        }
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.d7f
    public final boolean c(Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.d7f
    public final n d() {
        a aVar = this.a;
        if (aVar instanceof n) {
            return ((n) aVar).l();
        }
        f28 f28Var = (f28) ((n) aVar).e(5);
        boolean zI = f28Var.F.i();
        n nVar = f28Var.F;
        if (!zI) {
            return nVar;
        }
        nVar.j();
        return f28Var.F;
    }

    @Override // defpackage.d7f
    public final int e(n nVar) {
        ((uei) this.b).getClass();
        b0 b0Var = nVar.unknownFields;
        int i = b0Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < b0Var.a; i2++) {
            int i3 = b0Var.b[i2] >>> 3;
            iA += b.a(3, (f22) b0Var.c[i2]) + b.f(i3) + b.e(2) + (b.e(1) * 2);
        }
        b0Var.d = iA;
        return iA;
    }

    @Override // defpackage.d7f
    public final int f(n nVar) {
        ((uei) this.b).getClass();
        return nVar.unknownFields.hashCode();
    }

    @Override // defpackage.d7f
    public final void g(Object obj, poj pojVar) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.d7f
    public final boolean h(n nVar, n nVar2) {
        uei ueiVar = (uei) this.b;
        ueiVar.getClass();
        b0 b0Var = nVar.unknownFields;
        ueiVar.getClass();
        return b0Var.equals(nVar2.unknownFields);
    }

    @Override // defpackage.d7f
    public final void i(Object obj, byte[] bArr, int i, int i2, po0 po0Var) {
        n nVar = (n) obj;
        if (nVar.unknownFields == b0.f) {
            nVar.unknownFields = b0.c();
        }
        throw ij0.e(obj);
    }
}
