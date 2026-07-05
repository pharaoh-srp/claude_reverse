package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abh {
    public final int A;
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final Boolean k;
    public final Long l;
    public final Boolean m;
    public final Long n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    public final Boolean r;
    public final Long s;
    public final Long t;
    public final Long u;
    public final String v;
    public final String w;
    public final Boolean x;
    public final Long y;
    public final Long z;

    public abh(Long l, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, Boolean bool4, Long l5, int i, Boolean bool5, Long l6, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l7, Long l8, Long l9, String str4, String str5, Boolean bool10, Long l10, Long l11) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = bool;
        this.f = bool2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = bool3;
        this.k = bool4;
        this.l = l5;
        this.A = i;
        this.m = bool5;
        this.n = l6;
        this.o = bool6;
        this.p = bool7;
        this.q = bool8;
        this.r = bool9;
        this.s = l7;
        this.t = l8;
        this.u = l9;
        this.v = str4;
        this.w = str5;
        this.x = bool10;
        this.y = l10;
        this.z = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abh)) {
            return false;
        }
        abh abhVar = (abh) obj;
        if (!x44.r(this.a, abhVar.a) || !x44.r(this.b, abhVar.b) || !x44.r(this.c, abhVar.c) || !x44.r(this.d, abhVar.d) || !x44.r(this.e, abhVar.e) || !this.f.equals(abhVar.f) || !x44.r(this.g, abhVar.g) || !x44.r(this.h, abhVar.h) || !x44.r(this.i, abhVar.i) || !x44.r(this.j, abhVar.j) || !this.k.equals(abhVar.k) || !x44.r(this.l, abhVar.l)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        if (!obj2.equals(obj2) || this.A != abhVar.A || !x44.r(this.m, abhVar.m) || !x44.r(this.n, abhVar.n) || !this.o.equals(abhVar.o) || !this.p.equals(abhVar.p) || !this.q.equals(abhVar.q) || !this.r.equals(abhVar.r) || !this.s.equals(abhVar.s) || !this.t.equals(abhVar.t) || !this.u.equals(abhVar.u) || !x44.r(this.v, abhVar.v) || !x44.r(this.w, abhVar.w) || !this.x.equals(abhVar.x) || !x44.r(this.y, abhVar.y) || !x44.r(this.z, abhVar.z)) {
            return false;
        }
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3) && obj2.equals(obj2);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 29791;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 923521;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 29791;
        Boolean bool = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31)) * (-67006753);
        String str = this.g;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 28629151;
        Boolean bool2 = this.j;
        int iHashCode9 = (this.k.hashCode() + ((iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 961)) * 29791;
        Long l5 = this.l;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 29791;
        Boolean bool3 = Boolean.FALSE;
        int iHashCode11 = (bool3.hashCode() + iHashCode10) * 31;
        int i = this.A;
        int iF = (iHashCode11 + (i == 0 ? 0 : sq6.F(i))) * 29791;
        Boolean bool4 = this.m;
        int iHashCode12 = (iF + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l6 = this.n;
        int iHashCode13 = (this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((iHashCode12 + (l6 == null ? 0 : l6.hashCode())) * 31)) * 31)) * 31)) * 29791)) * 28629151)) * 31)) * 31)) * (-196513505);
        String str4 = this.v;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.w;
        int iHashCode15 = (this.x.hashCode() + ((iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 29791)) * 31;
        Long l7 = this.y;
        int iHashCode16 = (iHashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.z;
        return (bool3.hashCode() + ((Boolean.TRUE.hashCode() + ((iHashCode16 + (l8 != null ? l8.hashCode() : 0)) * 961)) * 31)) * (-196513505);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("Configuration(sessionSampleRate=");
        sb.append(this.a);
        sb.append(", telemetrySampleRate=");
        sb.append(this.b);
        sb.append(", telemetryConfigurationSampleRate=null, telemetryUsageSampleRate=null, traceSampleRate=");
        sb.append(this.c);
        sb.append(", traceContextInjection=");
        sb.append("null");
        sb.append(", premiumSampleRate=null, replaySampleRate=null, sessionReplaySampleRate=");
        sb.append(this.d);
        sb.append(", trackingConsent=");
        sb.append("null");
        sb.append(", startSessionReplayRecordingManually=null, startRecordingImmediately=");
        ebh.C(sb, this.e, ", useProxy=", this.f, ", useBeforeSend=null, silentMultipleInit=null, trackSessionAcrossSubdomains=null, trackResources=null, trackEarlyRequests=null, trackLongTask=null, trackBfcacheViews=null, useCrossSiteSessionCookie=null, usePartitionedCrossSiteSessionCookie=null, useSecureSessionCookie=null, allowFallbackToLocalStorage=null, sessionPersistence=");
        kgh.u(sb, "null", ", storeContextsAcrossPages=null, allowUntrustedEvents=null, actionNameAttribute=null, useAllowedTracingOrigins=null, useAllowedTracingUrls=null, useAllowedGraphQlUrls=null, useTrackGraphQlPayload=null, useTrackGraphQlResponseErrors=null, selectedTracingPropagators=null, defaultPrivacyLevel=null, textAndInputPrivacyLevel=", this.g, ", imagePrivacyLevel=");
        kgh.u(sb, this.h, ", touchPrivacyLevel=", this.i, ", enablePrivacyForActionName=null, useExcludedActivityUrls=null, useWorkerUrl=null, compressIntakeRequests=null, trackFrustrations=");
        ebh.C(sb, this.j, ", trackViewsManually=null, trackInteractions=", this.k, ", trackUserInteractions=null, forwardErrorsToLogs=null, numberOfDisplays=");
        sb.append(this.l);
        sb.append(", forwardConsoleLogs=null, forwardReports=null, useLocalEncryption=");
        sb.append(bool);
        sb.append(", viewTrackingStrategy=");
        int i = this.A;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NAVIGATIONVIEWTRACKINGSTRATEGY" : "MIXEDVIEWTRACKINGSTRATEGY" : "FRAGMENTVIEWTRACKINGSTRATEGY" : "ACTIVITYVIEWTRACKINGSTRATEGY");
        sb.append(", swiftuiViewTrackingEnabled=null, swiftuiActionTrackingEnabled=null, trackBackgroundEvents=");
        sb.append(this.m);
        sb.append(", mobileVitalsUpdatePeriod=");
        sb.append(this.n);
        sb.append(", trackErrors=");
        sb.append(this.o);
        sb.append(", trackNetworkRequests=");
        ebh.C(sb, this.p, ", useTracing=", this.q, ", trackNativeViews=null, trackNativeErrors=null, trackNativeLongTasks=");
        sb.append(this.r);
        sb.append(", trackCrossPlatformLongTasks=null, useFirstPartyHosts=null, initializationType=null, trackFlutterPerformance=null, batchSize=");
        sb.append(this.s);
        sb.append(", batchUploadFrequency=");
        sb.append(this.t);
        sb.append(", batchProcessingLevel=");
        sb.append(this.u);
        sb.append(", backgroundTasksEnabled=null, reactVersion=null, reactNativeVersion=null, dartVersion=null, unityVersion=null, mauiVersion=null, appHangThreshold=null, usePciIntake=null, tracerApi=");
        kgh.u(sb, this.v, ", tracerApiVersion=", this.w, ", sendLogsAfterSessionExpiration=null, plugins=null, isMainProcess=");
        sb.append(this.x);
        sb.append(", invTimeThresholdMs=");
        sb.append(this.y);
        sb.append(", tnsTimeThresholdMs=");
        sb.append(this.z);
        sb.append(", trackFeatureFlagsForEvents=null, trackAnonymousUser=");
        sb.append(bool2);
        sb.append(", useAllowedTrackingOrigins=");
        sb.append(bool);
        sb.append(", sdkVersion=null, source=null, variant=null, remoteConfigurationId=null, useRemoteConfigurationProxy=null, profilingSampleRate=null, propagateTraceBaggage=null, trackResourceHeaders=");
        sb.append("null");
        sb.append(", betaEncodeCookieOptions=null)");
        return sb.toString();
    }
}
