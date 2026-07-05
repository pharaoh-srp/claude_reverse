package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class efd implements doa {
    public final cfd a;
    public final int b;

    public efd(cfd cfdVar, int i) throws InvalidAlgorithmParameterException {
        this.a = cfdVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        cfdVar.k(new byte[0], i);
    }

    @Override // defpackage.doa
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        rl7.j("invalid MAC");
    }

    @Override // defpackage.doa
    public final byte[] b(byte[] bArr) {
        return this.a.k(bArr, this.b);
    }
}
