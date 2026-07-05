package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class uy extends s4d implements to4 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public uy() {
        List listC0 = mp0.C0(new xdg[]{Build.VERSION.SDK_INT >= 29 ? new vy() : null, new dw5(v50.e), new dw5(tk4.a), new dw5(jv1.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (((xdg) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.to4
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.to4
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.s4d
    public final zh4 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        kz kzVar = x509TrustManagerExtensions != null ? new kz(x509TrustManager, x509TrustManagerExtensions) : null;
        if (kzVar != null) {
            return kzVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new we1(new vg1((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.s4d
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((xdg) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        xdg xdgVar = (xdg) next;
        if (xdgVar != null) {
            xdgVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.s4d
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((xdg) next).a(sSLSocket)) {
                break;
            }
        }
        xdg xdgVar = (xdg) next;
        if (xdgVar != null) {
            return xdgVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.s4d
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuardJ = a6.j();
        closeGuardJ.open("response.body().close()");
        return closeGuardJ;
    }

    @Override // defpackage.s4d
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.s4d
    public final void i(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = h40.e;
            gqk.f();
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = h40.e;
            gqk.f();
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.s4d
    public final void j(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(str, obj);
        } else {
            obj.getClass();
            ty.h(obj).warnIfOpen();
        }
    }

    @Override // defpackage.s4d
    public final SSLContext k() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
