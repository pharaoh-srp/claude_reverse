package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class v50 implements xdg {
    public static final vz8 e = new vz8(12);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public v50(Class cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.xdg
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.xdg
    public final boolean b() {
        boolean z = h40.e;
        return gqk.g();
    }

    @Override // defpackage.xdg
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, dj2.a);
                }
            } catch (IllegalAccessException e2) {
                sz6.h(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !x44.r(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    sz6.h(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.xdg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                s4d s4dVar = s4d.a;
                method.invoke(sSLSocket, zp3.j(list));
            } catch (IllegalAccessException e2) {
                sz6.h(e2);
            } catch (InvocationTargetException e3) {
                sz6.h(e3);
            }
        }
    }
}
