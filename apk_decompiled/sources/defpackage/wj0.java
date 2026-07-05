package defpackage;

import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentType;
import com.anthropic.claude.analytics.events.AppIntentEvents$AppOpenedWithIntent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wj0 implements w28 {
    public static final wj0 a;
    private static final SerialDescriptor descriptor;

    static {
        wj0 wj0Var = new wj0();
        a = wj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_opened_with_intent", wj0Var, 3);
        pluginGeneratedSerialDescriptor.j("intent_type", false);
        pluginGeneratedSerialDescriptor.j("phone_locked", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.k(new pi(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AppIntentEvents$AppOpenedWithIntent.$childSerializers[0].getValue(), zt1.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AppIntentEvents$AppOpenedWithIntent.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        AppIntentEvents$AppIntentType appIntentEvents$AppIntentType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                appIntentEvents$AppIntentType = (AppIntentEvents$AppIntentType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), appIntentEvents$AppIntentType);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppIntentEvents$AppOpenedWithIntent(i, appIntentEvents$AppIntentType, zU, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppIntentEvents$AppOpenedWithIntent appIntentEvents$AppOpenedWithIntent = (AppIntentEvents$AppOpenedWithIntent) obj;
        encoder.getClass();
        appIntentEvents$AppOpenedWithIntent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppIntentEvents$AppOpenedWithIntent.write$Self$analytics(appIntentEvents$AppOpenedWithIntent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
