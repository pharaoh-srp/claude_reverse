package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class ig extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ ig(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) bo6.b.a.u("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    pmf.m(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) bo6.b.a.u("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    pmf.m(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) bo6.b.a.u("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    pmf.m(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) bo6.b.a.u("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    pmf.m(e4);
                    return null;
                }
            case 4:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(blj.a);
                return simpleDateFormat;
            case 5:
                return new Random();
            case 6:
                try {
                    return (Cipher) bo6.b.a.u("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    pmf.m(e5);
                    return null;
                }
            case 7:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 8:
                return new PathMeasure();
            case 9:
                return new Path();
            case 10:
                return new Path();
            case 11:
                return new float[4];
            default:
                return Boolean.FALSE;
        }
    }
}
