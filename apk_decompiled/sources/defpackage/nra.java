package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.NumberProperty;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.MapDisplayInputDescriptions;
import com.anthropic.claude.tool.model.MapDisplayV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nra extends dxh {
    public final String e;
    public final String f;
    public final ewh g;

    public nra(MapDisplayInputDescriptions mapDisplayInputDescriptions, String str, mwh mwhVar) {
        super(mwhVar, MapDisplayV0Input.Companion.serializer(), srg.a);
        this.e = str;
        this.f = hxh.k;
        this.g = new ewh(mapDisplayInputDescriptions != null ? new Tool.CustomTool("map_display_v0", str, mapDisplayInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("markers", new ArrayProperty(mapDisplayInputDescriptions.getMarkers().getDescription(), new ObjectProperty(mapDisplayInputDescriptions.getMarkers().getItems().getDescription(), sta.h0(new cpc("label", new StringProperty(mapDisplayInputDescriptions.getMarkers().getItems().getLabel(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("latitude", new NumberProperty(mapDisplayInputDescriptions.getMarkers().getItems().getLatitude(), (Double) null, (Double) null, 6, (mq5) null)), new cpc("longitude", new NumberProperty(mapDisplayInputDescriptions.getMarkers().getItems().getLongitude(), (Double) null, (Double) null, 6, (mq5) null)), new cpc("title", new StringProperty(mapDisplayInputDescriptions.getMarkers().getItems().getTitle(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.X("latitude", "longitude", "title")), (Integer) null, (Integer) null, 12, (mq5) null)), new cpc("title", new StringProperty(mapDisplayInputDescriptions.getTitle(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.W("markers"))) : null, new zp3(21));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        e18 e18Var;
        ta4 ta4VarQ0;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(908020268);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var2.f(lvhVar) : e18Var2.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z4 = z3;
            i2 |= e18Var2.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z4 = z3;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? 67108864 : 33554432;
        }
        if (e18Var2.Q(i2 & 1, (38347779 & i2) != 38347778)) {
            int i3 = i2;
            hj6 hj6Var = hj6.M;
            MapDisplayV0Input mapDisplayV0Input = (MapDisplayV0Input) dlbVar.a();
            if (mapDisplayV0Input == null) {
                e18Var2.a0(1128370996);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(1128370997);
                ta4VarQ0 = fd9.q0(867923036, new xg4(mapDisplayV0Input, str, lvhVar, 22), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var2.k0(objN);
            }
            int i4 = i3 >> 9;
            e18Var = e18Var2;
            auk.b(hj6Var, R.drawable.phosphor_map_trifold, z2, z4, (zy7) objN, iqbVar, false, 0L, false, null, ta4Var, e18Var, (i4 & 7168) | (i4 & 896) | 1597446 | ((i3 >> 6) & 458752), 0, 896);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 13);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.g;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        return R.drawable.phosphor_map_trifold;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.f;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
