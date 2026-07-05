package defpackage;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import com.anthropic.claude.api.events.HealthMetricEventConfig;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregation;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationBucketBy;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResult;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;
import java.util.LinkedHashMap;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ij8 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ij8(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return HealthConnectQueryV0InputQueriesItemAggregation._childSerializers$_anonymous_();
            case 1:
                return HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem._init_$_anonymous_();
            case 2:
                return HealthConnectQueryV0InputQueriesItemAggregationBucketBy._init_$_anonymous_();
            case 3:
                return HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType._init_$_anonymous_();
            case 4:
                return HealthConnectQueryV0OutputHealthConnectQueryResult._childSerializers$_anonymous_();
            case 5:
                return HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem._childSerializers$_anonymous_();
            case 6:
                return HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem._childSerializers$_anonymous_$0();
            case 7:
                return HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem._childSerializers$_anonymous_();
            case 8:
                return HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType._init_$_anonymous_();
            case 9:
                return HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType._init_$_anonymous_();
            case 10:
                return x44.X(nng.j, c96.j, wb.j, b3i.j, ip7.j, jk6.j, t9j.j, big.j, kng.j, re5.j, kad.j, e9j.j, hm8.j, gt1.j, b2a.j, nt1.j, lt1.j, dd1.j, vl8.j, bre.j, yl8.j, xs1.j, v1h.j, g36.j, qs1.j, pmc.j, lqe.j, it1.j, bd1.j, q0j.j, ct8.j, lac.j, nac.j, mac.j, jac.j, iac.j, p9g.j, kg2.j, ocb.j, qcb.j, kmc.j, i89.j, pzf.j, m67.j, o4d.j, nkb.j, d9g.j);
            case 11:
                u0h u0hVar = sk8.h;
                List listF = gsk.f();
                int iD0 = tta.d0(x44.y(listF, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 >= 16 ? iD0 : 16);
                for (Object obj : listF) {
                    linkedHashMap.put(((sk8) obj).a, obj);
                }
                return linkedHashMap;
            case 12:
                return HealthMetricAction._init_$_anonymous_();
            case 13:
                return HealthMetricEventConfig._childSerializers$_anonymous_();
            case 14:
                return HealthMetricOutcome._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return HealthMetricReport._childSerializers$_anonymous_();
            case 16:
                return HealthMetricReport._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return HostContext._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return (r20) rx8.a.getValue();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return sf5.c(1, 1, 0, 28);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new oy8("emptyImageVector", 1.0f, 1.0f, 1.0f, 1.0f, 0L, 0, false, 224).e();
            case 21:
                return new BitmapPainter((r20) rx8.a.getValue());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return (bpc) rx8.c.getValue();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (py8) rx8.b.getValue();
            case 24:
                return mpk.P(Boolean.FALSE);
            case BuildConfig.VERSION_CODE /* 25 */:
                return Long.valueOf(System.nanoTime());
            case 26:
                return x44.W(InternalSettingsAppScreen.InternalSettings.INSTANCE);
            case 27:
                return InternalSettingsAppScreen.EndpointSelectionScreen._init_$_anonymous_();
            case 28:
                return InternalSettingsAppScreen.GrowthBookOverrideScreen._init_$_anonymous_();
            default:
                return InternalSettingsAppScreen.InternalSettings._init_$_anonymous_();
        }
    }
}
