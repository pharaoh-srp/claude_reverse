package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwb {
    public final w79 a;
    public final mdg b = new mdg();
    public final isc c = new isc(16);

    public qwb(w79 w79Var) {
        this.a = w79Var;
    }

    public final void a(boolean z) {
        isc iscVar = this.c;
        iscVar.i((z ? 4 : 0) | (iscVar.h() & (-5)));
    }

    public final void b(boolean z) {
        isc iscVar = this.c;
        iscVar.i((z ? 2 : 0) | (iscVar.h() & (-3)));
    }

    public final void c(boolean z) {
        isc iscVar = this.c;
        iscVar.i((z ? 1 : 0) | (iscVar.h() & (-2)));
    }
}
