package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bvk {
    public static final ta4 a = new ta4(594258271, false, new cc4(15));

    public static final void a(nyj nyjVar, iqb iqbVar, long j, long j2, ld4 ld4Var, int i) {
        long j3;
        long j4;
        long j5;
        long j6;
        int i2;
        Object gu1Var;
        long j7;
        long j8;
        nyjVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(658155096);
        int i3 = i | (e18Var.h(nyjVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i4 = i3 | 1152;
        boolean z = true;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j5 = gm3.a(e18Var).M;
                j6 = gm3.a(e18Var).N;
                i2 = i4 & (-8065);
            } else {
                e18Var.T();
                i2 = i4 & (-8065);
                j5 = j;
                j6 = j2;
            }
            e18Var.q();
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new jsc(SystemClock.elapsedRealtime());
                e18Var.k0(objN);
            }
            jsc jscVar = (jsc) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ba9(jscVar, null, 19);
                e18Var.k0(objN2);
            }
            int i5 = i2 & 14;
            fd9.i(e18Var, (pz7) objN2, nyjVar);
            iqb iqbVarW = xn5.W(iqbVar);
            if (i5 != 4 && !e18Var.h(nyjVar)) {
                z = false;
            }
            boolean zE = e18Var.e(j5) | z | e18Var.e(j6);
            Object objN3 = e18Var.N();
            if (zE || objN3 == lz1Var) {
                j7 = j5;
                j8 = j6;
                gu1Var = new gu1(nyjVar, j7, j8, jscVar, 1);
                e18Var.k0(gu1Var);
            } else {
                gu1Var = objN3;
                j7 = j5;
                j8 = j6;
            }
            v40.a(0, e18Var, (bz7) gu1Var, iqbVarW);
            j4 = j8;
            j3 = j7;
        } else {
            e18Var.T();
            j3 = j;
            j4 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oyb(nyjVar, iqbVar, j3, j4, i);
        }
    }

    public static final Uri b(Intent intent) {
        if (!intent.hasExtra("android.intent.extra.STREAM")) {
            intent = null;
        }
        if (intent != null) {
            return (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableExtra("android.intent.extra.STREAM"));
        }
        return null;
    }

    public static final ArrayList c(Intent intent) {
        if (!intent.hasExtra("android.intent.extra.STREAM")) {
            intent = null;
        }
        if (intent != null) {
            return Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        return null;
    }

    public static final h21 d(nf0 nf0Var) {
        if (nf0Var instanceof lf0) {
            int i = ((lf0) nf0Var).a;
            return i != 413 ? i != 415 ? i != 429 ? h21.F : h21.J : h21.K : h21.L;
        }
        if (nf0Var instanceof mf0) {
            return h21.M;
        }
        wg6.i();
        return null;
    }

    public static void e(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                mr9.h(grc.p(i2, "at index "));
                return;
            }
        }
    }

    public static CreateCredentialException f(String str, String str2) {
        Exception excF;
        try {
            CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new r(26), null);
            if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excF = jpi.f(new r(0), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excF = jpi.f(new r(1), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excF = jpi.f(new r(2), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excF = jpi.f(new r(3), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excF = jpi.f(new r(4), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excF = jpi.f(new r(5), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excF = jpi.f(new r(6), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excF = jpi.f(new r(7), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excF = jpi.f(new r(8), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excF = jpi.f(new r(9), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excF = jpi.f(new r(10), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excF = jpi.f(new r(11), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excF = jpi.f(new r(12), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excF = jpi.f(new r(13), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excF = jpi.f(new r(14), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excF = jpi.f(new r(15), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excF = jpi.f(new r(16), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excF = jpi.f(new r(17), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excF = jpi.f(new r(18), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excF = jpi.f(new r(19), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excF = jpi.f(new r(20), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excF = jpi.f(new r(21), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excF = jpi.f(new r(22), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excF = jpi.f(new r(23), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excF = jpi.f(new r(24), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excF = jpi.f(new r(25), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excF = jpi.f(new r(26), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excF = jpi.f(new r(27), str2, createPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excF = jpi.f(new r(28), str2, createPublicKeyCredentialDomException);
            }
            return (CreateCredentialException) excF;
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(str2, str);
        }
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }
}
