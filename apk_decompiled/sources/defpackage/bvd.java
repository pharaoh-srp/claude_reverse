package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum bvd {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final efk F = new efk(25);
    public final String E;

    bvd(String str) {
        this.E = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.E;
    }
}
