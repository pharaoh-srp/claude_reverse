package defpackage;

import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolOutcome;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolResolved;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ymb implements w28 {
    public static final ymb a;
    private static final SerialDescriptor descriptor;

    static {
        ymb ymbVar = new ymb();
        a = ymbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_tool_resolved", ymbVar, 11);
        pluginGeneratedSerialDescriptor.j("tool_kind", false);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("conversation_id", false);
        pluginGeneratedSerialDescriptor.j("server_name", true);
        pluginGeneratedSerialDescriptor.j("server_uuid", true);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("is_error", true);
        pluginGeneratedSerialDescriptor.j("error_detail", true);
        pluginGeneratedSerialDescriptor.j("perceived_latency_ms", true);
        pluginGeneratedSerialDescriptor.k(new xmb(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MobileToolEvents$MobileToolResolved.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), srgVar, d4c.S(srgVar), srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[7].getValue(), d4c.S(zt1.a), d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        kw9[] kw9VarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr3 = MobileToolEvents$MobileToolResolved.$childSerializers;
        Long l = null;
        String str = null;
        Boolean bool = null;
        boolean z2 = true;
        MobileToolEvents$MobileToolOutcome mobileToolEvents$MobileToolOutcome = null;
        int i = 0;
        MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind = null;
        String strV = null;
        String str2 = null;
        String strV2 = null;
        String strV3 = null;
        String str3 = null;
        String str4 = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr2 = kw9VarArr3;
                    z2 = false;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    mobileToolEvents$MobileToolKind = (MobileToolEvents$MobileToolKind) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), mobileToolEvents$MobileToolKind);
                    i |= 1;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 1:
                    kw9VarArr2 = kw9VarArr3;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 3:
                    kw9VarArr2 = kw9VarArr3;
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 4:
                    kw9VarArr2 = kw9VarArr3;
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    mobileToolEvents$MobileToolOutcome = (MobileToolEvents$MobileToolOutcome) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), mobileToolEvents$MobileToolOutcome);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i |= 512;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    l = (Long) ud4VarC.m(serialDescriptor, 10, xka.a, l);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileToolEvents$MobileToolResolved(i, mobileToolEvents$MobileToolKind, strV, str2, strV2, strV3, str3, str4, mobileToolEvents$MobileToolOutcome, bool, str, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileToolEvents$MobileToolResolved mobileToolEvents$MobileToolResolved = (MobileToolEvents$MobileToolResolved) obj;
        encoder.getClass();
        mobileToolEvents$MobileToolResolved.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileToolEvents$MobileToolResolved.write$Self$analytics(mobileToolEvents$MobileToolResolved, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
