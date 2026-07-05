package io.sentry.android.ndk;

import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.d1;
import io.sentry.android.core.internal.util.e;
import io.sentry.ndk.NdkOptions;
import io.sentry.p;
import io.sentry.protocol.u;
import io.sentry.r5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new e(1), "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            io.sentry.ndk.SentryNdk.close();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        u sdkVersion = sentryAndroidOptions.getSdkVersion();
        int i = d.a;
        if (sdkVersion != null) {
            r5.d().b("maven:io.sentry:sentry-android-ndk", "8.43.1");
        }
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            String dsn = sentryAndroidOptions.getDsn();
            p.v("DSN is required for sentry-ndk", dsn);
            boolean zIsDebug = sentryAndroidOptions.isDebug();
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            p.v("outbox path is required for sentry-ndk", outboxPath);
            NdkOptions ndkOptions = new NdkOptions(dsn, zIsDebug, outboxPath, sentryAndroidOptions.getRelease(), sentryAndroidOptions.getEnvironment(), sentryAndroidOptions.getDist(), sentryAndroidOptions.getMaxBreadcrumbs(), sentryAndroidOptions.getNativeSdkName());
            int ndkHandlerStrategy = sentryAndroidOptions.getNdkHandlerStrategy();
            if (ndkHandlerStrategy == d1.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) {
                ndkOptions.setNdkHandlerStrategy(io.sentry.ndk.a.SENTRY_HANDLER_STRATEGY_DEFAULT);
            } else if (ndkHandlerStrategy == d1.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) {
                ndkOptions.setNdkHandlerStrategy(io.sentry.ndk.a.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);
            }
            Double tracesSampleRate = sentryAndroidOptions.getTracesSampleRate();
            if (tracesSampleRate == null) {
                ndkOptions.setTracesSampleRate(MTTypesetterKt.kLineSkipLimitMultiplier);
            } else {
                ndkOptions.setTracesSampleRate(tracesSampleRate.floatValue());
            }
            io.sentry.ndk.SentryNdk.init(ndkOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new c(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new a());
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            io.sentry.ndk.SentryNdk.loadNativeLibraries();
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }
}
