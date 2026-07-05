package com.datadog.android.rum.internal.domain.scope;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ebh;
import defpackage.fsh;
import defpackage.gid;
import defpackage.ij0;
import defpackage.ja9;
import defpackage.jph;
import defpackage.kgh;
import defpackage.kye;
import defpackage.mdj;
import defpackage.oxe;
import defpackage.qy1;
import defpackage.sq6;
import defpackage.uye;
import defpackage.vb7;
import defpackage.vye;
import defpackage.x44;
import defpackage.z9;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\"\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u0082\u0001\"$%&'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "ActionDropped", "ActionSent", "AddCustomTiming", "AddError", "AddFeatureFlagEvaluation", "AddLongTask", "AddViewLoadingTime", "AppStartEvent", "AppStartTTFDEvent", "AppStartTTIDEvent", "ApplicationStarted", "ErrorDropped", "ErrorSent", "LongTaskDropped", "LongTaskSent", "ResetSession", "ResourceDropped", "ResourceSent", "SdkInit", "SendCustomActionNow", "SetSyntheticsTestAttribute", "StartAction", "StartOperation", "StartResource", "StartView", "StopAction", "StopOperation", "StopResource", "StopResourceWithError", "StopView", "TelemetryEventWrapper", "UpdateExternalRefreshRate", "UpdatePerformanceMetric", "WebViewEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public abstract class RumRawEvent {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ActionDropped extends RumRawEvent {
        public final String a;
        public final jph b;

        public ActionDropped(String str) {
            jph jphVar = new jph();
            this.a = str;
            this.b = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionDropped)) {
                return false;
            }
            ActionDropped actionDropped = (ActionDropped) obj;
            return x44.r(this.a, actionDropped.a) && x44.r(this.b, actionDropped.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionDropped(viewId=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ActionSent extends RumRawEvent {
        public final String a;
        public final int b;
        public final z9 c;
        public final long d;
        public final jph e;

        public ActionSent(String str, int i, z9 z9Var, long j) {
            jph jphVar = new jph();
            this.a = str;
            this.b = i;
            this.c = z9Var;
            this.d = j;
            this.e = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionSent)) {
                return false;
            }
            ActionSent actionSent = (ActionSent) obj;
            return x44.r(this.a, actionSent.a) && this.b == actionSent.b && this.c == actionSent.c && this.d == actionSent.d && x44.r(this.e, actionSent.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + vb7.e((this.c.hashCode() + vb7.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbP = ij0.p("ActionSent(viewId=", this.a, this.b, ", frustrationCount=", ", type=");
            sbP.append(this.c);
            sbP.append(", eventEndTimestampInNanos=");
            sbP.append(this.d);
            sbP.append(", eventTime=");
            sbP.append(this.e);
            sbP.append(")");
            return sbP.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class AddCustomTiming extends RumRawEvent {
        public final String a;
        public final jph b;

        public AddCustomTiming(String str) {
            jph jphVar = new jph();
            this.a = str;
            this.b = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddCustomTiming)) {
                return false;
            }
            AddCustomTiming addCustomTiming = (AddCustomTiming) obj;
            return x44.r(this.a, addCustomTiming.a) && x44.r(this.b, addCustomTiming.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AddCustomTiming(name=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class AddError extends RumRawEvent {
        public final String a;
        public final int b;
        public final Throwable c;
        public final String d;
        public final boolean e;
        public final Map f;
        public final jph g;
        public final String h;
        public final int i;
        public final List j;
        public final Long k;

        public AddError(String str, int i, Throwable th, String str2, boolean z, Map map, jph jphVar, String str3, int i2, List list, Long l, int i3) {
            str3 = (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str3;
            i2 = (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 1 : i2;
            l = (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : l;
            str.getClass();
            sq6.a(i);
            sq6.a(i2);
            this.a = str;
            this.b = i;
            this.c = th;
            this.d = str2;
            this.e = z;
            this.f = map;
            this.g = jphVar;
            this.h = str3;
            this.i = i2;
            this.j = list;
            this.k = l;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddError)) {
                return false;
            }
            AddError addError = (AddError) obj;
            return x44.r(this.a, addError.a) && this.b == addError.b && x44.r(this.c, addError.c) && x44.r(this.d, addError.d) && this.e == addError.e && x44.r(this.f, addError.f) && x44.r(this.g, addError.g) && x44.r(this.h, addError.h) && this.i == addError.i && x44.r(this.j, addError.j) && x44.r(this.k, addError.k);
        }

        public final int hashCode() {
            int iC = qy1.c(this.b, this.a.hashCode() * 31, 31);
            Throwable th = this.c;
            int iHashCode = (iC + (th == null ? 0 : th.hashCode())) * 31;
            String str = this.d;
            int iHashCode2 = (this.g.hashCode() + ebh.g(fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
            String str2 = this.h;
            int iM = kgh.m(qy1.c(this.i, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.j);
            Long l = this.k;
            return iM + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbX = sq6.x("AddError(message=", this.a, ", source=");
            sbX.append(gid.B(this.b));
            sbX.append(", throwable=");
            sbX.append(this.c);
            sbX.append(", stacktrace=");
            gid.t(sbX, this.d, ", isFatal=", this.e, ", attributes=");
            sbX.append(this.f);
            sbX.append(", eventTime=");
            sbX.append(this.g);
            sbX.append(", type=");
            sbX.append(this.h);
            sbX.append(", sourceType=");
            sbX.append(gid.C(this.i));
            sbX.append(", threads=");
            sbX.append(this.j);
            sbX.append(", timeSinceAppStartNs=");
            sbX.append(this.k);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class AddFeatureFlagEvaluation extends RumRawEvent {
        public final String a;
        public final String b;
        public final jph c;

        public AddFeatureFlagEvaluation(String str, String str2) {
            jph jphVar = new jph();
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddFeatureFlagEvaluation)) {
                return false;
            }
            AddFeatureFlagEvaluation addFeatureFlagEvaluation = (AddFeatureFlagEvaluation) obj;
            return x44.r(this.a, addFeatureFlagEvaluation.a) && x44.r(this.b, addFeatureFlagEvaluation.b) && x44.r(this.c, addFeatureFlagEvaluation.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AddFeatureFlagEvaluation(name=" + this.a + ", value=" + ((Object) this.b) + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class AddLongTask extends RumRawEvent {
        public final long a;
        public final String b;
        public final jph c;

        public AddLongTask(long j, String str) {
            jph jphVar = new jph();
            str.getClass();
            this.a = j;
            this.b = str;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddLongTask)) {
                return false;
            }
            AddLongTask addLongTask = (AddLongTask) obj;
            return this.a == addLongTask.a && x44.r(this.b, addLongTask.b) && x44.r(this.c, addLongTask.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + kgh.l(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "AddLongTask(durationNs=" + this.a + ", target=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class AddViewLoadingTime extends RumRawEvent {
        public final jph a;

        public AddViewLoadingTime(jph jphVar) {
            this.a = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddViewLoadingTime) && this.a.equals(((AddViewLoadingTime) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return "AddViewLoadingTime(overwrite=false, eventTime=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class AppStartEvent extends RumRawEvent {
        public final uye a;
        public final jph b;

        public AppStartEvent(uye uyeVar) {
            jph jphVar = new jph();
            this.a = uyeVar;
            this.b = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class AppStartTTFDEvent extends RumRawEvent {
        public final jph a = new jph();

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class AppStartTTIDEvent extends RumRawEvent {
        public final jph a = new jph();
        public final vye b;

        public AppStartTTIDEvent(vye vyeVar) {
            this.b = vyeVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ApplicationStarted extends RumRawEvent {
        public final jph a;
        public final long b;

        public ApplicationStarted(jph jphVar, long j) {
            this.a = jphVar;
            this.b = j;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationStarted)) {
                return false;
            }
            ApplicationStarted applicationStarted = (ApplicationStarted) obj;
            return this.a.equals(applicationStarted.a) && this.b == applicationStarted.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ApplicationStarted(eventTime=" + this.a + ", applicationStartupNanos=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ErrorDropped extends RumRawEvent {
        public final String a;
        public final String b;
        public final jph c;

        public ErrorDropped(String str, String str2) {
            jph jphVar = new jph();
            this.a = str;
            this.b = str2;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorDropped)) {
                return false;
            }
            ErrorDropped errorDropped = (ErrorDropped) obj;
            return x44.r(this.a, errorDropped.a) && x44.r(this.b, errorDropped.b) && x44.r(this.c, errorDropped.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbR = kgh.r("ErrorDropped(viewId=", this.a, ", resourceId=", this.b, ", eventTime=");
            sbR.append(this.c);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ErrorSent extends RumRawEvent {
        public final String a;
        public final String b;
        public final Long c;
        public final jph d;

        public ErrorSent(String str, String str2, Long l) {
            jph jphVar = new jph();
            this.a = str;
            this.b = str2;
            this.c = l;
            this.d = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorSent)) {
                return false;
            }
            ErrorSent errorSent = (ErrorSent) obj;
            return x44.r(this.a, errorSent.a) && x44.r(this.b, errorSent.b) && x44.r(this.c, errorSent.c) && x44.r(this.d, errorSent.d);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.c;
            return this.d.hashCode() + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbR = kgh.r("ErrorSent(viewId=", this.a, ", resourceId=", this.b, ", resourceEndTimestampInNanos=");
            sbR.append(this.c);
            sbR.append(", eventTime=");
            sbR.append(this.d);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class LongTaskDropped extends RumRawEvent {
        public final String a;
        public final boolean b;
        public final jph c;

        public LongTaskDropped(String str, boolean z) {
            jph jphVar = new jph();
            this.a = str;
            this.b = z;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTaskDropped)) {
                return false;
            }
            LongTaskDropped longTaskDropped = (LongTaskDropped) obj;
            return x44.r(this.a, longTaskDropped.a) && this.b == longTaskDropped.b && x44.r(this.c, longTaskDropped.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fsh.p(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "LongTaskDropped(viewId=" + this.a + ", isFrozenFrame=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class LongTaskSent extends RumRawEvent {
        public final String a;
        public final boolean b;
        public final jph c;

        public LongTaskSent(String str, boolean z) {
            jph jphVar = new jph();
            this.a = str;
            this.b = z;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTaskSent)) {
                return false;
            }
            LongTaskSent longTaskSent = (LongTaskSent) obj;
            return x44.r(this.a, longTaskSent.a) && this.b == longTaskSent.b && x44.r(this.c, longTaskSent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fsh.p(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "LongTaskSent(viewId=" + this.a + ", isFrozenFrame=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ResetSession extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ResourceDropped extends RumRawEvent {
        public final String a;
        public final String b;
        public final jph c;

        public ResourceDropped(String str, String str2) {
            jph jphVar = new jph();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceDropped)) {
                return false;
            }
            ResourceDropped resourceDropped = (ResourceDropped) obj;
            return x44.r(this.a, resourceDropped.a) && x44.r(this.b, resourceDropped.b) && x44.r(this.c, resourceDropped.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbR = kgh.r("ResourceDropped(viewId=", this.a, ", resourceId=", this.b, ", eventTime=");
            sbR.append(this.c);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class ResourceSent extends RumRawEvent {
        public final String a;
        public final String b;
        public final long c;
        public final jph d;

        public ResourceSent(String str, String str2, long j) {
            jph jphVar = new jph();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceSent)) {
                return false;
            }
            ResourceSent resourceSent = (ResourceSent) obj;
            return x44.r(this.a, resourceSent.a) && x44.r(this.b, resourceSent.b) && this.c == resourceSent.c && x44.r(this.d, resourceSent.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + vb7.e(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbR = kgh.r("ResourceSent(viewId=", this.a, ", resourceId=", this.b, ", resourceEndTimestampInNanos=");
            sbR.append(this.c);
            sbR.append(", eventTime=");
            sbR.append(this.d);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class SdkInit extends RumRawEvent {
        public final boolean a;
        public final jph b;

        public SdkInit(boolean z) {
            jph jphVar = new jph();
            this.a = z;
            this.b = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SdkInit)) {
                return false;
            }
            SdkInit sdkInit = (SdkInit) obj;
            return this.a == sdkInit.a && x44.r(this.b, sdkInit.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "SdkInit(isAppInForeground=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class SendCustomActionNow extends RumRawEvent {
        public final jph a = new jph();

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendCustomActionNow) && x44.r(this.a, ((SendCustomActionNow) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendCustomActionNow(eventTime=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class SetSyntheticsTestAttribute extends RumRawEvent {
        public final String a;
        public final String b;
        public final jph c;

        public SetSyntheticsTestAttribute(String str, String str2) {
            jph jphVar = new jph();
            this.a = str;
            this.b = str2;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSyntheticsTestAttribute)) {
                return false;
            }
            SetSyntheticsTestAttribute setSyntheticsTestAttribute = (SetSyntheticsTestAttribute) obj;
            return x44.r(this.a, setSyntheticsTestAttribute.a) && x44.r(this.b, setSyntheticsTestAttribute.b) && x44.r(this.c, setSyntheticsTestAttribute.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbR = kgh.r("SetSyntheticsTestAttribute(testId=", this.a, ", resultId=", this.b, ", eventTime=");
            sbR.append(this.c);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StartAction extends RumRawEvent {
        public final oxe a;
        public final String b;
        public final boolean c;
        public final Map d;
        public final jph e;

        public StartAction(oxe oxeVar, String str, boolean z, Map map, jph jphVar) {
            str.getClass();
            this.a = oxeVar;
            this.b = str;
            this.c = z;
            this.d = map;
            this.e = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartAction)) {
                return false;
            }
            StartAction startAction = (StartAction) obj;
            return this.a == startAction.a && x44.r(this.b, startAction.b) && this.c == startAction.c && this.d.equals(startAction.d) && this.e.equals(startAction.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ebh.g(fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "StartAction(type=" + this.a + ", name=" + this.b + ", waitForStop=" + this.c + ", attributes=" + this.d + ", eventTime=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StartOperation extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StartResource extends RumRawEvent {
        public final String a;
        public final String b;
        public final int c;
        public final Map d;
        public final jph e;

        public StartResource(String str, String str2, int i, Map map, jph jphVar) {
            str2.getClass();
            sq6.a(i);
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = map;
            this.e = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartResource)) {
                return false;
            }
            StartResource startResource = (StartResource) obj;
            return this.a.equals(startResource.a) && x44.r(this.b, startResource.b) && this.c == startResource.c && this.d.equals(startResource.d) && this.e.equals(startResource.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ebh.g(qy1.c(this.c, kgh.l(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        }

        public final String toString() {
            return "StartResource(key=" + ((Object) this.a) + ", url=" + this.b + ", method=" + gid.E(this.c) + ", attributes=" + this.d + ", eventTime=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StartView extends RumRawEvent {
        public final kye a;
        public final Map b;
        public final jph c;

        public StartView(kye kyeVar, Map map, jph jphVar) {
            kyeVar.getClass();
            map.getClass();
            this.a = kyeVar;
            this.b = map;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartView)) {
                return false;
            }
            StartView startView = (StartView) obj;
            return x44.r(this.a, startView.a) && x44.r(this.b, startView.b) && this.c.equals(startView.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ebh.g(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "StartView(key=" + this.a + ", attributes=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StopAction extends RumRawEvent {
        public final oxe a;
        public final Map b;
        public final jph c;

        public StopAction(oxe oxeVar, Map map, jph jphVar) {
            this.a = oxeVar;
            this.b = map;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopAction)) {
                return false;
            }
            StopAction stopAction = (StopAction) obj;
            return this.a == stopAction.a && this.b.equals(stopAction.b) && this.c.equals(stopAction.c);
        }

        public final int hashCode() {
            oxe oxeVar = this.a;
            return this.c.hashCode() + ebh.g((oxeVar == null ? 0 : oxeVar.hashCode()) * 961, 31, this.b);
        }

        public final String toString() {
            return "StopAction(type=" + this.a + ", name=, attributes=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StopOperation extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StopResource extends RumRawEvent {
        public final String a;
        public final Long b;
        public final Long c;
        public final int d;
        public final Map e;
        public final jph f;

        public StopResource(String str, Long l, Long l2, int i, Map map, jph jphVar) {
            sq6.a(i);
            this.a = str;
            this.b = l;
            this.c = l2;
            this.d = i;
            this.e = map;
            this.f = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopResource)) {
                return false;
            }
            StopResource stopResource = (StopResource) obj;
            return this.a.equals(stopResource.a) && x44.r(this.b, stopResource.b) && x44.r(this.c, stopResource.c) && this.d == stopResource.d && this.e.equals(stopResource.e) && this.f.equals(stopResource.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Long l = this.b;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.c;
            return this.f.hashCode() + ebh.g(qy1.c(this.d, (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31), 31, this.e);
        }

        public final String toString() {
            return "StopResource(key=" + ((Object) this.a) + ", statusCode=" + this.b + ", size=" + this.c + ", kind=" + gid.D(this.d) + ", attributes=" + this.e + ", eventTime=" + this.f + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StopResourceWithError extends RumRawEvent {
        public final String a;
        public final Long b;
        public final String c;
        public final int d;
        public final Throwable e;
        public final Map f;
        public final jph g;

        public StopResourceWithError(String str, Long l, String str2, int i, Throwable th, Map map, jph jphVar) {
            sq6.a(i);
            this.a = str;
            this.b = l;
            this.c = str2;
            this.d = i;
            this.e = th;
            this.f = map;
            this.g = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopResourceWithError)) {
                return false;
            }
            StopResourceWithError stopResourceWithError = (StopResourceWithError) obj;
            return this.a.equals(stopResourceWithError.a) && x44.r(this.b, stopResourceWithError.b) && this.c.equals(stopResourceWithError.c) && this.d == stopResourceWithError.d && this.e.equals(stopResourceWithError.e) && this.f.equals(stopResourceWithError.f) && this.g.equals(stopResourceWithError.g);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Long l = this.b;
            return this.g.hashCode() + ebh.g((this.e.hashCode() + qy1.c(this.d, kgh.l((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31)) * 31, 31, this.f);
        }

        public final String toString() {
            return "StopResourceWithError(key=" + ((Object) this.a) + ", statusCode=" + this.b + ", message=" + this.c + ", source=" + gid.B(this.d) + ", throwable=" + this.e + ", attributes=" + this.f + ", eventTime=" + this.g + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class StopView extends RumRawEvent {
        public final kye a;
        public final Map b;
        public final jph c;

        public StopView(kye kyeVar, Map map, jph jphVar) {
            this.a = kyeVar;
            this.b = map;
            this.c = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopView)) {
                return false;
            }
            StopView stopView = (StopView) obj;
            return this.a.equals(stopView.a) && this.b.equals(stopView.b) && this.c.equals(stopView.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ebh.g(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "StopView(key=" + this.a + ", attributes=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class TelemetryEventWrapper extends RumRawEvent {
        public final ja9 a;
        public final jph b;

        public TelemetryEventWrapper(ja9 ja9Var) {
            jph jphVar = new jph();
            this.a = ja9Var;
            this.b = jphVar;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TelemetryEventWrapper)) {
                return false;
            }
            TelemetryEventWrapper telemetryEventWrapper = (TelemetryEventWrapper) obj;
            return x44.r(this.a, telemetryEventWrapper.a) && x44.r(this.b, telemetryEventWrapper.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TelemetryEventWrapper(event=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class UpdateExternalRefreshRate extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class UpdatePerformanceMetric extends RumRawEvent {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final /* data */ class WebViewEvent extends RumRawEvent {
        public final jph a = new jph();

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final jph getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebViewEvent) && x44.r(this.a, ((WebViewEvent) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WebViewEvent(eventTime=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract jph getA();
}
