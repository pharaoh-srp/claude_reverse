package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok5 implements Callable {
    public final /* synthetic */ DatadogRumMonitor E;
    public final /* synthetic */ RumRawEvent F;
    public final /* synthetic */ lj5 G;
    public final /* synthetic */ bz7 H;

    public /* synthetic */ ok5(DatadogRumMonitor datadogRumMonitor, RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var) {
        this.E = datadogRumMonitor;
        this.F = rumRawEvent;
        this.G = lj5Var;
        this.H = bz7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        sxe sxeVarA;
        DatadogRumMonitor datadogRumMonitor = this.E;
        RumRawEvent rumRawEvent = this.F;
        lj5 lj5Var = this.G;
        bz7 bz7Var = this.H;
        synchronized (datadogRumMonitor.f) {
            DatadogRumMonitor.z(datadogRumMonitor, rumRawEvent, lj5Var, bz7Var);
            sxeVarA = datadogRumMonitor.A();
        }
        return sxeVarA;
    }
}
