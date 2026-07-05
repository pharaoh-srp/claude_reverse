package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tmk implements jrj {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GMV(3);

    public final int E;

    tmk(int i) {
        this.E = i;
    }

    @Override // defpackage.jrj
    public final int zza() {
        return this.E;
    }
}
