package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh6 implements yz7, vi6, ia4, kz6, up4 {
    public final /* synthetic */ int E;

    public /* synthetic */ xh6(rl rlVar) {
        this.E = 19;
    }

    public static /* synthetic */ void b(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void c(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void d(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    public static /* synthetic */ void f(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void h(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    @Override // defpackage.vi6
    public float a(float f) {
        return f;
    }

    @Override // defpackage.yz7
    public Object apply(Object obj) {
        switch (this.E) {
            case 1:
                return eve.U((String) ((Map.Entry) obj).getKey());
            case 2:
                return eve.U((String) ((Map.Entry) obj).getValue());
            case 3:
                return eve.U((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT);
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                String strU = eve.U((String) entry.getValue());
                if (!strU.isEmpty()) {
                    return strU;
                }
                return "http.request.headers." + eve.K((String) entry.getKey());
            case 5:
                Map.Entry entry2 = (Map.Entry) obj;
                String strU2 = eve.U((String) entry2.getValue());
                if (!strU2.isEmpty()) {
                    return strU2;
                }
                return "http.response.headers." + eve.K((String) entry2.getKey());
            default:
                return adi.a((String) obj);
        }
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) throws IOException {
        Object obj;
        r5l r5lVar = (r5l) d5hVar;
        synchronized (r5lVar.a) {
            dgj.x("Task is not yet complete", r5lVar.c);
            if (r5lVar.d) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean zIsInstance = IOException.class.isInstance(r5lVar.f);
            Exception exc = r5lVar.f;
            if (zIsInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            obj = r5lVar.e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            c("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            c("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            c(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        c("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        switch (this.E) {
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 10:
                lw9 lw9Var = ExecutorsRegistrar.a;
                return jdi.E;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(el5Var);
        }
    }

    public /* synthetic */ xh6(int i) {
        this.E = i;
    }
}
