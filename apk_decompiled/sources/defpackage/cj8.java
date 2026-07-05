package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.chat.tool.PropertyDefinition;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Output;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cj8 extends dxh {
    public final Context e;
    public final String f;
    public final mc g;
    public final oi8 h;
    public final String i;
    public final ewh j;

    /* JADX WARN: Multi-variable type inference failed */
    public cj8(HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions, Context context, String str, mwh mwhVar, mc mcVar, oi8 oi8Var) {
        Tool.CustomTool customTool;
        super(mwhVar, HealthConnectQueryV0Input.Companion.serializer(), HealthConnectQueryV0Output.Companion.serializer());
        this.e = context;
        this.f = str;
        this.g = mcVar;
        this.h = oi8Var;
        this.i = hxh.u;
        if (healthConnectQueryInputDescriptions != null) {
            String tool_description = healthConnectQueryInputDescriptions.getTool_description();
            String description = healthConnectQueryInputDescriptions.getQueries().getDescription();
            String description2 = healthConnectQueryInputDescriptions.getQueries().getItems().getDescription();
            String description3 = healthConnectQueryInputDescriptions.getQueries().getItems().getAggregation().getDescription();
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            cpc cpcVar = new cpc("aggregation_types", new ArrayProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getAggregation().getAggregation_types(), (PropertyDefinition) new StringProperty((String) null, (List) null, (String) null, (Integer) null, (Integer) null, 31, (mq5) null), (Integer) objArr, (Integer) objArr2, 12, (mq5) (0 == true ? 1 : 0)));
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            List list = null;
            cpc cpcVar2 = new cpc("aggregation", new ObjectProperty(description3, sta.h0(cpcVar, new cpc("bucket_by", new StringProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getAggregation().getBucket_by(), x44.X("none", "duration", "period"), (String) objArr3, (Integer) objArr4, (Integer) null, 28, (mq5) null)), new cpc("bucket_duration_minutes", new IntegerProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getAggregation().getBucket_duration_minutes(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("bucket_period_days", new IntegerProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getAggregation().getBucket_period_days(), (Integer) null, (Integer) null, 6, (mq5) null))), list, 4, (mq5) null));
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            cpc cpcVar3 = new cpc("identifier", new StringProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getIdentifier(), list, (String) null, (Integer) objArr6, (Integer) null, 30, (mq5) objArr5));
            mq5 mq5Var = null;
            Integer num = null;
            List list2 = null;
            cpc cpcVar4 = new cpc("records", new ObjectProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getRecords().getDescription(), sta.h0(new cpc("limit", new IntegerProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getRecords().getLimit(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("page_token", new StringProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getRecords().getPage_token(), (List) null, (String) (0 == true ? 1 : 0), num, (Integer) null, 30, mq5Var))), list2, 4, (mq5) null));
            String description4 = healthConnectQueryInputDescriptions.getQueries().getItems().getTime_range().getDescription();
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            List list3 = null;
            Integer num2 = null;
            Integer num3 = null;
            Map mapSingletonMap = Collections.singletonMap("queries", new ArrayProperty(description, new ObjectProperty(description2, sta.h0(cpcVar2, cpcVar3, cpcVar4, new cpc("time_range", new ObjectProperty(description4, sta.h0(new cpc("end_time", new StringProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getTime_range().getEnd_time(), (List) (0 == true ? 1 : 0), (String) objArr8, (Integer) objArr7, num, 30, (mq5) null)), new cpc("start_time", new StringProperty(healthConnectQueryInputDescriptions.getQueries().getItems().getTime_range().getStart_time(), (List) objArr10, (String) objArr9, num, (Integer) null, 30, mq5Var))), list3, 4, (mq5) (0 == true ? 1 : 0)))), x44.W("identifier")), num2, num3, 12, (mq5) null));
            mapSingletonMap.getClass();
            customTool = new Tool.CustomTool("health_connect_query_v0", str, tool_description, new InputSchema("object", mapSingletonMap, x44.W("queries")));
        } else {
            customTool = null;
        }
        this.j = new ewh(customTool, new n78(15, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        e18 e18Var;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-624098388);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var2.f(lvhVar) : e18Var2.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i2 |= e18Var2.g(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.h(this) ? 67108864 : 33554432;
        }
        if (e18Var2.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            e18Var = e18Var2;
            ksk.c(dlbVar, z4, z3, lvhVar.d, iqbVar, e18Var, ((i2 >> 9) & 8078) | ((i2 >> 6) & 458752));
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 11);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        return new HealthConnectQueryV0OutputHealthConnectQueryError(HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.SYSTEM_PERMISSION_DENIED, "User denied Health Connect access in app.");
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        HealthConnectQueryV0Output healthConnectQueryV0Output = (HealthConnectQueryV0Output) obj;
        healthConnectQueryV0Output.getClass();
        if (!(healthConnectQueryV0Output instanceof HealthConnectQueryV0OutputHealthConnectQueryError)) {
            return null;
        }
        HealthConnectQueryV0OutputHealthConnectQueryError healthConnectQueryV0OutputHealthConnectQueryError = (HealthConnectQueryV0OutputHealthConnectQueryError) healthConnectQueryV0Output;
        return new bxh(healthConnectQueryV0OutputHealthConnectQueryError.getError_type().getLoggingName(), healthConnectQueryV0OutputHealthConnectQueryError.getMessage());
    }

    @Override // defpackage.dxh
    public final rok l() {
        return zxh.F;
    }

    @Override // defpackage.dxh
    public final Object m(tp4 tp4Var, Context context, String str) {
        String string = context.getString(R.string.health_connect_query_preview_label);
        string.getClass();
        String string2 = context.getString(R.string.health_connect_query_preview_description);
        string2.getClass();
        return new MobileAppToolPreviewInfo(R.drawable.health_connect, string, string2, null);
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.j;
    }

    @Override // defpackage.dxh
    public final int p() {
        return R.drawable.health_connect;
    }

    @Override // defpackage.dxh
    public final d54 q() {
        return new d54(d54.h);
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.i;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.f;
    }

    @Override // defpackage.dxh
    public final String t(dlb dlbVar) {
        List<HealthConnectQueryV0InputQueriesItem> queries;
        HealthConnectQueryV0Input healthConnectQueryV0Input = (HealthConnectQueryV0Input) dlbVar.a();
        if (healthConnectQueryV0Input == null || (queries = healthConnectQueryV0Input.getQueries()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem : queries) {
            u0h u0hVar = sk8.h;
            sk8 sk8VarD = gsk.d(healthConnectQueryV0InputQueriesItem.getIdentifier());
            if (sk8VarD != null) {
                arrayList.add(sk8VarD);
            }
        }
        return w44.S0(w44.p1(w44.s1(arrayList)), ", ", null, null, new py3(28, this), 30);
    }
}
