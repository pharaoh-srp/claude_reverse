package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItemPointsItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItem;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItemError;
import com.anthropic.claude.tool.model.EventDeleteDetails;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError;
import com.anthropic.claude.tool.model.EventUpdateDetails;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItem;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Iterator;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c32 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ c32(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Double dValueOf = null;
        switch (i) {
            case 0:
                ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj;
                modelSelectorEntry.getClass();
                return modelSelectorEntry.m364getIdi4oh0I();
            case 1:
                ((String) obj).getClass();
                return ieiVar;
            case 2:
                EventCreateV1OutputEventCreateV1ResultCreateResultsItem eventCreateV1OutputEventCreateV1ResultCreateResultsItem = (EventCreateV1OutputEventCreateV1ResultCreateResultsItem) obj;
                eventCreateV1OutputEventCreateV1ResultCreateResultsItem.getClass();
                return Boolean.valueOf(eventCreateV1OutputEventCreateV1ResultCreateResultsItem.getError() != null);
            case 3:
                EventCreateV1OutputEventCreateV1ResultCreateResultsItem eventCreateV1OutputEventCreateV1ResultCreateResultsItem2 = (EventCreateV1OutputEventCreateV1ResultCreateResultsItem) obj;
                eventCreateV1OutputEventCreateV1ResultCreateResultsItem2.getClass();
                EventCreateV1OutputEventCreateV1ResultCreateResultsItemError error = eventCreateV1OutputEventCreateV1ResultCreateResultsItem2.getError();
                if (error != null) {
                    return error.getError_type();
                }
                return null;
            case 4:
                EventCreateV1OutputEventCreateV1ResultCreateResultsItem eventCreateV1OutputEventCreateV1ResultCreateResultsItem3 = (EventCreateV1OutputEventCreateV1ResultCreateResultsItem) obj;
                eventCreateV1OutputEventCreateV1ResultCreateResultsItem3.getClass();
                EventCreateV1OutputEventCreateV1ResultCreateResultsItemError error2 = eventCreateV1OutputEventCreateV1ResultCreateResultsItem3.getError();
                if (error2 != null) {
                    return error2.getMessage();
                }
                return null;
            case 5:
                EventDeleteV0OutputEventDeleteResultDeleteResultsItem eventDeleteV0OutputEventDeleteResultDeleteResultsItem = (EventDeleteV0OutputEventDeleteResultDeleteResultsItem) obj;
                eventDeleteV0OutputEventDeleteResultDeleteResultsItem.getClass();
                return Boolean.valueOf(eventDeleteV0OutputEventDeleteResultDeleteResultsItem.getError() != null);
            case 6:
                EventDeleteV0OutputEventDeleteResultDeleteResultsItem eventDeleteV0OutputEventDeleteResultDeleteResultsItem2 = (EventDeleteV0OutputEventDeleteResultDeleteResultsItem) obj;
                eventDeleteV0OutputEventDeleteResultDeleteResultsItem2.getClass();
                EventDeleteV0OutputEventDeleteResultDeleteResultsItemError error3 = eventDeleteV0OutputEventDeleteResultDeleteResultsItem2.getError();
                if (error3 != null) {
                    return error3.getError_type();
                }
                return null;
            case 7:
                EventDeleteV0OutputEventDeleteResultDeleteResultsItem eventDeleteV0OutputEventDeleteResultDeleteResultsItem3 = (EventDeleteV0OutputEventDeleteResultDeleteResultsItem) obj;
                eventDeleteV0OutputEventDeleteResultDeleteResultsItem3.getClass();
                EventDeleteV0OutputEventDeleteResultDeleteResultsItemError error4 = eventDeleteV0OutputEventDeleteResultDeleteResultsItem3.getError();
                if (error4 != null) {
                    return error4.getMessage();
                }
                return null;
            case 8:
                EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem = (EventUpdateV0OutputEventUpdateResultUpdateResultsItem) obj;
                eventUpdateV0OutputEventUpdateResultUpdateResultsItem.getClass();
                return Boolean.valueOf(eventUpdateV0OutputEventUpdateResultUpdateResultsItem.getError() != null);
            case 9:
                EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem2 = (EventUpdateV0OutputEventUpdateResultUpdateResultsItem) obj;
                eventUpdateV0OutputEventUpdateResultUpdateResultsItem2.getClass();
                EventUpdateV0OutputEventUpdateResultUpdateResultsItemError error5 = eventUpdateV0OutputEventUpdateResultUpdateResultsItem2.getError();
                if (error5 != null) {
                    return error5.getError_type();
                }
                return null;
            case 10:
                EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem3 = (EventUpdateV0OutputEventUpdateResultUpdateResultsItem) obj;
                eventUpdateV0OutputEventUpdateResultUpdateResultsItem3.getClass();
                EventUpdateV0OutputEventUpdateResultUpdateResultsItemError error6 = eventUpdateV0OutputEventUpdateResultUpdateResultsItem3.getError();
                if (error6 != null) {
                    return error6.getMessage();
                }
                return null;
            case 11:
                ((EventUpdateDetails) obj).getClass();
                return "calendar_update_event";
            case 12:
                ((EventDeleteDetails) obj).getClass();
                return "calendar_delete_event";
            case 13:
                ((EventCreateV1InputNewEventsItem) obj).getClass();
                return "calendar_create_event";
            case 14:
                k82 k82Var = (k82) obj;
                k82Var.getClass();
                return k82Var.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((k82) obj).getClass();
                return "item";
            case 16:
                k82 k82Var2 = (k82) obj;
                k82Var2.getClass();
                return k82Var2.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((k82) obj).getClass();
                return "item";
            case g.AVG_FIELD_NUMBER /* 18 */:
                CameraPosition cameraPosition = (CameraPosition) obj;
                cameraPosition.getClass();
                return new ka2(cameraPosition);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((uub) obj).getClass();
                return new fe2();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ed2 ed2Var = (ed2) obj;
                ed2Var.getClass();
                Iterator it = ed2Var.a.iterator();
                while (it.hasNext()) {
                    double dC = ((ee2) it.next()).c();
                    if (dValueOf != null) {
                        dC = pmk.e(dValueOf.doubleValue(), dC);
                    }
                    dValueOf = Double.valueOf(dC);
                }
                return Double.valueOf(dValueOf != null ? dValueOf.doubleValue() : 1.0d);
            case 21:
                return Integer.valueOf(-((Integer) obj).intValue());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Integer.valueOf(-((Integer) obj).intValue());
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                e6i e6iVar = (e6i) obj;
                e6iVar.getClass();
                swb swbVar = e6iVar.d;
                return Boolean.valueOf(!((Boolean) swbVar.G.getValue()).booleanValue() && swbVar.L0());
            case 24:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.p(ekfVar, 0);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ChartDisplayV0InputSeriesItemPointsItem chartDisplayV0InputSeriesItemPointsItem = (ChartDisplayV0InputSeriesItemPointsItem) obj;
                chartDisplayV0InputSeriesItemPointsItem.getClass();
                return "(" + chartDisplayV0InputSeriesItemPointsItem.getX() + ", " + chartDisplayV0InputSeriesItemPointsItem.getY() + ")";
            case 26:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                return ij0.j("\n\n", ovaVar.c(), "\n\n");
            case 27:
                ((i90) obj).getClass();
                return ul3.e;
            case 28:
                ((i90) obj).getClass();
                return ul3.e;
            default:
                ((Uri) obj).getClass();
                return Boolean.FALSE;
        }
    }
}
