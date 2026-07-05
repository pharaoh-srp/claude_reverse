package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface tze extends AutoCloseable {
    boolean H0();

    void N(int i, String str);

    default boolean Q() {
        return getLong(0) != 0;
    }

    String g0(int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void o(int i, long j);

    void p(byte[] bArr, int i);

    void q(int i);

    void r();

    void reset();
}
