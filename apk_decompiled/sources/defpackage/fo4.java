package defpackage;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes2.dex */
public final class fo4 extends c1 {
    public final AsyncImagePainter Z;

    public fo4(AsyncImagePainter asyncImagePainter, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var, boolean z, String str, ul4 ul4Var) {
        super(ttVar, jo4Var, f, hr1Var, z, str, ul4Var);
        this.Z = asyncImagePainter;
    }

    @Override // defpackage.hqb
    public final void h1() {
        l45 l45VarD1 = d1();
        AsyncImagePainter asyncImagePainter = this.Z;
        asyncImagePainter.P = l45VarD1;
        asyncImagePainter.g();
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.Z.b();
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.Z.o(null);
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: q1 */
    public final bpc getPainter() {
        return this.Z;
    }
}
