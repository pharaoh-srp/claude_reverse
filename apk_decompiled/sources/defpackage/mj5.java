package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.util.Log;
import io.sentry.a1;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.c6;
import io.sentry.clientreport.b;
import io.sentry.h5;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.t5;
import io.sentry.w4;
import io.sentry.y5;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mj5 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ mj5(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        int i;
        boolean z = false;
        String str2 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        str2 = null;
        switch (this.E) {
            case 0:
                qj5 qj5Var = (qj5) this.F;
                Set set = (Set) this.G;
                lp4 lp4Var = qj5Var.h;
                if (lp4Var instanceof i4c) {
                    return null;
                }
                return lp4Var.b(set);
            case 1:
                Context context = (Context) this.F;
                Intent intent = (Intent) this.G;
                dpf dpfVarK = dpf.K();
                dpfVarK.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) dpfVarK.I).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (dpfVarK) {
                    try {
                        String str3 = (String) dpfVarK.F;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    dpfVarK.F = context.getPackageName() + serviceInfo.name;
                                } else {
                                    dpfVarK.F = serviceInfo.name;
                                }
                                str2 = (String) dpfVarK.F;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if ((dpfVarK.N(context) ? thk.o(context, intent2) : context.startService(intent2)) == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 2:
                gbf gbfVar = (gbf) this.F;
                Set set2 = (Set) this.G;
                if (!gbfVar.a.g.get()) {
                    return null;
                }
                lj5 lj5VarB = gbfVar.b.b(set2);
                return new cpc(lj5VarB, gbfVar.h.q(lj5VarB));
            case 3:
                zfj zfjVar = zfj.E;
                nhj nhjVar = (nhj) this.F;
                qhj qhjVar = (qhj) this.G;
                String str4 = qhjVar.l;
                String str5 = qhjVar.c;
                ahj ahjVar = qhjVar.i;
                tgj tgjVar = qhjVar.a;
                if (nhjVar instanceof lhj) {
                    yaa yaaVar = ((lhj) nhjVar).a;
                    zfj zfjVarC = ahjVar.c(str5);
                    lgj lgjVarV = qhjVar.h.v();
                    lgjVarV.getClass();
                    u00.E(lgjVarV.a, false, true, new hti(str5, 5));
                    if (zfjVarC != null) {
                        if (zfjVarC == zfj.F) {
                            if (yaaVar instanceof xaa) {
                                String str6 = rhj.a;
                                nga.c().d(str6, "Worker result SUCCESS for " + str4);
                                if (tgjVar.j()) {
                                    qhjVar.d();
                                } else {
                                    ahjVar.h(zfj.G, str5);
                                    pf5 pf5Var = ((xaa) yaaVar).a;
                                    pf5Var.getClass();
                                    u00.E(ahjVar.a, false, true, new nif(pf5Var, 23, str5));
                                    qhjVar.f.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    kz5 kz5Var = qhjVar.j;
                                    for (String str7 : kz5Var.a(str5)) {
                                        if (ahjVar.c(str7) == zfj.I && ((Boolean) u00.E(kz5Var.a, true, false, new cm5(str7, 7))).booleanValue()) {
                                            nga.c().d(rhj.a, "Setting status to enqueued for ".concat(str7));
                                            ahjVar.h(zfjVar, str7);
                                            ahjVar.g(jCurrentTimeMillis, str7);
                                        }
                                    }
                                }
                            } else if (yaaVar instanceof waa) {
                                String str8 = rhj.a;
                                nga.c().d(str8, "Worker result RETRY for " + str4);
                                qhjVar.c(-256);
                                z = true;
                            } else {
                                String str9 = rhj.a;
                                nga.c().d(str9, "Worker result FAILURE for " + str4);
                                if (tgjVar.j()) {
                                    qhjVar.d();
                                } else {
                                    qhjVar.e(yaaVar);
                                }
                            }
                        } else if (!zfjVarC.a()) {
                            qhjVar.c(-512);
                            z = true;
                        }
                    }
                } else if (nhjVar instanceof khj) {
                    yaa yaaVar2 = ((khj) nhjVar).a;
                    String str10 = rhj.a;
                    nga.c().d(str10, "Worker result FAILURE for " + str4);
                    if (tgjVar.j()) {
                        qhjVar.d();
                    } else {
                        qhjVar.e(yaaVar2);
                    }
                } else {
                    if (!(nhjVar instanceof mhj)) {
                        wg6.i();
                        return null;
                    }
                    int i2 = ((mhj) nhjVar).a;
                    if (x44.r(tgjVar.y, Boolean.TRUE)) {
                        String str11 = rhj.a;
                        nga.c().getClass();
                        qhjVar.c(i2);
                    } else {
                        zfj zfjVarC2 = ahjVar.c(str5);
                        if (zfjVarC2 == null || zfjVarC2.a()) {
                            String str12 = rhj.a;
                            nga ngaVarC = nga.c();
                            Objects.toString(zfjVarC2);
                            ngaVarC.getClass();
                        } else {
                            String str13 = rhj.a;
                            nga ngaVarC2 = nga.c();
                            zfjVarC2.toString();
                            ngaVarC2.getClass();
                            ahjVar.h(zfjVar, str5);
                            ahjVar.i(i2, str5);
                            ahjVar.e(-1L, str5);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                n1 n1Var = (n1) this.F;
                c6 c6Var = (c6) this.G;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, h5.d));
                    try {
                        n1Var.a(c6Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 5:
                n1 n1Var2 = (n1) this.F;
                w4 w4Var = (w4) this.G;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, h5.d));
                    try {
                        n1Var2.a(w4Var, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }
            case 6:
                n1 n1Var3 = (n1) this.F;
                b bVar = (b) this.G;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, h5.d));
                    try {
                        n1Var3.a(bVar, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } finally {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                    }
                }
            case 7:
                n1 n1Var4 = (n1) this.F;
                h7 h7Var = (h7) this.G;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, h5.d));
                    try {
                        n1Var4.a(h7Var, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } finally {
                        try {
                            bufferedWriter4.close();
                            break;
                        } catch (Throwable th7) {
                            th.addSuppressed(th7);
                        }
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th8) {
                    }
                }
            case 8:
                n1 n1Var5 = (n1) this.F;
                y5 y5Var = (y5) this.G;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, h5.d));
                    try {
                        n1Var5.a(y5Var, bufferedWriter5);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th9) {
                        }
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th10) {
                    }
                }
            default:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.F;
                Bitmap bitmap = (Bitmap) this.G;
                a1 logger = screenshotEventProcessor.E.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
                            bitmap.recycle();
                            if (byteArrayOutputStream6.size() <= 0) {
                                logger.h(t5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream6.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                bArr = byteArray6;
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th11) {
                            }
                        }
                    } catch (Throwable th12) {
                        logger.d(t5.ERROR, "Compressing bitmap failed.", th12);
                    }
                    break;
                }
                return bArr;
        }
    }
}
