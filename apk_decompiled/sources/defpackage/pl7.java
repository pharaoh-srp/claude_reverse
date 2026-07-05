package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pl7 {
    public static final Object j = new Object();
    public static final bp0 k = new bp0(0);
    public final Context a;
    public final String b;
    public final fm7 c;
    public final ra4 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final lw9 g;
    public final jvd h;
    public final CopyOnWriteArrayList i;

    public pl7(fm7 fm7Var, Context context, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.a = context;
        dgj.s(str);
        this.b = str;
        this.c = fm7Var;
        e91 e91Var = FirebaseInitProvider.E;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        int i = 14;
        ArrayList arrayListG = new nyj(context, i, new tk5(7, ComponentDiscoveryService.class)).G();
        Trace.endSection();
        Trace.beginSection("Runtime");
        jdi jdiVar = jdi.E;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListG);
        int i2 = 1;
        arrayList.add(new ha4(i2, new FirebaseCommonRegistrar()));
        arrayList.add(new ha4(i2, new ExecutorsRegistrar()));
        arrayList2.add(p94.c(context, Context.class, new Class[0]));
        arrayList2.add(p94.c(this, pl7.class, new Class[0]));
        arrayList2.add(p94.c(fm7Var, fm7.class, new Class[0]));
        efk efkVar = new efk(i);
        if (eve.G(context) && FirebaseInitProvider.F.get()) {
            arrayList2.add(p94.c(e91Var, e91.class, new Class[0]));
        }
        ra4 ra4Var = new ra4(jdiVar, arrayList, arrayList2, efkVar);
        this.d = ra4Var;
        Trace.endSection();
        this.g = new lw9(new qa4(this, 2, context));
        this.h = ra4Var.e(or5.class);
        ml7 ml7Var = new ml7(this);
        a();
        if (atomicBoolean.get()) {
            yb1.I.E.get();
        }
        copyOnWriteArrayList.add(ml7Var);
        Trace.endSection();
    }

    public static pl7 c() {
        pl7 pl7Var;
        synchronized (j) {
            try {
                pl7Var = (pl7) k.get("[DEFAULT]");
                if (pl7Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + u00.z() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((or5) pl7Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return pl7Var;
    }

    public static pl7 f(fm7 fm7Var, Context context, String str) {
        pl7 pl7Var;
        AtomicReference atomicReference = nl7.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = nl7.a;
            if (atomicReference2.get() == null) {
                nl7 nl7Var = new nl7();
                while (true) {
                    if (atomicReference2.compareAndSet(null, nl7Var)) {
                        yb1.a(application);
                        yb1 yb1Var = yb1.I;
                        yb1Var.getClass();
                        synchronized (yb1Var) {
                            yb1Var.G.add(nl7Var);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            bp0 bp0Var = k;
            dgj.x("FirebaseApp name " + strTrim + " already exists!", !bp0Var.containsKey(strTrim));
            dgj.w("Application context cannot be null.", context);
            pl7Var = new pl7(fm7Var, context, strTrim);
            bp0Var.put(strTrim, pl7Var);
        }
        pl7Var.e();
        return pl7Var;
    }

    public static pl7 g(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return c();
                }
                fm7 fm7VarA = fm7.a(context);
                if (fm7VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(fm7VarA, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        dgj.x("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(fd9.R(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(fd9.R(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        Context context = this.a;
        boolean zG = eve.G(context);
        String str = this.b;
        if (!zG) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            ol7.a(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.l("[DEFAULT]".equals(str));
        ((or5) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pl7)) {
            return false;
        }
        pl7 pl7Var = (pl7) obj;
        pl7Var.a();
        return this.b.equals(pl7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        q28 q28Var = new q28((Object) this);
        q28Var.c("name", this.b);
        q28Var.c("options", this.c);
        return q28Var.toString();
    }
}
