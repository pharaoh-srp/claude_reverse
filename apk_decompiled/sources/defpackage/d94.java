package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d94 implements tp4 {
    public static final d94 F = new d94(0);
    public static final d94 G = new d94(1);
    public final /* synthetic */ int E;

    public /* synthetic */ d94(int i) {
        this.E = i;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        switch (this.E) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return im6.E;
        }
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        switch (this.E) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
