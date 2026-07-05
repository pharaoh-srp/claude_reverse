package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lfe extends mpk {
    public static final lfe v = new lfe(0);
    public static final lfe w = new lfe(1);
    public static final lfe x = new lfe(2);
    public final /* synthetic */ int u;

    public /* synthetic */ lfe(int i) {
        this.u = i;
    }

    public final String toString() {
        switch (this.u) {
            case 0:
                return "invalid";
            case 1:
                return "obsolete";
            default:
                return "purged";
        }
    }
}
