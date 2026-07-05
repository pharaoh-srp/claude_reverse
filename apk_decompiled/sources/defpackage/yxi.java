package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class yxi extends ayi {
    public static yxi c;
    public static final xxi d = new xxi(0);
    public final Application b;

    public yxi(Application application) {
        this.b = application;
    }

    @Override // defpackage.ayi, defpackage.zxi
    public final vxi a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        pmf.n("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.ayi, defpackage.zxi
    public final vxi b(Class cls, sub subVar) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) subVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!p70.class.isAssignableFrom(cls)) {
            return sf5.B(cls);
        }
        sz6.p("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final vxi d(Class cls, Application application) {
        if (!p70.class.isAssignableFrom(cls)) {
            return sf5.B(cls);
        }
        try {
            vxi vxiVar = (vxi) cls.getConstructor(Application.class).newInstance(application);
            vxiVar.getClass();
            return vxiVar;
        } catch (IllegalAccessException e) {
            xh6.f(grc.s(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            xh6.f(grc.s(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            xh6.f(grc.s(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            xh6.f(grc.s(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }
}
