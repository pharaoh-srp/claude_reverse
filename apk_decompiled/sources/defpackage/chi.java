package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum chi {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(gh3.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(gh3.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(gh3.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(gh3.e("kotlin/ULong", false));

    public final gh3 E;
    public final sxb F;
    public final gh3 G;

    chi(gh3 gh3Var) {
        this.E = gh3Var;
        sxb sxbVarI = gh3Var.i();
        sxbVarI.getClass();
        this.F = sxbVarI;
        this.G = new gh3(gh3Var.g(), sxb.e(sxbVarI.b() + "Array"));
    }
}
