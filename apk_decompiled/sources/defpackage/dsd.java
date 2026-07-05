package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum dsd implements l89 {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);

    public final int E;

    dsd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
