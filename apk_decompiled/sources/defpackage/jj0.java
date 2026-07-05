package defpackage;

import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentGenerateTitleFailure;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jj0 implements w28 {
    public static final jj0 a;
    private static final SerialDescriptor descriptor;

    static {
        jj0 jj0Var = new jj0();
        a = jj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_intent_generate_title_failure", jj0Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("app_intent_session_id", false);
        pluginGeneratedSerialDescriptor.k(new pi(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV4 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppIntentEvents$AppIntentGenerateTitleFailure(i, strV, strV2, strV3, strV4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppIntentEvents$AppIntentGenerateTitleFailure appIntentEvents$AppIntentGenerateTitleFailure = (AppIntentEvents$AppIntentGenerateTitleFailure) obj;
        encoder.getClass();
        appIntentEvents$AppIntentGenerateTitleFailure.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppIntentEvents$AppIntentGenerateTitleFailure.write$Self$analytics(appIntentEvents$AppIntentGenerateTitleFailure, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
