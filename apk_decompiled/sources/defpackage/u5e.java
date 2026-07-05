package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u5e {
    public final Context a;
    public final u0h b = new u0h(new zcd(10));

    public u5e(Context context) {
        this.a = context;
    }

    public final void a() {
        try {
            i().deleteEntry("trusted_device_reattest");
        } catch (Throwable unused) {
        }
        try {
            i().deleteEntry("trusted_device_binding");
        } catch (Throwable unused2) {
        }
    }

    public final void b() {
        try {
            i().deleteEntry("trusted_device_reattest");
        } catch (Throwable unused) {
        }
    }

    public final String c(String str, boolean z) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (!i().containsAlias(str)) {
            e(str, z, null);
        }
        Certificate certificate = i().getCertificate(str);
        if (certificate == null) {
            try {
                i().deleteEntry(str);
            } catch (Throwable unused) {
            }
            throw new KeyStoreException(ij0.j("No certificate for ", str, "; deleted the corrupted entry"));
        }
        String strEncodeToString = Base64.encodeToString(certificate.getPublicKey().getEncoded(), 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s5e d(boolean r11) {
        /*
            r10 = this;
            java.lang.String r0 = "trusted_device_reattest"
            java.lang.String r1 = "trusted_device_binding"
            boolean r2 = r10.g()
            r3 = 0
            if (r2 != 0) goto Lf
            if (r11 != 0) goto Lf
            goto Lb1
        Lf:
            r11 = 0
            java.security.KeyStore r4 = r10.i()     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.containsAlias(r1)     // Catch: java.lang.Exception -> L44
            r5 = 1
            r4 = r4 ^ r5
            java.security.KeyStore r6 = r10.i()     // Catch: java.lang.Exception -> L40
            boolean r6 = r6.containsAlias(r0)     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L28
            if (r6 != 0) goto L28
            r7 = r5
            goto L29
        L28:
            r7 = r11
        L29:
            s5e r8 = new s5e     // Catch: java.lang.Exception -> L3e
            java.lang.String r11 = r10.c(r1, r11)     // Catch: java.lang.Exception -> L3e
            if (r6 != 0) goto L36
            if (r2 == 0) goto L34
            goto L36
        L34:
            r2 = r3
            goto L3a
        L36:
            java.lang.String r2 = r10.c(r0, r5)     // Catch: java.lang.Exception -> L3e
        L3a:
            r8.<init>(r11, r2)     // Catch: java.lang.Exception -> L3e
            return r8
        L3e:
            r11 = move-exception
            goto L48
        L40:
            r2 = move-exception
            r7 = r11
        L42:
            r11 = r2
            goto L48
        L44:
            r2 = move-exception
            r4 = r11
            r7 = r4
            goto L42
        L48:
            yfa r2 = defpackage.zfa.a
            r2.getClass()
            boolean r2 = defpackage.yfa.b()
            if (r2 != 0) goto L54
            goto L9f
        L54:
            java.lang.String r2 = defpackage.iuj.E(r10)
            java.util.concurrent.CopyOnWriteArrayList r5 = defpackage.yfa.b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L63:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L79
            java.lang.Object r8 = r5.next()
            r9 = r8
            zfa r9 = (defpackage.zfa) r9
            n30 r9 = (defpackage.n30) r9
            r9.getClass()
            r6.add(r8)
            goto L63
        L79:
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L9f
            yfa r5 = defpackage.zfa.a
            java.lang.String r8 = "ReattestKeyProvider.ensureKeys failed: "
            java.lang.String r11 = defpackage.sq6.q(r5, r11, r8)
            java.util.Iterator r5 = r6.iterator()
        L8b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r5.next()
            zfa r6 = (defpackage.zfa) r6
            n30 r6 = (defpackage.n30) r6
            sfa r8 = defpackage.sfa.ERROR
            r6.b(r8, r2, r11)
            goto L8b
        L9f:
            if (r7 == 0) goto La8
            java.security.KeyStore r11 = r10.i()     // Catch: java.lang.Throwable -> La8
            r11.deleteEntry(r0)     // Catch: java.lang.Throwable -> La8
        La8:
            if (r4 == 0) goto Lb1
            java.security.KeyStore r10 = r10.i()     // Catch: java.lang.Throwable -> Lb1
            r10.deleteEntry(r1)     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5e.d(boolean):s5e");
    }

    public final void e(String str, boolean z, byte[] bArr) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (Build.VERSION.SDK_INT < 28 || !this.a.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
            f(str, z, bArr, false);
            return;
        }
        try {
            f(str, z, bArr, true);
        } catch (Exception e) {
            yfa yfaVar = zfa.a;
            yfaVar.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                yfaVar.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strK = ij0.k("StrongBox keygen failed for ", str, "; falling back to TEE: ", gsk.c(e));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, strE, strK);
                    }
                }
            }
            f(str, z, bArr, false);
            List list = xah.a;
            xah.f(e, ij0.j("StrongBox keygen failed for ", str, "; fell back to TEE"), ozf.F, null, 24);
        }
    }

    public final void f(String str, boolean z, byte[] bArr, boolean z2) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256");
        if (z2 && Build.VERSION.SDK_INT >= 28) {
            digests.setIsStrongBoxBacked(true);
        }
        if (bArr != null) {
            digests.setAttestationChallenge(bArr);
        }
        if (z) {
            digests.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                digests.setUserAuthenticationParameters(0, 2);
            } else {
                digests.setUserAuthenticationValidityDurationSeconds(-1);
            }
            digests.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = digests.build();
        keyGenParameterSpecBuild.getClass();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        keyPairGenerator.generateKeyPair();
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String str2 = "Generated key " + str + " (strongBox=" + z2 + ")";
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, str2);
            }
        }
    }

    public final boolean g() {
        return xv8.l(this.a).i(15) == 0;
    }

    public final boolean h() {
        return i().containsAlias("trusted_device_binding");
    }

    public final KeyStore i() {
        return (KeyStore) this.b.getValue();
    }

    public final Signature j() throws NoSuchAlgorithmException, InvalidKeyException, KeyStoreException {
        sfa sfaVar = sfa.WARN;
        try {
            Key key = i().getKey("trusted_device_reattest", null);
            PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
            if (privateKey != null) {
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(privateKey);
                return signature;
            }
        } catch (KeyPermanentlyInvalidatedException e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strConcat = "Reattest key invalidated by biometric enrollment change: ".concat(gsk.c(e));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfaVar, strE, strConcat);
                    }
                }
            }
        } catch (UnrecoverableKeyException e2) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    zfa.a.getClass();
                    String strConcat2 = "Reattest key unrecoverable (treating as biometric-invalidated): ".concat(gsk.c(e2));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strConcat2);
                    }
                }
            }
        }
        return null;
    }

    public final byte[] k(byte[] bArr) {
        try {
            Key key = i().getKey("trusted_device_binding", null);
            PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
            if (privateKey != null) {
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            }
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    String strQ = sq6.q(zfa.a, e, "Device-binding sign failed: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                    }
                }
            }
        }
        return null;
    }
}
