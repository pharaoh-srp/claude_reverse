package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.e4a;
import defpackage.f4a;
import defpackage.fj0;
import defpackage.lhd;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.sz6;
import defpackage.u29;
import defpackage.y3a;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lu29;", "Lm4a;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class ProcessLifecycleInitializer implements u29 {
    @Override // defpackage.u29
    public final List a() {
        return lm6.E;
    }

    @Override // defpackage.u29
    public final Object b(Context context) {
        context.getClass();
        fj0 fj0VarT = fj0.t(context);
        fj0VarT.getClass();
        if (!((HashSet) fj0VarT.F).contains(ProcessLifecycleInitializer.class)) {
            sz6.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!f4a.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new e4a());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.M;
        processLifecycleOwner.getClass();
        processLifecycleOwner.I = new Handler();
        processLifecycleOwner.J.f(y3a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new lhd(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
