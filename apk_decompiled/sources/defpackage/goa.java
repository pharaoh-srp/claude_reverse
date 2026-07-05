package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class goa implements doa {
    public final lrb a;
    public final cm4 b;
    public final cm4 c;

    public goa(lrb lrbVar) {
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

    @Override // defpackage.doa
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        cm4 cm4Var = this.c;
        if (length <= 5) {
            cm4Var.getClass();
            rl7.j("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        lrb lrbVar = this.a;
        for (sfd sfdVar : lrbVar.K(bArrCopyOf)) {
            try {
                ((doa) sfdVar.b).a(bArrCopyOfRange, sfdVar.e.equals(bmc.LEGACY) ? ntj.b(bArr2, hoa.b) : bArr2);
                cm4Var.getClass();
                return;
            } catch (GeneralSecurityException e) {
                hoa.a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = lrbVar.K(dwk.a).iterator();
        while (it.hasNext()) {
            try {
                ((doa) ((sfd) it.next()).b).a(bArr, bArr2);
                cm4Var.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        cm4Var.getClass();
        rl7.j("invalid MAC");
    }

    @Override // defpackage.doa
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        cm4 cm4Var = this.b;
        sfd sfdVar = (sfd) this.a.G;
        if (sfdVar.e.equals(bmc.LEGACY)) {
            bArr = ntj.b(bArr, hoa.b);
        }
        try {
            byte[] bArr2 = sfdVar.c;
            byte[] bArrB = ntj.b(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((doa) sfdVar.b).b(bArr));
            int i = sfdVar.f;
            cm4Var.getClass();
            return bArrB;
        } catch (GeneralSecurityException e) {
            cm4Var.getClass();
            throw e;
        }
    }
}
