package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.b;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class t2k extends zo1 {
    public final Context F;
    public volatile int G;
    public volatile utj H;
    public volatile lj1 I;
    public volatile ScheduledExecutorService J;

    public t2k(a5 a5Var, Context context, yo1 yo1Var) {
        super(a5Var, context, yo1Var);
        this.G = 0;
        this.F = context;
    }

    public final synchronized boolean F() {
        if (this.G == 2 && this.H != null) {
            if (this.I != null) {
                return true;
            }
        }
        return false;
    }

    public final x3k G(int i) {
        if (F()) {
            return osk.u(new at(this, i, 15));
        }
        jyj.h("BillingClientTesting", "Billing Override Service is not ready.");
        H(94, 28, y3k.a(-1, "Billing Override Service connection is disconnected."));
        return new s3k(0);
    }

    public final void H(int i, int i2, hp1 hp1Var) {
        int i3 = a3k.a;
        lqk lqkVarB = a3k.b(i, i2, hp1Var, null, isk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(lqkVarB, "ApiFailure should not be null");
        this.h.v(lqkVarB);
    }

    public final void I(int i) {
        int i2 = a3k.a;
        irk irkVarC = a3k.c(i, isk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(irkVarC, "ApiSuccess should not be null");
        cbf cbfVar = this.h;
        cbfVar.getClass();
        try {
            cbfVar.E(irkVarC, (itk) cbfVar.F);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.zo1
    public final void a() {
        synchronized (this) {
            I(27);
            try {
                try {
                    if (this.I != null && this.H != null) {
                        jyj.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.F.unbindService(this.I);
                        this.I = new lj1(3, this);
                    }
                    this.H = null;
                    if (this.J != null) {
                        this.J.shutdownNow();
                        this.J = null;
                    }
                } catch (RuntimeException e) {
                    jyj.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.G = 3;
            } catch (Throwable th) {
                this.G = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // defpackage.zo1
    public final hp1 b(Activity activity, fp1 fp1Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) G(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            H(102, 28, y3k.q);
            jyj.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            H(95, 28, y3k.q);
            jyj.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            hp1 hp1VarA = y3k.a(iIntValue, "Billing override value was set by a license tester.");
            H(93, 2, hp1VarA);
            E(hp1VarA);
            return hp1VarA;
        }
        try {
            return super.b(activity, fp1Var);
        } catch (Exception e3) {
            hp1 hp1Var = y3k.f;
            H(103, 2, hp1Var);
            jyj.i("BillingClientTesting", "An internal error occurred.", e3);
            return hp1Var;
        }
    }

    @Override // defpackage.zo1
    public final void c(ro6 ro6Var, ap1 ap1Var) {
        ScheduledExecutorService scheduledExecutorService;
        lu7 lu7Var = new lu7(2, ap1Var);
        ije ijeVar = new ije(this, ro6Var, ap1Var, 4);
        x3k x3kVarG = G(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.J;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!x3kVarG.isDone()) {
            l4k l4kVar = new l4k();
            l4kVar.L = x3kVarG;
            b bVar = new b();
            bVar.E = l4kVar;
            l4kVar.M = scheduledExecutorService.schedule(bVar, 28500L, timeUnit);
            x3kVarG.c(bVar, c2k.E);
            x3kVarG = l4kVar;
        }
        uvj uvjVar = new uvj(this, lu7Var, ijeVar, 1);
        x3kVarG.c(new s2k(x3kVarG, 0, uvjVar), e());
    }

    @Override // defpackage.zo1
    public final void d(bp1 bp1Var) {
        synchronized (this) {
            if (F()) {
                jyj.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                I(26);
            } else {
                int i = 1;
                if (this.G == 1) {
                    jyj.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else {
                    int i2 = 3;
                    if (this.G == 3) {
                        jyj.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                        H(38, 26, y3k.a(-1, "Billing Override Service connection is disconnected."));
                    } else {
                        this.G = 1;
                        jyj.g("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.I = new lj1(i2, this);
                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                        Context context = this.F;
                        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                    jyj.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    if (context.bindService(intent2, this.I, 1)) {
                                        jyj.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    } else {
                                        jyj.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                    }
                                }
                                i = 39;
                            }
                        }
                        this.G = 0;
                        jyj.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                        H(i, 26, y3k.a(2, "Billing Override Service unavailable on device."));
                    }
                }
            }
        }
        t(bp1Var, 0);
    }

    public t2k(a5 a5Var, Context context, txd txdVar, yo1 yo1Var) {
        super(a5Var, context, txdVar, yo1Var);
        this.G = 0;
        this.F = context;
    }
}
