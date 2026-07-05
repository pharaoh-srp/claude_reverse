package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bpe {
    /* JADX INFO: Fake field, exist only in values array */
    EF10(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF22(2);

    public final Integer E;

    bpe(Integer num) {
        this.E = num;
    }

    public final vh9 a() {
        return new vh9(this.E);
    }
}
