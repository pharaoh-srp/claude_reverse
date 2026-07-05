package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class imj implements xb1 {
    public final /* synthetic */ j88 a;

    public imj(j88 j88Var) {
        this.a = j88Var;
    }

    @Override // defpackage.xb1
    public final void a(boolean z) {
        xnj xnjVar = this.a.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
