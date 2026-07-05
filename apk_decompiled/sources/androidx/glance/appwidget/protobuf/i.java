package androidx.glance.appwidget.protobuf;

import defpackage.c7f;
import defpackage.e22;
import defpackage.e28;
import defpackage.ij0;
import defpackage.ive;
import defpackage.kc7;
import defpackage.qc7;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements c7f {
    public final a a;
    public final k b;
    public final qc7 c;

    public i(k kVar, qc7 qc7Var, a aVar) {
        this.b = kVar;
        qc7Var.getClass();
        this.c = qc7Var;
        this.a = aVar;
    }

    @Override // defpackage.c7f
    public final void a(Object obj, Object obj2) {
        j.k(this.b, obj, obj2);
    }

    @Override // defpackage.c7f
    public final void b(Object obj) {
        ((m) this.b).getClass();
        l lVar = ((f) obj).unknownFields;
        if (lVar.e) {
            lVar.e = false;
        }
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.c7f
    public final boolean c(Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.c7f
    public final f d() {
        a aVar = this.a;
        return aVar instanceof f ? ((f) aVar).h() : ((e28) ((f) aVar).b(5)).b();
    }

    @Override // defpackage.c7f
    public final int e(f fVar) {
        ((m) this.b).getClass();
        l lVar = fVar.unknownFields;
        int i = lVar.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < lVar.a; i2++) {
            int i3 = lVar.b[i2] >>> 3;
            iF += e.f(3, (e22) lVar.c[i2]) + e.i(i3) + e.h(2) + (e.h(1) * 2);
        }
        lVar.d = iF;
        return iF;
    }

    @Override // defpackage.c7f
    public final void f(Object obj, d dVar, kc7 kc7Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.c7f
    public final int g(f fVar) {
        ((m) this.b).getClass();
        return fVar.unknownFields.hashCode();
    }

    @Override // defpackage.c7f
    public final void h(Object obj, ive iveVar) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.c7f
    public final boolean i(f fVar, f fVar2) {
        m mVar = (m) this.b;
        mVar.getClass();
        l lVar = fVar.unknownFields;
        mVar.getClass();
        return lVar.equals(fVar2.unknownFields);
    }
}
