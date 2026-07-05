package com.segment.analytics.kotlin.core;

import defpackage.mdj;
import defpackage.x44;
import java.net.URL;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/AnalyticsError;", "", "NetworkUnknown", "SettingsFail", "Lcom/segment/analytics/kotlin/core/AnalyticsError$NetworkUnknown;", "Lcom/segment/analytics/kotlin/core/AnalyticsError$SettingsFail;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public abstract class AnalyticsError extends Throwable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/segment/analytics/kotlin/core/AnalyticsError$NetworkUnknown;", "Lcom/segment/analytics/kotlin/core/AnalyticsError;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class NetworkUnknown extends AnalyticsError {
        public final URL E;
        public final Exception F;

        public NetworkUnknown(URL url, Exception exc) {
            this.E = url;
            this.F = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkUnknown)) {
                return false;
            }
            NetworkUnknown networkUnknown = (NetworkUnknown) obj;
            return x44.r(this.E, networkUnknown.E) && x44.r(this.F, networkUnknown.F);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.F;
        }

        public final int hashCode() {
            URL url = this.E;
            int iHashCode = (url == null ? 0 : url.hashCode()) * 31;
            Exception exc = this.F;
            return iHashCode + (exc != null ? exc.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NetworkUnknown(uri=" + this.E + ", cause=" + this.F + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/segment/analytics/kotlin/core/AnalyticsError$SettingsFail;", "Lcom/segment/analytics/kotlin/core/AnalyticsError;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class SettingsFail extends AnalyticsError {
        public final NetworkUnknown E;

        public SettingsFail(NetworkUnknown networkUnknown) {
            this.E = networkUnknown;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SettingsFail) && x44.r(this.E, ((SettingsFail) obj).E);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.E;
        }

        public final int hashCode() {
            return this.E.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SettingsFail(cause=" + this.E + ')';
        }
    }
}
