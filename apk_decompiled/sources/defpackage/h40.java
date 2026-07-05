package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class h40 extends s4d implements to4 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public h40() {
        hkg hkgVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            hkgVar = new hkg(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = l30.a;
            l30.a(hdc.class.getName(), 5, "unable to load android socket classes", e2);
            hkgVar = null;
        }
        List listC0 = mp0.C0(new xdg[]{hkgVar, new dw5(v50.e), new dw5(tk4.a), new dw5(jv1.a)});
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
        u7i vg1Var;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        kz kzVar = x509TrustManagerExtensions != null ? new kz(x509TrustManager, x509TrustManagerExtensions) : null;
        if (kzVar != null) {
            return kzVar;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            vg1Var = new g40(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            vg1Var = new vg1((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new we1(vg1Var);
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.s4d
    public final void i(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
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
