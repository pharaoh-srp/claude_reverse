package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class dhj {
    public abstract zaa a(Context context, String str, WorkerParameters workerParameters);

    public final zaa b(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        zaa zaaVarA = a(context, str, workerParameters);
        if (zaaVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(zaa.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    zaaVarA = (zaa) objNewInstance;
                } catch (Throwable th) {
                    nga.c().b(ehj.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                nga.c().b(ehj.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!zaaVarA.b()) {
            return zaaVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
