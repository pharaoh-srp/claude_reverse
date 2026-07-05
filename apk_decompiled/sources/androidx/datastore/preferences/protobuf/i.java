package androidx.datastore.preferences.protobuf;

import defpackage.efe;
import defpackage.g7f;
import defpackage.i22;
import defpackage.ij0;
import defpackage.j28;
import defpackage.pc7;
import defpackage.uc7;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements g7f {
    public final a a;
    public final k b;
    public final uc7 c;

    public i(k kVar, uc7 uc7Var, a aVar) {
        this.b = kVar;
        uc7Var.getClass();
        this.c = uc7Var;
        this.a = aVar;
    }

    public static i j(k kVar, uc7 uc7Var, a aVar) {
        return new i(kVar, uc7Var, aVar);
    }

    @Override // defpackage.g7f
    public final void a(Object obj, Object obj2) {
        j.k(this.b, obj, obj2);
    }

    @Override // defpackage.g7f
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

    @Override // defpackage.g7f
    public final boolean c(Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.g7f
    public final f d() {
        a aVar = this.a;
        return aVar instanceof f ? ((f) aVar).i() : ((j28) ((f) aVar).b(5)).b();
    }

    @Override // defpackage.g7f
    public final void e(Object obj, d dVar, pc7 pc7Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.g7f
    public final int f(f fVar) {
        ((m) this.b).getClass();
        l lVar = fVar.unknownFields;
        int i = lVar.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < lVar.a; i2++) {
            int i3 = lVar.b[i2] >>> 3;
            iF += e.f(3, (i22) lVar.c[i2]) + e.i(i3) + e.h(2) + (e.h(1) * 2);
        }
        lVar.d = iF;
        return iF;
    }

    @Override // defpackage.g7f
    public final void g(efe efeVar, Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.g7f
    public final int h(f fVar) {
        ((m) this.b).getClass();
        return fVar.unknownFields.hashCode();
    }

    @Override // defpackage.g7f
    public final boolean i(f fVar, f fVar2) {
        m mVar = (m) this.b;
        mVar.getClass();
        l lVar = fVar.unknownFields;
        mVar.getClass();
        return lVar.equals(fVar2.unknownFields);
    }
}
