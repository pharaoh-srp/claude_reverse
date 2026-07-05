package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface u4k extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(x4k x4kVar);

    void getAppInstanceId(x4k x4kVar);

    void getCachedAppInstanceId(x4k x4kVar);

    void getConditionalUserProperties(String str, String str2, x4k x4kVar);

    void getCurrentScreenClass(x4k x4kVar);

    void getCurrentScreenName(x4k x4kVar);

    void getGmpAppId(x4k x4kVar);

    void getMaxUserProperties(String str, x4k x4kVar);

    void getSessionId(x4k x4kVar);

    void getTestFlag(x4k x4kVar, int i);

    void getUserProperties(String str, String str2, boolean z, x4k x4kVar);

    void initForTests(Map map);

    void initialize(lu8 lu8Var, y5k y5kVar, long j);

    void isDataCollectionEnabled(x4k x4kVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, x4k x4kVar, long j);

    void logHealthData(int i, String str, lu8 lu8Var, lu8 lu8Var2, lu8 lu8Var3);

    void onActivityCreated(lu8 lu8Var, Bundle bundle, long j);

    void onActivityDestroyed(lu8 lu8Var, long j);

    void onActivityPaused(lu8 lu8Var, long j);

    void onActivityResumed(lu8 lu8Var, long j);

    void onActivitySaveInstanceState(lu8 lu8Var, x4k x4kVar, long j);

    void onActivityStarted(lu8 lu8Var, long j);

    void onActivityStopped(lu8 lu8Var, long j);

    void performAction(Bundle bundle, x4k x4kVar, long j);

    void registerOnMeasurementEventListener(o5k o5kVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(lu8 lu8Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setDefaultEventParametersWithBackfill(Bundle bundle);

    void setEventInterceptor(o5k o5kVar);

    void setInstanceIdProvider(p5k p5kVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, lu8 lu8Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(o5k o5kVar);
}
