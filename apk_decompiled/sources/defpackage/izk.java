package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class izk extends k0l {
    public final HashMap H;
    public final kjk I;
    public final kjk J;
    public final kjk K;
    public final kjk L;
    public final kjk M;
    public final kjk N;

    public izk(o0l o0lVar) {
        super(o0lVar);
        this.H = new HashMap();
        this.I = new kjk(I0(), "last_delete_stale", 0L);
        this.J = new kjk(I0(), "last_delete_stale_batch", 0L);
        this.K = new kjk(I0(), "backoff", 0L);
        this.L = new kjk(I0(), "last_upload", 0L);
        this.M = new kjk(I0(), "last_upload_attempt", 0L);
        this.N = new kjk(I0(), "midnight_offset", 0L);
    }

    @Override // defpackage.k0l
    public final boolean Q0() {
        return false;
    }

    public final String R0(String str, boolean z) {
        K0();
        String str2 = z ? (String) S0(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestW1 = h1l.W1();
        if (messageDigestW1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestW1.digest(str2.getBytes())));
    }

    public final Pair S0(String str) {
        kzk kzkVar;
        jf jfVarA;
        K0();
        umk umkVar = (umk) this.E;
        ql8 ql8Var = umkVar.R;
        vqj vqjVar = umkVar.K;
        ql8Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.H;
        kzk kzkVar2 = (kzk) map.get(str);
        if (kzkVar2 != null && jElapsedRealtime < kzkVar2.c) {
            return new Pair(kzkVar2.a, Boolean.valueOf(kzkVar2.b));
        }
        vqjVar.getClass();
        long jS0 = vqjVar.S0(str, zvj.b) + jElapsedRealtime;
        try {
            try {
                jfVarA = kf.a(umkVar.E);
            } catch (PackageManager.NameNotFoundException unused) {
                if (kzkVar2 != null && jElapsedRealtime < kzkVar2.c + vqjVar.S0(str, zvj.c)) {
                    return new Pair(kzkVar2.a, Boolean.valueOf(kzkVar2.b));
                }
                jfVarA = null;
            }
        } catch (Exception e) {
            b0().Q.c("Unable to get advertising id", e);
            kzkVar = new kzk("", false, jS0);
        }
        if (jfVarA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = jfVarA.a();
        kzkVar = strA != null ? new kzk(strA, jfVarA.b(), jS0) : new kzk("", jfVarA.b(), jS0);
        map.put(str, kzkVar);
        return new Pair(kzkVar.a, Boolean.valueOf(kzkVar.b));
    }
}
