package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePartiallyCompleted;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class slb implements w28 {
    public static final slb a;
    private static final SerialDescriptor descriptor;

    static {
        slb slbVar = new slb();
        a = slbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_use_partially_completed", slbVar, 8);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("success_count", false);
        pluginGeneratedSerialDescriptor.j("failure_count", false);
        pluginGeneratedSerialDescriptor.j("error_type_counts", false);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("conversation_id", false);
        pluginGeneratedSerialDescriptor.j("organization_id", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.k(new pi(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePartiallyCompleted.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, e79Var, e79Var, kw9VarArr[3].getValue(), srgVar, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePartiallyCompleted.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String strV = null;
        Map map = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
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
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iR2 = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map);
                    i |= 8;
                    break;
                case 4:
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strV3 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strV4 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV5 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppUseEvents$MobileAppUsePartiallyCompleted(i, strV, iR, iR2, map, strV2, strV3, strV4, strV5, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseEvents$MobileAppUsePartiallyCompleted mobileAppUseEvents$MobileAppUsePartiallyCompleted = (MobileAppUseEvents$MobileAppUsePartiallyCompleted) obj;
        encoder.getClass();
        mobileAppUseEvents$MobileAppUsePartiallyCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseEvents$MobileAppUsePartiallyCompleted.write$Self$analytics(mobileAppUseEvents$MobileAppUsePartiallyCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
