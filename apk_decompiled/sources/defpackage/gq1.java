package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gq1 implements Runnable {
    public final /* synthetic */ int E;
    public final WeakReference F;

    public gq1(qq1 qq1Var, int i) {
        this.E = i;
        switch (i) {
            case 2:
                this.F = new WeakReference(qq1Var);
                break;
            default:
                this.F = new WeakReference(qq1Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        WeakReference weakReference = this.F;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((hq1) weakReference.get()).R();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((qq1) weakReference.get()).n = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((qq1) weakReference.get()).o = false;
                }
                break;
        }
    }

    public gq1(hq1 hq1Var) {
        this.E = 0;
        this.F = new WeakReference(hq1Var);
    }
}
