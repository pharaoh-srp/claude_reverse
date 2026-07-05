package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class juk extends zqk {
    public final byte[] k;

    public juk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.k = bArr;
    }

    @Override // defpackage.zqk
    public final byte[] F() {
        return this.k;
    }
}
