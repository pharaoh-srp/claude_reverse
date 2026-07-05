package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class geb implements f87 {
    public final f87 a;
    public final v3i b;

    public geb(f87 f87Var, v3i v3iVar) {
        this.a = f87Var;
        this.b = v3iVar;
    }

    @Override // defpackage.f87
    public final v3i a() {
        return this.b;
    }

    @Override // defpackage.f87
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.f87
    public final jw7 c(int i) {
        return this.b.d[this.a.e(i)];
    }

    @Override // defpackage.f87
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.f87
    public final int e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (m(obj) && (obj instanceof geb)) {
            return this.b.equals(((geb) obj).b);
        }
        return false;
    }

    @Override // defpackage.f87
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.f87
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.f87
    public final jw7 h() {
        return this.b.d[this.a.g()];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.f87
    public final void i(float f) {
        this.a.i(f);
    }

    @Override // defpackage.f87
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.f87
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.f87
    public final int l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.f87
    public final int length() {
        return this.a.length();
    }

    public final boolean m(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof geb) {
            return this.a.equals(((geb) obj).a);
        }
        return false;
    }
}
