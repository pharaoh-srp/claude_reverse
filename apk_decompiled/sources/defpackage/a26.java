package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class a26 implements y16 {
    public final lrb a;
    public final cm4 b;
    public final cm4 c;

    public a26(lrb lrbVar) {
        cm4 cm4Var = ntj.b;
        this.a = lrbVar;
        if (((yqb) lrbVar.H).a.isEmpty()) {
            this.b = cm4Var;
            this.c = cm4Var;
            return;
        }
        ivb ivbVar = (ivb) jvb.b.a.get();
        ivbVar = ivbVar == null ? jvb.c : ivbVar;
        ntj.d(lrbVar);
        ivbVar.getClass();
        this.b = cm4Var;
        this.c = cm4Var;
    }

    @Override // defpackage.y16
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        cm4 cm4Var = this.b;
        sfd sfdVar = (sfd) this.a.G;
        try {
            byte[] bArr3 = sfdVar.c;
            byte[] bArrB = ntj.b(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((y16) sfdVar.b).a(bArr, bArr2));
            int i = sfdVar.f;
            cm4Var.getClass();
            return bArrB;
        } catch (GeneralSecurityException e) {
            cm4Var.getClass();
            throw e;
        }
    }

    @Override // defpackage.y16
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        lrb lrbVar = this.a;
        cm4 cm4Var = this.c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = lrbVar.K(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((y16) ((sfd) it.next()).b).b(bArrCopyOfRange, bArr2);
                    cm4Var.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e) {
                    b26.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = lrbVar.K(dwk.a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((y16) ((sfd) it2.next()).b).b(bArr, bArr2);
                cm4Var.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        cm4Var.getClass();
        rl7.j("decryption failed");
        return null;
    }
}
