package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkRateLimitEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4c;
import defpackage.na6;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xka;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 implements w28 {
    public static final w0 a;
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkRateLimitEvent.RateLimitInfo", w0Var, 9);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("rateLimitType", true);
        pluginGeneratedSerialDescriptor.j("resetsAt", true);
        pluginGeneratedSerialDescriptor.j("isUsingOverage", true);
        pluginGeneratedSerialDescriptor.j("overageDisabledReason", true);
        pluginGeneratedSerialDescriptor.j("utilization", true);
        pluginGeneratedSerialDescriptor.j("surpassedThreshold", true);
        pluginGeneratedSerialDescriptor.j("overageStatus", true);
        pluginGeneratedSerialDescriptor.j("overageResetsAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        xka xkaVar = xka.a;
        KSerializer kSerializerS2 = d4c.S(xkaVar);
        KSerializer kSerializerS3 = d4c.S(zt1.a);
        KSerializer kSerializerS4 = d4c.S(srgVar);
        na6 na6Var = na6.a;
        return new KSerializer[]{srgVar, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(na6Var), d4c.S(na6Var), d4c.S(srgVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        Long l = null;
        String strV = null;
        String str = null;
        Long l2 = null;
        Boolean bool = null;
        String str2 = null;
        Double d = null;
        Double d2 = null;
        String str3 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) ud4VarC.m(serialDescriptor, 5, na6.a, d);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) ud4VarC.m(serialDescriptor, 6, na6.a, d2);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    l = (Long) ud4VarC.m(serialDescriptor, 8, xka.a, l);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SdkRateLimitEvent.RateLimitInfo(i, strV, str, l2, bool, str2, d, d2, str3, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkRateLimitEvent.RateLimitInfo rateLimitInfo = (SdkRateLimitEvent.RateLimitInfo) obj;
        encoder.getClass();
        rateLimitInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkRateLimitEvent.RateLimitInfo.write$Self$sessions(rateLimitInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
