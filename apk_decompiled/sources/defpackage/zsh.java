package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zsh extends evh {
    public zsh() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // defpackage.evh
    public final void d(msh mshVar, vi2 vi2Var) {
        if (!vi2Var.r0('-')) {
            mshVar.o(evh.J);
        } else {
            mshVar.f('-');
            mshVar.a(evh.b0);
        }
    }
}
