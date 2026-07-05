package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class az9 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ja8 F;
    public final /* synthetic */ bz9 G;

    public /* synthetic */ az9(ja8 ja8Var, bz9 bz9Var, int i) {
        this.E = i;
        this.F = ja8Var;
        this.G = bz9Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        bz9 bz9Var = this.G;
        ja8 ja8Var = this.F;
        a80 a80Var = (a80) obj;
        switch (i) {
            case 0:
                ja8Var.g(((Number) a80Var.e()).floatValue());
                bz9Var.c.a();
                break;
            default:
                ja8Var.g(((Number) a80Var.e()).floatValue());
                bz9Var.c.a();
                break;
        }
        return ieiVar;
    }
}
