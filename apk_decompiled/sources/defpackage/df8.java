package defpackage;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectManager;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.datatypes.Record;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class df8 {
    public static /* bridge */ /* synthetic */ HandwritingGesture A(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ AggregateRecordsGroupedByDurationResponse i(Object obj) {
        return (AggregateRecordsGroupedByDurationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ AggregateRecordsGroupedByPeriodResponse j(Object obj) {
        return (AggregateRecordsGroupedByPeriodResponse) obj;
    }

    public static /* bridge */ /* synthetic */ AggregateRecordsResponse k(Object obj) {
        return (AggregateRecordsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ HealthConnectManager l(Object obj) {
        return (HealthConnectManager) obj;
    }

    public static /* bridge */ /* synthetic */ ReadRecordsResponse m(Object obj) {
        return (ReadRecordsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Record n(Object obj) {
        return (Record) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture o(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture p(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture q(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture r(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture s(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
