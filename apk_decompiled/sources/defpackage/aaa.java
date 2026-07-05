package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aaa implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ eaa F;

    public /* synthetic */ aaa(eaa eaaVar, int i) {
        this.E = i;
        this.F = eaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        eaa eaaVar = this.F;
        switch (i) {
            case 0:
                dh6 dh6Var = eaaVar.G;
                if (dh6Var != null) {
                    dh6Var.setListSelectionHidden(true);
                    dh6Var.requestLayout();
                }
                break;
            default:
                dh6 dh6Var2 = eaaVar.G;
                if (dh6Var2 != null && dh6Var2.isAttachedToWindow() && eaaVar.G.getCount() > eaaVar.G.getChildCount() && eaaVar.G.getChildCount() <= eaaVar.Q) {
                    eaaVar.d0.setInputMethodMode(2);
                    eaaVar.g();
                    break;
                }
                break;
        }
    }
}
