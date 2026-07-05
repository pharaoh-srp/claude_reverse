package defpackage;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.health.connect.ReadRecordsRequest;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class nh8 {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ ReadRecordsRequest e(Object obj) {
        return (ReadRecordsRequest) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void o() {
        new DeletionRequest.Builder();
    }
}
