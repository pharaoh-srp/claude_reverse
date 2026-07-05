package defpackage;

import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.core.telemetry.SilentException;
import io.sentry.t4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class urk {
    public static final ta4 a = new ta4(-925740652, false, new tb4(28));
    public static final ta4 b = new ta4(-712118769, false, new tb4(29));
    public static final ta4 c;
    public static final ta4 d;
    public static r20 e;
    public static iz f;
    public static ib2 g;

    static {
        new ta4(-1123184665, false, new wb4(0));
        c = new ta4(-1525249892, false, new wb4(1));
        new ta4(-720791559, false, new vb4(5));
        d = new ta4(2002329303, false, new wb4(2));
        new ta4(380153498, false, new wb4(3));
    }

    public static final void a(ParsedContentBlock$Thinking parsedContentBlock$Thinking, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2 = iqbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-643486778);
        int i2 = i | (e18Var.f(parsedContentBlock$Thinking) ? 4 : 2) | (e18Var.f(iqbVar2) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            jz0 markdownRoot = parsedContentBlock$Thinking.getMarkdownRoot();
            if (markdownRoot != null) {
                e18Var.a0(-1675355291);
                jlk.f(markdownRoot, iqbVar2, (tkh) ((wk) gm3.c(e18Var).e.F).f, null, null, null, null, e18Var, i2 & 112, 248);
                e18Var.p(false);
                iqbVar2 = iqbVar;
            } else {
                e18Var.a0(-1675182373);
                iqbVar2 = iqbVar;
                tjh.b(parsedContentBlock$Thinking.getBody(), iqbVar2, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).f, e18Var, i2 & 112, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(parsedContentBlock$Thinking, iqbVar2, i, 26);
        }
    }

    public static void b(SilentException silentException, String str) {
        t4.p(new et5(str, silentException, ozf.G, 5));
    }

    public static kpe c(qh9 qh9Var) {
        try {
            return new kpe(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Ssl", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Ssl", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Ssl", e4);
            return null;
        }
    }

    public static b80 d(c cVar, bna bnaVar) {
        return new b80(up9.a(cVar, bnaVar, 1.0f, lyk.J, false), 0);
    }

    public static c80 e(a aVar, bna bnaVar, boolean z) {
        return new c80(1, up9.a(aVar, bnaVar, z ? zpi.c() : 1.0f, tqh.M, false));
    }

    public static b80 f(c cVar, bna bnaVar, int i) {
        x9c x9cVar = new x9c(2);
        x9cVar.F = i;
        ArrayList arrayListA = up9.a(cVar, bnaVar, 1.0f, x9cVar, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            rp9 rp9Var = (rp9) arrayListA.get(i2);
            w98 w98Var = (w98) rp9Var.b;
            w98 w98Var2 = (w98) rp9Var.c;
            if (w98Var != null && w98Var2 != null) {
                float[] fArr = w98Var.a;
                int length = fArr.length;
                float[] fArr2 = w98Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f3 = fArr3[i4];
                        if (f3 != f2) {
                            fArr3[i3] = f3;
                            i3++;
                            f2 = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    rp9Var = new rp9(w98Var.b(fArrCopyOfRange), w98Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, rp9Var);
        }
        return new b80(arrayListA, 1);
    }

    public static b80 g(a aVar, bna bnaVar) {
        return new b80(up9.a(aVar, bnaVar, 1.0f, hj6.L, false), 2);
    }

    public static b80 h(c cVar, bna bnaVar) {
        return new b80(up9.a(cVar, bnaVar, zpi.c(), hj6.P, true), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final CreateCredentialException i(CharSequence charSequence, String str) {
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new CreateCredentialCancellationException(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new CreateCredentialUnsupportedException(charSequence);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new CreateCredentialProviderConfigurationException(charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new CreateCredentialUnknownException(charSequence);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new CreateCredentialInterruptedException(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new CreateCredentialNoCreateOptionException(charSequence);
                }
                break;
        }
        if (!isg.q0(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new CreateCredentialCustomException(charSequence, str);
        }
        int i = CreatePublicKeyCredentialException.F;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!bsg.u0(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i2 = CreatePublicKeyCredentialDomException.G;
            return bvk.f(str, string);
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(string, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final GetCredentialException j(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (!isg.q0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new GetCredentialCustomException(charSequence, str);
        }
        int i = GetPublicKeyCredentialException.F;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!isg.q0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i2 = GetPublicKeyCredentialDomException.G;
            return ppk.d(str, string);
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(string, str);
        }
    }

    public static /* synthetic */ boolean k(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, x0l x0lVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(x0lVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(x0lVar) != obj && atomicReferenceFieldUpdater.get(x0lVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
