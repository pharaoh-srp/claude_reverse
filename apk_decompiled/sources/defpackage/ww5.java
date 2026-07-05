package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ww5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ zw5 F;
    public final /* synthetic */ Runnable G;
    public final /* synthetic */ ax5 H;

    public /* synthetic */ ww5(zw5 zw5Var, Runnable runnable, ax5 ax5Var, int i) {
        this.E = i;
        this.F = zw5Var;
        this.G = runnable;
        this.H = ax5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        final ax5 ax5Var = this.H;
        final Runnable runnable = this.G;
        zw5 zw5Var = this.F;
        switch (i) {
            case 0:
                final int i2 = 0;
                zw5Var.E.execute(new Runnable() { // from class: uw5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        ax5 ax5Var2 = ax5Var;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ax5Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ax5Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    ax5Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    ax5Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                zw5Var.E.execute(new Runnable() { // from class: uw5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i32 = i3;
                        ax5 ax5Var2 = ax5Var;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ax5Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ax5Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    ax5Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    ax5Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                zw5Var.E.execute(new Runnable() { // from class: uw5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i32 = i4;
                        ax5 ax5Var2 = ax5Var;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ax5Var2.L(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ax5Var2.L(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    ax5Var2.K(null);
                                    return;
                                } catch (Exception e3) {
                                    ax5Var2.L(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
