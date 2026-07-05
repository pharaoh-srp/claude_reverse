package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p7k implements zdc, pec {
    public final /* synthetic */ j5h E;

    public /* synthetic */ p7k(j5h j5hVar) {
        this.E = j5hVar;
    }

    @Override // defpackage.pec
    public void a() {
        this.E.a.o();
    }

    @Override // defpackage.zdc
    public /* synthetic */ void onComplete(d5h d5hVar) {
        if (d5hVar.g()) {
            return;
        }
        Exception excD = d5hVar.d();
        Objects.requireNonNull(excD);
        this.E.c(excD);
    }

    public p7k(b99 b99Var, j5h j5hVar) {
        this.E = j5hVar;
    }
}
