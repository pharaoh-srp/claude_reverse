package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ImageDecodeFallback;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dp2 implements w28 {
    public static final dp2 a;
    private static final SerialDescriptor descriptor;

    static {
        dp2 dp2Var = new dp2();
        a = dp2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_image_decode_fallback", dp2Var, 5);
        pluginGeneratedSerialDescriptor.j("mime_type", false);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.j("original_error", false);
        qy1.u(pluginGeneratedSerialDescriptor, "width", false, "height", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, zt1.a, srgVar, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        int iR2 = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                iR = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                iR2 = ud4VarC.r(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ImageDecodeFallback(i, strV, zU, strV2, iR, iR2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ImageDecodeFallback chatEvents$ImageDecodeFallback = (ChatEvents$ImageDecodeFallback) obj;
        encoder.getClass();
        chatEvents$ImageDecodeFallback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ImageDecodeFallback.write$Self$analytics(chatEvents$ImageDecodeFallback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
