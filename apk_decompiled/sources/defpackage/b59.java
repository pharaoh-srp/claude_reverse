package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class b59 extends k5 {
    public final /* synthetic */ int c;

    public b59(byte[] bArr, int i) throws GeneralSecurityException {
        this.c = i;
        if (!gid.a(1)) {
            rl7.j("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.a = p(bArr, 1);
        this.b = p(bArr, 0);
    }

    @Override // defpackage.k5
    public final r34 p(byte[] bArr, int i) {
        switch (this.c) {
            case 0:
                return new a59(bArr, i, 0);
            default:
                return new a59(bArr, i, 1);
        }
    }
}
