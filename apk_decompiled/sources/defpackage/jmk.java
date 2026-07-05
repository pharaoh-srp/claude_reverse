package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum jmk implements erj {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_THICK(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GMV(3);

    public final int E;

    jmk(int i) {
        this.E = i;
    }

    @Override // defpackage.erj
    public final int zza() {
        return this.E;
    }
}
