package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.HealthConnectDataTypesInputDescriptions;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Input;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Output;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wh8 extends dxh {
    public final String e;
    public final fk0 f;
    public final String g;
    public final ewh h;

    public wh8(HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions, String str, mwh mwhVar, fk0 fk0Var) {
        Tool.CustomTool customTool;
        super(mwhVar, HealthConnectDataTypesV0Input.Companion.serializer(), HealthConnectDataTypesV0Output.Companion.serializer());
        this.e = str;
        this.f = fk0Var;
        this.g = hxh.t;
        if (healthConnectDataTypesInputDescriptions != null) {
            String tool_description = healthConnectDataTypesInputDescriptions.getTool_description();
            Map mapSingletonMap = Collections.singletonMap("search_text", new StringProperty(healthConnectDataTypesInputDescriptions.getSearch_text(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null));
            mapSingletonMap.getClass();
            customTool = new Tool.CustomTool("health_connect_data_types_v0", str, tool_description, new InputSchema("object", mapSingletonMap, (List) null, 4, (mq5) null));
        } else {
            customTool = null;
        }
        this.h = new ewh(customTool, new tk5(15, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        boolean z4;
        int i2;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-806369972);
        if ((i & 196608) == 0) {
            z4 = z2;
            i2 = i | (e18Var.g(z4) ? 131072 : 65536);
        } else {
            z4 = z2;
            i2 = i;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38338561 & i2) != 38338560)) {
            pyk pykVar = pyk.L;
            long j = d54.h;
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var.k0(objN);
            }
            int i3 = i2 >> 9;
            auk.b(pykVar, R.drawable.health_connect, z4, z3, (zy7) objN, iqbVar, false, j, false, null, null, e18Var, (i3 & 7168) | (i3 & 896) | 14180358 | ((i2 >> 6) & 458752), 0, 1792);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 10);
        }
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
        return this.h;
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
        return this.g;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
