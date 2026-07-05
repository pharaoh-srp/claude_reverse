package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Trace;
import com.anthropic.claude.analytics.events.PerfEvents$LongTask;
import com.google.firebase.FirebaseCommonRegistrar;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.f;
import io.sentry.f1;
import io.sentry.g4;
import io.sentry.j4;
import io.sentry.p2;
import io.sentry.r1;
import io.sentry.w6;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja4 implements ia4, gka, up4, g4, j4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ja4(q28 q28Var, String str) {
        this.E = 3;
        this.G = q28Var;
        this.F = str;
    }

    @Override // io.sentry.g4
    public void c(r1 r1Var) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 4:
                f1 f1Var = (f1) obj;
                if (x44.r(r1Var, ((smf) obj2).c)) {
                    f1Var.x();
                }
                break;
            default:
                f1 f1Var2 = (f1) obj2;
                r1 r1Var2 = (r1) obj;
                if (r1Var == null) {
                    f1Var2.Q(r1Var2);
                }
                break;
        }
    }

    @Override // defpackage.gka
    public void d(long j, String str) {
        qi3 qi3Var = (qi3) this.F;
        List list = (List) this.G;
        long j2 = j / 1000000;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Number number = (Number) listIterator.previous();
            if (j2 >= number.longValue()) {
                qi3Var.e(new PerfEvents$LongTask(j2, number.longValue(), str), PerfEvents$LongTask.Companion.serializer());
                return;
            }
        }
        pmf.h("List contains no element matching the predicate.");
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) {
        q28 q28Var = (q28) this.G;
        String str = (String) this.F;
        synchronized (q28Var) {
            ((bp0) q28Var.G).remove(str);
        }
        return d5hVar;
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 7:
                f1Var.O(new f((ActivityLifecycleIntegration) obj2, f1Var, (r1) obj));
                break;
            default:
                ((p2) obj2).b = f1Var.M(new u95(f1Var, 29, (w6) obj));
                break;
        }
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        int i = this.E;
        Object obj = this.G;
        String str = (String) this.F;
        switch (i) {
            case 0:
                p94 p94Var = (p94) obj;
                try {
                    Trace.beginSection(str);
                    return p94Var.f.s(el5Var);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) el5Var.a(Context.class);
                int i2 = ((xh6) obj).E;
                String strValueOf = "";
                switch (i2) {
                    case 11:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 12:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 13:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new t81(str, strValueOf);
        }
    }

    public /* synthetic */ ja4(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
