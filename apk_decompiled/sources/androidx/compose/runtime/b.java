package androidx.compose.runtime;

import defpackage.fd9;
import defpackage.l45;
import defpackage.mee;

/* JADX INFO: loaded from: classes.dex */
public final class b implements mee {
    public final l45 E;

    public b(l45 l45Var) {
        this.E = l45Var;
    }

    @Override // defpackage.mee
    public final void a() {
        l45 l45Var = this.E;
        if (l45Var instanceof e) {
            ((e) l45Var).c();
        } else {
            fd9.z(l45Var, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.mee
    public final void b() {
        l45 l45Var = this.E;
        if (l45Var instanceof e) {
            ((e) l45Var).c();
        } else {
            fd9.z(l45Var, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.mee
    public final void g() {
    }
}
