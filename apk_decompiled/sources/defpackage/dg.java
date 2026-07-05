package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dg {
    public static final dsc a;
    public static final csc b;
    public static final cp9 c;
    public static final ap9 d;

    static {
        n22 n22VarB = rpi.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new dsc(ag.class);
        b = new csc(n22VarB);
        c = new cp9(tf.class);
        d = new ap9(n22VarB, new wg6(9));
    }

    public static zf a(bmc bmcVar) throws GeneralSecurityException {
        int iOrdinal = bmcVar.ordinal();
        if (iOrdinal == 1) {
            return zf.G;
        }
        if (iOrdinal == 2) {
            return zf.I;
        }
        if (iOrdinal == 3) {
            return zf.J;
        }
        if (iOrdinal == 4) {
            return zf.H;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar.b());
    }
}
