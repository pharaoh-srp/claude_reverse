package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.HashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class q4k extends yxj implements u4k {
    public static u4k asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof u4k ? (u4k) iInterfaceQueryLocalInterface : new a5k(iBinder);
    }

    @Override // defpackage.yxj
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        x4k e5kVar = null;
        x4k e5kVar2 = null;
        x4k e5kVar3 = null;
        x4k e5kVar4 = null;
        o5k u5kVar = null;
        o5k u5kVar2 = null;
        o5k u5kVar3 = null;
        x4k e5kVar5 = null;
        x4k e5kVar6 = null;
        x4k e5kVar7 = null;
        x4k e5kVar8 = null;
        x4k e5kVar9 = null;
        x4k e5kVar10 = null;
        p5k d6kVar = null;
        x4k e5kVar11 = null;
        x4k e5kVar12 = null;
        x4k e5kVar13 = null;
        x4k e5kVar14 = null;
        x4k e5kVar15 = null;
        switch (i) {
            case 1:
                lu8 lu8VarF = cbc.F(parcel.readStrongBinder());
                y5k y5kVar = (y5k) qxj.a(parcel, y5k.CREATOR);
                long j = parcel.readLong();
                qxj.e(parcel);
                initialize(lu8VarF, y5kVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                boolean zG = qxj.g(parcel);
                boolean zG2 = qxj.g(parcel);
                long j2 = parcel.readLong();
                qxj.e(parcel);
                logEvent(string, string2, bundle, zG, zG2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar = iInterfaceQueryLocalInterface instanceof x4k ? (x4k) iInterfaceQueryLocalInterface : new e5k(strongBinder);
                }
                long j3 = parcel.readLong();
                qxj.e(parcel);
                logEventAndBundle(string3, string4, bundle2, e5kVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                lu8 lu8VarF2 = cbc.F(parcel.readStrongBinder());
                boolean zG3 = qxj.g(parcel);
                long j4 = parcel.readLong();
                qxj.e(parcel);
                setUserProperty(string5, string6, lu8VarF2, zG3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zG4 = qxj.g(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar15 = iInterfaceQueryLocalInterface2 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface2 : new e5k(strongBinder2);
                }
                qxj.e(parcel);
                getUserProperties(string7, string8, zG4, e5kVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar14 = iInterfaceQueryLocalInterface3 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface3 : new e5k(strongBinder3);
                }
                qxj.e(parcel);
                getMaxUserProperties(string9, e5kVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                qxj.e(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                qxj.e(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                qxj.e(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar13 = iInterfaceQueryLocalInterface4 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface4 : new e5k(strongBinder4);
                }
                qxj.e(parcel);
                getConditionalUserProperties(string13, string14, e5kVar13);
                break;
            case 11:
                boolean zG5 = qxj.g(parcel);
                long j7 = parcel.readLong();
                qxj.e(parcel);
                setMeasurementEnabled(zG5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                qxj.e(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                qxj.e(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                qxj.e(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                lu8 lu8VarF3 = cbc.F(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                qxj.e(parcel);
                setCurrentScreen(lu8VarF3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar12 = iInterfaceQueryLocalInterface5 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface5 : new e5k(strongBinder5);
                }
                qxj.e(parcel);
                getCurrentScreenName(e5kVar12);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar11 = iInterfaceQueryLocalInterface6 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface6 : new e5k(strongBinder6);
                }
                qxj.e(parcel);
                getCurrentScreenClass(e5kVar11);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    d6kVar = iInterfaceQueryLocalInterface7 instanceof p5k ? (p5k) iInterfaceQueryLocalInterface7 : new d6k(strongBinder7);
                }
                qxj.e(parcel);
                setInstanceIdProvider(d6kVar);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar10 = iInterfaceQueryLocalInterface8 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface8 : new e5k(strongBinder8);
                }
                qxj.e(parcel);
                getCachedAppInstanceId(e5kVar10);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar9 = iInterfaceQueryLocalInterface9 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface9 : new e5k(strongBinder9);
                }
                qxj.e(parcel);
                getAppInstanceId(e5kVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar8 = iInterfaceQueryLocalInterface10 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface10 : new e5k(strongBinder10);
                }
                qxj.e(parcel);
                getGmpAppId(e5kVar8);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar7 = iInterfaceQueryLocalInterface11 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface11 : new e5k(strongBinder11);
                }
                qxj.e(parcel);
                generateEventId(e5kVar7);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                qxj.e(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                qxj.e(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                lu8 lu8VarF4 = cbc.F(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                qxj.e(parcel);
                onActivityStarted(lu8VarF4, j14);
                break;
            case 26:
                lu8 lu8VarF5 = cbc.F(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                qxj.e(parcel);
                onActivityStopped(lu8VarF5, j15);
                break;
            case 27:
                lu8 lu8VarF6 = cbc.F(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                qxj.e(parcel);
                onActivityCreated(lu8VarF6, bundle5, j16);
                break;
            case 28:
                lu8 lu8VarF7 = cbc.F(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                qxj.e(parcel);
                onActivityDestroyed(lu8VarF7, j17);
                break;
            case 29:
                lu8 lu8VarF8 = cbc.F(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                qxj.e(parcel);
                onActivityPaused(lu8VarF8, j18);
                break;
            case 30:
                lu8 lu8VarF9 = cbc.F(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                qxj.e(parcel);
                onActivityResumed(lu8VarF9, j19);
                break;
            case 31:
                lu8 lu8VarF10 = cbc.F(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar6 = iInterfaceQueryLocalInterface12 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface12 : new e5k(strongBinder12);
                }
                long j20 = parcel.readLong();
                qxj.e(parcel);
                onActivitySaveInstanceState(lu8VarF10, e5kVar6, j20);
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                Bundle bundle6 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar5 = iInterfaceQueryLocalInterface13 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface13 : new e5k(strongBinder13);
                }
                long j21 = parcel.readLong();
                qxj.e(parcel);
                performAction(bundle6, e5kVar5, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                lu8 lu8VarF11 = cbc.F(parcel.readStrongBinder());
                lu8 lu8VarF12 = cbc.F(parcel.readStrongBinder());
                lu8 lu8VarF13 = cbc.F(parcel.readStrongBinder());
                qxj.e(parcel);
                logHealthData(i2, string19, lu8VarF11, lu8VarF12, lu8VarF13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u5kVar3 = iInterfaceQueryLocalInterface14 instanceof o5k ? (o5k) iInterfaceQueryLocalInterface14 : new u5k(strongBinder14);
                }
                qxj.e(parcel);
                setEventInterceptor(u5kVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u5kVar2 = iInterfaceQueryLocalInterface15 instanceof o5k ? (o5k) iInterfaceQueryLocalInterface15 : new u5k(strongBinder15);
                }
                qxj.e(parcel);
                registerOnMeasurementEventListener(u5kVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u5kVar = iInterfaceQueryLocalInterface16 instanceof o5k ? (o5k) iInterfaceQueryLocalInterface16 : new u5k(strongBinder16);
                }
                qxj.e(parcel);
                unregisterOnMeasurementEventListener(u5kVar);
                break;
            case 37:
                HashMap mapB = qxj.b(parcel);
                qxj.e(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar4 = iInterfaceQueryLocalInterface17 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface17 : new e5k(strongBinder17);
                }
                int i3 = parcel.readInt();
                qxj.e(parcel);
                getTestFlag(e5kVar4, i3);
                break;
            case 39:
                boolean zG6 = qxj.g(parcel);
                qxj.e(parcel);
                setDataCollectionEnabled(zG6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar3 = iInterfaceQueryLocalInterface18 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface18 : new e5k(strongBinder18);
                }
                qxj.e(parcel);
                isDataCollectionEnabled(e5kVar3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                qxj.e(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                qxj.e(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                qxj.e(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                qxj.e(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    e5kVar2 = iInterfaceQueryLocalInterface19 instanceof x4k ? (x4k) iInterfaceQueryLocalInterface19 : new e5k(strongBinder19);
                }
                qxj.e(parcel);
                getSessionId(e5kVar2);
                break;
            case mdj.f /* 48 */:
                Intent intent = (Intent) qxj.a(parcel, Intent.CREATOR);
                qxj.e(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 49:
                Bundle bundle10 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                qxj.e(parcel);
                setDefaultEventParametersWithBackfill(bundle10);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
