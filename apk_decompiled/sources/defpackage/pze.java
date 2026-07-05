package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import com.anthropic.claude.api.experience.ExperienceToggle;
import io.sentry.a1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b;
import io.sentry.android.core.c;
import io.sentry.android.core.f;
import io.sentry.f7;
import io.sentry.i7;
import io.sentry.k7;
import io.sentry.okhttp.h;
import io.sentry.protocol.n;
import io.sentry.protocol.w;
import io.sentry.s4;
import io.sentry.t5;
import io.sentry.util.network.d;
import io.sentry.v;
import io.sentry.w6;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLHandshakeException;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pze implements qze, s4, k7, d {
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ pze(Object obj, Object obj2, Object obj3) {
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    @Override // defpackage.qze
    public Object apply(Object obj) {
        long jInsert;
        sze szeVar = (sze) this.E;
        o81 o81Var = (o81) this.F;
        bn6 bn6Var = o81Var.c;
        String str = o81Var.a;
        g91 g91Var = (g91) this.G;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long jSimpleQueryForLong = szeVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * szeVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
        p81 p81Var = szeVar.H;
        if (jSimpleQueryForLong >= p81Var.a) {
            szeVar.i(1L, nfa.CACHE_FULL, str);
            return -1L;
        }
        Long lD = sze.d(sQLiteDatabase, g91Var);
        if (lD != null) {
            jInsert = lD.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", g91Var.a);
            contentValues.put("priority", Integer.valueOf(bgd.a(g91Var.c)));
            contentValues.put("next_request_ms", (Integer) 0);
            byte[] bArr = g91Var.b;
            if (bArr != null) {
                contentValues.put("extras", Base64.encodeToString(bArr, 0));
            }
            jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i = p81Var.e;
        byte[] bArr2 = bn6Var.b;
        boolean z = bArr2.length <= i;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(jInsert));
        contentValues2.put("transport_name", str);
        contentValues2.put("timestamp_ms", Long.valueOf(o81Var.d));
        contentValues2.put("uptime_ms", Long.valueOf(o81Var.e));
        contentValues2.put("payload_encoding", bn6Var.a.a);
        contentValues2.put("code", o81Var.b);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr2 : new byte[0]);
        long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i));
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i2 - 1) * i, Math.min(i2 * i, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(jInsert2));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(o81Var.f).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(jInsert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put(ExperienceToggle.DEFAULT_PARAM_KEY, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(jInsert2);
    }

    @Override // io.sentry.k7
    public void b(i7 i7Var) {
        b bVarB;
        f7 f7Var = (f7) this.E;
        k7 k7Var = (k7) this.F;
        AtomicReference atomicReference = (AtomicReference) this.G;
        if (k7Var != null) {
            k7Var.b(i7Var);
        }
        f fVar = f7Var.r.k;
        if (fVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) fVar.E;
            WeakReference weakReference = (WeakReference) fVar.F;
            String str = (String) fVar.G;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                c cVar = activityLifecycleIntegration.U;
                w wVar = f7Var.a;
                v vVarA = cVar.f.a();
                try {
                    if (cVar.c()) {
                        b bVar = null;
                        cVar.d(new tui(cVar, 8, activity), null);
                        b bVar2 = (b) cVar.d.remove(activity);
                        if (bVar2 != null && (bVarB = cVar.b()) != null) {
                            bVar = new b(bVarB.a - bVar2.a, bVarB.b - bVar2.b, bVarB.c - bVar2.c);
                        }
                        if (bVar != null && (bVar.a != 0 || bVar.b != 0 || bVar.c != 0)) {
                            n nVar = new n(Integer.valueOf(bVar.a), "none");
                            n nVar2 = new n(Integer.valueOf(bVar.b), "none");
                            n nVar3 = new n(Integer.valueOf(bVar.c), "none");
                            HashMap map = new HashMap();
                            map.put("frames_total", nVar);
                            map.put("frames_slow", nVar2);
                            map.put("frames_frozen", nVar3);
                            cVar.c.put(wVar, map);
                        }
                    }
                    vVarA.close();
                } catch (Throwable th) {
                    try {
                        vVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.H;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(t5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        io.sentry.n nVar4 = f7Var.q;
        if (nVar4 != null) {
            atomicReference.set(nVar4.f(f7Var));
        }
    }

    @Override // io.sentry.util.network.d
    public io.sentry.internal.debugmeta.c c(Object obj) throws EOFException {
        String str;
        Charset charsetA;
        jie jieVar = (jie) this.E;
        dae daeVar = (dae) this.F;
        h hVar = (h) this.G;
        kie kieVar = (kie) obj;
        kieVar.getClass();
        tie tieVar = kieVar.d;
        if (tieVar != null) {
            Buffer buffer = new Buffer();
            tieVar.writeTo(buffer);
            byte[] bArrK = buffer.K(buffer.F);
            jieVar.e(((kie) daeVar.E).b, sie.c(tie.Companion, bArrK, tieVar.getContentType(), 0, 6));
            p8b p8bVarContentType = tieVar.getContentType();
            a1 logger = hVar.E.r().getLogger();
            logger.getClass();
            if (p8bVarContentType != null) {
                try {
                    str = p8bVarContentType.a;
                } catch (Exception e) {
                    logger.h(t5.ERROR, "Failed to parse buffered request body: " + e.getMessage(), new Object[0]);
                }
            } else {
                str = null;
            }
            String strName = (p8bVarContentType == null || (charsetA = p8bVarContentType.a(dj2.a)) == null) ? null : charsetA.name();
            if (strName == null) {
                strName = "UTF-8";
            }
            return io.sentry.util.c.b(bArrK, str, strName, logger);
        }
        return null;
    }

    @Override // io.sentry.s4
    public void d(w6 w6Var) {
        khi khiVar = (khi) this.E;
        lhi lhiVar = (lhi) this.F;
        lmf lmfVar = (lmf) this.G;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w6Var;
        sentryAndroidOptions.getClass();
        sentryAndroidOptions.setDsn("https://319c8a3f9b835a5d37221a81401d500e@o1158394.ingest.us.sentry.io/4507346684477440");
        sentryAndroidOptions.setEnableAutoSessionTracking(false);
        sentryAndroidOptions.setSendClientReports(false);
        sentryAndroidOptions.setAttachScreenshot(false);
        sentryAndroidOptions.setAttachViewHierarchy(true);
        sentryAndroidOptions.setBeforeScreenshotCaptureCallback(new pmf(0));
        sentryAndroidOptions.addIgnoredExceptionForType(GetCredentialCancellationException.class);
        sentryAndroidOptions.addIgnoredExceptionForType(SSLHandshakeException.class);
        sentryAndroidOptions.setPropagateTraceparent(true);
        sentryAndroidOptions.setTracePropagationTargets(ui3.a);
        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(0.005d));
        sentryAndroidOptions.setTracesSampler(new mr9());
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.SECONDS;
        sentryAndroidOptions.setIdleTimeout(Long.valueOf(uh6.f(v40.Q(6, zh6Var))));
        sentryAndroidOptions.setDeadlineTimeout(uh6.f(v40.Q(30, zh6Var)));
        sentryAndroidOptions.setEnablePerformanceV2(true);
        sentryAndroidOptions.setEnableAppStartProfiling(true);
        sentryAndroidOptions.setEnableTimeToFullDisplayTracing(true);
        sentryAndroidOptions.setBeforeBreadcrumb(new kmf(lmfVar, 1));
        sentryAndroidOptions.setBeforeSend(khiVar);
        sentryAndroidOptions.setBeforeSendTransaction(lhiVar);
        sentryAndroidOptions.setTombstoneEnabled(true);
    }
}
