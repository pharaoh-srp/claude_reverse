package com.google.crypto.tink.shaded.protobuf;

import defpackage.e7f;
import defpackage.ij0;
import defpackage.ive;
import defpackage.k22;
import defpackage.mc7;
import defpackage.oo0;
import defpackage.sc7;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements e7f {
    public final a a;
    public final k b;
    public final sc7 c;

    public i(k kVar, sc7 sc7Var, a aVar) {
        this.b = kVar;
        sc7Var.getClass();
        this.c = sc7Var;
        this.a = aVar;
    }

    @Override // defpackage.e7f
    public final void a(Object obj, Object obj2) {
        j.w(this.b, obj, obj2);
    }

    @Override // defpackage.e7f
    public final void b(Object obj) {
        ((m) this.b).getClass();
        ((f) obj).unknownFields.e = false;
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.e7f
    public final boolean c(Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.e7f
    public final Object d() {
        a aVar = this.a;
        return aVar instanceof f ? ((f) aVar).q() : aVar.d().c();
    }

    @Override // defpackage.e7f
    public final void e(Object obj, d dVar, mc7 mc7Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.e7f
    public final boolean f(f fVar, f fVar2) {
        m mVar = (m) this.b;
        mVar.getClass();
        l lVar = fVar.unknownFields;
        mVar.getClass();
        return lVar.equals(fVar2.unknownFields);
    }

    @Override // defpackage.e7f
    public final int g(f fVar) {
        ((m) this.b).getClass();
        return fVar.unknownFields.hashCode();
    }

    @Override // defpackage.e7f
    public final void h(Object obj, ive iveVar) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.e7f
    public final int i(f fVar) {
        ((m) this.b).getClass();
        l lVar = fVar.unknownFields;
        int i = lVar.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < lVar.a; i2++) {
            int i3 = lVar.b[i2] >>> 3;
            iA += e.a(3, (k22) lVar.c[i2]) + e.i(i3) + e.h(2) + (e.h(1) * 2);
        }
        lVar.d = iA;
        return iA;
    }

    @Override // defpackage.e7f
    public final void j(Object obj, byte[] bArr, int i, int i2, oo0 oo0Var) {
        f fVar = (f) obj;
        if (fVar.unknownFields == l.f) {
            fVar.unknownFields = l.c();
        }
        throw ij0.e(obj);
    }
}
