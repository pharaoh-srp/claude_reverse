package org.chromium.net;

import android.content.Context;
import android.os.Trace;
import com.google.protobuf.UninitializedMessageException;
import defpackage.mr9;
import defpackage.n78;
import defpackage.nn7;
import defpackage.swc;
import defpackage.v28;
import defpackage.yb5;
import defpackage.yfd;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String SHOULD_OVERRIDE_WITH_HTTPENGINE = "Cronet_OverrideWithHttpEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public static boolean shouldOverrideWithHttpEngine(Context context) {
        boolean z;
        n78 n78Var;
        String cronetVersion = ApiVersion.getCronetVersion();
        try {
            Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, yb5.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        boolean z2 = yb5.s(context).getBoolean("android.net.http.EnableTelemetry", !z);
        synchronized (yfd.f) {
            try {
                String str = yfd.e;
                if (str != null && !cronetVersion.equals(str)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                n78Var = yfd.d;
                if (n78Var == null) {
                    yfd.e = cronetVersion;
                    swc.e("HttpFlagsLoader#getHttpFlags loading flags");
                    try {
                        nn7 nn7VarJ = !yb5.s(context).getBoolean("android.net.http.ReadHttpFlags", true) ? null : yfd.J(context);
                        if (nn7VarJ == null) {
                            v28 v28VarA = nn7.g().a();
                            v28VarA.getClass();
                            if (!v28.d(v28VarA, true)) {
                                throw new UninitializedMessageException();
                            }
                            nn7VarJ = (nn7) v28VarA;
                        }
                        context.getPackageName();
                        n78 n78VarS = n78.S(nn7VarJ, cronetVersion, z2);
                        yfd.d = n78VarS;
                        if (Collections.unmodifiableMap((HashMap) n78VarS.F).get("Cronet_log_me") != null) {
                            throw new ClassCastException();
                        }
                        n78Var = yfd.d;
                        Trace.endSection();
                    } finally {
                    }
                }
            } finally {
            }
        }
        if (Collections.unmodifiableMap((HashMap) n78Var.F).get(SHOULD_OVERRIDE_WITH_HTTPENGINE) == null) {
            return false;
        }
        mr9.o();
        return false;
    }

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ CronetEngine.Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            JSONObject jSONObject;
            if (str == null || str.isEmpty()) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Experimental options parsing failed", e);
                }
            }
            this.mParsedExperimentalOptions = jSONObject;
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public ExperimentalCronetEngine build() {
            return buildExperimental();
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            super.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            super.setDnsOptions(dnsOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setQuicOptions(QuicOptions quicOptions) {
            super.setQuicOptions(quicOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }
    }
}
