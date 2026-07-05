package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class e4i {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final nz8 i;
    public final nz8 j;
    public final nz8 k;
    public final nz8 l;
    public final nz8 m;
    public final int n;
    public final int o;
    public final nz8 p;
    public final c4i q;
    public final nz8 r;
    public final nz8 s;
    public final boolean t;
    public final aee u;
    public final qz8 v;

    static {
        new e4i(new d4i());
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
        tpi.w(4);
        ebh.w(5, 6, 7, 8, 9);
        ebh.w(10, 11, 12, 13, 14);
        ebh.w(15, 16, 17, 18, 19);
        ebh.w(20, 21, 22, 23, 24);
        ebh.w(25, 26, 27, 28, 29);
        ebh.w(30, 31, 32, 33, 34);
        tpi.w(35);
        tpi.w(36);
        tpi.w(37);
        tpi.w(38);
    }

    public e4i(d4i d4iVar) {
        this.a = d4iVar.a;
        this.b = d4iVar.b;
        this.c = d4iVar.c;
        this.d = d4iVar.d;
        this.e = d4iVar.e;
        this.f = d4iVar.f;
        this.g = d4iVar.g;
        this.h = d4iVar.h;
        this.i = d4iVar.i;
        this.j = d4iVar.j;
        this.k = d4iVar.k;
        this.l = d4iVar.l;
        this.n = d4iVar.n;
        this.m = d4iVar.m;
        this.o = d4iVar.o;
        this.p = d4iVar.p;
        this.q = d4iVar.q;
        this.r = d4iVar.r;
        this.t = d4iVar.s;
        this.s = d4iVar.t;
        this.u = aee.a(d4iVar.u);
        this.v = qz8.p(d4iVar.v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e4i e4iVar = (e4i) obj;
        if (this.a != e4iVar.a || this.b != e4iVar.b || this.c != e4iVar.c || this.d != e4iVar.d || this.h != e4iVar.h || this.e != e4iVar.e || this.f != e4iVar.f || this.g != e4iVar.g || !this.i.equals(e4iVar.i) || !this.j.equals(e4iVar.j) || !this.k.equals(e4iVar.k) || !this.l.equals(e4iVar.l) || this.n != e4iVar.n || !this.m.equals(e4iVar.m) || this.o != e4iVar.o || !this.p.equals(e4iVar.p) || !this.q.equals(e4iVar.q) || !this.s.equals(e4iVar.s) || !this.r.equals(e4iVar.r) || this.t != e4iVar.t) {
            return false;
        }
        aee aeeVar = e4iVar.u;
        aee aeeVar2 = this.u;
        aeeVar2.getClass();
        return dlk.k(aeeVar, aeeVar2) && this.v.equals(e4iVar.v);
    }

    public int hashCode() {
        int iHashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.v.hashCode() + ((this.u.hashCode() + ((this.s.hashCode() + ((((this.r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
