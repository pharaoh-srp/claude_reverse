package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ask;
import defpackage.bk0;
import defpackage.dgj;
import defpackage.myj;
import defpackage.umk;
import defpackage.woj;
import defpackage.y5k;
import defpackage.zwk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final bk0 a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(umk umkVar) {
        this.a = new woj(umkVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (b == null) {
                        zwk zwkVar = (zwk) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (zwkVar != null) {
                            b = new AppMeasurement(zwkVar);
                        } else {
                            b = new AppMeasurement(umk.a(context, new y5k(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.d(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.c(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.e(str);
    }

    public long generateEventId() {
        return this.a.zza();
    }

    public String getAppInstanceId() {
        return this.a.h();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listM = this.a.m(str, str2);
        ArrayList arrayList = new ArrayList(listM == null ? 0 : listM.size());
        for (Bundle bundle : listM) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            dgj.v(bundle);
            conditionalUserProperty.mAppId = (String) ask.n(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) ask.n(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) ask.n(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = ask.n(bundle, ExperienceToggle.DEFAULT_PARAM_KEY, Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) ask.n(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) ask.n(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) ask.n(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) ask.n(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) ask.n(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) ask.n(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) ask.n(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) ask.n(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) ask.n(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) ask.n(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) ask.n(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) ask.n(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.l();
    }

    public String getCurrentScreenName() {
        return this.a.g();
    }

    public String getGmpAppId() {
        return this.a.j();
    }

    public int getMaxUserProperties(String str) {
        return this.a.b(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.i(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.k(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        dgj.v(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            ask.o(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.f(bundle);
    }

    public AppMeasurement(zwk zwkVar) {
        this.a = new myj(zwkVar);
    }
}
