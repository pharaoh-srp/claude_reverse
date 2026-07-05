package com.anthropic.claude.api.common;

import com.anthropic.claude.api.common.RateLimit;
import defpackage.d4c;
import defpackage.fl5;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.zt1;
import java.util.Date;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements w28 {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("exceeded_limit", gVar, 4);
        pluginGeneratedSerialDescriptor.j("resetsAt", true);
        pluginGeneratedSerialDescriptor.j("perModelLimit", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("windows", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(fl5.a), d4c.S(zt1.a), d4c.S(srg.a), d4c.S((KSerializer) RateLimit.ExceedsLimit.$childSerializers[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RateLimit.ExceedsLimit.$childSerializers;
        boolean z = true;
        int i = 0;
        Date date = null;
        Boolean bool = null;
        String str = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                date = (Date) ud4VarC.m(serialDescriptor, 0, fl5.a, date);
                i |= 1;
            } else if (iX == 1) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RateLimit.ExceedsLimit(i, date, bool, str, map, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RateLimit.ExceedsLimit exceedsLimit = (RateLimit.ExceedsLimit) obj;
        encoder.getClass();
        exceedsLimit.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RateLimit.ExceedsLimit.write$Self$Claude_api_result(exceedsLimit, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
