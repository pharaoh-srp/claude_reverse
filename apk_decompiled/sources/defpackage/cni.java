package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.UserLocationInputDescriptions;
import com.anthropic.claude.tool.model.LocationPreviewData;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.tool.model.UserLocationV0Input;
import com.anthropic.claude.tool.model.UserLocationV0Output;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cni extends dxh {
    public final String e;
    public final mc f;
    public boolean g;
    public final String h;
    public final ewh i;

    public cni(UserLocationInputDescriptions userLocationInputDescriptions, String str, mc mcVar, mwh mwhVar) {
        Tool.CustomTool customTool;
        super(mwhVar, UserLocationV0Input.Companion.serializer(), UserLocationV0Output.Companion.serializer());
        this.e = str;
        this.f = mcVar;
        this.h = hxh.g;
        if (userLocationInputDescriptions != null) {
            String tool_description = userLocationInputDescriptions.getTool_description();
            Map mapSingletonMap = Collections.singletonMap("accuracy", new StringProperty(userLocationInputDescriptions.getAccuracy(), x44.X("precise", "approximate"), (String) null, (Integer) null, (Integer) null, 28, (mq5) null));
            mapSingletonMap.getClass();
            customTool = new Tool.CustomTool("user_location_v0", str, tool_description, new InputSchema("object", mapSingletonMap, x44.W("accuracy")));
        } else {
            customTool = null;
        }
        this.i = new ewh(customTool, new w9h(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.cni r17, android.content.Context r18, android.location.Location r19, defpackage.vp4 r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof defpackage.zmi
            if (r1 == 0) goto L15
            r1 = r0
            zmi r1 = (defpackage.zmi) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1c
        L15:
            zmi r1 = new zmi
            r2 = r17
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.E
            int r2 = r1.G
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            defpackage.sf5.h0(r0)     // Catch: java.lang.Throwable -> L2a
            goto L6a
        L2a:
            r0 = move-exception
            goto Lbc
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r3
        L33:
            defpackage.sf5.h0(r0)
            android.location.Geocoder r5 = new android.location.Geocoder
            r0 = r18
            r5.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2a
            r2 = 33
            if (r0 < r2) goto L6d
            r1.G = r4     // Catch: java.lang.Throwable -> L2a
            ua2 r0 = new ua2     // Catch: java.lang.Throwable -> L2a
            tp4 r1 = defpackage.zni.I(r1)     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2a
            r0.t()     // Catch: java.lang.Throwable -> L2a
            double r6 = r19.getLatitude()     // Catch: java.lang.Throwable -> L2a
            double r8 = r19.getLongitude()     // Catch: java.lang.Throwable -> L2a
            ani r10 = new ani     // Catch: java.lang.Throwable -> L2a
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            defpackage.se0.q(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L2a
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L6a
            return r1
        L6a:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L2a
            goto L7a
        L6d:
            double r6 = r19.getLatitude()     // Catch: java.lang.Throwable -> L2a
            double r8 = r19.getLongitude()     // Catch: java.lang.Throwable -> L2a
            r10 = 1
            java.util.List r0 = r5.getFromLocation(r6, r8, r10)     // Catch: java.lang.Throwable -> L2a
        L7a:
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = defpackage.w44.N0(r0)     // Catch: java.lang.Throwable -> L2a
            android.location.Address r0 = (android.location.Address) r0     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto Lbb
            java.lang.String r10 = r0.getFeatureName()     // Catch: java.lang.Throwable -> L2a
            b79 r11 = new b79     // Catch: java.lang.Throwable -> L2a
            int r1 = r0.getMaxAddressLineIndex()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r11.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r12 = "\n"
            ymi r15 = new ymi     // Catch: java.lang.Throwable -> L2a
            r15.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r16 = 30
            r13 = 0
            r14 = 0
            java.lang.String r6 = defpackage.w44.S0(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r12 = r0.getSubLocality()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r9 = r0.getLocality()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r0.getAdminArea()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r11 = r0.getPostalCode()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = r0.getCountryName()     // Catch: java.lang.Throwable -> L2a
            com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded r5 = new com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded     // Catch: java.lang.Throwable -> L2a
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2a
            return r5
        Lbb:
            return r3
        Lbc:
            java.util.List r1 = defpackage.xah.a
            java.lang.String r1 = "Failed to geocode location."
            r2 = 28
            defpackage.xah.f(r0, r1, r3, r3, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cni.x(cni, android.content.Context, android.location.Location, vp4):java.lang.Object");
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1110627916);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            rkj.f(z2, p(), z3, lvhVar.d, (UserLocationV0Output) dlbVar.b(), iqbVar, e18Var, ((i2 >> 15) & 14) | ((i2 >> 12) & 896) | ((i2 >> 6) & 458752));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 23);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        this.g = true;
        return new UserLocationV0OutputUserLocationError(UserLocationV0OutputUserLocationErrorErrorType.APP_PERMISSION_DENIED, "User denied location access in app.");
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        UserLocationV0Output userLocationV0Output = (UserLocationV0Output) obj;
        userLocationV0Output.getClass();
        if (!(userLocationV0Output instanceof UserLocationV0OutputUserLocationError)) {
            return null;
        }
        UserLocationV0OutputUserLocationError userLocationV0OutputUserLocationError = (UserLocationV0OutputUserLocationError) userLocationV0Output;
        return new bxh(userLocationV0OutputUserLocationError.getError_type().getLoggingName(), userLocationV0OutputUserLocationError.getMessage());
    }

    @Override // defpackage.dxh
    public final rok l() {
        return ayh.F;
    }

    @Override // defpackage.dxh
    public final Object m(tp4 tp4Var, Context context, String str) {
        ud0 ud0Var = ud0.d;
        String string = context.getString(R.string.location_tool_preview_label);
        string.getClass();
        String string2 = context.getString(R.string.location_tool_preview_description);
        string2.getClass();
        return new MobileAppToolPreviewInfo(R.drawable.anthropicon_location, string, string2, LocationPreviewData.INSTANCE);
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.i;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        if (this.g) {
            ud0 ud0Var = ud0.d;
            return R.drawable.anthropicon_location_slash;
        }
        ud0 ud0Var2 = ud0.d;
        return R.drawable.anthropicon_location;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.h;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
