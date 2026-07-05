package defpackage;

import com.google.protobuf.c;
import com.google.protobuf.e;
import com.google.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class mib implements f7f {
    public final v28 a;
    public final e b;
    public final tc7 c;

    public mib(e eVar, tc7 tc7Var, v28 v28Var) {
        this.b = eVar;
        tc7Var.getClass();
        this.c = tc7Var;
        this.a = v28Var;
    }

    public static mib h(e eVar, tc7 tc7Var, v28 v28Var) {
        return new mib(eVar, tc7Var, v28Var);
    }

    @Override // defpackage.f7f
    public final void a(Object obj, Object obj2) {
        j7f.b(this.b, obj, obj2);
    }

    @Override // defpackage.f7f
    public final void b(Object obj) {
        ((tei) this.b).getClass();
        ((v28) obj).c.d = false;
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.f7f
    public final boolean c(Object obj) {
        this.c.getClass();
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.f7f
    public final v28 d() {
        v28 v28Var = this.a;
        return v28Var instanceof v28 ? v28Var.f() : ((h28) v28Var.a(5)).a();
    }

    @Override // defpackage.f7f
    public final boolean e(v28 v28Var, v28 v28Var2) {
        tei teiVar = (tei) this.b;
        teiVar.getClass();
        f fVar = v28Var.c;
        teiVar.getClass();
        return fVar.equals(v28Var2.c);
    }

    @Override // defpackage.f7f
    public final int f(v28 v28Var) {
        ((tei) this.b).getClass();
        return v28Var.c.hashCode();
    }

    @Override // defpackage.f7f
    public final void g(Object obj, c cVar, nc7 nc7Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
