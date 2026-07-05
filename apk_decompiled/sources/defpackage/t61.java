package defpackage;

import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t61 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ w61 a;

    public t61(w61 w61Var) {
        this.a = w61Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((oq1) this.a).a;
        if (weakReference.get() == null || ((qq1) weakReference.get()).m || !((qq1) weakReference.get()).l) {
            return;
        }
        ((qq1) weakReference.get()).f(new xp1(i, charSequence));
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((oq1) this.a).a;
        if (weakReference.get() == null || !((qq1) weakReference.get()).l) {
            return;
        }
        qq1 qq1Var = (qq1) weakReference.get();
        if (qq1Var.s == null) {
            qq1Var.s = new bvb();
        }
        qq1.j(qq1Var.s, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult r6) {
        /*
            r5 = this;
            r0 = 30
            r1 = 0
            if (r6 == 0) goto L3f
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = r6.getCryptoObject()
            if (r2 != 0) goto Lc
            goto L3f
        Lc:
            javax.crypto.Cipher r3 = defpackage.tc5.d(r2)
            if (r3 == 0) goto L18
            c61 r1 = new c61
            r1.<init>(r3)
            goto L3f
        L18:
            java.security.Signature r3 = defpackage.tc5.f(r2)
            if (r3 == 0) goto L24
            c61 r1 = new c61
            r1.<init>(r3)
            goto L3f
        L24:
            javax.crypto.Mac r3 = defpackage.tc5.e(r2)
            if (r3 == 0) goto L30
            c61 r1 = new c61
            r1.<init>(r3)
            goto L3f
        L30:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L3f
            android.security.identity.IdentityCredential r2 = defpackage.uc5.b(r2)
            if (r2 == 0) goto L3f
            c61 r1 = new c61
            r1.<init>(r2)
        L3f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 2
            r4 = -1
            if (r2 < r0) goto L4c
            if (r6 == 0) goto L50
            int r6 = defpackage.v61.a(r6)
            goto L53
        L4c:
            r6 = 29
            if (r2 != r6) goto L52
        L50:
            r6 = r4
            goto L53
        L52:
            r6 = r3
        L53:
            lq1 r0 = new lq1
            r0.<init>(r1, r6)
            w61 r5 = r5.a
            oq1 r5 = (defpackage.oq1) r5
            java.lang.ref.WeakReference r5 = r5.a
            java.lang.Object r2 = r5.get()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r5.get()
            qq1 r2 = (defpackage.qq1) r2
            boolean r2 = r2.l
            if (r2 == 0) goto La1
            if (r6 != r4) goto L8b
            lq1 r0 = new lq1
            java.lang.Object r6 = r5.get()
            qq1 r6 = (defpackage.qq1) r6
            int r6 = r6.e()
            r2 = r6 & 32767(0x7fff, float:4.5916E-41)
            if (r2 == 0) goto L87
            boolean r6 = defpackage.mvk.f(r6)
            if (r6 != 0) goto L87
            goto L88
        L87:
            r3 = r4
        L88:
            r0.<init>(r1, r3)
        L8b:
            java.lang.Object r5 = r5.get()
            qq1 r5 = (defpackage.qq1) r5
            bvb r6 = r5.p
            if (r6 != 0) goto L9c
            bvb r6 = new bvb
            r6.<init>()
            r5.p = r6
        L9c:
            bvb r5 = r5.p
            defpackage.qq1.j(r5, r0)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t61.onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt$AuthenticationResult):void");
    }
}
