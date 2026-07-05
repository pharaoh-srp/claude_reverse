package defpackage;

import android.os.Build;
import com.pvporbit.freetype.FreeTypeConstants;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class z49 {
    public static final ig c = new ig(6);
    public final SecretKeySpec a;
    public final boolean b;

    public z49(byte[] bArr) throws GeneralSecurityException {
        if (!gid.b(2)) {
            rl7.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        rqi.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = rpi.a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(FreeTypeConstants.FT_LOAD_PEDANTIC, bArr, 0, length);
    }
}
