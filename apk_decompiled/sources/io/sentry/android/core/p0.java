package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import defpackage.ij0;
import io.sentry.a7;
import io.sentry.o4;
import io.sentry.o5;
import io.sentry.r5;
import io.sentry.t5;
import io.sentry.x3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public static final io.sentry.android.core.util.a a = new io.sentry.android.core.util.a(new io.sentry.e0(10));
    public static final io.sentry.android.core.util.a b = new io.sentry.android.core.util.a(new io.sentry.e0(11));
    public static final io.sentry.android.core.util.a c = new io.sentry.android.core.util.a(new io.sentry.e0(12));
    public static final io.sentry.android.core.util.a d = new io.sentry.android.core.util.a(new io.sentry.e0(13));
    public static final io.sentry.android.core.util.a e = new io.sentry.android.core.util.a(new io.sentry.e0(14));

    public static void a(Context context, l0 l0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listI;
        List listI2;
        List listI3;
        List listI4;
        io.sentry.p.v("The options object is required.", sentryAndroidOptions);
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) d.a(context) : (ApplicationInfo) e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            io.sentry.a1 logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(g(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strK = k(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strK != null) {
                        sentryAndroidOptions.setDiagnosticLevel(t5.valueOf(strK.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(g(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(g(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setAttachRawTombstone(g(bundle, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
                sentryAndroidOptions.setEnableAutoSessionTracking(g(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dH = h(bundle, logger, "io.sentry.sample-rate");
                    if (dH != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dH));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(g(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(j(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(g(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                sentryAndroidOptions.setReportHistoricalAnrs(g(bundle, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
                String strK2 = k(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zG = g(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zG || (strK2 != null && strK2.isEmpty())) {
                    sentryAndroidOptions.getLogger().h(t5.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strK2 == null) {
                    sentryAndroidOptions.getLogger().h(t5.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zG);
                sentryAndroidOptions.setDsn(strK2);
                sentryAndroidOptions.setEnableNdk(g(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(g(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strK3 = k(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strK3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strK3);
                }
                sentryAndroidOptions.setRelease(k(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(k(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(k(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(j(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) j(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(g(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(g(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(g(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(g(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(g(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(g(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (g(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.v1.LOW);
                }
                sentryAndroidOptions.setForceInit(g(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(g(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(g(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dH2 = h(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dH2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dH2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(g(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(g(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(g(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dH3 = h(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dH3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dH3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dH4 = h(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dH4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dH4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strK4 = k(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strK4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(x3.valueOf(strK4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(g(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(g(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(g(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long j = j(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (j != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(j));
                }
                List<String> listI5 = i(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listI5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listI5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listI5);
                }
                sentryAndroidOptions.setEnableFramesTracking(g(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(k(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.u("", "");
                }
                String strL = l(bundle, logger, "io.sentry.sdk.name", sdkVersion.a());
                io.sentry.p.v("name is required.", strL);
                sdkVersion.E = strL;
                String strL2 = l(bundle, logger, "io.sentry.sdk.version", sdkVersion.b());
                io.sentry.p.v("version is required.", strL2);
                sdkVersion.F = strL2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(g(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listI6 = i(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listI6 != null) {
                    Iterator it = listI6.iterator();
                    while (it.hasNext()) {
                        r5.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(g(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(g(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(g(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(g(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(g(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(g(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(j(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().q() == null) {
                    double dH5 = h(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dH5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().B(Double.valueOf(dH5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().p() == null) {
                    double dH6 = h(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dH6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().A(Double.valueOf(dH6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().i(g(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().h(g(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().u(g(bundle, logger, "io.sentry.session-replay.debug", false));
                String strK5 = k(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strK5 != null) {
                    if ("canvas".equals(strK5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = o4.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = o4.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().t(g(bundle, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().r()));
                if (sentryAndroidOptions.getSessionReplay().l().isEmpty() && (listI4 = i(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listI4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listI4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().w(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().m().isEmpty() && (listI3 = i(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listI3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listI3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().x(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().v(g(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().s()));
                if (sentryAndroidOptions.getSessionReplay().n().size() == a7.u.size() && (listI2 = i(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listI2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().y(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().o().size() == a7.u.size() && (listI = i(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listI.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listI.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().z(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(i(bundle, logger, "io.sentry.ignored-errors"));
                List listI7 = i(bundle, logger, "io.sentry.in-app-includes");
                if (listI7 != null && !listI7.isEmpty()) {
                    Iterator it6 = listI7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listI8 = i(bundle, logger, "io.sentry.in-app-excludes");
                if (listI8 != null && !listI8.isEmpty()) {
                    Iterator it7 = listI8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().b(g(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a()));
                sentryAndroidOptions.getMetrics().b(g(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a()));
                o5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.i(g(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.l(g(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.h(g(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.k(g(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.m(g(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.j(g(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
                feedbackOptions.n(g(bundle, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.g()));
                sentryAndroidOptions.setStrictTraceContinuation(g(bundle, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strK6 = k(bundle, logger, "io.sentry.org-id", null);
                if (strK6 != null) {
                    sentryAndroidOptions.setOrgId(strK6);
                }
                sentryAndroidOptions.setEnableSpotlight(g(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strK7 = k(bundle, logger, "io.sentry.spotlight.url", null);
                if (strK7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strK7);
                }
                sentryAndroidOptions.getScreenshot().i(g(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().h(g(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dH7 = h(bundle, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dH7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dH7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(g(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
            }
            sentryAndroidOptions.getLogger().h(t5.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static String b(io.sentry.a1 a1Var) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo c(Context context, io.sentry.a1 a1Var) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            a1Var.h(t5.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo d(Context context, l0 l0Var) {
        l0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) a.a(context) : (PackageInfo) b.a(context);
    }

    public static String e(PackageInfo packageInfo, l0 l0Var) {
        l0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean f() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean g(Bundle bundle, io.sentry.a1 a1Var, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        a1Var.h(t5.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    public static double h(Bundle bundle, io.sentry.a1 a1Var, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        a1Var.h(t5.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    public static List i(Bundle bundle, io.sentry.a1 a1Var, String str) {
        String string = bundle.getString(str);
        a1Var.h(t5.DEBUG, ij0.C(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long j(Bundle bundle, io.sentry.a1 a1Var, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        a1Var.h(t5.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    public static String k(Bundle bundle, io.sentry.a1 a1Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        a1Var.h(t5.DEBUG, ij0.C(str, " read: ", string), new Object[0]);
        return string;
    }

    public static String l(Bundle bundle, io.sentry.a1 a1Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        a1Var.h(t5.DEBUG, ij0.C(str, " read: ", string), new Object[0]);
        return string;
    }
}
