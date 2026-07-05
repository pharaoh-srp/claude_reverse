package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum bl9 implements l89 {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);

    public final int E;

    bl9(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
