package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa4 implements jvd {
    public final /* synthetic */ int a;

    @Override // defpackage.jvd
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                lw9 lw9Var = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new zw5(Executors.newFixedThreadPool(4, new he5("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                lw9 lw9Var2 = ExecutorsRegistrar.a;
                return new zw5(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new he5("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                lw9 lw9Var3 = ExecutorsRegistrar.a;
                return new zw5(Executors.newCachedThreadPool(new he5("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                lw9 lw9Var4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new he5("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
