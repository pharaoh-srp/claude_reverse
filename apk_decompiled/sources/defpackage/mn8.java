package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mn8 {
    public static final dsc a;
    public static final csc b;
    public static final cp9 c;
    public static final ap9 d;

    static {
        n22 n22VarB = rpi.b("type.googleapis.com/google.crypto.tink.HmacKey");
        a = new dsc(jn8.class);
        b = new csc(n22VarB);
        c = new cp9(gn8.class);
        d = new ap9(n22VarB, new rl7(8));
    }

    public static zf a(zf8 zf8Var) throws GeneralSecurityException {
        int iOrdinal = zf8Var.ordinal();
        if (iOrdinal == 1) {
            return zf.R;
        }
        if (iOrdinal == 2) {
            return zf.U;
        }
        if (iOrdinal == 3) {
            return zf.T;
        }
        if (iOrdinal == 4) {
            return zf.V;
        }
        if (iOrdinal == 5) {
            return zf.S;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zf8Var.a());
    }

    public static wg b(bmc bmcVar) throws GeneralSecurityException {
        int iOrdinal = bmcVar.ordinal();
        if (iOrdinal == 1) {
            return wg.T;
        }
        if (iOrdinal == 2) {
            return wg.V;
        }
        if (iOrdinal == 3) {
            return wg.W;
        }
        if (iOrdinal == 4) {
            return wg.U;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar.b());
    }
}
