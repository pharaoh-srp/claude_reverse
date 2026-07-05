package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class vij extends nf {
    public static vij v(wg wgVar, xzd xzdVar, Integer num) throws GeneralSecurityException {
        n22 n22Var = (n22) xzdVar.F;
        wg wgVar2 = wg.Z;
        if (wgVar != wgVar2 && num == null) {
            poc.k(wgVar, " the value of idRequirement must be non-null", "For given Variant ");
            return null;
        }
        if (wgVar == wgVar2 && num != null) {
            rl7.j("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (n22Var.a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + n22Var.a.length);
        }
        if (wgVar == wgVar2) {
            n22.a(new byte[0]);
        } else if (wgVar == wg.Y) {
            n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (wgVar != wg.X) {
                xh6.m("Unknown Variant: ", wgVar);
                return null;
            }
            n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new vij();
    }
}
