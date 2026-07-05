package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface dxg {
    default xwg a(byte[] bArr, int i, int i2) {
        hz8 hz8VarO = nz8.o();
        b(bArr, 0, i2, cxg.c, new jke(3, hz8VarO));
        return new id5(hz8VarO.g());
    }

    void b(byte[] bArr, int i, int i2, cxg cxgVar, gm4 gm4Var);

    default void reset() {
    }
}
